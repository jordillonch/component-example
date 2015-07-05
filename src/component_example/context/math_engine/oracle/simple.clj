(ns component-example.context.math-engine.oracle.simple
  (:require [component-example.context.math-engine.oracle.protocol])
  (:import (component_example.context.math_engine.oracle.protocol MathOracle)))

(defrecord MathOracleSimple []
  MathOracle
  (sum [this value1 value2]
    (+ value1 value2))

  (sub [this value1 value2]
    (- value1 value2)))

(defn new-math-oracle []
  (map->MathOracleSimple {}))