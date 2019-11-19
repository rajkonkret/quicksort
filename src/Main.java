import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 3, 4, 5, 5, 5, 4, 4, 3, 5, 7,9,9,9,9,0,0,0,0,0,0,4,3,1,6,7};
        //quickSort q=new qui
        QuickSort quickSort = new QuickSort();

        System.out.println(Arrays.toString(array));
        quickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}


