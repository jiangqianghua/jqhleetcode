import java.util.HashMap;
import java.util.Map;

public class DemoJava {
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 26;
        int[] result = Solution.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("not found");
        }
    }
}

class Solution{
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap();
        for (int i = 0; i < nums.length; ++i) {
            int val = target - nums[i];
            if (hashTable.containsKey(val)) {
                return new int[]{hashTable.get(val), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }
}