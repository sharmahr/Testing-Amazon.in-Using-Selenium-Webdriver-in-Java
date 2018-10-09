/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automate_amazon;

/**
 *
 * @author Hardik Sharma
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Amazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
         //path of your chrome driver
    	System.setProperty("webdriver.chrome.driver","C:\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
     //Url to be visited
     //in my case it is amazon
     driver.get("https://www.amazon.in/");
     //mazimising window size
     driver.manage().window().maximize();
     //searching for laptops in the search box (id of the search box for amazon.in is twotabsearchtextbox 
     //  using inspect element option 
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
     //clicking on go button       
             driver.findElement(By.xpath("//input[@value='Go']")).click();
             Thread.sleep(3000);
           JavascriptExecutor js = ((JavascriptExecutor) driver);
      //to scroll the page down
      //this can be executed in a for or while loop
js.executeScript("window.scrollTo(0, 250)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(250, 500)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(500,750)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(750, 1000)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(1000, 1250)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(1250,1500)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(1500,1750)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(2000,2250)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(2250,2500)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(2500,2750)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(2750,3000)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(3000,3250)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(3250,3500)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(3500,3750)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(3750,4000)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(4000,4250)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(4250,4500)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(4500,4750)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(4750,5000)");
Thread.sleep(1000);
//to scroll up the webpage
js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
Thread.sleep(3000);
//to resize the window to a specified size 480*620
               Dimension d = new Dimension(480,620);
               driver.manage().window().setSize(d);
 Thread.sleep(2000); 
driver.manage().window().maximize();
 //to view all the results on the webpage              
               List<WebElement> resultsList = driver.findElements(By.xpath(".//*[starts-with(@id, 'result_')]"));
                       for (WebElement result:resultsList) {
           System.out.println(result.getText());               
}
driver.get("https://www.amazon.in/Dell-3468-Corei3-7100U-Integrated-Graphics/dp/B0793DGV69/ref=sr_1_6?s=computers&rps=1&ie=UTF8&qid=1539027435&sr=1-6&keywords=laptops&refinements=p_85%3A10440599031");
  Thread.sleep(3000);
   driver.findElement(By.id("add-to-cart-button")).click();
             Thread.sleep(3000);
             driver.findElement(By.id("siNoCoverage-announce")).click();
             Thread.sleep(3000);
             driver.findElement(By.id("hlb-ptc-btn-native")).click();
             Thread.sleep(3000);
             driver.findElement(By.id("ap_email")).sendKeys("email or phone number");
             Thread.sleep(2000);
              driver.findElement(By.id("continue")).click();
             Thread.sleep(3000);
                 driver.findElement(By.id("ap_password")).sendKeys("password");
             Thread.sleep(2000);
             //this will sign in into your amazon account
                driver.findElement(By.id("signInSubmit")).click();
             Thread.sleep(2000);
               
                        
js.executeScript("window.scrollTo(0, 250)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(250, 500)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(500,750)");
Thread.sleep(1000);
js.executeScript("window.scrollTo(750, 1000)");
Thread.sleep(1000);js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
Thread.sleep(5000);
             
    // for closing your driver         
        driver.close();
    }
    
}
