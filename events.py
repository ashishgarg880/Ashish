days = {"monday":1,"tuesday":2,"wednesday":3,"thursday":4,"friday":5,"saturday":6,"sunday":7}
for _ in range(int(input())):
    fd,ld,l,r = input().split()
    r,l = int(r),int(l)
    d = days[ld] - days[fd]+1
    if d<0:
        d+=7
    x = []
    while(d<=r):
        x.append(d)
        d+=7
    c=0
    ans = 0
    for i in x:
        if i>=l and i<=r:
            c+=1
            ans = i
    if c==0:
        print("impossible")
    elif c==1:
        print(ans)
    else:
        print("many")
