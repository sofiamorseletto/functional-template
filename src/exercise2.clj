(ns exercise2)

(defn only-greater-than-five
  "Returns a list with elements greater than 5."
  [list]
  (filter(fn [x] 
  	(> x 5)) list)
)