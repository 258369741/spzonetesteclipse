package webdriver_basice;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import org.apache.commons.io.FileUtils;

class Buy {
	  public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }
	//choose product
	@Test
	public void TC301() throws InterruptedException {
		System.out.println("Choose product to cart");
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:3000/");
		System.out.println("Step : Login ");
	    driver.manage().window().setSize(new Dimension(926, 824));
	    driver.findElement(By.cssSelector(".Login-text-home")).click();
	    driver.findElement(By.name("L_email")).click();
	    driver.findElement(By.name("L_email")).sendKeys("thx123@hotmail.com");
	    driver.findElement(By.name("L_password")).click();
	    driver.findElement(By.name("L_password")).sendKeys("12345678");
	    driver.findElement(By.cssSelector(".input-submit-login > input")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".input-submit-login > input"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    System.out.println("Result : Login Success");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".hamburger-react")).click();
	    Thread.sleep(1000);
	    System.out.println("Step : Add to cart ");
	    driver.findElement(By.cssSelector(".item-nuvbar-box:nth-child(4) span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".Link-producttoInfo:nth-child(1) img")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".radio-input-group-proInfo:nth-child(2) > label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".button_add_cart")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[3]/div/div[1]")).click();
	    Thread.sleep(1000);
	    
	    String actualString = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div/h4")).getText();
	    Thread.sleep(1000);
		String expectedString = "Around the bonfire Black";
		Thread.sleep(1000);
		// assertTrue(actualString.contains(expectedString));
		Thread.sleep(2000);
		try {
		assertEquals(actualString, expectedString);
		System.out.println("Result : Add to cart Success");
		takeSnapShot(driver,"C://Users//mmilk//Desktop//Addtocart.png");
		}catch(Throwable e)
		{
		System.out.println("Result : Add to cart fail ");
		}
		finally {
		System.out.println("Checkout testing end");
		
		}
		Thread.sleep(1000);
		
	    driver.close();
	    
	}
	
	
	//checkout
	@Test
	public void TC302() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(928, 824));
	    driver.findElement(By.cssSelector(".Login-text-home")).click();
	    driver.findElement(By.name("L_email")).click();
	    driver.findElement(By.name("L_email")).sendKeys("thx123@hotmail.com");
	    driver.findElement(By.name("L_password")).click();
	    driver.findElement(By.name("L_password")).sendKeys("12345678");
	    driver.findElement(By.cssSelector(".input-submit-login > input")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".input-submit-login > input"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".nuvbar_cart_icon > svg")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".LinkInfoCArtCheckout > button")).click();
	    Thread.sleep(1000);
	    
	    String actualString = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/h2")).getText();
	    Thread.sleep(1000);
		String expectedString = "Select Address";
		Thread.sleep(1000);
		// assertTrue(actualString.contains(expectedString));
		Thread.sleep(1000);
		try {
		assertEquals(actualString, expectedString);
		System.out.println("Result : Checkout  Success ");
		takeSnapShot(driver,"C://Users//mmilk//Desktop//Checkout.png");
		}catch(Throwable e)
		{
			System.out.println("Result : Checkout  fail ");
		}
		finally {
		System.out.println("Checkout testing end");
			
			}
		Thread.sleep(1000);
		
	    driver.close();
	}
	
	//choose address
	@Test
	public void TC303() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(928, 824));
	    driver.findElement(By.cssSelector(".Login-text-home")).click();
	    driver.findElement(By.name("L_email")).click();
	    driver.findElement(By.name("L_email")).sendKeys("thx123@hotmail.com");
	    driver.findElement(By.name("L_password")).click();
	    driver.findElement(By.name("L_password")).sendKeys("12345678");
	    driver.findElement(By.cssSelector(".input-submit-login > input")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".input-submit-login > input"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector(".nuvbar_cart_icon > svg")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".LinkInfoCArtCheckout > button")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/h4")).click();
	    driver.findElement(By.cssSelector(".arrow_next_payment")).click();
	    Thread.sleep(1000);
	    
	    String actualString = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/h2")).getText();
	    Thread.sleep(1000);
		String expectedString = "Payment Page";
		Thread.sleep(1000);
		// assertTrue(actualString.contains(expectedString));
		Thread.sleep(1000);
		try {
		assertEquals(actualString, expectedString);
		System.out.println("Result : Choose address  Success ");
		takeSnapShot(driver,"C://Users//mmilk//Desktop//Chooseaddress.png");
		}catch(Throwable e) {
			System.out.println("Result : Choose address  fail ");
		}
		finally {
			System.out.println("Choose address testing end");	
		}
		Thread.sleep(1000);
	    driver.close();
	}
	
	//payment
	@Test
	public void TC304() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(928, 824));
	    driver.findElement(By.cssSelector(".Login-text-home")).click();
	    driver.findElement(By.name("L_email")).click();
	    driver.findElement(By.name("L_email")).sendKeys("thx123@hotmail.com");
	    driver.findElement(By.name("L_password")).click();
	    driver.findElement(By.name("L_password")).sendKeys("12345678");
	    driver.findElement(By.cssSelector(".input-submit-login > input")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".input-submit-login > input"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector(".nuvbar_cart_icon > svg")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".LinkInfoCArtCheckout > button")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/h4")).click();
	    driver.findElement(By.cssSelector(".arrow_next_payment")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".bill_img")).click();
	    driver.findElement(By.id("ImgFileOrder")).sendKeys("C:\\Users\\mmilk\\Downloads\\testpayment.jpg");
	    driver.findElement(By.cssSelector(".button_group_payment_next")).click();
	    Thread.sleep(1000);
	    
	    String actualString = driver.findElement(By.xpath("//*[@id=\"Modal_Finish_cart\"]/div/h1")).getText();
	    Thread.sleep(1000);
		String expectedString = "Successful purchase";
		Thread.sleep(1000);
		// assertTrue(actualString.contains(expectedString));
		Thread.sleep(1000);
		try {
		assertEquals(actualString, expectedString);
		System.out.println("Result : Payment success");
		takeSnapShot(driver,"C://Users//mmilk//Desktop//Payment.png");
		}catch(Throwable e) {
			System.out.println("Payment fail");
		}
		finally {
			System.out.println("Payment testing end");	
		}
		Thread.sleep(1000);
	    driver.close();
	}
}
