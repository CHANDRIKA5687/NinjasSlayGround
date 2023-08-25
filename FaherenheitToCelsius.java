package ninjaslayground;
import java.util.* ;
import java.io.*; 

public class FaherenheitToCelsius {

    public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
        List<List<Integer>> result = new ArrayList<>();

        for (int fahrenheit = s; fahrenheit <= e; fahrenheit += w) {
            int celsius = (int) ((fahrenheit - 32) * 5.0 / 9.0); // Fahrenheit to Celsius conversion
            result.add(Arrays.asList(fahrenheit, celsius));
        }

        return result;
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        int step = 10;

        List<List<Integer>> conversionTable = fahrenheitToCelsius(start, end, step);

        System.out.println("Fahrenheit\tCelsius");
        for (List<Integer> entry : conversionTable) {
            System.out.println(entry.get(0) + "\t\t" + entry.get(1));
        }
    }
}
