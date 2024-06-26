package org.limon.Sorting;

public class InsertionSort {
    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            while (j >= 0 && nums[j+1] < nums[j]) {
                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        return nums;
    }
}
