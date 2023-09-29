package hw;
/*Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
        Check if the "Female" radio button is displayed.
        Click on the "Show Button".
        Check again if the "Female" radio button is displayed or not.
        Print the results of the checks to the console.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement radioBtnFemale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']"));
        radioBtnFemale.click();
        boolean btnIsDisplayedStatus = radioBtnFemale.isDisplayed();
        System.out.println("the female radio button is displayed " + btnIsDisplayedStatus);
    }
}

