import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//Tests have access to everything in original class except for private variables
/**
 * Created by Taylor on 1/23/16.
 */
public class TestConnectionManager {
    ConnectionManager connectionManagerTest;
    ConnectionManager.Connection connectionTest;

    @Before
    public void assetsNeeded(){
        connectionManagerTest = new ConnectionManager();
        connectionTest = connectionManagerTest.displayConnection(); //connection object (display returns a connection obj)


    }
    @Test
    public void addTest(){//testing add and display methods
        connectionTest.setIpAddress(005);
        connectionManagerTest.addConnection(connectionTest);
        assertEquals("Test if we added a connection.",005,connectionManagerTest.displayConnection().getIpAddress());

    }
    @Test
    public void displayTest(){ // tested port number
        assertEquals("Test if we can display a connection.",002,connectionManagerTest.displayConnection().getPortNumber());
    }

    @Test
    public void deleteTest(){ //can't tests methods without return values directly, test their side effects
        connectionManagerTest.deleteConnection();
        assertEquals("If deleted, value should be null",null,connectionManagerTest.displayConnection());
    }
}
