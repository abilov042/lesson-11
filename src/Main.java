import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4 , 9 , 10 , 11, 12, 13}; // temp 5, arr[j + 1] = temp
                //   2, 2, 8, 1, 6, 2 ,7, 4

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            boolean isSorted = false;
            for(int j = 0; j < arr.length - i- 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1]; // 2
                    arr[j + 1] = temp; // 5
                    isSorted = true;
                }
                System.out.println(Arrays.toString(arr));
            }
            if(!isSorted){
                break;
            }
            System.out.println("-------------------");
        }
    }

}