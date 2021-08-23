numbers = list(input("Enter a sequence of numbers separated by comma : ").split(','))

firstNumber = numbers[0]
lastNumber = numbers[-1]

if(firstNumber == lastNumber):
    print('True')
else:
    print('False')