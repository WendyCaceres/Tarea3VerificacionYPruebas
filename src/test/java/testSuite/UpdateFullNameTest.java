package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.ProfileSection;

public class UpdateFullNameTest extends BaseTestTodoLy {
    ProfileSection profileSection = new ProfileSection();

    @Test
    public void verifyUpdateFullName() throws InterruptedException {
        String newName = "Update"; // Antes: Tarea
        mainPage.loginButton.click();
        loginSection.login("tareaupdate@tarea.com","12345");
        settingsSection.settings();
        profileSection.changeFullName(newName);
        settingsSection.settings();

        Assertions.assertEquals(newName, profileSection.getFullName(),
                "ERROR! The full name was not updated correctly");
    }
}
