class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        int first = 0;

        List<List<Integer>> output = new ArrayList<>();

        while (first < nums.length - 2) {

            int second = first + 1;
            int third = nums.length - 1;

            int target = -nums[first];

            while (second < third) {

                int sum = nums[second] + nums[third];

                if (sum == target) {

                    output.add(
                        List.of(nums[first], nums[second], nums[third])
                    );

                    // Skip duplicate second values
                    while (second < third &&
                           nums[second] == nums[second + 1]) {
                        second++;
                    }

                    // Skip duplicate third values
                    while (second < third &&
                           nums[third] == nums[third - 1]) {
                        third--;
                    }

                    // Move both pointers to look for a new pair
                    second++;
                    third--;

                } else if (sum > target) {

                    third--;

                } else {

                    second++;
                }
            }

            // Skip duplicate first values
            while (first < nums.length - 2 &&
                   nums[first] == nums[first + 1]) {
                first++;
            }

            first++;
        }

        return output;
    }
}