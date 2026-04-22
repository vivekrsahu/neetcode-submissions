class Solution {
    public void reverseString(char[] s) {
        int index = 0;
        char swap;

        while(index < s.length / 2) {
            swap = s[index];
            s[index] = s[s.length - 1 - index];
            s[s.length - 1 - index] = swap;
            index++;
        }

        System.out.println(s);
    }
}