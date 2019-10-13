(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Nick")
  (println "Loving my closure so far")
  (+ 2 5))

#(println "Hello" %)

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  (map increment x))