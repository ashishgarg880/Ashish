try:
    for _ in range(int(input())):
        n,minX,maxX=map(int,input().split())
        rangeX=maxX-minX+1	
        if(rangeX%2 == 0):
        	even,odd = rangeX//2,rangeX//2
        elif(minX%2==0):
        	even,odd = rangeX//2+1,rangeX
        else:
        	even,odd = rangeX//2,rangeX//2+1
        for i in range(n):
        	w,b=map(int,input().split())
        	if(w%2==0 and b%2==0):
        		even=rangeX
        		odd=0
        	elif(w%2==0 and b%2!=0):
        		even=0
        		odd=rangeX
        	elif(w%2!=0 and b%2!=0):
        		even,odd=odd,even
        print(even,odd)
except:
    pass
