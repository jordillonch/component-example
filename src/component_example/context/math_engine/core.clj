(ns component-example.context.math-engine.core
  (:require
    [com.stuartsierra.component :as component]
    [component-example.context.math-engine.oracle.simple :refer [new-math-oracle]]))

(defn new-context-math-engine-system []
  (component/system-map
    :oracle (new-math-oracle)))
