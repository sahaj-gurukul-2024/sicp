(ns sicp.tower-of-hanoi-test
  (:require [clojure.test :refer :all])
  (:require [sicp.tower-of-hanoi :refer :all]))


(deftest move-tower-test
  (println (move-tower 4 "from" "to" "spare")))
