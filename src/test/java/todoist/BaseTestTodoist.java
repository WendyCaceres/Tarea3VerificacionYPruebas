package todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoist.LoginSection;
import pages.todoist.MainPage;
import session.Session;

public class BaseTestTodoist {

    protected MainPage mainPage = new MainPage();
    protected LoginSection loginSection = new LoginSection();


    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todoist.com/es");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
