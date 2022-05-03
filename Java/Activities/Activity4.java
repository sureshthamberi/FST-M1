package Activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] ArryNums={4,1,3,5,2,0,7,9};

        //before sorting- Arry Values
        System.out.println("Arry values before sort:" + Arrays.toString(ArryNums));
        ascendingSort(ArryNums);
        System.out.println("Arry values Afer sort:" + Arrays.toString(ArryNums));
    }
static void ascendingSort(int digits[]){
    int size = digits.length, i;

    for (i = 1; i < size; i++) {
        int key = digits[i];
        int j = i - 1;

        while (j >= 0 && key < digits[j]) {
            digits[j + 1] = digits[j];
            --j;
        }
        digits[j + 1] = key;
    }
}

}
