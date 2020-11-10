l = []
def findDivisiors(n):
    for i in range(1, n):
        if n%i == 0:
            l.append(i)


def isPerfect(n):
    findDivisiors(n)
    sum = 0
    for i in range(0, len(l)):
        sum += l[i]
    
    if n == sum:
        return True
    else:
        return False

def main():
    n = int(input("Enter a number: "))
    if isPerfect(n):
        print(f"{n} is a perfect number")
    else:
        print(f"{n} is not a perfect number")


main()