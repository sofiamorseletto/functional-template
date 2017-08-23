(ns exercise3)

(defn fibonacci 
	"Returns fibonacci number."
	[x]
	(if (<= x 1) x (+ (fibonacci(- x 2)) (fibonacci(- x 1))))
)