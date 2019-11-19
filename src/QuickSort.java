public class QuickSort {

    public QuickSort() {
    }

    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int iterations = start;
        for (int s = start; s < end; s++) {
            if (array[s] <= array[end]) {
                change(array, s, iterations);
                iterations++;
            }
        }
        change(array, end, iterations);
        return iterations;
    }

    private void change(int[] array, int first, int last) {
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }
}
