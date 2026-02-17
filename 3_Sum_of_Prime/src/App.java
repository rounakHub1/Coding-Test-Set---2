import java.util.Scanner;
import sum.prime.algorithm;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        algorithm algo = new algorithm();

        if (!sc.hasNextInt()) {
            System.out.println("ERROR");
            sc.close();
            return;
        }
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            algo.getNum(n, k);

            if (algo.solve()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
