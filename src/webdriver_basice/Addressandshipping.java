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

class Addressandshipping {
	
	//add address for shipping pass
	@Disable
	public void TC501() throws InterruptedException {
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
	    driver.manage().window().setSize(new Dimension(932, 824));
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
	    Thread.sleep(500);
	    Thread.sleep(500);
	    Thread.sleep(500);
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[3]/div/div[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".LinkInfoCArtCheckout > button")).click();
	    Thread.sleep(500);
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector(".AddNewAddress_Payment")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_receive_name")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_receive_name")).sendKeys("test");
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_phone")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_phone")).sendKeys("1234567890");
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_homenumber")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_homenumber")).sendKeys("99");
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_moo")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_moo")).sendKeys("9");
	    Thread.sleep(1000);
	    driver.findElement(By.name("A_province")).click();
	    Thread.sleep(1000);
	    {
	        WebElement dropdown = driver.findElement(By.name("A_province"));
	        dropdown.findElement(By.xpath("//*[@id=\"Modal_Add_Address_Payment\"]/div/div[4]/select/option[12]")).click();
	      }
	    Thread.sleep(1000);
	    Thread.sleep(1000);
	    Thread.sleep(1000);
	    Thread.sleep(1000);
	    Thread.sleep(1000);
	    Thread.sleep(1000);
	    Thread.sleep(1000);
	      driver.findElement(By.name("A_district")).click();
	      {
	        WebElement dropdown = driver.findElement(By.name("A_district"));
	        dropdown.findElement(By.xpath("//*[@id=\"Modal_Add_Address_Payment\"]/div/div[5]/select[1]/option[10]")).click();
	      }
	      Thread.sleep(1000);
	      Thread.sleep(1000);
	      driver.findElement(By.name("A_canton")).click();
	      {
	        WebElement dropdown = driver.findElement(By.name("A_canton"));
	        dropdown.findElement(By.xpath("//*[@id=\"Modal_Add_Address_Payment\"]/div/div[5]/select[2]/option[2]")).click();
	      }
	      Thread.sleep(1000);
	      Thread.sleep(1000);
	      driver.findElement(By.name("A_postal_code")).click();
	      {
	        WebElement dropdown = driver.findElement(By.name("A_postal_code"));
	        dropdown.findElement(By.xpath("//*[@id=\"Modal_Add_Address_Payment\"]/div/div[6]/select/option[2]")).click();
	      }
	      Thread.sleep(1000);
	      Thread.sleep(1000);
	      driver.findElement(By.cssSelector(".button_Address_Payment_add > button")).click();
	      {
	        WebElement element = driver.findElement(By.cssSelector(".group_ofAddressPayment"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).clickAndHold().perform();
	      }
	      Thread.sleep(1000);
	      Thread.sleep(1000);
	      {
	        WebElement element = driver.findElement(By.cssSelector(".group_ofAddressPayment"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	      }
	      Thread.sleep(1000);
	      Thread.sleep(1000);
	      {
	        WebElement element = driver.findElement(By.cssSelector(".group_ofAddressPayment"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).release().perform();
	      }
	      Thread.sleep(1000);
	      Thread.sleep(1000);
	      driver.findElement(By.cssSelector(".address_payment_group:nth-child(8) > h5")).click();
	      Thread.sleep(1000);
	      
	      String actualString = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div/div/div[8]/h5")).getText();
		    Thread.sleep(500);
		    Thread.sleep(500);
			String expectedString = "99 9 สัตหีบ สัตหีบ ชลบุรี 20180";
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
	
	//add address for shipping fail 
		@Disable
		public void TC502() throws InterruptedException {
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
		    driver.manage().window().setSize(new Dimension(932, 824));
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
		    Thread.sleep(500);
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[3]/div/div[1]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".LinkInfoCArtCheckout > button")).click();
		    Thread.sleep(500);
		    Thread.sleep(500);
		    driver.findElement(By.cssSelector(".AddNewAddress_Payment")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_receive_name")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_receive_name")).sendKeys("test");
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_phone")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_phone")).sendKeys("1234567890");
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_homenumber")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_homenumber")).sendKeys("99");
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_moo")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_moo")).sendKeys("9");
		    Thread.sleep(1000);
		    driver.findElement(By.name("A_province")).click();
		    Thread.sleep(1000);
		    {
		        WebElement dropdown = driver.findElement(By.name("A_province"));
		        dropdown.findElement(By.xpath("//*[@id=\"Modal_Add_Address_Payment\"]/div/div[4]/select/option[12]")).click();
		      }
		    Thread.sleep(1000);
		    Thread.sleep(1000);
		    
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
		
		//add address for shipping fail
				@Disable
				public void TC503() throws InterruptedException {
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
				    driver.manage().window().setSize(new Dimension(932, 824));
				    driver.findElement(By.cssSelector(".Login-text-home")).click();
				    driver.findElement(By.name("L_email")).click();
				    driver.findElement(By.name("L_email")).sendKeys("thx123@hotmail.com");
				    driver.findElement(By.name("L_password")).click();
				    driver.findElement(By.name("L_password")).sendKeys("12345678");
				    Thread.sleep(1000);
				    Thread.sleep(1000);
				    driver.findElement(By.cssSelector(".input-submit-login > input")).click();
				    Thread.sleep(5000);
				    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[3]/div/div[1]")).click();
				    Thread.sleep(1000);
				    Thread.sleep(1000);
				    Thread.sleep(1000);
				    driver.findElement(By.cssSelector(".LinkInfoCArtCheckout > button")).click();
				    Thread.sleep(500);
				    Thread.sleep(500);
				    driver.findElement(By.cssSelector(".AddNewAddress_Payment")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_receive_name")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_receive_name")).sendKeys("test");
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_phone")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_phone")).sendKeys("1234567890");
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_homenumber")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_homenumber")).sendKeys("99");
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_moo")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.name("A_moo")).sendKeys("9");
				    Thread.sleep(1000);
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
						
}
