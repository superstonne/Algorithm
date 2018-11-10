package search;

import utils.ArrayUitl;

/**
 * @description:
 * @author: hejinlong
 * @create: 2018-11-10 17:32
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = ArrayUitl.createSequIntArray(20);
        ArrayUitl.printArrayInOneLine(arr);
        System.out.println(binarySearch(arr, 20));
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == middle) {
                return middle;
            } else if (target < middle) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
