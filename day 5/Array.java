
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int []a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //2nd method;
        Scanner sc = new Scanner(System.in);
        int b[] = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
            System.out.println(b[i]+" ");
        }
    }
}
