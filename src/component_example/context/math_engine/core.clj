(ns component-example.context.math-engine.core
  (:require
    [com.stuartsierra.component :as component]
    [component-example.context.math-engine.oracle.simple])
  (:import (component_example.context.math_engine.oracle.simple MathOracleSimple)))

(defn context-math-engine-system []
  (component/system-map
    :oracle (MathOracleSimple.)))
