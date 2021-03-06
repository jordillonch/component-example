(ns component-example.app.api.math-sum
  (:require [component-example.context.math-engine.oracle.protocol :as oracle]))

(defn math-sum [math-engine-oracle request]
  (let [value1 (get-in request [:params :value1])
        value2 (get-in request [:params :value2])
        value1-int (. Integer parseInt value1)
        value2-int (. Integer parseInt value2)
        result-int (oracle/sum math-engine-oracle value1-int value2-int)
        result-str (str result-int)]
    result-str))
