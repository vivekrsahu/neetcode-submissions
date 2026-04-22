class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] output = new int[length * 2];
        int index = 0;

        while(index < length) {
            output[index] = nums[index];
            output[index + length] = nums[index];
            index++;
        }

        return output;
    }
}