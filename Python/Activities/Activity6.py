def total(initial, *num, **key):
    count=initial
    #print(initial)
    print(num)
    #print(n)
    print( count)
    for n in num:
        #print(n)
        #print(num)
        count += n
        print(count)
        for k in key:
          print(key)
          print(k)
          count += key[k]
          print(key[k])
          print(count)
          return count
print(total(100,2,3, clouds=50, stars=100))


