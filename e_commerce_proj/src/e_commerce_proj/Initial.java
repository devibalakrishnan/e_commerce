package e_commerce_proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.bcel.generic.NEWARRAY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initial {
	static List<String> productList;

	public void isSorted() {

	    // Copies all of the elements from one list into another.
	    List<String> listSorted = new ArrayList<String>(productList);

	    // Sorts the new list.
	    Collections.sort(listSorted);

	    // Check if both of list are equals.
	//System.out.println(listSorted.equals(productList));
	    if(listSorted.equals(productList)){
	    	System.out.println("products are in alphabetical order");
	    }
	    else{
	    	System.out.println("products are not in alphabetical order");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/DEVIBALA/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(" http://live.guru99.com/index.php/");
		driver.manage().window().maximize();
		//verify the title of this website's homepage
		String title=driver.getTitle();
		System.out.println(title);
		//clicking the mobile menu in that page
		driver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).click();
		//verify the title 
		String title1=driver.getTitle();
		System.out.println(title1);
		WebElement dropdown1=driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		dropdown1.sendKeys("Name");
		
		// List<WebElement> productList = driver.findElements(By.xpath(""));

	      
	            String IPHONE = driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a")).getAttribute("innerHTML");
	            String SAMSUNG_GALAXY = driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a")).getAttribute("innerHTML");
	            String SONY_XPERIA = driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/h2/a")).getAttribute("innerHTML");
	            


		
		
		 productList= new ArrayList<String>();
		productList.add(IPHONE);
		productList.add(SAMSUNG_GALAXY);
		productList.add(SONY_XPERIA);
		System.out.println(productList);
		
		//check the ordering
Initial initial=new Initial();
initial.isSorted();
		
	}

}
