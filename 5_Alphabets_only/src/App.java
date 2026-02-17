import alphabetsOnly.Algorithm;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Algorithm algo = new Algorithm();

        String str;
        System.out.print("Enter the String: ");
        str = sc.nextLine();

        algo.setStr(str);
        System.out.println("String is: " + algo.getStr());
        sc.close();
    }
}
