class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(helper(red, blue), helper(blue, red));
    }

    private int helper(int first, int second) {
        int row = 1;

        while (true) {
            if (row % 2 == 1) { // First color
                if (first < row) break;
                first -= row;
            } else { // Second color
                if (second < row) break;
                second -= row;
            }
            row++;
        }

        return row - 1;
    }
}