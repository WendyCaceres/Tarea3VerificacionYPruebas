package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.id(""));
    public TextBox pwdTxtBox = new TextBox(By.id(""));
    public  Button loginButton = new Button(By.id(""));

    public void login(String email, String pwd){
        this.emailTxtBox.setText(email);
        this.pwdTxtBox.setText(pwd);
        this.loginButton.click();
    }
}
