import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Personal_loan {
    @BeforeSuite
    public void before_suite() {
        System.out.println("First method");
    }
    @Test
    public void personal_loan() {
        System.out.println("Personal Loan");
    }


}
