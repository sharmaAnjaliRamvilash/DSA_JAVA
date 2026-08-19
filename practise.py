











# import random
# def guessNumber():
#     luckynumber  = random.randint(0,10)
#     while True:
#         guessNumber = int(input("Guesss the  number"))
#         if  luckynumber==guessNumber:
#             print("You won the game !")
#             break
#         elif luckynumber>guessNumber:
#             print("yout number is smaller than the expected number")
#         else:
#             print("Your number is grater than the expected number")


# guessNumber()










# #    check the frequency of the word in a string
# str = "hello i am anjali"

# freq =  {}
# #   find the  frequency of the character
# for word in str:
#     for char  in word:
#          if(char in freq):
#               freq[char] +=1
#          else:
#           freq[char] = 1


# print(freq)

#   revers  the string

# str = "anjali sharma"
# #   using the slicing
# newStr = str[::-1]
# print(newStr)

#  using the iterator


# str = "anjali"
# text = ""
# for ch in str:
#     text = ch+text

# print(text)

#   list 

#   stores the same kind of data or it can be store the different type of the data


#    Todo app using the task......................................................

# tasks = []

# def showTask():
#     if not tasks:
#         print("Task not found")
#     else:
#         print("\n your tasks")
#         for i,task in enumerate(tasks,1):
#             print(f"{i} . {task}")

# def addTask():
#     task = input("Enter the task")
#     tasks.append(task)
#     print("Task added succesfully")


# def removeTask():
#     showTask()
#     try:
#         num = int(input("Enter the tasks to delete"))
#         removed =  tasks.pop(num-1)
#         print(f"Task removed successfully {removed}")
#     except:
#         print("Please select the valid number")


# def main():
#     while True:
#         print("\n To do app")
#         print("\n 1.Show Task")
#         print("\n 2.Add Task")
#         print("\n 3.Remove Task")
#         print("\n  4.Exist")

#         choice = input("Enter your choice")


#         if choice=="1":
#             showTask()
#         elif choice=="2":
#             addTask()
#         elif choice=="3":
#             removeTask()
#         elif choice=="4":
#             print("Good bye")
#             break
#         else:
#               print("Invalid choise ")
#               return

# main()

# .................................................................  contact book

# contact = {
#     "anjali":"7096056687",
#     "sumit":"9173126047"
# }

# name = input("Enter the name")

# if name in contact:
#     print(contact[name])
# else :
#      print("Not found name in contact details")


# .............................................................  
















