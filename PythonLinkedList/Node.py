class Node:
    data = None
    next = None
    previous = None


    def __init__(self, data):
        self.data = data

    @property
    def getData(self):
        return self.data
    
    @getData.setter
    def setData(self, data):
        self.data = data

    @property
    def getPrevious(self):
        return self.previous
    
    @getPrevious.setter
    def setPrevious(self, previous):
        self.previous = previous
        
    @property
    def getNext(self):
        return self.next

    @getNext.setter
    def setNext(self, next):
        self.next = next


    def __str__(self):
        s = f"Data:{self.data}"
        return s