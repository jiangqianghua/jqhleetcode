class Solution:
    def twoSum(self, nums, target):
        hashTable = dict()
        for i, num in enumerate(nums):
            if target - num in hashTable:
                return [hashTable[target - num], i]
            hashTable[nums[i]] = i
        return []

solution = Solution()
nums = [3,5,6,7,9]
target = 13
result = solution.twoSum(nums, target)
if len(result) == 2:
    print(result[0], result[1])
