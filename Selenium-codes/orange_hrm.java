package Maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange_hrm {
	
	WebDriver dr = new ChromeDriver();
	
	public void login() throws InterruptedException
	{
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	public void admin() throws InterruptedException
	{
	
		
		Thread.sleep(1000);
		dr.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			
		Thread.sleep(1000);
		dr.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).click();
		dr.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).sendKeys("Madhuri Bobade");
		
		
		
		
		
		dr.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		//dr.findElement(By.linkText("ESS")).click();
		
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).click();
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("madhuri");
		
		dr.findElement(By.xpath("//input[@type='password']")).click();
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Madhuri@93");
		
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).click();
		dr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Madhuri@93");
	}

	public void logout()
	{
		
	}
}
