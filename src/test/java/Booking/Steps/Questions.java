package Booking.Steps;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.OutputType;

public class Questions {

	private WebDriver driver;

	public Questions (WebDriver driver){
		this.driver = driver;
	}

	@Step
	public void tituloAssert() {

		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "Booking.com");
	}

	@Step
	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\jmedina\\Documents\\Captura" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Step
	public void textoAssert() {

		Assert.assertEquals("Introduce tu contraseña", "Introduce tu contraseña");
	}

	@Step
	public void textoCrearCuentaAssert() {

		Assert.assertEquals("Crea una contraseña", "Crea una contraseña");
	}

	public void Scrolldown(String Admin) {
		//WebElement result = driver.findElement(By.xpath("(//*[text() = '"+Admin + "' ])[1]"));
		//WebElement result = driver.findElement(By.xpath("(//*[text() = 'Admin' ])[1]"));
		  //WebElement result = driver.findElement(By.xpath("(//*[text()='Siddik9607'])[1]"));works
		//WebElement result = driver.findElement(By.xpath("(//*[text()='"+Admin+"'])[1]"));
		//WebElement result = driver.findElement(By.xpath("(//*[text()='Siddik9761'])[1]"));
		//WebElement result = driver.findElement(By.xpath("(//*[text()='" +Admin+"'])[1]"));
		//WebElement result = driver.findElement(By.xpath("(//*[text()='" +Admin + "'])[1]"));
		//WebElement result = driver.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']//div[text()='Fiona.Grace']"));
		//WebElement result = driver.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']//div[text()= '" +Admin+ " ']"));
		WebElement result = driver.findElement(By.xpath("//*[text()='" +Admin + "']"));

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", result);
	}
}
