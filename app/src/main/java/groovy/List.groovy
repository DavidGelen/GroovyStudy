package groovy

import groovy.object.Person

def list1 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']
def list2 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']
assert list1 == list2
assert !list1.is(list2) //we can check that references are distinct

def list = ['Grace','Rob','Emmy']
assert ('Emmy' in list) //list.isCase('Emmy')

def list3 = [0,1,2,3,4]
assert list3[2] == 2
list3[2] = 4
assert list3[0..2] == [0,1,4] //这是闭区间
list3[0..2] = [6,6,6]
assert list3 == [6,6,6,3,4]

def items = [4,5]
def list4 = [1,2,3,*items,6]
assert list4 == [1,2,3,4,5,6]

//=============================
//The method pointer operator (.&) call be used to store a reference to a method in a variable, in order to call it later:
def str = 'example of method reference'
def fun = str.&toUpperCase
def upper = fun()
assert upper == str.toUpperCase()

//===============================
def transform(List elements, Closure action) {
    def result = []
    elements.each {
        result << action(it) //类似于add的功能
    }
    result
}
String describe(Person p) {
    "$p.name is $p.age"
}
def action = this.&describe //注意这个牛逼的操作符 .&,有了它可以不用跟方法的参数
def list5 = [
        new Person(name: 'Bob',   age: 42),
        new Person(name: 'Julia', age: 35)]
assert transform(list5, action) == ['Bob is 42', 'Julia is 35']

//===================================

def heterogeneous = [1, "a", true]


def letters = ['a', 'b', 'c', 'd']
assert letters[0] == 'a'
assert letters[1] == 'b'

assert letters[-1] == 'd'
assert letters[-2] == 'c'

letters[2] = 'C'
assert letters[2] == 'C'

letters << 'e' //Use the << leftShift operator to append an element at the end of the list
assert letters[ 4] == 'e'
assert letters[-1] == 'e'

assert letters[1, 3] == ['b', 'd']
assert letters[2..4] == ['C', 'd', 'e']

/*def list = [new A(), new B()]
list.each {
    it.greet()
    it.salute()
    it.exit()
}*/




















