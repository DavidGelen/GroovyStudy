package groovy

import java.util.regex.Matcher
import java.util.regex.Pattern

//The spaceship operator (<=>) delegates to the compareTo method
assert (1 <=> 1) == 0
assert (1 <=> 2) == -1
assert (2 <=> 1) == 1
assert ('a' <=> 'z') == -1

//Groovy supports the concept of ranges and provides a notation (..) to create ranges of objects:
def range = 0..5
assert (0..5).collect() == [0, 1, 2, 3, 4, 5]
assert (0..<5).collect() == [0, 1, 2, 3, 4]
assert (0..5) instanceof java.util.List
assert (0..5).size() == 6
assert ('a'..'d').collect() == ['a','b','c','d']

//The pattern operator (~) provides a simple way to create a java.util.regex.Pattern instance:
def p = ~/foo/
assert p instanceof Pattern
//p = ~'foo'
//p = ~"foo"
//p = ~$/dollar/slashy $ string/$
//p = ~"${pattern}"

//you can directly use the find operator =~ to build a java.util.regex.Matcher instance:
def text = "some text to match"
def m = text =~ /match/
assert m instanceof Matcher
if (!m) {
    throw new RuntimeException("Oops, text not found!")
}

//The match operator (==~) is a slight variation of the find operator,
// that does not return a Matcher but a boolean and requires a strict match of the input string
m = text ==~ /match/
assert m instanceof Boolean
if (m) {
    throw new RuntimeException("Should not reach that point!")
}

//The method pointer operator (.&) call be used to store a reference to a method in a variable, in order to call it later:
def doSomething(String str) { str.toUpperCase() }
def doSomething(Integer x) { 2*x }
def reference = this.&doSomething
assert reference('foo') == 'FOO'
assert reference(123)   == 246