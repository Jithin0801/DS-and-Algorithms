from Node import Node


class LinkedList:
    Head = None
    size = 0

    def __init__(self):
        pass


    def add(self, node):
        node = Node(node)
        node.setNext = self.Head
        if self.Head is None:
            self.Head = node
            LinkedList.size += 1
        else:
            self.Head.setPrevious = node
            node.setNext = self.Head
            LinkedList.size += 1
        self.Head = node 


    def remove(self):
        self.Head = self.Head.getNext
        self.Head.setPrevious(None)
        LinkedList.size -= 1
        
        
    def printList(self):
        current = self.Head
        if self.Head is None:
            print("List is Empty!")
        else:
            print("HEAD -->", end=" "),
            while current is not None:
                print(f"[{current.getPrevious}, {current}, {current.getNext}]", end=" "),
                print("-->", end=" "),
                current = current.getNext
            print("TAIL"),

        
    def length(self):
        return self.size