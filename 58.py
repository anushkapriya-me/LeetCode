#Q58. Length of Last Word
class Solution(object):
    def lengthOfLastWord(self, s):
        words=s.split()
        return len(words[-1])