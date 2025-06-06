// Time Complexity : O(N)
// Space Complexity : O(1)

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum=0, max=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                rSum -= 1;
            } else {
                rSum += 1;
            }
            if(map.containsKey(rSum)) {
                max = Math.max(max, i-map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}