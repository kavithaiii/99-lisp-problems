# 99-lisp-problems

## Working with lists
##### P01 (*) Find the last box of a list.
Example:
* (my-last '(a b c d))

(D)

##### P02 (*) Find the last but one box of a list.
Example:
* (my-but-last '(a b c d))

(C D)

##### P03 (*) Find the K'th element of a list.
The first element in the list is number 1.

Example:
* (element-at '(a b c d e) 3)

C

##### P04 (*) Find the number of elements of a list.
##### P05 (*) Reverse a list.
##### P06 (*) Find out whether a list is a palindrome.
A palindrome can be read forward or backward; e.g. (x a m a x).

##### P07 (**) Flatten a nested list structure.
Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively).

Example:
* (my-flatten '(a (b (c d) e)))
(A B C D E)

Hint: Use the predefined functions list and append.

##### P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

Example:
* (compress '(a a a a b c c a a d e e e e))
(A B C A D E)

##### P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.

Example:
* (pack '(a a a a b c c a a d e e e e))
((A A A A) (B) (C C) (A A) (D) (E E E E))
P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as lists (N E) where N is the number of duplicates of the element E.

Example:
* (encode '(a a a a b c c a a d e e e e))
((4 A) (1 B) (2 C) (2 A) (1 D)(4 E))
