package groovy

Integer x = 123
String str = x as String //use of as will coerce it to a String

def f = 3
f **= 2
assert f == 9

def a = 2
def b = a++ * 3
assert a == 3 && b == 6

def c = 3
def d = c-- * 2
assert c == 2 && d == 6

def g = 4
def h = --g + 1
assert g == 3 && h == 4

assert 'ab' == 'a' + 'b'

def aMultilineString = '''line one
line two
line three'''

def isOdd = { int i -> i%2 != 0 }
assert isOdd(3) == true
assert isOdd.call(2) == false

def greeting = { it -> "Hello, $it!" }
assert greeting('Patrick') == 'Hello, Patrick!'

//Varargs
def concat1 = { String... args -> args.join('') }
assert concat1('abc','def') == 'abcdef'
def concat2 = { String[] args -> args.join('') }
assert concat2('abc', 'def') == 'abcdef'

def multiConcat = { int n, String... args ->
    args.join('')*n
}
assert multiConcat(2, 'abc','def') == 'abcdefabcdef'

def nCopies = { int n, String st -> st*n }
def twice = nCopies.curry(2)
assert twice('bla') == 'blabla'
assert twice('bla') == nCopies(2, 'bla')

def (l, k, m) = [10, 20, 'foo']
assert l == 10 && k == 20 && m == 'foo'

def (int i, String j) = [10, 'foo']
assert i == 10 && j == 'foo'

/*def nums = [1, 3, 5]
def a, b, c
(a, b, c) = nums
assert a == 1 && b == 3 && c == 5*/

def (_, month, year) = "18th June 2009".split()
assert "In $month of $year" == 'In June of 2009'

/*def (a, b, c) = [1, 2]
assert a == 1 && b == 2 && c == null*/

/*def (a, b) = [1, 2, 3]
assert a == 1 && b == 2*/

//sum()函数是求和
/*def x = 2
def y = 7
def z = 5
def calc = { a,b -> a*b+1 }
assert calc(x,y) == [x,z].sum()*/


































































