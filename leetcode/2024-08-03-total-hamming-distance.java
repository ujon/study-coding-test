/**
 * Leetcode
 * problem: 477
 * link: https://leetcode.com/problems/total-hamming-distance/description/
 * tag: Array, Math, Bit Manipulation
 */

class Solution {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                result = result + Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return result;
    }
}