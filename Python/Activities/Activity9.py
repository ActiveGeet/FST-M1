listOne = list(input("Enter a sequence of numbers in 1st List separated by comma : ").split(','))
listTwo = list(input("Enter a sequence of numbers in 2nd List separated by comma : ").split(','))

print('First List: ',listOne)
print('Second List: ',listTwo)

listThree = []

for number in listOne:
    if(int(number) % 2 != 0):
        listThree.append(number)

for number in listTwo:
    if(int(number) % 2 == 0):
        listThree.append(number)

print('Third List i.e. New List: ',listThree)