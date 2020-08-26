t=int(input())
if t<50:
    for i in range(t):
        n,m=map(int, input().split())
        uncomp=[]
        chef=[]
        ass=[]
        comp=list(map(int, input().split()))
        count=0
        for j in range(1,n+1):
            if j not in comp:
                  count+=1
                  if count%2==1:
                      chef.append(j)
                  else:
                      ass.append(j)

        for j in chef:
            print(j,end=" ")

        for j in ass:
            print(" ",j,end=" ")
