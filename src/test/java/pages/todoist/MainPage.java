package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    public  Button iniciarSesionButton = new Button(By.xpath("//ul//li//a//span[contains(text(),'Iniciar sesión')]"));
}