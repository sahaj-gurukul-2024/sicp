(ns sicp.sigma)

(defn sum-integers [a b]
  (if (> a b) 0
              (+ a (sum-integers (inc a) b))))

(defn sum-cubes [a b]
  (if (> a b) 0
              (+
                (* a (* a a))
                (sum-cubes (inc a) b))))


; 1/(1 * 3) + 1/(5 * 7) + 1/(9 * 11) + …
(defn pi-sum [a b]
  (if (> a b) 0
              (+
                (/ 1 (* a (+ 2 a)))
                (pi-sum (+ 4 a) b))))