package Cyclic_Sort_Pattern;

// Problem Statement: Find all Missing Numbers (easy)
// LeetCode Question: 448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.List;

public class Problem_3_FindAllMissingNumbers {
    public List<Integer> findNumbers(int[] nums){
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                missingNumbers.add(j + 1);
            }
        }
        return missingNumbers;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
