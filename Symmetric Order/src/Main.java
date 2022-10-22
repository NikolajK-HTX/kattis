import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setNumber = 0;
        while (true) {
            int N = Integer.parseInt(sc.nextLine());
            if(N == 0) {
                break;
            }
            ArrayList<String> namesEven = new ArrayList<>();
            ArrayList<String> namesOdd = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String name = sc.nextLine();
                if (i%2==0) {
                    namesEven.add(name);
                } else {
                    namesOdd.add(name);
                }
            }

            for (int i = namesOdd.size()-1; i >= 0; i--) {
                namesEven.add(namesOdd.get(i));
            }

            setNumber++;
            System.out.println("SET " + setNumber);
            namesEven.stream().forEach(System.out::println);
        }
    }
}