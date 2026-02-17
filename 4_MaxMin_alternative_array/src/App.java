import java.util.*;
import maxMin.array.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Algorithm algo = new Algorithm();
        ArrayList<Integer> list = new ArrayList<>();

        try {
            System.out.println("Enter array(to stop, press any non-integer term):");
            while (sc.hasNextInt()) {
                    list.add(sc.nextInt());
                }
            int[] arr = list.stream().mapToInt(i -> i).toArray();

            algo.setArr(arr);
            System.out.println("Array is: " + Arrays.toString(algo.getArr()));

        } catch (Exception e){
            System.out.println("ERROR");
        }
        sc.close();
    }
}
