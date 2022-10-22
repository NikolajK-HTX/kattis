import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputValues = sc.nextLine().split(" ");
        int initialRows = Integer.parseInt(inputValues[0]);
        int initialColumns = Integer.parseInt(inputValues[1]);
        int scaleRows = Integer.parseInt(inputValues[2]);
        int scaleColumns = Integer.parseInt(inputValues[3]);

        String output = "";
        for (int i = 0; i < initialRows; i++) {
            String line = sc.nextLine();
            int[] values = line.chars().toArray();
            String row = "";
            for (int n = 0; n < line.length(); n++) {
                row += (line.charAt(n) + "").repeat(scaleColumns);
            }
            output += (row+"\n").repeat(scaleRows);
        }
        System.out.println(output);
    }
}