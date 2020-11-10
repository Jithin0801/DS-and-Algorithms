class Node:
    data = None
    leftChild = None
    rightChild = None


    def __init__(self, data):
        self.data = data

    @property
    def getData(self):
        return self.data
    
    @getData.setter
    def setData(self, data):
        self.data = data

    @property
    def getLeftChild(self):
        return self.leftChild
    
    @getLeftChild.setter
    def setLeftChild(self, leftChild):
        self.leftChild = leftChild
        
    @property
    def getRightChild(self):
        return self.rightChild

    @getRightChild.setter
    def setRightChild(self, rightChild):
        self.rightChild = rightChild

    
    

    def add(self, data):
       
        if data < self.getData:
            if self.getLeftChild is None:
                self.setLeftChild = Node(data)
            else:
                self.getLeftChild.add(data)
        elif data > self.getData:
            if self.getRightChild is None:
                self.setRightChild = Node(data)
            else:
                self.getRightChild.add(data)
        elif data == self.getData:
            print("Value already exists!")

    def print(self):
        if self.leftChild is None:
            print(self.data)
            return
        else:
            self.leftChild.print()
        
        print(self.data)

        if self.rightChild is None:
            print(self.data)
            return
        else:
            self.rightChild.print()




    def __str__(self):
        return self.data