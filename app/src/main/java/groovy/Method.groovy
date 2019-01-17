package groovy

int function(int x, int y, int z) {
    x*y + z
}

def args = [4,5,6]

assert function(*args) == 26 //* 操作符相当于做了拆分list的作用

args = [4]
assert function(*args,5,6) == 26

def test(String string) {
    def result = string ? 'Found' : 'Not found'

    //等价于 def result = (string!=null && string.length()>0) ? 'Found' : 'Not found'

    //displayName = user.name ? user.name : 'Anonymous'
    //displayName = user.name ?: 'Anonymous'
}

