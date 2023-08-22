package ninjaslayground;

import java.util.Scanner;

public class FindCharacterCaseDay10 {
    public static int findCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return 1; // Uppercase
        } else if (ch >= 'a' && ch <= 'z') {
            return 0; // Lowercase
        } else {
            return -1; // Non-alphabet
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int result = findCase(ch);
        
      
    }
}
