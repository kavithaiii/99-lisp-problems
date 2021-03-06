(defn nienty-nine-problems []
;; Find last box of list
(def my-list (list 'a 'b 'c 'd))
(println "my list: " my-list)
(def last-item (last my-list))
(println "1 - last item in list: " last-item)
(def last-but-one (- (count my-list) 2))
(println "2 - the \"last but one\" of a list - "(nth my-list last-but-one)" " last-item)
(println "3 - find the Kth element in the list - " (nth my-list 1))
(println "4 - number of items in the list - " (count my-list))
(println "5 - reverse the list -" (reverse my-list))

(def pali-list (list 'x 'a 'm 'a 'x))
(defn is-list-palindrome? [s]
  (= (seq s) (reverse s)))
;; (is-list-palindrome? pali-list)  
 (println "6 - Is list a palindrome?  " pali-list " -  "  (is-list-palindrome? pali-list))
 
 (def nested-list (list '(a (b (c d) e))))
 (println "7 - flatten a nested list structure " nested-list)
 (println (list (clojure.string/replace nested-list #"[()]" "")))
 
(def my-list '(a a c d a a a b b b))
(defn compressed-list [s e]
  (if (= (last s) e)
     s
     (conj s e)))

(defn comp-my-list [s]
  (reduce compressed-list [] s))
(println "8 - eliminate consecutive duplicates of list elements - " new-list)
(println (comp-my-list my-list))
  
(println "14 - duplicate the elements of the list (a c c d)")
(def my-list '(a c c d))
(def duplicate-list (reduce #(count (map println (repeat %1 %2))) 2 my-list))

) 
