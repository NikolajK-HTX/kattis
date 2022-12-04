import java.util.Scanner;

public class FinalExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String prevAns = null;
        int counter = 0;
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if(prevAns == null) {
                prevAns = input;
            } else {
                if(prevAns.equals(input)) {
                    counter++;
                }
                prevAns = input;
            }
        }
        System.out.println(counter);
    }
}
