import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int G = sc.nextInt();
            sc.nextLine();
            String guestsString = sc.nextLine();
            String[] guests = guestsString.split(" ");
            for (int j = 0; j < guests.length; j++) {
                String guest = guests[j];
                int noOfElements = (int) Arrays.stream(guests)
                                               .filter(s -> s.equals(guest))
                                               .count();
                if (noOfElements == 1) {
                    System.out.println("Case #" + (i+1) + ": " + guest);
                }
            }
        }
    }
}