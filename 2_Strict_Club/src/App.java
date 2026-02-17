import java.util.*;
import strict.club.algorithm;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        algorithm algo = new algorithm();

        String str;
        System.out.print("Input string: ");
        str = sc.nextLine();

        algo.setStr(str);
        System.out.println("Trimmed string: " + algo.getStr());
        sc.close();
    }
}
