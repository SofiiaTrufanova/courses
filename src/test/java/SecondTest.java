import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SecondTest {

    @BeforeMethod
    public void before_method() {
        System.out.println("This method will be invoked before every test method");
    }

    @Test
    public void test1() {
        FirstClass task1 = new FirstClass();
        int[] arr = {10, 5, -7, 0, 3};
        int actual = task1.min(arr);
        int expected = -7;
        assertEquals(actual, expected);
    }
}
