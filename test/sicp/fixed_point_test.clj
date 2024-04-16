(ns sicp.fixed-point-test
  (:require [clojure.test :refer :all])
  (:require [sicp.fixed-point :refer :all]))

(deftest square-root-test
  (is (= (Math/round (square-root 4)) 2)))
