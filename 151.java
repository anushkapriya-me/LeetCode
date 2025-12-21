//Q151. Reverse Words in a String

class Solution(object):
    def reverseWords(self, s):
        s = s.split()
        s = s[::-1]
        out = " ".join(s)
        return out