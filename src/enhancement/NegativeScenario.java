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

public class NegativeScenario {

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
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"phSearchInput\"]")));

		WebElement search = driver.findElement(By.xpath("//*[@id=\"phSearchInput\"]"));
		search.sendKeys("Moritz Heissenberg");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]")));

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]"));
		dropdown.click();	

	}

	@Test(priority=3,enabled=true)
	public void EUUserDetails()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}	

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"moderatorMutton\"]")));

		WebElement userdetails = driver.findElement(By.xpath("//*[@id=\"moderatorMutton\"]"));
		userdetails.click();

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"USER_DETAIL\"]")));

		WebElement edit = driver.findElement(By.xpath("//*[@id=\"USER_DETAIL\"]"));
		edit.click();	
	}


	@Test(priority=4,enabled=true)
	public void EUUserLogin()
	{
		driver.switchTo().defaultContent();
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
		login.click();	

	}


	@Test(priority=5,enabled=true)
	public void CreateOpportunity()
	{	

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Opportunity_Tab']/a")));

		driver.findElement(By.xpath("//*[@id='Opportunity_Tab']/a")).click();


		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input")));

		driver.findElement(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input")).click();

	}

	@Test(priority=6,enabled=true)
	public void CreateNewOpportunity() {	


		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='inputOppType']")));

		driver.findElement(By.xpath("//*[@id='inputOppType']")).sendKeys("New");

		driver.findElement(By.xpath("//*[@id='inputArea']")).sendKeys("1200");

		driver.findElement(By.xpath("//*[@id='inputMarket']")).sendKeys("BE-Belgium-Antwerp");

		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__menu")));

		driver.findElement(By.className("slds-lookup__menu")).click();	

		WebDriverWait wait5 = new WebDriverWait(driver, 30);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='inputAccount']")));	

		driver.findElement(By.xpath("//*[@id='inputAccount']")).sendKeys("Abacus Plumbing");

		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		wait4.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__list")));

		driver.findElement(By.className("slds-lookup__list")).click();

		((JavascriptExecutor)driver).executeScript("scroll(0,600)");

		WebDriverWait wait6 = new WebDriverWait(driver, 30);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='opportunityApp']/div[1]/div[1]/ng-include/div[3]/button[2]")));	

		driver.findElement(By.xpath("//*[@id='opportunityApp']/div[1]/div[1]/ng-include/div[3]/button[2]")).click();	

	}



	@Test(priority=7,enabled=true)
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

	@Test(priority=8,enabled=true)
	public void Analysis() 
	{	

		((JavascriptExecutor)driver).executeScript("scroll(0,100)");

		driver.navigate().refresh();

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


	@Test(priority=9,enabled=true)
	public void NewAnalysis()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));	

		WebElement buttonClick = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[1]/div[1]/article/div/button"));
		buttonClick.click();

	}


	@Test(priority=10,enabled=true)
	public void UnitsAndSetup()
	{

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().defaultContent();

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter\"]")));

		WebElement search = driver.findElement(By.xpath("//*[@id=\"filter\"]"));
		search.sendKeys("Boom DC1");

		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions.elementToBeClickable(By.className("tt-suggestions")));

		driver.findElement(By.className("tt-suggestions")).click();		

		WebElement select = driver.findElement(By.xpath("//*[@id=\"addUnitFields\"]/div[2]/div[2]/table/tbody/tr[1]/td[1]/div/label/span[1]"));
		select.click();		

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[4]/div/div/div/div[1]/div/div[3]/div[2]/button[2]")));

		WebElement Units = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[4]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
		Units.click();	

	}

	@Test(priority=11,enabled=true)
	public void Budget()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().defaultContent();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[4]/div/div/div/div[1]/div/div[3]/div[2]/button[2]")));

		WebElement budget = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[4]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
		budget.click();	

	}


	@Test(priority=12,enabled=true)
	public void RentsAndIncentive()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));	
		WebElement RentAndIncentive = driver.findElement(By.xpath("//*[@id=\"rentsIncentives\"]/div[1]"));
		RentAndIncentive.click();	

		((JavascriptExecutor)driver).executeScript("scroll(0,500)");	

		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[3]/div[1]/div[4]/div[6]/div[2]/span[2]/span/span[1]/input[1]")));	

		WebElement date = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[3]/div[1]/div[4]/div[6]/div[2]/span[2]/span/span[1]/input[1]"));
		date.sendKeys("15");	

		WebElement month = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[3]/div[1]/div[4]/div[6]/div[2]/span[2]/span/span[1]/input[2]"));
		month.sendKeys("05");

		WebElement year = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[3]/div[1]/div[4]/div[6]/div[2]/span[2]/span/span[1]/input[3]"));
		year.sendKeys("2018");

		WebElement baserent = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[6]/div[1]/div[2]/div[2]/div[2]/input"));
		baserent.clear();
		baserent.sendKeys("2");

		WebElement office = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[6]/div[1]/div[3]/div[2]/div[2]/input"));
		office.clear();
		office.sendKeys("2");

		((JavascriptExecutor)driver).executeScript("scroll(0,200)");

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[11]/div[2]/textarea")));

		WebElement comment = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[11]/div[2]/textarea"));
		comment.sendKeys("Test");

	}

	@Test(priority=13,enabled=true)
	public void Guarantees()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebElement Guarantees = driver.findElement(By.xpath("//*[@id=\"guarantees\"]/div[1]"));
		Guarantees.click();	

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[6]/textarea")));

		WebElement comment = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[2]/div/ng-include[2]/div/div[2]/ui-view/div/div/div[6]/textarea"));
		comment.sendKeys("Test");
	}

	@Test(priority=14,enabled=true)
	public void SaveAnalysis()
	{
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebElement Save = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[1]/div[2]/div/button[3]/span"));
		Save.click();

	}

	@Test(priority=15,enabled=true)
	public void LaunchAnalysis()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().defaultContent();

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"scenarioPopup0\"]/button")));

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"scenarioPopup0\"]/button"));
		dropdown.click();	

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"scenarioPopup0\"]/div/ul/li[4]/a")));

		WebElement launch = driver.findElement(By.xpath("//*[@id=\"scenarioPopup0\"]/div/ul/li[4]/a"));
		launch.click();


	}

	@Test(priority=16,enabled=true)
	public void LaunchApproval()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().defaultContent();

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"scenarioPopup0\"]/button")));

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"scenarioPopup0\"]/button"));
		dropdown.click();	

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"scenarioPopup0\"]/div/ul/li[4]/a")));

		WebElement launch = driver.findElement(By.xpath("//*[@id=\"scenarioPopup0\"]/div/ul/li[4]/a"));
		launch.click();

		dropdown.click();

		launch.click();


	}


	@Test(priority=17,enabled=true)
	public void Overview() 
	{	

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().defaultContent();

		((JavascriptExecutor)driver).executeScript("scroll(0,100)");			

		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li")));	

		List<WebElement> element1 = driver.findElements(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li"));
		for(WebElement elements : element1)
		{

			WebElement test = elements.findElement(By.tagName("a"));      	

			if(test.getText().contains("OVERVIEW"))
			{
				test.click();       
			}

		}

	}

	@Test(priority=18,enabled=true)
	public void TenantNameError()
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("tenantNameError")));	

		String Tenant = driver.findElement(By.id("tenantNameError")).getText();

		Assert.assertEquals(Tenant, " Tenant Name On Lease Required.");


	}


}
