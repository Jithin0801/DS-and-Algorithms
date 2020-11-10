l =[]
fact = []
def digits(n):
    i = int(n)
    if n <= 0:
        return 1
    n = int(n % 10)
    l.append(n)
    digits(int(i / 10))

def factorial(n):
    if n <= 1:
        return 1
    return(n * factorial(n-1))



def strong(n):
    digits(n)
    sum = 0
    for i in l:
        sum = sum + factorial(i)
    
    if sum == n:
        print(f"{n} is a strong number")
    else:
        print(f"{n} is not a strong number")

strong(40585)