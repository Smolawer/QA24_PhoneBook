package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void LoginSuccsess (){
       app. getHelperUser().openLoginRegistrationForm();
       app.getHelperUser().fillLoginRegistrationForm("mara@gmail.com","Mmar123456$");
       app.getHelperUser().submitLogin();
       Assert.assertTrue(app.getHelperUser().isLogged());


    }


}
