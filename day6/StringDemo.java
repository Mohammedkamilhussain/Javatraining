public class StringDemo{
    public static void main(String[] args) {
        String str="Hello";
        String str1=new String("Hello");
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}