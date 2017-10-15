package work;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class WorkerTest {
    @Test(timeout = 100)
    public void testDoWork(){
        Assert.assertEquals("Work!", new Mason().work("Work!"));
        assertEquals("Work!", new Mason().work("Work!"));
    }

    @Before
    public void printLineBefore(){
        System.out.println("Before method");
    }

    @After
    public void printLineAfter(){
        System.out.println("After method");
    }
}