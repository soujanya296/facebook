import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement el = driver.findElement(By.xpath("//select[@id='month']"));
				Select sl=new Select(el);

				List<WebElement> opt = sl.getOptions();
				TreeSet<String> l=new TreeSet<String>(Collections.reverseOrder());
				
				int ct = opt.size();
				System.out.println(ct);
		for (WebElement txt:opt)
		{
			String tx1 = txt.getText();
			l.add(tx1);
		}
		//Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		for (String t:l)
		{
			System.out.println(t);
		}
		
		}
	}
