#Q7. Reverse Integer

class Solution(object):
    def reverse(self, x):
        s = str(x)
        if(s[0] == '-'):
            s = '-' + s[:0:-1]
        else:
            s= s[::-1]
        
        num=int(s)
        if((num > -2**31) & (num < 2**31-1 )):
            return num
        return 0