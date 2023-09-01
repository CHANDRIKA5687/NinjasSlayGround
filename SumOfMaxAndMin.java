package ninjaslayground;
import java.util.* ;
import java.io.*; 

public class SumOfMaxAndMin {
    public static int sumOfMaxMin(int[] arr, int n) {
        if (n <= 0) {
            return 0; 
        }
        
        int max = arr[0]; 
        int min = arr[0]; 
        for (int i = 1; i < n; i++) {
        max = Math.max(max, arr[i]); // Update max if a larger element is found
        min = Math.min(min, arr[i]); // Update min if a smaller element is found
        }
          return max + min;
    }
}