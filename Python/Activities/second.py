class Person:
    'This class represents a person'

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def myFunc(self):
        print("Hello, my name is " + self.name)

p1 = Person("John", 36)

p1.name = "Harry"
print(p1.age)
p1.myFunc()
#print(p1.age)
p1.myFunc() # Output: "Hello, my name is Harry"