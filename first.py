#    working with the series

import pandas as  pd


studentsName = ["anjali","sneha","priya","ragini","rajvi"]
mySeries = pd.Series([31,22,63,84,95])    

#      who score >75
# print(mySeries[mySeries>75])
#    add 5 marks
# print(mySeries+5)

# desc = mySeries.sort_values(ascending=False)
count=0

if(mySeries[mySeries>75]):
    count+=1


print(count)






# print(mySeries.mean)

# decreaseOrder  =    mySeries.sort_values(ascending=True)
# print(decreaseOrder)





#    statical function on the series
# print(mySeries.mean())
# print(mySeries.median())
# print(mySeries.mode())
# print(mySeries.std())
# print(mySeries.var())
# print(mySeries.max())
# print(mySeries.min())



# print(mySeries*mySeries)
# print(mySeries+mySeries)
# print(mySeries-mySeries)

# print(mySeries[mySeries>2])


#    fetch the that data from the series which are havinng the  greater >2 values


















#    check the amount that  you have provided
# class miniAtm:  

#     def __init__(self,name,pin,amount):
#         self.name = name
#         self.pin = pin
#         self.amount = amount
    
#     def  checkPin(self):
#         enteredPin = int(input("Enter the pin"))

#         if enteredPin==self.pin:
#             print("Authentication is successfully completed")
#             self.menu()
    
#     def menu(self):
#         while True:
#          print("1. Withdraw  the money \n")
#          print("2.  Deposite the money \n")
#          print("3. Check the Balance \n")
#          print("4. exist")

#          choise = (input("Enter the choise  as given "))

#          if choise =="1":
#              self.withdraw()
#          elif choise =="2":
#               self.deposite()
#          elif choise=="3":
#              self.Balance()
#          elif choise=="4":
#              self.exist()
#         else :
#             print("please enter the valid choise")
#             return False
        
#     def  withdraw(self,amount):
#         amount = int(input("How much amount do you access \n"))

#         if amount<self.amount:
#            print("you don't have the enough amount to access")
#            return
#         else:
#             print("Your withdrwal amount is succefully received")
#             amount -= self.amount
    

#     def deposite(self,amount):
#          amount += self.amount
    
#     def checkBalance(self):
#         print(f"your current amount is {self.amount}")



# m = miniAtm("anjali",1,2000)
# m.withdraw(200)
# m.checkBalance()
# m.deposite(3000)


# .................................  Task  management system 



# myData = []
# leftTask = []
# completedTask = []

# class  TaskManagemet:
#     def __init__(self,task):
#         self.task = task
    
#     def checkLeftTask(self):
#         if len(myData)==0:
#             print("There is no task to complete")
#             self.add()
#         else:
#                 for  i in leftTask:
#                      print(f"please this all task first {i}")
    
#     def addTask(): 
#          while True:
#               task = input("please enter the task")
#               myData.append(task)


# ...........................................

# class Tree:
#     def __init__(self,data):
#         self.data = data
#         self.left = None
#         self.right = None

# root = Tree(2)

# nodeA = Tree(9)
# nodeB = Tree(3)
# nodeC = Tree(4)
# nodeD = Tree(5)
# nodeE = Tree(6)
# nodeF = Tree(7)

# root.left  = nodeA
# root.right = nodeB
# nodeA.left = nodeC
# nodeB.right = nodeD



# def preOrder(root):
#      if root is None:
#          return
# preOrder(root.left)
# print(root.data, end=",")
# preOrder(root.right)

# preOrder(root)
        


# ...................................................... 











    


    
    
    




             


            



    
     

