fruit_dictionary = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "mango": 50,
    "chicku": 15,
}

fruit = input("Which fruit you are looking for? ").lower()

if(fruit in fruit_dictionary):
    print('Yes, fruit ',fruit,' is available.')
else:
    print('No, fruit ',fruit,' is not available.')