def array(s,n):
    lps=[0 for _ in range(n)]
    len=0
    i=1
    while i<n:
        if s[i]==s[len]:
            len+=1
            lps[i]=len
            i+=1
        else:
            if len!=0:
                len=lps[len-1]
            else:
                lps[i]=0
                i+=1
    return lps

def Search(t,s,lps):
    n=len(s)
    m=len(t)
    i=0
    j=0
    c_arr=[0 for _ in range(n)]
    while i<n:
        c_arr[i]=c_arr[i-1]
        if s[i]==t[j]:
            i+=1
            j+=1
        if j==m:
            c_arr[i-1]+=1
            j=lps[j-1]
        elif i<n and s[i]!=t[j]:
            if j!=0:
                j=lps[j-1]
            else:
                i+=1

    return c_arr
s=input()
t=input()
lps=array(t,len(t))
c1=Search(t,s,lps)[-1]
c_arr=Search(t,s*2,lps)
c2=c_arr[-1]
c3=c2-(2*c1)
for i in range(int(input())):
    n=int(input())
    v=n//len(s)
    if v:
        ans=(v*c1)+(v-1)*c3
        x=n%len(s)
        ans+=c_arr[len(s)-1+x]-c_arr[len(s)-1]
    else:
        x=n%len(s)
        ans=c_arr[x-1]
    print(ans)
