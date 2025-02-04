import java.util.Scanner;
public class Scannerinput{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(a);
            System.out.println(s);
        }
    }
}