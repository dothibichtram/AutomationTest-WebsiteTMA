package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

	private WebDriver driver;

	private By searchHeader = By.id("headerSearch");
	private By searchString  = By.name("SearchString");
	private By hotJobItem = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[1]/div/div[3]/a[1]");
	private By hotJobMore = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[1]/div/div[4]/a");
	
	private By jobAdvLeft = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[2]/div/div[1]/a/span");
	private By jobAdvMid = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[2]/div/div[2]/a/span");
	private By jobAdvRight = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[2]/div/div[3]/a/span");
	
	private By spanH1 = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div[1]/div/div/div[1]/h1");
	
	private By whyTMAReadmore = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[4]/div/div[2]/div/div[2]/div/a[2]");
	private By whyTMAEdu = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[4]/div/div[3]/div/div[1]/div/a/span");
	private By whyTMASala = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[4]/div/div[3]/div/div[2]/div/a/span");
	private By whyTMAAct = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[4]/div/div[3]/div/div[3]/div/a/span");
	private By lifeIn = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div/article/div/div[6]/div/div/div[2]/a/label");
	
	private By moveTop = By.xpath("//*[@id=\"layout-wrapper\"]/a");
	private By chatByMess = By.xpath("//*[@id=\"facebook\"]/body/div/div/div/div");
	
	private By hrefJob = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[1]/div[2]/ul/li[1]/a");
	private By hrefLifeIn = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[1]/div[3]/ul/li[1]/a");
	private By hrefCont = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[1]/div[4]/ul/li/a");
	private By hrefWhyTMA = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[1]/div[2]/ul/li[2]/a");
	private By hrefQandA = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[1]/div[3]/ul/li[2]/a");
	
	private By hrefFB = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[2]/div/ul/li[1]/a/img");
	private By hrefYoutube = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[2]/div/ul/li[2]/a/img");
	private By hrefTwitter = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[2]/div/ul/li[3]/a/img");
	private By hrefLinkedin = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[2]/div/ul/li[3]/a/img");
	private By hrefLogoFooter = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[6]/div/article/div/div/div[1]/div[1]/a/img");
	private By hrefLogoHeader = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[1]/a");
	
	private By dropDownJob = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[3]/a");
	private By coKN = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[3]/ul/li[1]/a");
	private By khongKN = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[3]/ul/li[2]/a");
	private By thucTap = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[3]/ul/li[3]/a");
	
	
	private By dropDownWhyTMA = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[4]/a");
	private By qtPhatTrien = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[4]/ul/li[1]/a");
	private By dvDoiTac = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[4]/ul/li[2]/a");
	private By mtLamViec = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[4]/ul/li[3]/a");
	private By dtPhatTrien = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[4]/ul/li[4]/a");
	private By thuNhap = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[4]/ul/li[5]/a");
	private By hoatDong = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[4]/ul/li[6]/a");
	
	private By nhipSong = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[5]/a");
	private By hoiDap = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[6]/a");
	private By lienHe = By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div/article/nav/ul/li[7]/a");
	
	private By name = By.id("FullName");
	private By position = By.id("JobPosition");
	private By email = By.id("Email");
	private By phone = By.id("Phone");
	private By content = By.id("Content");
	private By submitLH = By.xpath("//*[@id=\"ApplyCV\"]/div[7]/div[2]/button");
	// Khởi tạo class khi được gọi và truyền driver vào để các thành phần trong
	// class này đọc
	public HomePage(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		Thread.sleep(3000);
	}

	public String getHomePageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public boolean verifyHomePageTitle() {
		String expectedTitle = "Công ty phần mềm hàng đầu Việt Nam - TMA Solutions";
		return getHomePageTitle().equals(expectedTitle);
	}

	public void enterSearchHeader(String value) throws InterruptedException {
		WebElement search = driver.findElement(searchHeader);
        Actions act = new Actions(driver);
        search.sendKeys(value);
        Thread.sleep(1000);
        act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void navigateBack() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().back();
	}
	public void navigateRefesh() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	
	public void enterSearchString(String value) throws InterruptedException {
		WebElement search = driver.findElement(searchString);
			search.sendKeys(value);
			Thread.sleep(1000);
			search.submit();
	}
	
	public void clickHotJobItem() {
		WebElement item = driver.findElement(hotJobItem);
			item.click();
	}
	
	public void clickHotJobMore() {
		WebElement item = driver.findElement(hotJobMore);
			item.click();
	}
	
	public void clickJobAdvLeft() {
		WebElement item = driver.findElement(jobAdvLeft);
			item.click();
	}
	
	public void clickJobAdvMid() {
		WebElement item = driver.findElement(jobAdvMid);
			item.click();
	}
	
	public void clickJobAdvRight() {
		WebElement item = driver.findElement(jobAdvRight);
			item.click();
	}
	
	public String getH1() {
		WebElement element = driver.findElement(spanH1);
		String span = element.getText();
		return span;
	}
	
	public void clickWhyTMAReadmore() {
		WebElement item = driver.findElement(whyTMAReadmore);
			item.click();
	}

	public void clickWhyTMASala() {
		WebElement item = driver.findElement(whyTMASala);
			item.click();
	}
	public void clickWhyTMAEdu() {
		WebElement item = driver.findElement(whyTMAEdu);
			item.click();
	}
	public void clickWhyTMAAct() {
		WebElement item = driver.findElement(whyTMAAct);
			item.click();
	}
	public void clickLifeIn() {
		WebElement item = driver.findElement(lifeIn);
			item.click();
	}
	public void clickMoveTop() {
		WebElement item = driver.findElement(moveTop);
			item.click();
	}
	public void clickChatByMess() {
		WebElement item = driver.findElement(chatByMess);
			item.click();
	}
	public void clickHrefJob() {
		WebElement item = driver.findElement(hrefJob);
			item.click();
	}
	public void clickHrefLifeIn() {
		WebElement item = driver.findElement(hrefLifeIn);
			item.click();
	}
	public void clickHrefCont() {
		WebElement item = driver.findElement(hrefCont);
			item.click();
	}
	public void clickHrefWhyTMA() {
		WebElement item = driver.findElement(hrefWhyTMA);
			item.click();
	}
	public void clickHrefQandA() {
		WebElement item = driver.findElement(hrefQandA);
			item.click();
	}
	public void clickHrefFB() {
		WebElement item = driver.findElement(hrefFB);
			item.click();
	}
	public void clickHrefYoutube() {
		WebElement item = driver.findElement(hrefYoutube);
			item.click();
	}
	public void clickHrefTwitter() {
		WebElement item = driver.findElement(hrefTwitter);
			item.click();
	}
	public void clickHrefLinkedin() {
		WebElement item = driver.findElement(hrefLinkedin);
			item.click();
	}
	public void clickHrefLogoHeader() {
		WebElement item = driver.findElement(hrefLogoHeader);
			item.click();
	}
	public void clickHrefLogoFooter() {
		WebElement item = driver.findElement(hrefLogoFooter);
			item.click();
	}
	public void toDropdownWhyTMA() throws InterruptedException {
		WebElement item = driver.findElement(dropDownWhyTMA);
		Actions act = new Actions(driver);
		act.moveToElement(item).build().perform();
	}
	public void clickDropdownWhyTMA() {
		WebElement item = driver.findElement(dropDownWhyTMA);
			item.click();
	}
	public void clickQTPhatTrien() {
		WebElement item = driver.findElement(qtPhatTrien);
			item.click();
	}
	public void clickDVDoiTac() {
		WebElement item = driver.findElement(dvDoiTac);
			item.click();
	}
	public void clickMTLamViec() {
		WebElement item = driver.findElement(mtLamViec);
			item.click();
	}
	public void clickDTPhatTrien() {
		WebElement item = driver.findElement(dtPhatTrien);
			item.click();
	}
	public void clickThuNhap() {
		WebElement item = driver.findElement(thuNhap);
			item.click();
	}
	public void clickHoatDong() {
		WebElement item = driver.findElement(hoatDong);
			item.click();
	}
	public void toDropdownJob() throws InterruptedException {
		WebElement item = driver.findElement(dropDownJob);
		Actions act = new Actions(driver);
		act.moveToElement(item).build().perform();
	}
	public void clickDropdownJob() {
		WebElement item = driver.findElement(dropDownJob);
			item.click();
	}
	public void clickCoKN() {
		WebElement item = driver.findElement(coKN);
			item.click();
	}
	public void clickKhongKN() {
		WebElement item = driver.findElement(khongKN);
			item.click();
	}
	public void clickThucTap() {
		WebElement item = driver.findElement(thucTap);
			item.click();
	}
	public void clickNhipSong() {
		WebElement item = driver.findElement(nhipSong);
			item.click();
	}
	public void clickHoiDap() {
		WebElement item = driver.findElement(hoiDap);
			item.click();
	}
	public void clickLienHe() {
		WebElement item = driver.findElement(lienHe);
			item.click();
	}
	
	public void enterName(String value) throws InterruptedException {
		WebElement item = driver.findElement(name);
			item.sendKeys(value);
			Thread.sleep(500);
	}
	public void enterPosition(String value) throws InterruptedException {
		WebElement item = driver.findElement(position);
			item.sendKeys(value);
			Thread.sleep(500);
	}
	public void enterEmail(String value) throws InterruptedException {
		WebElement item = driver.findElement(email);
			item.sendKeys(value);
			Thread.sleep(500);
	}
	public void enterPhone(String value) throws InterruptedException {
		WebElement item = driver.findElement(phone);
			item.sendKeys(value);
			Thread.sleep(500);
	}
	public void enterContent(String value) throws InterruptedException {
		WebElement item = driver.findElement(content);
			item.sendKeys(value);
			Thread.sleep(500);
	}
	public void clickSubmitLH() {
		WebElement item = driver.findElement(submitLH);
			item.click();
	}
	public void formLH(String name, String email, String position, String phone, String content) throws Exception {
		enterName(name);
		enterPosition(position);
		enterEmail(email);
		enterPhone(phone);
		enterContent(content);
		clickSubmitLH();
		Thread.sleep(500);
		driver.navigate().to("https://www.tma.vn/Lien-he/");
	}



	@SuppressWarnings("unused")
	public void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}
}
