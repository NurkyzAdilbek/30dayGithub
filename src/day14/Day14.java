package day14;

public class Day14 {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //On
    public static void nestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
    //On2
    public static void reduceByHalf(int n) {
        while (n > 0) {
            System.out.println(n);
            n /= 2;
        }
    }
    //Ologn

    public static int recursiveFunction(int n) {
        if (n <= 1) {
            return 1;
        }
        return recursiveFunction(n - 1) + recursiveFunction(n - 1);
    }
    //o2n

}

