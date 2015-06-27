(ns component-example.context.math-engine.oracle.protocol)

(defprotocol MathOracle
  (sum [this value1 value2])
  (sub [this value1 value2]))
