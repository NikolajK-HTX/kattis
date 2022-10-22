import java.util.Collection;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfIter = sc.nextInt();
        sc.nextLine();
        HashMap<String, String> birthdays = new HashMap<>();

        for (int i = 0; i < noOfIter; i++) {
            String[] values = sc.nextLine().split(" ");
            String name = values[0];
            int likeness = Integer.parseInt(values[1]);
            String birthdate = values[2];
            String current = birthdays.get(birthdate);
            if (current == null) {
                birthdays.put(birthdate, name + " " + likeness);
                continue;
            }

            String[] storedValues = current.split(" ");
            if (likeness > Integer.parseInt(storedValues[1])) {
                birthdays.put(birthdate, name + " " + likeness);
            }
        }
        Collection<String> stringCollection = birthdays.values();
        System.out.println(stringCollection.size());
        stringCollection.stream().sorted().forEach(s -> System.out.println(s.split(" ")[0]));
    }
}