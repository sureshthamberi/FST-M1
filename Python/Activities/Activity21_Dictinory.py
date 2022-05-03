count={}
count[(1,2,3)]=5
count[(4,2,1)]=7
count[(1,2)]=6
count[(4,2,1)]=2
tot=0
for i in count:
    tot=tot+count[i]
    #print (tot)
    print(count[i])

#print(len(count)+tot)