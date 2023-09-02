package ninjaslayground;
import java.util.*;

public class Day21 {
    public static boolean checkDiff(int[] arr, int N, int K) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int target1 = arr[i] + K;
            int target2 = arr[i] - K;

            if (set.contains(target1) || set.contains(target2)) {
                return true; // If a pair is found, return true
            }

            set.add(arr[i]);
        }

        return false; // Return false if no such pair is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of the array
            int K = scanner.nextInt(); // Difference to check
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt(); // Input array elements
            }

            boolean result = checkDiff(arr, N, K);
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}