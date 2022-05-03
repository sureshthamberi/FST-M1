age=40
salutation='Mr'
initl='T'

txt="I am {} suresh {} and my age is {}"
print(txt.format(salutation,initl, age))
print(txt.format(age,salutation,initl))
# print(txt.format( age[2], salutation[1], initl[0] ))  -- WRONG DECLARATION INSTEAD BELOW CAN BE DECLARED
TXT=" i AM {2} SURESH {0} AND MU AGE IS {1}"
print(TXT.format(age,salutation,initl))