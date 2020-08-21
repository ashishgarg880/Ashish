def bitwise(n,array):
    counter=0
    if n==1:
        return 0
    else:
        for i in range(n-1):
            for j in range(i+1,n):
                if array[i] & array[j]==array[i]:
                    counter+=1
                    print(i,j)
        return counter
               
testcase=int(input())
while testcase>0:
    n=int(input())
    array=[int(i) for i in input().split()]
    result=bitwise(n,array)
    print(result)
    testcase-=1
