import org.junit.Test;
import static org.junit.Assert.*;

public class BrokerageClientTest {
    @Test
    public void clientValidate(){
        BrokerageClient brkclient = new BrokerageClient("Himanshu",25,"Male");
        assertEquals("Himanshu",brkclient.getName());
        assertEquals(25,brkclient.getAge());
        assertEquals("Male",brkclient.getGender());
    }
}