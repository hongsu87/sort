public class SelectionSort extends AwesomeSort {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
}
