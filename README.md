# sicp

Simple exercises to demonstrate building of abstractions with procedures using Clojure

## Installation

1. Run `brew install leiningen`. Leiningen is a build automation and dependency management tool like gradle for Clojure.
2. Have fun with clojure by launching the REPL `lein repl`.
```
user=> (+ 1 (* 2 3))
7
user=> (* 2 3)
6
user=> (* (+ 2 3) (- 7 1))
30
user=> (defn square [x]
            (* x x))
user=> (square 4)
16
```



