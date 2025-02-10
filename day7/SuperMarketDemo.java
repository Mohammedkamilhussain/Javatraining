public class SuperMarketDemo {
    String name;
    String pname;
    int price;
    int discount;
    public static void main(String[] args) {
        int a=20;
        SuperMarketDemo product1=new SuperMarketDemo();
        product1.name="rice";
        product1.price=50;
        System.out.println(product1.name);

        SuperMarketDemo product2=new SuperMarketDemo();
        product2.pname="biscuits";
        product2.price=10;
        product2.discount=2;
        System.out.println(product2.pname);
        System.out.println(product1.name);
    }
}
