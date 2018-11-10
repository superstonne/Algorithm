package utils;

import java.util.Random;

/**
 * @description:
 * @author: hejinlong
 * @create: 2018-11-10 17:38
 */
public class ArrayUitl {

    public static int[] createRandomIntArray(int length) {
        Random random = new Random();
        if (length <= 0) {
            return null;
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
    public static int[] createSequIntArray(int length) {
        if (length <= 0) {
            return null;
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void printArrayInOneLine(int[] arr) {
        if (arr == null) return;
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
