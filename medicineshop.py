l=[31,28,31,30,31,30,31,31,30,31,30,31]
t=0
try:
    t=int(input())
except:
    pass
for i in range(t):
    n=""
    try:
        n=list(map(int,input().split(':')))
    except:
        pass
    if (n[0]%4==0 and n[0]%100!=0) or (n[0]%400)==0:
        l[1] +=1
    c=1
    c +=int((l[n[1]-1]-n[2])/2)
    if l[n[1]-1]%2==0:
        if n[2]%2==0:
            c +=15
        else:
            c +=16
    if (n[0]%4==0 and n[0]%100!=0) or (n[0]%400)==0:
        l[1] -=1
    print(c)
