import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by localadmin on 02/01/17.
 */
public class BrokerageTest {

   @Test
    public void testBrokerage()
   {
       Brokerage brk = new Brokerage("Kite");
       BrokerageClient brkclient = new BrokerageClient("Himanshu",25,"Male");
       assertEquals("Kite",brk.getName());
       assertEquals("Himanshu is added to Kite",brk.addClient(brkclient));
   }

   @Test

    public void testBalance()
   {
       Brokerage brk = new Brokerage("Kite");
       BrokerageClient brkclient = new BrokerageClient("Himanshu",25,"Male");
       //assertEquals("Himanshu is added to Kite",brk.addClient(brkclient));
       assertEquals(0,brk.checkBalance());

   }

}
