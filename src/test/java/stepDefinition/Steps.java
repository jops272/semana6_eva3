package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
   @Given("Abrir Chrome")
   public void abrir_Chrome() {
	   System.out.println("En este paso abre el navegador chrome");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kako\\Documents\\RECURSOS S3\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://localhost:3306/db_login");
   }
   
   @When("ingresa Username {string} y Password {string}")
   public void ingresa_Username_y_Password(String string, String string2) {
	   System.out.println("En este paso ingresa las credenciales de usuario");
	   System.out.println("Ingresa usuario y contraseña");
	   By.id("username");
	   driver.findElement(By.name(string));
	   driver.findElement(By.name(string2));
	   
   }
   
   @Then("inicia sesion")
   public void inicia_sesion() {
	   System.out.println("En este paso inicia sesion con los datos ingresados desde Mytest.feature");
	   driver.findElement(By.id("btnIngresar")).click();
   }
   
}
