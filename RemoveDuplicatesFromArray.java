
import java.util.ArrayList;
public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (!arr.get(i).equals(arr.get(i + 1))) {
                arr.set(index++, arr.get(i));
            }
        }
        
        arr.set(index++, arr.get(n - 1)); // Store the last element
        
        return index;
    }
}