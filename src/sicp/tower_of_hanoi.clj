(ns sicp.tower-of-hanoi)

(defn move-tower [n from to spare]
  (if (= n 0) ""
              (str
                (move-tower (- n 1) from spare to)
                (str "Ring " n " " from " " to "\n")
                (move-tower (- n 1) spare to from))))

