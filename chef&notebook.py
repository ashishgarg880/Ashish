T=int(input())
for i in range(T):
    X,Y,K,N=list(map(int,input().split()))
    book=[]
    if N>0:
        for _ in range(N):
            P,C=list(map(int,input().split()))
            book.append((P,C))
        rem=X-Y

        found=False
        for P,C in book:
            if K>=C and P>=rem:
                found=True
                break
            
        if found:
            print("LuckyChef")

        else:
            print("UnluckyChef")
