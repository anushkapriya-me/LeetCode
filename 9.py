#Q9. Palindrome Number
class Solution(object):
    def isPalindrome(self, x):

        if(x < 0):
            return False
        temp = int(x)
        reverse = 0 
        while(temp):
            reverse = (reverse *10) + temp%10
            temp /= 10
        if(reverse == x):
            return True
        else:
            return False