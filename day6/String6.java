public class String6 {
    public static void main(String[] args) {
        String s="Nice to meet you";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.equals("")){
                count=0;
                break;
            }
            if(s.charAt(i)==' '){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);
    }
}
