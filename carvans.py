def carvans(t):
    for _ in range(t):
        a=int(input())
        count=1
        n=list(map(int,input().split()))
        for i in range(a-1):
            if n[i]>=n[i+1]:
                count+=1
            else:
                n[i+1]=n[i]
        print(count)
t=int(input())
carvans(t)
