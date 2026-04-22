class Solution {
    public void reverseString(char[] s) {
        int index = 0;
        int length = s.length;
        char swap;

        while(index < length / 2) {
            swap = s[index];
            s[index] = s[length - 1 - index];
            s[length - 1 - index] = swap;
            index++;
        }

        System.out.println(s);
    }
}