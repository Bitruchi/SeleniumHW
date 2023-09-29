package hw;
/*Navigate to http://35.175.58.98/basic-checkbox-demo.php.
        Check the if Checkbox1 is enabled
        If Checkbox1 is disabled:
        Click on the "enable checkboxes" button.
        Verify that Checkbox1 is now enabled.
        Click on Checkbox1.
        Confirm that Checkbox1 is selected.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();


       boolean selectState = checkBox1.isEnabled();
        if (selectState) {
            System.out.println("the checkbox is enabled");
        } else {
            checkBox1.click();
        }

        boolean status = checkBox1.isSelected();
        if (status) {
            System.out.println("the checkbox is selected");
        } else {
            System.out.println("the checkbox isnt selected");
        }
    }
}
