from Node import Node


class Tree:
    root = None


    def __init__(self):
        pass


    def add(self, data):
        if self.root is None:
            self.root = Node(data)
        else:
            self.root.add(data)
        
    def print(self):
        if self.root is None:
            print("The tree is empty!")
        else:
            self.root.print()