import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        //quickSort q=new qui
        QuickSort quickSort = new QuickSort();

        System.out.println(Arrays.toString(array));
        quickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}


