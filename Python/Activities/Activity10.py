tuple = list(input("Enter a numbers in tuple separated by comma : ").split(','))
print("User Enters List of Tuples: ", tuple)

print("List of Tuples from the user input which are divisible by 5: ")
for number in tuple:
    if(int(number) % 5 == 0):
        print(number)