package BaiThucHanh;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] mangSapXepSan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mangNgauNhien = {24, 5, 67, 2, 5, 6, 72, 24, 7, 5};
        int[] mangNguoc = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Mảng sắp xếp sẵn");
        insertion(mangSapXepSan);
        System.out.println("Mảng ngẫu nhiên");
        insertion(mangNgauNhien);
        System.out.println("Mảng ngược");
        insertion(mangNguoc);
    }

    public static void insertion(int[] arr) {
        int soLanSoSanh=0;
        int soLanDoi=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                soLanSoSanh++;
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    soLanDoi++;
                } else {
                    break;
                }
            }
        }
        System.out.println("Mảng sau khi xếp: "+ Arrays.toString(arr));
        System.out.println("Số lần so sánh: "+soLanSoSanh);
        System.out.println("Số lần đổi: "+soLanDoi);
    }
}
