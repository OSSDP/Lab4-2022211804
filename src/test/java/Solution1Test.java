import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    Solution1 s;

    @Before
    public void setUp() throws Exception {
        s=new Solution1();
    }

    @After
    public void tearDown() throws Exception {
        s=null;
    }

    @Test
    public void testInteger(){
        int a = -90;
        int b = 3;
        String c = "-30";
        assertEquals("failure - strings not same",c,s.fractionToDecimal(a,b));
    }

    @Test
    public void testTerminatingDecimal() {
        int a = 12;
        int b = 50;
        String c = "0.24";
        assertEquals("failure - strings not same",c,s.fractionToDecimal(a,b));
    }

    @Test
    public void testRecurringDecimal() {
        int a = 1;
        int b = 3;
        String c = "0.(3)";
        assertEquals("failure - strings not same",c,s.fractionToDecimal(a,b));
    }
}