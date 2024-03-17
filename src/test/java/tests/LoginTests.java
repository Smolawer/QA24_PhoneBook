package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
        }
    }

    @Test
    public void LoginSuccsess (){
       app. getHelperUser().openLoginRegistrationForm();
       app.getHelperUser().fillLoginRegistrationForm("mara@gmail.com","Mmar123456$");
       app.getHelperUser().submitLogin();
       Assert.assertTrue(app.getHelperUser().isLogged());


    }
    @Test
    public void LoginSuccsessModel (){
        app. getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("mara@gmail.com","Mmar123456$");
        app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isLogged());


    }

}
