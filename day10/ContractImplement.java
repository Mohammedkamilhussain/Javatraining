public class ContractImplement implements Contract,contract1 {
    public static void main(String[] args) {
        Contract ci=new ContractImplement();
        Contract.print();
        ci.calculate(100, 2);
    }
    @Override
    public void calculate(int a,int b){
        Contract.super.calculate(a, b);
        Contract1.super.calculate(a, b);
    }
    public void result(){
        System.out.println("result is today");
    }
}
