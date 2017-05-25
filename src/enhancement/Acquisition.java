package enhancement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Acquisition {
	
	public WebDriver driver = new ChromeDriver(); 

	@Test(priority=1,enabled=true)
	public void Login() 
	{

		driver.get("https://test.salesforce.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("satya@minusculetechnologies.com.cdpqa");

		driver.findElement(By.id("password")).sendKeys("reddyreddy1");

		driver.findElement(By.id("Login")).click();	

	}
	
	@Test(priority=2,enabled=true)
	public void AMUserSearch()
	{
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"221:0;p\"]")));

		WebElement search = driver.findElement(By.xpath("//*[@id=\"221:0;p\"]"));
		search.sendKeys("Tyson Chave");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Tyson Chave\"']")));

		WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Tyson Chave\"']"));
		suggestion.click();	

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Tyson Chave")));

		WebElement dropdown = driver.findElement(By.partialLinkText("Tyson Chave"));
		dropdown.click();	

	}
	
	@Test(priority=3,enabled=true)
	public void AMUserDetails()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("User Detail")));

		WebElement userdetails = driver.findElement(By.partialLinkText("User Detail"));
		userdetails.click();	
	}
	
	@Test(priority=4,enabled=true)
	public void AMUserLogin()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
			
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='User: Tyson Chave ~ Salesforce - Unlimited Edition']")));
		
		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
		login.click();       


	}
	
	@Test(priority=5,enabled=true)
	public void AcquisitionClick()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[2]/a/span")));
		
		WebElement Acquisition = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[2]/a/span"));
		Acquisition.click();
	}
	
	@Test(priority=6,enabled=true)
	public void CreateNewDeal() throws InterruptedException {			
		
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'vfFrameId')]")));
		
		try{
					
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"newDealButton\"]")));

		WebElement deal = driver.findElement(By.xpath("//*[@id=\"newDealButton\"]"));
		deal.isDisplayed();		
		
		deal.click();		
		}
		catch(Exception deal)
		{
			
		}

	}
	
	
	@Test(priority=7,enabled=true)
	public void CreateNewDealclick() throws InterruptedException {			

		
		Thread.sleep(5000);		
		try{		

		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"newDealButton\"]")));

		WebElement deal = driver.findElement(By.xpath("//*[@id=\"newDealButton\"]"));
		deal.isDisplayed();
		
		deal.click();	
		
		}
		catch(Exception deal)
		{
			
		}

	}
	
	
	@Test(priority=8,enabled=true)
	public void CreateNewAcquisitionDeal()
	{		
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
						
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[2]")));

		WebElement Next = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[2]"));
		Next.click();		
		
	}
	
	@Test(priority=9,enabled=true)
	public void CreateNewAcquisitionDealSingleBuilding()
	{
		
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}		
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[3]/cdp-new-deal-questions/div[1]/div[4]/fieldset/div/label[1]/span[1]")));

		WebElement Single_Building = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[3]/cdp-new-deal-questions/div[1]/div[4]/fieldset/div/label[1]/span[1]"));
		Single_Building.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[2]")));

		WebElement Next = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[2]"));
		Next.click();	
		
	}
	
	@Test(priority=10,enabled=true)
	public void CreateNewDealName()
	{		
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("editNewDealName")));

		WebElement new_deal = driver.findElement(By.id("editNewDealName"));
		new_deal.sendKeys("May264");	
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[4]")));

		WebElement Next = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[4]"));
		Next.click();
		
	}
	
	@Test(priority=11,enabled=false)
	public void ClickOnExistingDeal()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}		
		
		WebDriverWait wait6 = new WebDriverWait(driver, 60);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a")));

		WebElement logout = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a"));
		logout.isDisplayed(); 
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"221:0;p\"]")));

		WebElement search = driver.findElement(By.xpath("//*[@id=\"221:0;p\"]"));
		search.sendKeys("May18");	
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"May18\"']")));

		WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"May18\"']"));
		suggestion.click();	

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'May18')]")));

		WebElement dropdown = driver.findElement(By.xpath("//*[@class='outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'May18')]"));
		dropdown.click();
		
	}
	
	@Test(priority=12,enabled=true)
	public void AssetAttribute()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		
		driver.switchTo().defaultContent();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 60);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a")));

		WebElement logout = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a"));
		logout.isDisplayed();		
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[2]/a/span")));
		
		WebElement Acquisition = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[2]/a/span"));
		Acquisition.isDisplayed();		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[3]/a/span")));
		
		WebElement Dispositions_Pipeline = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[3]/a/span"));
		Dispositions_Pipeline.isDisplayed();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[4]/a/span")));
		
		WebElement Development_Pipeline = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[4]/a/span"));
		Development_Pipeline.isDisplayed();
		
		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[5]/a/span")));
		
		WebElement Value_Pipeline = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[5]/a/span"));
		Value_Pipeline.isDisplayed();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 60);
		wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[6]/a/span")));
		
		WebElement Reports = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[6]/a/span"));
		Reports.isDisplayed();
		
		WebDriverWait wait8 = new WebDriverWait(driver, 60);
		wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[7]/a/span")));
		
		WebElement Land = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[7]/a/span"));
		Land.isDisplayed(); 		
		
		WebDriverWait wait9 = new WebDriverWait(driver, 60);
		wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[8]/a/span")));
		
		WebElement Forecast = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[8]/a/span"));
		Forecast.isDisplayed();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[1]/div/nav/one-app-launcher-header/button")));
		
		WebElement home = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[1]/div/nav/one-app-launcher-header/button"));
		home.click();		
		
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebDriverWait wait10 = new WebDriverWait(driver, 60);
		wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'label slds-truncate slds-text-link') and text() = 'Approvals']")));

		WebElement approval = driver.findElement(By.xpath("//span[contains(@class, 'label slds-truncate slds-text-link') and text() = 'Approvals']"));
		approval.isDisplayed();
		
		WebDriverWait wait11 = new WebDriverWait(driver, 60);
		wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[2]/div[3]/div[2]/div/div[1]/button")));

		WebElement close = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div[2]/div/div[1]/button"));
		close.click();
		
	}
	
	@Test(priority=13,enabled=true)
	public void WaitForFrame() {
		
		try{
			AssetAttribute();
			}
		catch(Exception e)
		{
			
		}
		
				
	
	}
	
	@Test(priority=14,enabled=true)
	public void SwitchToFrame()
	{
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		int framenumber = (iframeElements.size()-1);
		System.out.println(framenumber);
		driver.switchTo().frame(framenumber);
	}
	
	@Test(priority=15,enabled=true)
	public void AssetAttributeclick() throws InterruptedException	{
		
		try
		{
			SwitchToFrame();
		}
		catch(Exception e)
		{
			
		}
				
		try
		{
		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button--neutral slds-button--small slds-col--bump-left ng-isolate-scope' and contains(text(),'Edit All')]")));

		WebElement Edit_All = driver.findElement(By.xpath("//*[@class='slds-button slds-button--neutral slds-button--small slds-col--bump-left ng-isolate-scope' and contains(text(),'Edit All')]"));
		Edit_All.click();
		Edit_All.click();
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	@Test(priority=16,enabled=true)
	public void AssetAttributeclickAgain() throws InterruptedException	{
		
		try{				
		
		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-button slds-button--neutral slds-button--small slds-col--bump-left ng-isolate-scope' and contains(text(),'Edit All')]")));

		WebElement Edit_All = driver.findElement(By.xpath("//*[@class='slds-button slds-button--neutral slds-button--small slds-col--bump-left ng-isolate-scope' and contains(text(),'Edit All')]"));
		Edit_All.click();
		Edit_All.click();
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	@Test(priority=16,enabled=true)
	public void AssetAttributedetails() throws InterruptedException
	{
		Thread.sleep(2000);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("buildingNRA")));

		WebElement Building_NRA = driver.findElement(By.id("buildingNRA"));
		Building_NRA.clear();
		Building_NRA.sendKeys("1500");		
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("singleAssetLandArea3")));

		WebElement Land_Area = driver.findElement(By.id("singleAssetLandArea3"));
		Land_Area.clear();
		Land_Area.sendKeys("1500");		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("singleAssetOccupancy")));

		WebElement Occupancy = driver.findElement(By.id("singleAssetOccupancy"));
		Occupancy.clear();
		Occupancy.sendKeys("10");		
		
		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("singleAssetYearBuilt")));

		WebElement Year_Built = driver.findElement(By.id("singleAssetYearBuilt"));
		Year_Built.clear();
		Year_Built.sendKeys("2015");
		
		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("waltrYears")));

		WebElement Waltr = driver.findElement(By.id("waltrYears"));
		Waltr.clear();
		Waltr.sendKeys("5");
		
		WebDriverWait wait6 = new WebDriverWait(driver, 60);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("waltrYears")));

		WebElement Building_Classification = driver.findElement(By.id("singleAssetBuildingClassification"));
		Building_Classification.sendKeys("Core");		
		
	}
	
	@Test(priority=17,enabled=true)
	public void FinanceAttribute() throws InterruptedException
	{
		
		Thread.sleep(2000);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("grosseditPurchasePrice")));
		
		WebElement Gross_Purchase_Price = driver.findElement(By.id("grosseditPurchasePrice"));
		Gross_Purchase_Price.clear();
		Gross_Purchase_Price.sendKeys("30000");	
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("editClosingCosts")));

		WebElement Closing_cost = driver.findElement(By.id("editClosingCosts"));
		Closing_cost.clear();
		Closing_cost.sendKeys("10000");			
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("editImmediateCapital")));

		WebElement Immediate_Capital = driver.findElement(By.id("editImmediateCapital"));
		Immediate_Capital.clear();
		Immediate_Capital.sendKeys("5000");			
		
		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("editActualCapRate")));

		WebElement Actual_Cap_Rate = driver.findElement(By.id("editActualCapRate"));
		Actual_Cap_Rate.clear();
		Actual_Cap_Rate.sendKeys("5000");		
		
		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("editStabilizedCapRate")));

		WebElement Stabilized_Cap_Rate = driver.findElement(By.id("editStabilizedCapRate"));
		Stabilized_Cap_Rate.clear();
		Stabilized_Cap_Rate.sendKeys("5000");	
		
		WebDriverWait wait6 = new WebDriverWait(driver, 60);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("editIrr")));

		WebElement IRR = driver.findElement(By.id("editIrr"));
		IRR.clear();
		IRR.sendKeys("100");		
		
		WebDriverWait wait7 = new WebDriverWait(driver, 60);
		wait7.until(ExpectedConditions.elementToBeClickable(By.id("dealBrokerCommission")));

		WebElement Broker = driver.findElement(By.id("dealBrokerCommission"));
		Broker.clear();
		Broker.sendKeys("5000");		
		
	}
	
	@Test(priority=18,enabled=true)
	public void FinanceAttributeValidation() throws InterruptedException
	{
		Thread.sleep(2000);
		
		int Grossprice = 30000;
		
		int Closingcost = 10000;
		
		int NetPurchasePriceValue = Grossprice - Closingcost; 
		
		System.out.println(NetPurchasePriceValue);
		
		int BuildingNRA = 1500;		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[49]/div/div/div[1]/div/div[2]/div/div[10]/div/div[2]/div/div/div/span[2]")));

		String result1 = driver.findElement(By.xpath("/html/body/div[49]/div/div/div[1]/div/div[2]/div/div[10]/div/div[2]/div/div/div/span[2]")).getText();
		
		String result2=result1.replace(".00","").trim();
		
		String result3=result2.replace(",","").trim();
		
		int NetPurchasePrice = Integer.parseInt(result3);
		System.out.println(NetPurchasePrice);		
		
		int GrossPricePerSqf = Grossprice/BuildingNRA;		
		
		System.out.println(GrossPricePerSqf);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[49]/div/div/div[1]/div/div[2]/div/div[10]/div/div[5]/div/div/div/span[2]")));

		String result = driver.findElement(By.xpath("/html/body/div[49]/div/div/div[1]/div/div[2]/div/div[10]/div/div[5]/div/div/div/span[2]")).getText();
		
		String replaceString=result.replace(".00 / sqf","").trim();
				
		int GrossPricePer = Integer.parseInt(replaceString);
		System.out.println(GrossPricePer);		
		
		Assert.assertEquals(NetPurchasePriceValue, NetPurchasePrice);
		
		Assert.assertEquals(GrossPricePerSqf, GrossPricePer);		
		
	}
	
	@Test(priority=19,enabled=true)
	public void SaveDeal() throws InterruptedException
	{
		Thread.sleep(2000);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[49]/div/div/div[1]/div/div[3]/button[2]")));

		WebElement Save = driver.findElement(By.xpath("/html/body/div[49]/div/div/div[1]/div/div[3]/button[2]"));
		Save.click();
	}
	
}
