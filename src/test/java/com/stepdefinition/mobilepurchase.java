package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class mobilepurchase {
	static WebDriver driver;
	@Given("user launching amazon")
	public void user_launching_amazon() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	   }
	String name;

	@When("user ready to search product")
	public void user_ready_to_search_product() 

	
	{
		name="Apple iPhone 12 (64GB)";
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name,Keys.ENTER);
		WebElement mobilename = driver.findElement(By.xpath("(//span[contains(text(),'"+name+"')])[1]"));
		String text = mobilename.getText();
		System.out.println(text);
		mobilename.click();	
	  
	}

	@When("user select the project")
	public void user_select_the_project() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x:child) {
			if (!x.equals(parent)) {
				driver.switchTo().window(x);
				System.out.println("windows switched");
			}
		}

		
		
	   
	}

	@Then("user add the product and purchase")
	public void user_add_the_product_and_purchase() {
		WebElement buy = driver.findElement(By.id("buy-now-button"));
		String text = buy.getText();
		Assert.assertTrue(buy.isDisplayed());
		Assert.assertEquals("BUY NOW",text);
		
		
		
	   
	}
	@When("user ready to search product by one dime list")
	public void user_ready_to_search_product_by_one_dime_list(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(asList.get(0),Keys.ENTER);
		WebElement mobilename = driver.findElement(By.xpath("(//span[contains(text(),'"+asList.get(0)+"')])[1]"));
		String text = mobilename.getText();
		System.out.println(text);
		mobilename.click();	
		driver.quit();
	   
	}
	@When("user ready to search product by one dime map")
	public void user_ready_to_search_product_by_one_dime_map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class,String.class);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(asMap.get("phone3"),Keys.ENTER);
		WebElement mobilename = driver.findElement(By.xpath("(//span[contains(text(),'"+asMap.get("phonne3")+"')])[1]"));
		String text = mobilename.getText();
		System.out.println(text);
		mobilename.click();	
		driver.quit();
	   
	}
	@When("user ready to search product{String}")
	public void user_ready_to_search_product(String name) 

	
	{
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name,Keys.ENTER);
		WebElement mobilename = driver.findElement(By.xpath("(//span[contains(text(),'"+name+"')])[1]"));
		String text = mobilename.getText();
		System.out.println(text);
		mobilename.click();	
	  
	}
	
}
