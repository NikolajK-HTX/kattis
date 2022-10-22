import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mainRing = sc.nextInt();
        for (int i = 0; i < N-1; i++) {
            int currentRing = sc.nextInt();
            int divisor = commonDivisor(mainRing, currentRing);
            System.out.println("" + (mainRing/divisor) + "/" + (currentRing/divisor));
        }
    }

    public static int commonDivisor(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return commonDivisor(n2, n1 % n2);
    }
}