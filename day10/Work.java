
public interface Citizen1 {
    void rule();
}
public class Work implements Citizen1 {

    public static void main(String[] args) {
        // Work w=new Work();
        // w.rule5();

        //Citizen c=new Citizen() { //anonomus class
        //public void rule(){
            //System.out.println("silence");
        //lamda expression for above method rule
        Citizen1 c = () -> {

            System.out.println("silence");

        };

    }

}

