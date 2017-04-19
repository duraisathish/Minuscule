package enhancement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class General_Enhancement
{
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
public void CreateOpportunity() {	
		
	WebDriverWait wait1 = new WebDriverWait(driver, 30);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Opportunity_Tab']/a")));
	
	driver.findElement(By.xpath("//*[@id='Opportunity_Tab']/a")).click();

	
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input")));
	
	driver.findElement(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
	
}

@Test(priority=3,enabled=true)
public void CreateNewOpportunity() {	
	
		
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='inputOppType']")));
	
	driver.findElement(By.xpath("//*[@id='inputOppType']")).sendKeys("New");
	
	driver.findElement(By.xpath("//*[@id='inputArea']")).sendKeys("1200");
	
	driver.findElement(By.xpath("//*[@id='inputMarket']")).sendKeys("US-LA County");
	
	WebDriverWait wait3 = new WebDriverWait(driver, 30);
	wait3.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__menu")));
		
	driver.findElement(By.className("slds-lookup__menu")).click();	
	
	WebDriverWait wait5 = new WebDriverWait(driver, 30);
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='inputAccount']")));	
	
	driver.findElement(By.xpath("//*[@id='inputAccount']")).sendKeys("Really Useful Boxes");
	
	WebDriverWait wait4 = new WebDriverWait(driver, 30);
	wait4.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__list")));
		
	driver.findElement(By.className("slds-lookup__list")).click();
	
	((JavascriptExecutor)driver).executeScript("scroll(0,600)");
	
	WebDriverWait wait6 = new WebDriverWait(driver, 30);
	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='opportunityApp']/div[1]/div[1]/ng-include/div[3]/button[2]")));	
	
	driver.findElement(By.xpath("//*[@id='opportunityApp']/div[1]/div[1]/ng-include/div[3]/button[2]")).click();	
	
	}


@Test(priority=4,enabled=true)
public void TenantName()
{
	WebDriverWait wait1 = new WebDriverWait(driver, 30);
	wait1.until(ExpectedConditions.elementToBeClickable(By.id("customerEditButton")));	
	
	driver.findElement(By.id("customerEditButton")).click();	
	
	driver.findElement(By.xpath("//*[@id='editTenantName']")).sendKeys("Test");
	
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='editCustomerModal']/div/ng-include/div[3]/button[2]/span[2]")));
	
	driver.findElement(By.xpath("//*[@id='editCustomerModal']/div/ng-include/div[3]/button[2]/span[2]")).click();
		
}

@Test(priority=5,enabled=true)
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

@Test(priority=6,enabled=true)
public void AddUnits()
{
	try	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebElement add = driver.findElement(By.xpath("//*[@id=\"unitAddButton\"]/span"));
	add.click();
	
	WebElement search = driver.findElement(By.id("addProperty"));
	search.clear();
	search.sendKeys("Addis");	

	WebDriverWait wait3 = new WebDriverWait(driver, 30);
	wait3.until(ExpectedConditions.elementToBeClickable(By.className("slds-lookup__menu")));
		
	driver.findElement(By.className("slds-lookup__menu")).click();
	
	WebElement select = driver.findElement(By.xpath("//*[@id=\"addUnitFields\"]/div/div[4]/table/tbody/tr/td[1]/div/label/span[1]"));
	select.click();
	
	WebElement save  = driver.findElement(By.xpath("//*[@id=\"addUnitsModal\"]/div/ng-include/div[3]/button[2]/span[2]"));
	save.click();	
	
}

@Test(priority=7,enabled=true)
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

@Test(priority=8,enabled=true)
public void NewAnalysis()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().frame(driver.findElement(By.id("iframeLeaseAnalysis")));	
	
	WebElement buttonClick = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[1]/div[1]/article/div/button"));
	buttonClick.click();
	
}

@Test(priority=9,enabled=true)
public void UnitsAndSetup()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().defaultContent();
	
	WebElement Units = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[9]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
	Units.click();	
	
}

@Test(priority=10,enabled=true)
public void Budget()
{
	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().defaultContent();
	
	WebElement budget = driver.findElement(By.xpath("//*[@id=\"SPA_Opportunity\"]/div[9]/div/div/div/div[1]/div/div[3]/div[2]/button[2]"));
	budget.click();	
	
}


@Test(priority=11,enabled=true)
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

@Test(priority=12,enabled=true)
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

@Test(priority=13,enabled=true)
public void SaveAnalysis()
{
	((JavascriptExecutor)driver).executeScript("scroll(0,100)");
	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebElement Save = driver.findElement(By.xpath("//*[@id=\"leaseAnalysisApp\"]/ng-include/div/div/div[1]/div[2]/div/button[3]/span"));
	Save.click();
	
}

@Test(priority=14,enabled=true)
public void LaunchAnalysis()
{
	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
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

@Test(priority=15,enabled=true)
public void LaunchApproval()
{
	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
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



@Test(priority=16,enabled=true)
public void Approval()
{
	driver.switchTo().defaultContent();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-250)", "");
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
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

@Test(priority=17,enabled=true)
public void CommentForApproval()
{
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
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[8]/div/p[1]")));
	
	WebElement request = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[3]/div[1]/div[8]/div/p[1]"));
	request.isDisplayed();
}


@Test(priority=18,enabled=true)
public void CreditInquiry()
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
	search.sendKeys("Jeff Sillik");
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebDriverWait wait4 = new WebDriverWait(driver, 60);
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]")));
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]"));
	dropdown.click();
}


@Test(priority=19,enabled=true)
public void CreditInquiryApproval()
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

@Test(priority=20,enabled=true)
public void CreditInquiryLogin()
{
	
	driver.switchTo().defaultContent();
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebDriverWait wait5 = new WebDriverWait(driver, 60);
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topButtonRow\"]/input[4]")));	
	
	WebElement login = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[4]"));
	login.click();
	
}

@Test(priority=21,enabled=true)
public void CreditInquirySubmit() throws InterruptedException
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().frame(driver.findElement(By.id("0666C0000008QjI")));	
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,3000)", "");	
	
	//Verify the element is green 
	WebDriverWait wait3 = new WebDriverWait(driver, 60);
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[170]/div[9]/div/a/span")));
	
	
	WebElement WorkSheet = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[170]/div[9]/div/a/span"));	
	WorkSheet.click();	
	
	
	WebDriverWait wait6 = new WebDriverWait(driver, 60);
	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[6]/div[1]/div[2]/span[1]/span/span[1]/input[1]")));
	
	WebElement month = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[6]/div[1]/div[2]/span[1]/span/span[1]/input[1]"));
	month.sendKeys("04");
	
	WebElement days = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[6]/div[1]/div[2]/span[1]/span/span[1]/input[2]"));
	days.sendKeys("15");
	
	WebElement year = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[6]/div[1]/div[2]/span[1]/span/span[1]/input[3]"));
	year.sendKeys("2017");
	
	WebDriverWait wait5 = new WebDriverWait(driver, 60);
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[9]/div[1]/div[5]/button[2]/span")));
	
	WebElement Submit = driver.findElement(By.xpath("//*[@id=\"allContentDiv\"]/div/ng-include/div[9]/div[1]/div[5]/button[2]/span"));
	Submit.click();
		
}

@Test(priority=22,enabled=true)
public void CreditInquiryLogout()
{
	driver.switchTo().defaultContent();	
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebDriverWait wait5 = new WebDriverWait(driver, 60);
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"userNavButton\"]")));
	
	WebElement Jeff = driver.findElement(By.xpath("//*[@id=\"userNavButton\"]"));
	Jeff.click();
	
	WebDriverWait wait6 = new WebDriverWait(driver, 60);
	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")));
	
	WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
	logout.click();
	
}


@Test(priority=23,enabled=true)
public void ThirdLevelSearch()
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
	search.sendKeys("Juan Fernandez");
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebDriverWait wait4 = new WebDriverWait(driver, 60);
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]")));
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]"));
	dropdown.click();	
	
}

@Test(priority=24,enabled=true)
public void ThirdLevelLogin()
{
 
	CreditInquiryApproval();
	CreditInquiryLogin();	
	
}

@Test(priority=25,enabled=true)
public void ThirdLevelHome()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebDriverWait wait1 = new WebDriverWait(driver, 60);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"81:0;p\"]/div/div/a")));
	
	WebElement home = driver.findElement(By.xpath("//*[@id=\"81:0;p\"]/div/div/a"));
	home.click();	
	
}

@Test(priority=26,enabled=true)
public void ThirdLevelApproval()
{

	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}	
	
	WebDriverWait wait2 = new WebDriverWait(driver, 60);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[25]/div/div[2]/div/ul/li[9]/a")));
	
	WebElement approval = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[2]/nav/ul/li[25]/div/div[2]/div/ul/li[9]/a"));
	approval.click();	
	
}

@Test(priority=27,enabled=true)
public void ThirdLevelClick()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://port--cdpqa.cs63.my.salesforce.com/servlet/servlet.Integration?lid=01r6C00000008jU&ic=1&isdtp=p1&sfdcIFrameOrigin=https://port--cdpqa.lightning.force.com&sfdcIFrameHost=web')]")));
	
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

@Test(priority=28,enabled=true)
public void ThirdLevelLogout()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	driver.switchTo().defaultContent();
	
	WebDriverWait wait3 = new WebDriverWait(driver, 60);
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a")));
	
	WebElement logout = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[1]/div/a"));
	logout.click();
}

@Test(priority=29,enabled=true)
public void FourthLevelApproval()
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
	search.sendKeys("Jorge Girault");
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebDriverWait wait4 = new WebDriverWait(driver, 60);
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]")));
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]"));
	dropdown.click();
	
	CreditInquiryApproval();
	CreditInquiryLogin();	
	ThirdLevelHome();
	ThirdLevelApproval();
	ThirdLevelClick();
	ThirdLevelLogout();	
}


@Test(priority=30,enabled=true)
public void FifthLevelLogin()
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
	search.sendKeys("Hector Ibarzabal");
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	WebDriverWait wait4 = new WebDriverWait(driver, 60);
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]")));
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"phSearchInput:group0:option0\"]"));
	dropdown.click();
	
	CreditInquiryApproval();
	CreditInquiryLogin();	
}

@Test(priority=31,enabled=false)
public void FifthLevelApproval()
{
	try
	{Thread.sleep(2000);} catch(Exception e){System.out.println("Thread Error");}
	
	WebDriverWait wait1 = new WebDriverWait(driver, 60);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[1]/div/nav")));
		
	WebElement home = driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[1]/div/nav"));
	home.click();
			
	WebDriverWait wait2 = new WebDriverWait(driver, 60);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'label slds-truncate slds-text-link') and text() = 'Approvals']")));
	
	WebElement approval = driver.findElement(By.xpath("//span[contains(@class, 'label slds-truncate slds-text-link') and text() = 'Approvals']"));
	approval.click();	
}

@Test(priority=32,enabled=false)
public void FinalApproval()
{
	ThirdLevelClick();
	ThirdLevelLogout();		
}


}

