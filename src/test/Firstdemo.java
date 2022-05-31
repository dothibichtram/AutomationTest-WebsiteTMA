package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Firstdemo {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "D:\\Soft\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setBrowserName("chrome");
//		try {
//			driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), caps);
//		}catch(MalformedURLException e) {
//			e.printStackTrace();
//		}
        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url
        
        driver.navigate().to("https://www.tma.vn/");
        Thread.sleep(3000);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //3 - Lấy Title và in ra console
        
        System.out.println(driver.getTitle());
//        //4 - Search
        driver.findElement(By.name("SearchString")).sendKeys("Test");
        Thread.sleep(5000);
        driver.findElement(By.name("SearchString")).submit();
        Thread.sleep(3000);

        driver.navigate().to("https://www.tma.vn/");
        List<WebElement> row = driver.findElements(By.id("headerSearch"));
        WebElement element = driver.findElement(By.id("headerSearch"));
        Actions act = new Actions(driver);
        act.sendKeys(element,"Test").build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
//        int rowTotal = row.size(); 
//        System.out.println("Số dòng tìm thấy: " + rowTotal);
        Thread.sleep(3000);
        driver.navigate().to("https://www.tma.vn/");
        	driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[1]/div/div[3]/a[5]")).click();
        	System.out.println(driver.getTitle());
        	Thread.sleep(3000);
        	driver.navigate().to("https://www.tma.vn/");
        	 
        	
        	driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[1]/div/div[4]/a")).click();
        	System.out.println(driver.getTitle());
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@id=\"SearchAllResult\"]/div[1]/div[2]/a")).click();
        	System.out.println(driver.getTitle());
        	Thread.sleep(3000);
        	driver.navigate().back();
        	driver.findElement(By.name("SearchString")).sendKeys("Test");
        	Thread.sleep(5000);
        	driver.findElement(By.name("SearchString")).submit();
        	System.out.println(driver.getTitle());
//        	List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"SearchAllResult\"]"));
//        	int rowTotal = row.size(); 
//        	System.out.println("Số dòng tìm thấy: " + rowTotal);
        	Thread.sleep(3000);
//        	Assert.assertEquals(actualTitle, expectedTitle);
        	
        	//*[@id="SearchAllResult"]
//        	driver.navigate().to("https://www.tma.vn/");

        
        // Thoát hẳn Browser
//        http://192.168.56.1:4444
        driver.quit();
	}

}
