for _ in range(int(input())):
    n=int(input())
    a=[int(x) for x in input().split()]
    mul,mod=[a[0]],1000000007
    sumy,temp=0,a[0]
    pr1=1
    for i in range(1,n+1):
        pr=(a[i]*temp)
        sumy=2*sumy+pr
        temp += (a[i] * pr1)
        pr1=(pr1*2)%mod
    print((sumy*2)%mod)
