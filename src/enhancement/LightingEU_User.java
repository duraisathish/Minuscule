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

public class LightingEU_User {

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
	public void EUUserSearch()
	{
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"589:0;p\"]")));

		WebElement search = driver.findElement(By.xpath("//*[@id=\"589:0;p\"]"));
		search.sendKeys("Moritz Heissenberg");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Moritz Heissenberg")));

		WebElement dropdown = driver.findElement(By.partialLinkText("Moritz Heissenberg"));
		dropdown.click();	

	}


	@Test(priority=3,enabled=true)
	public void EUUserDetails()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}	

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("User Detail")));

		WebElement userdetails = driver.findElement(By.partialLinkText("User Detail"));
		userdetails.click();	
	}

	@Test(priority=4,enabled=true)
	public void EUUserLogin()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000001Oam9IAC?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
		login.click(); 	
	}

	@Test(priority=5,enabled=true)
	public void Opportunities()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[5]/a/span")));

		WebElement opportunity = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[5]/a/span"));
		opportunity.click();
	}

	@Test(priority=6,enabled=true)
	public void CreateOpportunity() {			

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("New")));

		driver.findElement(By.partialLinkText("New")).click();

	}

	@Test(priority=7,enabled=true)
	public void CreateNewOpportunity() {	

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(1);

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("inputOppType")));

		WebElement select = driver.findElement(By.id("inputOppType"));
		select.sendKeys("New");	

		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("inputArea")));

		WebElement text = driver.findElement(By.id("inputArea"));
		text.sendKeys("1200");

		WebElement market =driver.findElement(By.xpath("//*[@id='inputMarket']"));
		market.sendKeys("BE-Belgium-Antwerp");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__list")));

		driver.findElement(By.className("slds-lookup__list")).click();

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("inputAccount")));	

		driver.findElement(By.id("inputAccount")).sendKeys("Carniato Europe");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__list")));

		driver.findElement(By.className("slds-lookup__list")).click();

		((JavascriptExecutor)driver).executeScript("scroll(0,600)");

		WebDriverWait wait6 = new WebDriverWait(driver, 60);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"opportunityApp\"]/div[1]/div[1]/ng-include/div[3]/button[2]")));	

		driver.findElement(By.xpath("//*[@id=\"opportunityApp\"]/div[1]/div[1]/ng-include/div[3]/button[2]")).click();	

	}


	@Test(priority=8,enabled=true)
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

	@Test(priority=9,enabled=true)
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
		driver.switchTo().parentFrame();

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter\"]")));

		WebElement search = driver.findElement(By.xpath("//*[@id=\"filter\"]"));
		search.sendKeys("Boom DC1");

		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions.elementToBeClickable(By.className("tt-suggestions")));

		driver.findElement(By.className("tt-suggestions")).click();		

		WebElement select = driver.findElement(By.xpath("//*[@id=\"addUnitFields\"]/div[2]/div[2]/table/tbody/tr[1]/td[1]/div/label/span[1]"));
		select.click();

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]")));

		WebElement Units = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
		Units.click();	


	}

	@Test(priority=14,enabled=true)
	public void Budget()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}		

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]")));

		WebElement budget = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[3]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
		budget.click();			

	}

	@Test(priority=15,enabled=true)
	public void RentsAndIncentive()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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

	@Test(priority=16,enabled=true)
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

	@Test(priority=17,enabled=true)
	public void SaveAnalysis()
	{
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebElement Save = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[1]/div[2]/div/button[3]/span"));
		Save.click();

	}

	@Test(priority=18,enabled=true)
	public void LaunchAnalysis()
	{

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}


		try
		{
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
		catch(Exception dropdown)
		{
			System.out.println("Exception found");
		}


	}

	@Test(priority=19,enabled=true)
	public void LaunchApproval()
	{

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		try
		{
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
		catch(Exception dropdown)
		{
			System.out.println("Exception handled");
		}

	}

	@Test(priority=20,enabled=true)
	public void Approval()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		try
		{


			((JavascriptExecutor)driver).executeScript("scroll(0,100)");
			driver.switchTo().parentFrame();

			WebDriverWait wait3 = new WebDriverWait(driver, 60);
			wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li")));	

			List<WebElement> element1 = driver.findElements(By.xpath("//*[@id='opportunityApp']/div[1]/div[5]/ul/li"));
			for(WebElement elements : element1)
			{

				WebElement test = elements.findElement(By.tagName("a"));      	

				if(test.getText().contains("APPROVAL"))
				{
					test.click();       
				}

			}
		}
		catch(Exception element1)
		{

		}
	}


	@Test(priority=21,enabled=true)
	public void CommentForApproval()
	{

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(driver.findElement(By.id("iframeApproval")));	

		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[4]/textarea")));

		WebElement comment = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[4]/textarea"));
		comment.sendKeys("Test");	

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[6]/button")));

		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[6]/button"));
		Submit.click();	

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[9]/div[2]/p[1]")));

		WebElement request = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[9]/div[2]/p[1]"));
		request.isDisplayed();	

	}	

	@Test(priority=22,enabled=true)
	public void ApprovalLogout()
	{

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().defaultContent();

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a")));

		WebElement logout = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a"));
		logout.click();                       

	}

	@Test(priority=23,enabled=true)
	public void FirstLevelSearch()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		try
		{	
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"174:15;a\"]")));

			WebElement search = driver.findElement(By.xpath("//*[@id=\"174:15;a\"]"));
			search.sendKeys("Bram Verhoeven");	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Bram Verhoeven")));

			WebElement dropdown = driver.findElement(By.partialLinkText("Bram Verhoeven"));
			dropdown.click();
		}
		catch(Exception search)
		{

		}

		EUUserDetails(); 	

	}


	@Test(priority=24,enabled=true)
	public void FirstLevelLogin()
	{

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000000c0f3IAA?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
		login.click(); 		

	}

	@Test(priority=25,enabled=true)
	public void FirstLevelHome()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		driver.switchTo().defaultContent();

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[1]/div/nav/button")));

		WebElement home = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[1]/div/nav/button"));
		home.click();	

	}

	@Test(priority=26,enabled=true)
	public void FirstLevelApproval()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'label slds-truncate slds-text-link') and text() = 'Approvals']")));

		WebElement approval = driver.findElement(By.xpath("//span[contains(@class, 'label slds-truncate slds-text-link') and text() = 'Approvals']"));
		approval.click();	

	}

	@Test(priority=27,enabled=true)
	public void FirstLevelLevelClick()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		try{				

			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.cs63.my.salesforce.com/servlet/servlet.Integration?lid=01r6C00000008jU&ic=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));

			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[1]/span")));

			WebElement click = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[1]/span"));
			click.click();

			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[7]/div/div[1]/textarea")));

			WebElement comment = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[7]/div/div[1]/textarea"));
			comment.sendKeys("Test");               

			WebDriverWait wait3 = new WebDriverWait(driver, 60);
			wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[7]/div/div[2]/button[3]")));

			WebElement Submit = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[7]/div/div[2]/button[3]"));
			Submit.click();
		}
		catch(Exception click)
		{

		}

		ApprovalLogout();		

	}

	@Test(priority=28,enabled=true)
	public void SecondLevelSearch()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}

		try
		{	
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"174:15;a\"]")));

			WebElement search = driver.findElement(By.xpath("//*[@id=\"174:15;a\"]"));
			search.sendKeys("Mark Zulve");	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Mark Zulve")));

			WebElement dropdown = driver.findElement(By.partialLinkText("Mark Zulve"));
			dropdown.click();
		}
		catch(Exception search)
		{

		}

		EUUserDetails(); 	

	}

	@Test(priority=29,enabled=true)
	public void SecondLevelLogin()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}															
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000001NqpuIAC?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));									

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
		login.click(); 	
	}

	@Test(priority=30,enabled=true)
	public void SecondLevelApproval()
	{	
		FirstLevelHome();
		FirstLevelApproval();
		FirstLevelLevelClick();	
	}

}
