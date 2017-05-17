package enhancement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		new_deal.sendKeys("May17");	
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[4]")));

		WebElement Next = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[4]/button[4]"));
		Next.click();
		
	}

}
