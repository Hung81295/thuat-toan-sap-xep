package BaiThucHanh;

import java.util.Arrays;

public class SelectionSortTh {
    public static void main(String[] args) {
int a[]={5,6,2,6,27,8,34,8,4,8,23,7,854,23,5};
        System.out.println("Trước khi sắp xếp: "+Arrays.toString(a));
        selectionSor(a);
        System.out.println("Sau khi sắp xếp: "+ Arrays.toString(a));
    }

    public static void selectionSor(int[] a) {
        int soLanSoSanh = 0;
        int soLanDoiCho = 0;
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                soLanSoSanh++;
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
                soLanDoiCho++;
            }
        }

        System.out.println("Số lần so sánh: "+soLanSoSanh);
        System.out.println("Số lần đổi chỗ: "+soLanDoiCho);
    }
}
