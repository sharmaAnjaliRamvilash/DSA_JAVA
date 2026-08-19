#    random number generator
import random

num = input("Enter the number range")

if num.isdigit():
    int_num = int(num)
    if(int_num<=0):
        print("Please enter the number greater than 0")
        quit()
else:
    print("Please eneter the valid number")

random_num = random.randint(0,int_num)
# print(random_num)

while True:
    userGuess = input("Guess the number")
    if userGuess.isdigit():
        user = int(userGuess)
    else:
         print("Please choose the vlid number")
         continue
    
    if user==random_num:
        print("You got the right number")
        break
    else:
         if user>random_num:
             print("you'r above to the number")
         else:
              print("Your'r below to the number")
       


