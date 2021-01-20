import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


    public class FirstTest {
    @BeforeMethod
    public void before_method()
    {
        System.out.println("This method will be invoked before every test method");
    }

    @Test(dataProvider = "dp")
    public void test1(int arr[], int expected) {
        FirstClass task1 = new FirstClass();
        int actual = task1.min(arr);
        assertEquals(actual, expected);
    }

    @DataProvider (name = "dp")
    public Object[][] provider() {
        return new Object[][] {
                {new int[] {1,2,3,4}, 1},
                {new int[] {1,2,-3,4}, -3}
        };
    }
        @Test
        public void test2() {
            FirstClass task2 = new FirstClass();
            int[] arr = {4,5,-2,0,8};
            int actual = task2.min (arr);
            int expected = -2;
            assertEquals (actual, expected);
        }

    }



