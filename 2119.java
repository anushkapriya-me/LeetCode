//Q2119. A Number After a Double Reversal
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0)
        {
            return true;
        }
        return num % 10 != 0;
    }
}