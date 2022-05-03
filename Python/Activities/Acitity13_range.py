a=[1,2,3,4,5]
for i in range(1,5):
   #print (i,end='')
    a[i-1]=a[i]
    #print(a[i-1],end="")
for i in range(0,5):
    print(a[i],end="")
