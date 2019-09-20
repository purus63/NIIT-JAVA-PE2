
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;




import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.q1;

public class q1test {
    private static q1 obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new q1();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }

    @Test
    public void testcase1() {
        assertEquals("Error in the test"
                , new String[]{"The string is palindrome", "12344321"}, obj.palindromecheck("12344321"));
        assertEquals("Error in the test"
                , new String[]{"The string is not palindrome", "amog"}, obj.palindromecheck("goma"));
        assertEquals("Error in the test"
                , new String[]{"The string is palindrome", "12345678900987654321"}, obj.palindromecheck("12345678900987654321"));
    }
    @Test
    public void testcase2() {
        assertNotEquals("Error in the test"
                , new String[]{"The string is palindrome", "12344321"}, obj.palindromecheck("12344321"));
        assertNotNull("Error in the test", obj.palindromecheck("goma"));
        assertEquals("Error in the test"
                , null, obj.palindromecheck(""));
    }
}



