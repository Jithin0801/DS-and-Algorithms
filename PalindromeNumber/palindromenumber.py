l =[]
def digits(n):
    i = int(n)
    if n <= 0:
        return 1
    n = int(n % 10)
    l.insert(0 ,n)
    digits(int(i / 10))


i = 0
def revere(n):
    digits(n)
    sum = 0
    for i in range(0, len(l)):
        sum += l[i] * pow(10, i+1)
    return int(sum/10)


def main():
    a = int(input("Enter a number:"))
    b = revere(a)

    if(a == b):
        print(f"{a} is a palindrome")
    else:
        print(f"{a} in not a palindrome")

main()


#Clean code:

number = int(input("Enter the Number:"))
temp = number
reverse = 0
while number > 0:
    remainder = number % 10
    reverse = (reverse * 10) + remainder
    number = number // 10

if temp == reverse:
    print("Given number {} is Palindrome".format(temp))
else:
    print("Given number {} is not Palindrome".format(temp))