import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[32];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        AwesomeSort ShellSort = new ShellSort();
        ShellSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
