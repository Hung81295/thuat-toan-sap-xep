package LyThuyet;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,2,5};
        System.out.println("Trước khi sắp xếp"+ Arrays.toString(arr));


        selectionSort(arr);
        System.out.println("Sau khi sắp xếp"+ Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//đưa từng phần tử về đúng vị trí của nó
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {// tìm ra vị trí của phần tử nhỏ nhất
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {// đổi chỗ phần tử đầu tiên của chuỗi chưa được sắp xếp với phần tử nhỏ nhất đổi chỗ cho arr[i] với arr[min]
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }
    }
}
