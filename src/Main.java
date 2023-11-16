import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static ArrayList<Integer> Sorted_A(ArrayList<Integer> A){
        Collections.sort(A);
        return A;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Get num: " );
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int i = 0; i < n; i++){
            int Mem = s.nextInt();
            arr.add(Mem);
        }
        ArrayList<Integer> Sorted = Sorted_A(arr);
        for(int num : Sorted){
            System.out.print(num + " ");
        }
    }
}