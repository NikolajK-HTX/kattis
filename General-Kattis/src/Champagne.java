import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Champagne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> edges = new ArrayList<>(Arrays.asList(1, 1));

        int sum = 0;
        for (int i = 3; i <= N; i++) {
            ArrayList<Integer> nextEdges = new ArrayList<>();
            nextEdges.add(1);
            for (int j = 0; j < edges.size() - 1; j++) {
                nextEdges.add(edges.get(j) + edges.get(j + 1));
            }
            nextEdges.add(1);
            int edgeSum = nextEdges.stream().mapToInt(s -> s).sum();
            sum += Math.pow(edgeSum, 2) - Math.pow(i, 2);
            edges = nextEdges;
        }
        System.out.println(sum);
    }
}
