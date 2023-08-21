package ninjaslayground;

import java.util.*;

class Pair {
  char firstLetterOfName;
  int avgMarks;

  Pair(char firstLetterOfName, int avgMarks) {
      this.firstLetterOfName = firstLetterOfName;
     this.avgMarks = avgMarks;
  }
}

public class AverageMarksDay9 {
 public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
     int sum = m1 + m2 + m3;
     int avgMarks = sum / 3;
     return new Pair(firstLetterOfName, avgMarks);
 }

 public static void main(String args[]) {
     AverageMarksDay9 s = new AverageMarksDay9();
     char firstLetterOfName = 'A';
     int m1 = 85;
     int m2 = 90;
     int m3 = 78;
     
     Pair result = averageMarks(firstLetterOfName, m1, m2, m3);
     System.out.println("First Letter: " + result.firstLetterOfName);
     System.out.println("Average Marks: " + result.avgMarks);
 }
}
