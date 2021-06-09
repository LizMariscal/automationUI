package ui;

import org.openqa.selenium.By;

public class EmployeeUI {
    public static By form = By.id("formEmployee"); 
    public static By name = By.cssSelector(".modal-body > div:nth-of-type(1) > .form-control");
   // public static By email = By.xpath("//*[@id=\"formEmployee\"]/div[2]/div[1]/input");
}
