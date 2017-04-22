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
import org.testng.annotations.Test;

public class LightingAM_User {
	
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
			wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"335:0;p\"]")));
			
			WebElement search = driver.findElement(By.xpath("//*[@id=\"335:0;p\"]"));
			search.sendKeys("Rob Antrobius");
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Rob Antrobius")));
			
			WebElement dropdown = driver.findElement(By.partialLinkText("Rob Antrobius"));
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
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000001NqqAIAS?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));
	
	WebDriverWait wait5 = new WebDriverWait(driver, 60);
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	
	
	WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
	login.click();	
	
}

@Test(priority=5,enabled=true)
public void CreateOpportunity() {	
		
	WebDriverWait wait1 = new WebDriverWait(driver, 30);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[5]/a/span")));
	
	WebElement opportunity = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[5]/a/span"));
	opportunity.click();

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebDriverWait wait2 = new WebDriverWait(driver, 60);
	wait2.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("New")));
	
	driver.findElement(By.partialLinkText("New")).click();
	
}

@Test(priority=6,enabled=true)
public void CreateNewOpportunity() {	
		
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().frame(1);
	
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	wait2.until(ExpectedConditions.elementToBeClickable(By.id("inputOppType")));
	
	driver.findElement(By.id("inputOppType")).sendKeys("New");	
	
	WebDriverWait wait3 = new WebDriverWait(driver, 30);
	wait3.until(ExpectedConditions.elementToBeClickable(By.id("inputArea")));
	
	driver.findElement(By.id("inputArea")).sendKeys("1200");	
	
	WebDriverWait wait5 = new WebDriverWait(driver, 30);
	wait5.until(ExpectedConditions.elementToBeClickable(By.id("inputAccount")));	
	
	driver.findElement(By.id("inputAccount")).sendKeys("Really Useful Boxes");
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebDriverWait wait4 = new WebDriverWait(driver, 60);
	wait4.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__list")));
		
	driver.findElement(By.className("slds-lookup__list")).click();
	
	((JavascriptExecutor)driver).executeScript("scroll(0,600)");
	
	WebDriverWait wait6 = new WebDriverWait(driver, 30);
	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"opportunityApp\"]/div[1]/div[1]/ng-include/div[3]/button[2]")));	
	
	driver.findElement(By.xpath("//*[@id=\"opportunityApp\"]/div[1]/div[1]/ng-include/div[3]/button[2]")).click();	
	
}

@Test(priority=7,enabled=true)
public void TenantName()
{

	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebDriverWait wait1 = new WebDriverWait(driver, 30);
	wait1.until(ExpectedConditions.elementToBeClickable(By.id("customerEditButton")));	
	
	driver.findElement(By.id("customerEditButton")).click();	
	
	driver.findElement(By.xpath("//*[@id='editTenantName']")).sendKeys("Test");
	
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='editCustomerModal']/div/ng-include/div[3]/button[2]/span[2]")));
	
	driver.findElement(By.xpath("//*[@id='editCustomerModal']/div/ng-include/div[3]/button[2]/span[2]")).click();
		
}


@Test(priority=8,enabled=true)
public void Units()
{
	((JavascriptExecutor)driver).executeScript("scroll(0,200)");	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabOpportunity\"]/ng-include/div[1]/div/div[1]/div[8]/div[1]/div[1]/a[2]")));
	
	WebElement unit = driver.findElement(By.xpath("//*[@id=\"tabOpportunity\"]/ng-include/div[1]/div/div[1]/div[8]/div[1]/div[1]/a[2]"));
	unit.click();
	
	WebElement industry = driver.findElement(By.xpath("//*[@id=\"unitUseField\"]/div/div[1]/div[1]/div/div/select"));
	industry.sendKeys("Auto and Parts");
	
	WebElement customer = driver.findElement(By.xpath("//*[@id=\"unitUseField\"]/div/div[1]/div[2]/div/div/select"));
	customer.sendKeys("Retailer");
	
	WebElement units = driver.findElement(By.xpath("//*[@id=\"unitUseField\"]/div/div[2]/div[1]/div/div[2]/label/span"));
	units.click();
	
	WebElement save = driver.findElement(By.xpath("//*[@id=\"unitUseModal\"]/div/ng-include/div[3]/button[2]"));
	save.click();
	
}

@Test(priority=9,enabled=true)
public void AddUnits()
{
	try	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebElement add = driver.findElement(By.xpath("//*[@id=\"unitAddButton\"]/span"));
	add.click();
	
	WebElement search = driver.findElement(By.id("addProperty"));
	search.clear();
	search.sendKeys("Addi");	

	WebDriverWait wait3 = new WebDriverWait(driver, 30);
	wait3.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__menu")));
		
	driver.findElement(By.className("slds-lookup__menu")).click();
	
	WebElement select = driver.findElement(By.xpath("//*[@id=\"addUnitFields\"]/div/div[4]/table/tbody/tr/td[1]/div/label/span[1]"));
	select.click();
	
	WebElement save  = driver.findElement(By.xpath("//*[@id=\"addUnitsModal\"]/div/ng-include/div[3]/button[2]/span[2]"));
	save.click();
}

@Test(priority=10,enabled=true)
public void Analysis() 
{	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	((JavascriptExecutor)driver).executeScript("scroll(0,100)");			
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li")));	
		
		List<WebElement> element1 = driver.findElements(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li"));
	    for(WebElement elements : element1)
	    {
	    	
	    	WebElement test = elements.findElement(By.tagName("a"));      	
	     
	    	if(test.getText().contains("ANALYSIS"))
	    	{
	    		test.click();       
	    	}
	        
	    }
	
}


@Test(priority=11,enabled=true)
public void ClickAnalysis() 
{	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	((JavascriptExecutor)driver).executeScript("scroll(0,100)");			
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li")));	
		
		List<WebElement> element1 = driver.findElements(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li"));
	    for(WebElement elements : element1)
	    {
	    	
	    	WebElement test = elements.findElement(By.tagName("a"));      	
	     
	    	if(test.getText().contains("ANALYSIS"))
	    	{
	    		test.click();       
	    	}
	        
	    }
	
}

@Test(priority=12,enabled=true)
public void NewAnalysis()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));	
	
	WebElement buttonClick = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[1]/div[1]/article/div/button"));
	buttonClick.click();
	
}

@Test(priority=13,enabled=true)
public void UnitsAndSetup()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Next")));
																	
	WebElement Units = driver.findElement(By.partialLinkText("Next"));
	Units.click();	
	
	

}

@Test(priority=14,enabled=true)
public void UnitsAndSetupClick()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Next")));
																	
	WebElement Units = driver.findElement(By.partialLinkText("Next"));
	Units.click();	
	
}



@Test(priority=15,enabled=true)
public void Budget()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().defaultContent();
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]")));
	
	WebElement budget = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
	budget.click();	
		
}

@Test(priority=16,enabled=true)
public void BudgetClick()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().defaultContent();
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]")));
	
	WebElement budget = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
	budget.click();	
		
}


@Test(priority=17,enabled=true)
public void RentsAndIncentive()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	/*driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));*/
	WebElement RentAndIncentive = driver.findElement(By.xpath("//*[@id=\"rentsIncentives\"]/div[1]"));
	RentAndIncentive.click();	
	
	((JavascriptExecutor)driver).executeScript("scroll(0,500)");	
	
	WebDriverWait wait3 = new WebDriverWait(driver, 60);
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[8]/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[3]/input")));	
	
	WebElement endmonth = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[8]/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[3]/input"));
	endmonth.clear();
	endmonth.sendKeys("12");	
	
	WebElement baserent = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[8]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/input"));
	baserent.clear();
	baserent.sendKeys("2");
	
	((JavascriptExecutor)driver).executeScript("scroll(0,200)");
	
	WebDriverWait wait4 = new WebDriverWait(driver, 60);
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[11]/div[2]/textarea")));
	
	WebElement comment = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[11]/div[2]/textarea"));
	comment.sendKeys("Test");

}

@Test(priority=18,enabled=true)
public void Securities()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		
	WebElement securites = driver.findElement(By.xpath("//*[@id=\"Securities\"]/div[1]"));
	securites.click();	
	
	WebDriverWait wait4 = new WebDriverWait(driver, 60);
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[6]/textarea")));
	
	WebElement comment = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[6]/textarea"));
	comment.sendKeys("Test");
}

}
