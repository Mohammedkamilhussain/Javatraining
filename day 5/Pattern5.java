public class Pattern5 {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n*2;i++){
            int totalColInRow=i>n?2*n-i:i;
            int spaces =n-totalColInRow;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=totalColInRow;k>0;k--){
                System.out.print(k);
            }
            for(int I=2;I<=totalColInRow;I++){
                System.out.print(I);
            }
            System.out.println(" ");
        }
    }
}

