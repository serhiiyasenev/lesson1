package lesson8;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsExmple {

    @Test
    @Parameters({"email", "password"})
    public void  login (String email, String password)
    {
        System.out.println("EMAIL: " + email);
        System.out.println("PASSWORD: " + password);
    }
}
