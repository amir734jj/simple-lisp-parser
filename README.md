# simple-lisp-parser

Very basic Lisp (S-expression) parser using Scala parser combinators

It can currently handle:

- arithmetic operations: `+ -`
- logical operations: `< >`
- conditional
- function definition
- function invocation

Example:

```
(defun add(a, b) (+ a b))
(add 2 1)
```
