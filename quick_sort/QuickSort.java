class Solution {
  public int[] sortArray(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
    return nums;
  }

  public void quickSort(int[] nums, int l, int r) {
    if (l < r) {
      int partitioningPosition = partition(nums, l, r);
      quickSort(nums, l, partitioningPosition - 1);
      quickSort(nums, partitioningPosition, r);
    }
  }

  public int partition(int[] arr, int left, int right) {
    int mid = left + (right - left) / 2;
    int partVal = arr[mid];

    while (left <= right) {
      while (arr[left] < partVal)
        left++;

      while (arr[right] > partVal)
        right--;

      if (left <= right)
        swap(arr, left++, right--);

    }

    return left;
  }

  public void swap(int[] arr, int l, int r) {
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
  }
}class QuickSort {
  
}