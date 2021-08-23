player1 = input("Enter Player1 name: ")
print("Player1 is: "+player1)

player2 = input("Enter Player2 name: ")
print("Player2 is: "+player2)

player1Item = input(player1+" Choose an item from Rock, Paper and Scissor: ")
print("Player1 choosed "+player1Item)

player2Item = input(player2+" Choose an item from Rock, Paper and Scissor: ")
print("Player2 choosed "+player2Item)

if player1Item == player2Item:
    print("Tie!!")
elif player1Item == "Rock":
    if player2Item == "Scissor":
        print("Rock wins")
    else:
        print("Paper Wins")
elif player1Item == "Scissor":
    if player2Item == "Paper":
        print("Scissor wins")
    else:
        print("Rock wins")
elif player1Item == "Paper":
    if player1Item == "Rock":
        print("Paper wins")
    else:
        print("Scissor wins")
else:
    print("Invalid item entered! Please enter from Rock, Paper and Scissor. Try Again!")