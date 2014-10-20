(ns my-stuff.core-test
  (:require [clojure.test :refer :all]
            [my-stuff.core :refer :all]))

;(deftest a-test
  ;(testing "FIXME, I fail."
    ;(is (= 0 1))))

(deftest b-test
  (testing "not return hello bro."
    (is (= "Hello, bro" (hello "bro")))))
