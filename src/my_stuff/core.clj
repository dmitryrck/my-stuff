(ns my-stuff.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn hello [name]
  (str "Hello, " name))

(comment Foo returns bar)
(defn foo [] "bar")
