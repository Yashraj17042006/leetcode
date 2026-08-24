class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i)
            return i;
        }
        return n;
//         public static int missingNumber(int[] arr) {

//     HashSet<Integer> set = new HashSet<>();

//     // Store all array elements
//     for(int i = 0; i < arr.length; i++) {
//         set.add(arr[i]);
//     }

//     // Find the missing number
//     for(int i = 0; i <= arr.length; i++) {
//         if(!set.contains(i)) {
//             return i;
//         }
//     }

//     return -1;
// }
    }
}