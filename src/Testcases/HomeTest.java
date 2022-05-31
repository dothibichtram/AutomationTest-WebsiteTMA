package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseSetup;
import Pages.HomePage;

public class HomeTest extends BaseSetup {

	private WebDriver driver;
	public HomePage homePage;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test()
	public void home() throws Exception {
		
		homePage = new HomePage(driver);
		System.out.println(homePage.getHomePageTitle());
		if(homePage.verifyHomePageTitle())
			System.out.println("Page title match");
		
		System.out.println("--------SEARCH----------");
		homePage.enterSearchString("Test");
		homePage.navigateBack();
		homePage.navigateRefesh();
		System.out.println(homePage.getHomePageTitle());
		homePage.enterSearchString(" %% ");
		homePage.navigateBack();
		homePage.navigateRefesh();
		homePage.enterSearchString("123");
		homePage.navigateBack();
		homePage.navigateRefesh();
		homePage.enterSearchString(" ");
		homePage.navigateBack();
		homePage.navigateRefesh();
		
		
		
		homePage.enterSearchHeader("Test");
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.navigateRefesh();
		homePage.enterSearchHeader(" %% ");
		homePage.navigateBack();
		homePage.navigateRefesh();
		homePage.enterSearchHeader("56");
		homePage.navigateBack();
		
		System.out.println("--------HOT JOB----------");
		homePage.clickHotJobItem();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHotJobMore();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		
		homePage.clickJobAdvLeft();
		System.out.println(homePage.getH1());
		homePage.navigateBack();
		homePage.clickJobAdvMid();
		System.out.println(homePage.getH1());
		homePage.navigateBack();
		homePage.clickJobAdvRight();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();

		System.out.println("--------WHY TMA----------");
		homePage.clickWhyTMAReadmore();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickWhyTMAEdu();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickWhyTMAAct();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickWhyTMASala();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		System.out.println("--------TIN TUC TMA----------");
		homePage.clickLifeIn();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickMoveTop();
		
		System.out.println("--------LINK FOOTER----------");
		homePage.clickHrefJob();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefLifeIn();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefCont();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefWhyTMA();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefQandA();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefFB();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefYoutube();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefTwitter();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefLinkedin();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHrefLogoFooter();
		
		System.out.println("--------LINK HEADER----------");
		homePage.clickDropdownJob();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.toDropdownJob();
		homePage.clickCoKN();
		System.out.println(homePage.getH1());
		homePage.navigateBack();
		homePage.toDropdownJob();
		homePage.clickKhongKN();
		System.out.println(homePage.getH1());
		homePage.navigateBack();
		homePage.toDropdownJob();
		homePage.clickThucTap();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		
		homePage.clickDropdownWhyTMA();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.toDropdownWhyTMA();
		homePage.clickQTPhatTrien();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.toDropdownWhyTMA();
		homePage.clickDVDoiTac();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.toDropdownWhyTMA();
		homePage.clickMTLamViec();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.toDropdownWhyTMA();
		homePage.clickDTPhatTrien();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.toDropdownWhyTMA();
		homePage.clickThuNhap();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.toDropdownWhyTMA();
		homePage.clickHoatDong();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		
		homePage.clickNhipSong();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickHoiDap();
		System.out.println(homePage.getHomePageTitle());
		homePage.navigateBack();
		homePage.clickLienHe();
		System.out.println(homePage.getHomePageTitle());
		homePage.clickSubmitLH();
		homePage.navigateBack();
		homePage.formLH("", "", "", "", "");
		homePage.formLH("Nguyen Van A", "", "", "", "");
		homePage.formLH("Nguyen Van A", "abc", "", "", "");
		homePage.formLH("Nguyen Van A", "", "", "abc", "");
		homePage.formLH("", "ab", "", "", "");
		homePage.formLH("", "", "", "123", "");
		homePage.formLH("", "", "", "123456789", "");
		homePage.formLH("", "a@", "", "", "");
		homePage.formLH("", "a@b", "", "", "");
		
//		homePage.navigateBack();
		
		
	}

}
