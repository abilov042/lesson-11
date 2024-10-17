package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //2, 2, 8, 1, 6, 2 ,7, 4

        //           {1, 2, 8, 1, 6, 2, 7, 4};
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//        }

//        System.out.println(min);

        int[] arr = {5, 2, 8, 1, 6, 2, 7, 4};
        //          {1, 2, 8, 5, 6, 2, 7, 4}
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
