(defproject component-example "0.1.0-SNAPSHOT"
  :description "Example project that aims to show how component library works"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.stuartsierra/component "0.2.3"]
                 [compojure "1.3.4"]
                 [http-kit "2.1.18"]
                 [ring/ring-defaults "0.1.2"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [
                                  [org.clojure/tools.namespace "0.2.10"]
                                  [org.clojure/java.classpath "0.2.2"]]}})
