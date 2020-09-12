def pos(sm):
    a=sqrtl(1ul+2)
    a=a-1.0m
    a=a/2.0
    fs=a
    return fs
def fun(n):
    if(n=0 or n==1 or n==2):
        print(0,end="")
        continue
    t1=(n*(n+1))/2
    if (t1%2!=0):
        print(0,end="")
        continue;
    indx=pos(t1)
    ss=indx*(indx+1)/2
    if (t1/2==s):
        ans=(indx*(indx-1ul))/2l+((n-indx)*(n-indx-1ul))/2l+(n-indx)
        print(0,end="")
    else:
        print(n-indx,end="")
    
        
t=int(input())
while t>0:
    n=int(input())
    print(func(n))
