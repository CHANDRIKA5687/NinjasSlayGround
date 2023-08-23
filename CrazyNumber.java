package ninjaslayground;


import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class CrazyNumber {

    public static ArrayList<ArrayList<Integer>> numberPattern(int n) {
        ArrayList<ArrayList<Integer>> pattern = new ArrayList<>();

        int currentNumber = 1;
        for (int row = 1; row <= n; row++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (int space = 1; space <= n - row; space++) {
                currentRow.add(-1); // Add a placeholder for the spaces
            }
            for (int col = 1; col <= row; col++) {
                currentRow.add(currentNumber);
                currentNumber = (currentNumber % 9) + 1; // Restart from 1 after 9
            }
            pattern.add(currentRow);
        }

        return pattern;
    }

    public static void main(String[] args) {
        int N = 4;
        ArrayList<ArrayList<Integer>> result = numberPattern(N);

        int maxLength = result.get(result.size() - 1).size();

        for (ArrayList<Integer> row : result) {
            int numSpaces = maxLength - row.size();
            for (int i = 0; i < numSpaces; i++) {
                System.out.print(" ");
            }
            for (Integer num : row) {
                if (num == -1) {
                    System.out.print(" ");
                } else {
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }
}