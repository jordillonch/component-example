(ns component-example.app.api.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [org.httpkit.server :refer [run-server]]
            [com.stuartsierra.component :as component]
            [component-example.app.api.math-sum :refer :all]
            [component-example.app.api.math-sub :refer :all]))

(defn app-routes [math-engine-oracle]
  (routes
    (GET "/" [] "Component example project!")
    (POST "/math/sum" request (math-sum math-engine-oracle request))
    (POST "/math/sub" request (math-sub math-engine-oracle request))
    (route/not-found "Not found")))

(defrecord ApplicationApiComponent []
  component/Lifecycle

  (start [component]
    (println "  Starting Application API...")
    (assoc component :stop-server
                     (run-server
                       (wrap-defaults
                         (app-routes (get-in component [:context-math-engine :oracle]))
                         (assoc-in site-defaults [:security :anti-forgery] false))
                       {:port 8080})
                     ))

  (stop [component]
    (println "  Stopping Application API...")
    ((:stop-server component))
    (dissoc component :stop-server)))
