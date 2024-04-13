(ns sicp.sigma-test
  (:require [clojure.test :refer :all])
  (:require [sicp.sigma :refer :all]))

(deftest sum-integers-test
  (is (= (sum-integers 1 5) 15)))

(deftest sum-cubes-test
  (is (= (sum-cubes 1 4) 100)))

(deftest pi-sum-test
  (is (= (pi-sum 1 5) (/ 38 105))))
