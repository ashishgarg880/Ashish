# cook your dish here
import math
def lcm(list1):
    lcm1=list1[0]
    for i in range(1,len(list1)):
        lcm1=lcm1*list1[i]//math.gcd(lcm1,list1[i])
    return lcm1
n=int(input())
for i in range(n):
    length=int(input())
    list1=list(map(int,input().split()))
    number=lcm(list1)
    if number%2!=0:
        print("YES")
    else:
        print("NO")
