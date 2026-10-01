package LyThuyet;

import java.util.Arrays;

public class BubblesortDemo {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,2,5};
        System.out.println("Trước khi sắp xếp"+Arrays.toString(arr));


        bubbleSort(arr);
        System.out.println("Sau khi sắp xếp"+ Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
