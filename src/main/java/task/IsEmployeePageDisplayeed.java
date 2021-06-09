package task;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.EmployeeUI;

public class IsEmployeePageDisplayeed {
    public static boolean form(WebDriver webDriver){
        return IsDisplayed.element(webDriver, EmployeeUI.form);
    }
}
