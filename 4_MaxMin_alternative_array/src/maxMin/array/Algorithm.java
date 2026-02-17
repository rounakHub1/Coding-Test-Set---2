package maxMin.array;

import java.util.Arrays;

public class Algorithm {

    private int[] arr, finalArr;
    private int ln, fln=0;

    public void setArr(int[] arr) {
        this.arr = arr;
        ln = arr.length;
        finalArr = new int[ln];
    }
    private void sortArr() {
        Arrays.sort(arr);
    }
    private int calculate(int idx) {
        int i=0;
        while(i<idx) {

            finalArr[fln++] = arr[i];
            finalArr[fln++] = arr[ln-1-i];
            i++;
        }
        return i;
    }
    public int[] getArr() {

        sortArr();
        int i = calculate(ln/2);
        if(i == (ln-1)/2)
            finalArr[fln++] = arr[i];

        return finalArr;
    }
}
