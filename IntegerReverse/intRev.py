l =[]
def digits(n):
    i = int(n)
    if n <= 0:
        return 1
    n = int(n % 10)
    l.insert(0 ,n)
    digits(int(i / 10))


i = 0
def toInt(l):
    sum = 0
    for i in range(0, len(l)):
        sum += l[i] * pow(10, i+1)
    return int(sum/10)


def main():
    n = int(input("Enter a number:"))
    digits(n)
    print(l)
    print(toInt(l))

main()