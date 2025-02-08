public class String7 {
    public static void main(String[] args) {
        String s="hello";
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        String s1=new String(c);
        System.out.println(s1);
    }
}
