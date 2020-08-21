for _ in range(int(input())):
    [n, h, y1, y2, l] = list(map(int, input().split(" ")))
    barriers = 0
    for _ in range(n):
        [typ, distance] = list(map(int, input().split(" ")))
        if(typ==1):
            if(distance < h-y1):
                l-= 1
        else:
            if(distance > y2):
                l-= 1
        if l<=0:
            continue
        else:
            barriers+=1
    print(barriers)
