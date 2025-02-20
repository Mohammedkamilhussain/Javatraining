public interface  Contract {
    public static void main(String[] args) {
        System.out.println("hello");
    }
    default void display(){
        System.out.println("I am from display");
    }
    static void print(){
        System.out.println("I am from print");
    }
    default void calculate(int a,int b){
        System.out.println(a - b);
    }
    void result();
}
