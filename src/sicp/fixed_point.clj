(ns sicp.fixed-point)

(def tolerance 0.000001)

(defn average [x y]
  (/ (+ x y) 2))

(defn square [x]
  (* x x))

(defn square-root [x]
  (letfn [(good-enough? [guess]
            (< (abs (- (square guess) x)) tolerance))
          (improve [guess]
            (average guess (/ x guess)))
          (sqrt-iter [guess]
            (if (good-enough? guess)
              guess
              (sqrt-iter (improve guess))))
          ]
    (sqrt-iter 1.0))
  )