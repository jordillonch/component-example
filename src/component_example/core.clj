(ns component-example.core
  (:require [com.stuartsierra.component :as component]
            [component-example.app.api.core]
            [component-example.context.math-engine.core :refer [context-math-engine-system]])
  (:import (component_example.app.api.core ApplicationApiComponent)))

(defn my-system []
  (component/system-map
    :context-math-engine (context-math-engine-system)
    :application-api (component/using (ApplicationApiComponent.) [:context-math-engine])))

(def system (my-system))

(defn start []
  (println "Starting...")
  (alter-var-root #'component-example.core/system component/start))

(defn stop []
  (println "Stopping...")
  (alter-var-root #'component-example.core/system component/stop))

(defn -main []
  (start))
