from math import sqrt
def gcd(n1,n2):
    n=min(n1,n2)
    for i in range(1,round(sqrt(n))+1):
        if(n1%i==0 and n2%i==0):
            a=i
        if(n%i==0):
            x=n//i
            if(n1%x==0 and n2%x==0):
                return x
    return a
for _ in range(int(input())):
    n,a,k=map(int,input().split())
    b=(n-1)*n
    T_A=(n-2)*180
    x=b*a+(k-1)*(2*(T_A-n*a))
    y=b
    g=gcd(x,y)
    x//=g
    y//=g
    print(x,y)
