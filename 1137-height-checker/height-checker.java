class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];

        // Count frequency
        for (int h : heights) {
            count[h]++;
        }

        int index = 0;
        int mismatch = 0;

        // Compare expected sorted order with original array
        for (int h = 1; h <= 100; h++) {
            while (count[h] > 0) {
                if (heights[index] != h) {
                    mismatch++;
                }
                index++;
                count[h]--;
            }
        }

        return mismatch;
    }
}