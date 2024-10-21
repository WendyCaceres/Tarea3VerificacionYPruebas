package pages.todoly;

import controls.Button;
import org.openqa.selenium.By;


public class SettingsSection {

    public Button settingsButton = new Button(By.xpath("//a[text()='Settings']"));
    public void settings(){
        this.settingsButton.click();
    }
}
