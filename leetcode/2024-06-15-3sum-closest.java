/**
 * Leetcode
 * problem: 16
 * link: https://leetcode.com/problems/3sum-closest/
 */

/**
 * Success:
 * 12 ms
 * Beats 96.09%
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int result = nums[0] + nums[1] + nums[2];
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++){
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target) { return sum; }
                else if(sum < target) { j++; }
                else { k--; }

                int diff = Math.abs(target - sum);
                if(diff < closest){
                    closest = diff;
                    result = sum;
                }
            }
        }
        return result;
    }
}

/**
 * Success:
 * 486 ms
 * Beats 7.00%
 */
//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        int closest = Integer.MAX_VALUE;
//        int result = Integer.MAX_VALUE;
//        int n = nums.length;
//        for(int i = 0; i < n - 2; i++){
//            for(int j = i + 1; j < n - 1; j++){
//                for(int k = j + 1; k < n; k++){
//                    int sum = nums[i] + nums[j] + nums[k];
//                    int abs = Math.abs(target - sum);
//                    if(abs == 0) {
//                        return sum;
//                    }
//                    else if(abs < closest) {
//                        closest = abs;
//                        result = sum;
//                    }
//                }
//            }
//        }
//        return result;
//    }
//}