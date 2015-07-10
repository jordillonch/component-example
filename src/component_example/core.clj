(ns component-example.core
  (:require [com.stuartsierra.component :as component]
            [component-example.app.api.core :refer [new-application-api]]
            [component-example.context.math-engine.core :refer [new-context-math-engine-system]]))

(def math-engine
  new-context-math-engine-system)

(defn my-system []
  (component/system-map
    :context-math-engine (math-engine)
    :application-api (component/using (new-application-api)
                                      [:context-math-engine])))

(def system (my-system))

(defn start []
  (println "Starting...")
  (alter-var-root #'component-example.core/system component/start))

(defn stop []
  (println "Stopping...")
  (alter-var-root #'component-example.core/system component/stop))

(defn -main []
  (start))
