class Monstro:
    def gritar(self):
        print("GRRRRR")

fernando = Monstro()
fernando.gritar()

#gritar é o metodo

def isadult(age):
    if (age>= 18):
        return True
    else:
        return False

age= int(input( "What is your age?"))

if isadult(age):
    print("Adult")
else:
    print("Child")
