import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char c=sc.next().charAt(0);
    System.out.println(c);
    sc.close();
    }
}