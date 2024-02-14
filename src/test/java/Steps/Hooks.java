package Steps;

import Utility.SeleniumUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import javax.swing.plaf.PanelUI;

public class Hooks extends SeleniumUtility {
    @Before

    public void beforeScenarios() {
        OpenBrowser();
    }

    @After
    public void CloseTheBrowse() {
        QuitBrowser();
    }
}

