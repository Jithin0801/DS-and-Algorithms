from LinkedList import LinkedList


Linkedlist = LinkedList()

ans = 'y'
while ans == 'y' or 'Y':
    print("1. Add element to list")
    print("2. Remove element from list")
    print("3. Get the size of the list")
    print("4. Print the list")
    i = None
    try:
        i = int(input("Enter your choice: "))
    except ValueError:
       pass
    if i == 1:
        item = input("Enter the element: ")
        Linkedlist.add(item)
    elif i == 2:
        if Linkedlist.length() == 0:
            print("There is nothing to remove from the list!")
        else:
            Linkedlist.remove()
    elif i == 3:
        print(f"The size of the list is: {Linkedlist.length()}")
    elif i == 4:
         if Linkedlist.length() == 0:
            print("There is nothing to print in the list!")
         else:
            print(Linkedlist.printList())
    else:
        print("Enter a valid choice!")
    
    ans = input("Do you want to continue? (Y - Yes/N - No)")
