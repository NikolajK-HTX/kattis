import java.util.Scanner;

public class AFA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scale = Integer.parseInt(sc.nextLine());
        int gin = 45*scale;
        int juice = 30*scale;
        int syrup = 10*scale;
        int lemon = 1*scale;


        System.out.format("%d ml gin\n", gin);
        System.out.format("%d ml fresh lemon juice\n", juice);
        System.out.format("%d ml simple syrup\n", syrup);
        System.out.format("%d %s of lemon\n", lemon, (scale == 1 ? "slice" : "slices"));
    }
}
