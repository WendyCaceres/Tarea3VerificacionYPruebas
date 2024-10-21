package todoist;

import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTestTodoist {

    @Test
    public void verifyLoginSuccessfully(){
        mainPage.iniciarSesionButton.click();
        loginSection.emailTxtBox.setText("wcaceres683@gmail.com");
        loginSection.pwdTxtBox.setText("123456Wen");
        loginSection.loginButton.click();
    }

}
