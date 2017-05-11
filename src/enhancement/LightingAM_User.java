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
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"221:0;p\"]")));

		WebElement search = driver.findElement(By.xpath("//*[@id=\"221:0;p\"]"));
		search.sendKeys("Rob Antrobius");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		/*WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Rob Antrobius\" in Salesforce']")));

		WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Rob Antrobius\" in Salesforce']"));
		suggestion.click();	*/	
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Rob Antrobius\"']")));

		WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Rob Antrobius\"']"));
		suggestion.click();	

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
		/*//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000001NqqAIAS?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));
		 */
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='User: Rob Antrobius ~ Salesforce - Unlimited Edition']")));
		
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

		/*WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[5]/a/span")));

		WebElement opportunity = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[5]/a/span"));
		opportunity.click();*/
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[5]/a/span")));

		WebElement opportunity = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[2]/one-app-nav-bar/one-app-nav-bar-item-root[5]/a/span"));
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
		search.sendKeys("Addison 4");

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

	@Test(priority=16,enabled=true)
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
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[9]/div/p[1]")));

		WebElement request = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[9]/div/p[1]"));
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
			WebDriverWait wait6 = new WebDriverWait(driver, 60);
			wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a")));

			WebElement setup = driver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a"));
			setup.isDisplayed();				
			
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"216:20;a\"]")));

			WebElement search = driver.findElement(By.xpath("//*[@id=\"216:20;a\"]"));
			search.sendKeys("Jeffrey folkman");	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			/*WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeffrey folkman\" in Salesforce']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeffrey folkman\" in Salesforce']"));
			suggestion.click();	*/	
			
			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeffrey folkman\"']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeffrey folkman\"']"));
			suggestion.click();	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			

			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Jeffrey Folkmann')]")));

			WebElement dropdown = driver.findElement(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Jeffrey Folkmann')]"));
			dropdown.click();

		}
		catch(Exception dropdown)
		{

		}

		AMUserDetails();


	}


	@Test(priority=24,enabled=true)
	public void FirstLevelLogin()
	{

		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
		/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000001NqsJIAS?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));*/

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='User: Jeffrey Folkmann ~ Salesforce - Unlimited Edition']")));
		
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

		WebDriverWait wait6 = new WebDriverWait(driver, 60);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a")));

		WebElement logout = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a"));
		logout.isDisplayed(); 

		/*WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[1]/div/nav/button")));

		WebElement home = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[1]/div/nav/button"));
		home.click();	*/
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[1]/div/nav/one-app-launcher-header/button")));
		
		WebElement home = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div[1]/div/nav/one-app-launcher-header/button"));
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

			/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.cs63.my.salesforce.com/servlet/servlet.Integration?lid=01r6C00000008jU&ic=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));*/
			driver.switchTo().frame(0);
			
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[1]/span")));

			WebElement click = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[1]/span"));
			click.click();

			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[6]/div/div[1]/textarea")));

			WebElement comment = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[6]/div/div[1]/textarea"));
			comment.sendKeys("Test");               

			WebDriverWait wait3 = new WebDriverWait(driver, 60);
			wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[6]/div/div[2]/button[3]")));

			WebElement Submit = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[5]/div[11]/div/div[6]/div/div[2]/button[3]"));
			Submit.click();
		}
		catch(Exception submit)
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
			
			WebDriverWait wait6 = new WebDriverWait(driver, 60);
			wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a")));

			WebElement setup = driver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a"));
			setup.isDisplayed();			
			
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"216:20;a\"]")));

			WebElement search = driver.findElement(By.xpath("//*[@id=\"216:20;a\"]"));
			search.sendKeys("Jacob Thibeault");	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			/*WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jacob Thibeault\" in Salesforce']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jacob Thibeault\" in Salesforce']"));
			suggestion.click();	*/
			
			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jacob Thibeault\"']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jacob Thibeault\"']"));
			suggestion.click();	
			

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			

			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Jacob Thibeault')]")));

			WebElement dropdown = driver.findElement(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Jacob Thibeault')]"));
			dropdown.click();

		}
		catch(Exception dropdown)
		{

		}

		AMUserDetails();

	}

	@Test(priority=29,enabled=true)
	public void SecondLevelLogin()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}															
		/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000003UZYNIA4?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));*/
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='User: Jacob Thibeault ~ Salesforce - Unlimited Edition']")));

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


	@Test(priority=31,enabled=true)
	public void ThirdLevelSearch()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}		

		try
		{	
			WebDriverWait wait6 = new WebDriverWait(driver, 60);
			wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a")));

			WebElement setup = driver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a"));
			setup.isDisplayed();			
			
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"216:20;a\"]")));

			WebElement search = driver.findElement(By.xpath("//*[@id=\"216:20;a\"]"));
			search.sendKeys("Carter Andrus");	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			/*WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Carter Andrus\" in Salesforce']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Carter Andrus\" in Salesforce']"));
			suggestion.click();	*/	
			
			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Carter Andrus\"']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Carter Andrus\"']"));
			suggestion.click();				

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			

			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Carter Andrus')]")));

			WebElement dropdown = driver.findElement(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Carter Andrus')]"));
			dropdown.click();

		}
		catch(Exception dropdown)
		{

		}

		AMUserDetails();	

	}

	@Test(priority=32,enabled=true)
	public void ThirdLevelLogin()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}															
		/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000001NqtNIAS?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));*/									

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='User: Carter Andrus ~ Salesforce - Unlimited Edition']")));
		
		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
		login.click(); 	
	}

	@Test(priority=33,enabled=true)
	public void ThirdLevelApproval()
	{
		FirstLevelHome();
		FirstLevelApproval();
		FirstLevelLevelClick();		
	}


	@Test(priority=34,enabled=true)
	public void FourthLevelSearch()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}		

		try
		{	
			WebDriverWait wait6 = new WebDriverWait(driver, 60);
			wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a")));

			WebElement setup = driver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[1]/a"));
			setup.isDisplayed();			
			
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"216:20;a\"]")));

			WebElement search = driver.findElement(By.xpath("//*[@id=\"216:20;a\"]"));
			search.sendKeys("Jeremy Giles");	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			/*WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeremy Giles\" in Salesforce']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeremy Giles\" in Salesforce']"));
			suggestion.click();	*/	
			
			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeremy Giles\"']")));

			WebElement suggestion = driver.findElement(By.xpath("//span[contains(@class, 'mruSearchLabel slds-text-body--regular slds-text-color--default slds-truncate slds-show slds-m-right--large') and text() = '\"Jeremy Giles\"']"));
			suggestion.click();	

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			

			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Jeremy Giles')]")));

			WebElement dropdown = driver.findElement(By.xpath("//*[@class='textUnderline outputLookupLink slds-truncate forceOutputLookup' and contains(text(),'Jeremy Giles')]"));
			dropdown.click();

		}
		catch(Exception dropdown)
		{

		}

		AMUserDetails();	

	}

	@Test(priority=35,enabled=true)
	public void FourthLevelLogin()
	{
		try
		{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}															
		/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.lightning.force.com/005U0000001NqsDIAS?noredirect=1&isUserEntityOverride=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));*/									

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='User: Jeremy Giles ~ Salesforce - Unlimited Edition']")));
		
		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	

		WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
		login.click(); 	
	}

	@Test(priority=36,enabled=true)
	public void FourthLevelApproval()
	{
		FirstLevelHome();
		FirstLevelApproval();
		FirstLevelLevelClick();		
	}

}
