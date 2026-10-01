package LyThuyet;

import java.util.Arrays;

public class IsertionSort {
    public static void main(String[] args) {

        int[] arr={3,4,5,6,2,5};
        System.out.println("Trước khi sắp xếp"+ Arrays.toString(arr));


        insertion(arr);
        System.out.println("Sau khi sắp xếp"+ Arrays.toString(arr));

    }
    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {//đứa các phần tử về đúng vị trí của chúng
                if (arr[j] < arr[j - 1]) {//  đưa 1 phần tử đang kiểu tra phần tử ở i vếf đúng vị trí của nó
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else  {
                    break;
                }
            }
        }
    }
}
