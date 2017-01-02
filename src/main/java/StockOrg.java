/**
 * Created by localadmin on 02/01/17.
 */
public class StockOrg {
    public static void main(String[] args) {
        Brokerage brk=new Brokerage("Kite");
        BrokerageClient brkclient1=new BrokerageClient("Rakesh",25,"Male");
        brk.addClient(brkclient1);
        brk.addMoney(1000);
        brk.addMoney(1000);
        brk.withDrawMoney(500);
        System.out.println(brk.checkBalance());
        brk.withDrawMoney(3000);

    }
}
