import java.util.ArrayList;
/**
 * Created by localadmin on 02/01/17.
 */
public class Brokerage {
    private String name;
    private int money;

    public Brokerage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<BrokerageClient> brkClientList=new ArrayList<BrokerageClient>();
    public String addClient(BrokerageClient brkClient){
        brkClientList.add(brkClient);
        return brkClient.getName() + " is added to " + this.name;
    }

    public void addMoney(int money){
        BrokerageClient.money+=money;
    }
    public void withDrawMoney(int money){
        if(BrokerageClient.money>=money) {
            BrokerageClient.money -= money;
        }
        else
            System.out.println("Not sufficient Balance");
    }
    public int checkBalance(){
        return  BrokerageClient.money;
    }
}
