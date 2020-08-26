t=int(input())
for i in range(t):
    k=int(input())
    row=[]
    col=[]
try:
      for i in range(8):
            row=[]
            for j in range(8):
                row.append("X")
            col.append(row)

            for i in range(8):
               for j in range(8):
                    if(k!=0):
                        col[i][j]="."
                        k=k-1
                    else:
                        break
            col[0][0]="0"

            for i in range(8):
                for j in range(8):
                    print(col[i][j],end="")
                print()
except:
    print("Error completion")
