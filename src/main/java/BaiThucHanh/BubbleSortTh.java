package BaiThucHanh;


public class BubbleSortTh {
    public static void main(String[] args) {
        int[] mangNgauNhien = {23, 5, 67, 12, 89, 3, 45, 78, 1, 56};
        int[] mangDaSapXep = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("---Mảng ngẫu nhiên---");
        bubbleSort(mangNgauNhien);
        System.out.println("---Mảng sắp xếp sẵn---");
        bubbleSort(mangDaSapXep);

    }

    public static void bubbleSort(int[] arr) {
        int soLanSoSanh = 0;
        int soLanDoicho = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                soLanSoSanh++;
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    soLanDoicho++;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Số lần so sánh: " + soLanSoSanh);
        System.out.println("Số lần đổi: " + soLanDoicho);
    }
}
