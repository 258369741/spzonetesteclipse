package webdriver_basice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class cartandcheckoutorder {

	//view cart pass
	@Test
	public void TC401() throws InterruptedException {
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
	    Thread.sleep(500);
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".nuvbar_cart_icon > svg")).click();
	    Thread.sleep(500);
	    Thread.sleep(500);
	    
	    String actualString = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div/h4")).getText();
	    Thread.sleep(500);
	    Thread.sleep(500);
		String expectedString = "Around the bonfire Black";
		Thread.sleep(500);
		Thread.sleep(500);
		// assertTrue(actualString.contains(expectedString));
		Thread.sleep(500);
		Thread.sleep(500);
		assertEquals(actualString, expectedString);
		Thread.sleep(500);
		Thread.sleep(500);
	    driver.close();
	  }
	
	//check out order pass
		@Test
		public void TC402() throws InterruptedException {
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
		    Thread.sleep(500);
		    Thread.sleep(500);
		    Thread.sleep(500);
		    Thread.sleep(500);
		    driver.findElement(By.cssSelector(".nuvbar_cart_icon > svg")).click();
		    Thread.sleep(500);
		    Thread.sleep(500);
		    driver.findElement(By.cssSelector(".LinkInfoCArtCheckout > button")).click();
		    Thread.sleep(500);
		    Thread.sleep(500);
		    
		    String actualString = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/h2")).getText();
		    Thread.sleep(500);
		    Thread.sleep(500);
			String expectedString = "Select Address";
			Thread.sleep(500);
			Thread.sleep(500);
			// assertTrue(actualString.contains(expectedString));
			Thread.sleep(500);
			Thread.sleep(500);
			assertEquals(actualString, expectedString);
			Thread.sleep(500);
			Thread.sleep(500);
			
		    driver.close();
		}
		
		//delete  order pass
				@Disable
				public void TC403() throws InterruptedException {
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
				    Thread.sleep(500);
					Thread.sleep(500);
					Thread.sleep(500);
					Thread.sleep(500);
				    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[3]/div/div[1]")).click();
				    Thread.sleep(500);
					Thread.sleep(500);
				    driver.findElement(By.cssSelector("button > svg")).click();
				    Thread.sleep(500);
					Thread.sleep(500);
					
					String actualString = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[1]/div[2]/div[1]/h5[2]")).getText();
				    Thread.sleep(500);
				    Thread.sleep(500);
					String expectedString = "0.00 ฿";
					Thread.sleep(500);
					Thread.sleep(500);
					// assertTrue(actualString.contains(expectedString));
					Thread.sleep(500);
					Thread.sleep(500);
					assertEquals(actualString, expectedString);
					Thread.sleep(500);
					Thread.sleep(500);
				    driver.close();
				    
				}

}
