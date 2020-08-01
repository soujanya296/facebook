import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class textofele {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("soujanyack@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("arnav@123");
driver.findElement(By.xpath("//input[@type='submit']")).click();
WebElement ele = driver.findElement(By.xpath("//span[text()='Soujanya']"));
Thread.sleep(3000);
String title = ele.getText();
System.out.println(title);
Actions act=new Actions(driver);
act.moveToElement(ele).perform();
Thread.sleep(3000);
 List<WebElement> links = driver.findElements(By.tagName("a"));
int ct = links.size();
System.out.println(ct);
for (WebElement text:links)
{
	String name = text.getText();
	System.out.println(name);

if (name.equals("Groups"))
{
String s = name.toLowerCase();
System.out.println(s);
	}

}
	}
	
	}

