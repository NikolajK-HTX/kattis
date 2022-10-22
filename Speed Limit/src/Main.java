import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            if (N == -1) {
                break;
            }
            int prevMiles = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int speed = sc.nextInt();
                int totalMiles = sc.nextInt();
                int miles = totalMiles - prevMiles;
                sum += miles*speed;
                prevMiles = totalMiles;
            }
            System.out.println(sum + " miles");
        }
    }
}