package org.stepdefinition;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.pojo.FbLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBookLogin extends LibGlobal {
	
	FbLoginPage f;
	
@Given("User launch the chrome browser and maximize window")
	public void user_launch_the_chrome_browser_and_maximize_window() {
	launchBrowser();
	maximize();

	}
	@When("User launch the facebook application")
	public void user_launch_the_facebook_application() {
		loadUrl("https://www.facebook.com/");

	}

	@When("User enter the valid username and valid password")
	public void user_enter_the_valid_username_and_valid_password() {

		f = new FbLoginPage();
		passText(f.getEmail(), "naveen@gmail.com");
		passText(f.getPassword(), "rock");

	}

	@When("User click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		f = new FbLoginPage();
		click(f.getLoginbtn());
		Thread.sleep(3000);
	}
	

	@When("User Check whether the page navigate to flipkart home page")
	public void user_check_whether_the_page_navigate_to_flipkart_home_page() {

		System.out.println(".....Home page is displayed....");

	}

	@Then("User close the browser")
	public void user_close_the_browser() {
		quit();

	}

	@When("User enter invalid {string} and {string}")
	public void user_enter_invalid_and(String username, String password) throws InterruptedException {
		f = new FbLoginPage();
		Thread.sleep(3000);
		passText(f.getEmail(), username);
		passText(f.getPassword(), password);

	}
	@When("User cliks login button")
	public void user_cliks_login_button() {
		f = new FbLoginPage();
		click(f.getLoginbtn());
	    
	}

	@When("User check whether error message is displayed")
	public void user_check_whether_error_message_is_displayed() throws InterruptedException {
		String text = driver.findElement(By.xpath("//div[contains(text(),'entered is incorrect')]")).getText();
		System.out.println(text);
		boolean contains = text.contains("incorrect");
		System.out.println(contains);
		Thread.sleep(3000);
	}

}



//	FaceBookSignup f;
//
//	@Given("User launch the chrome browser and maximize window")
//	public void user_launch_the_chrome_browser_and_maximize_window() {
//		launchBrowser();
//		maximize();
//	}
//
//	@When("User launch the facebook application")
//	public void user_launch_the_facebook_application() {
//		loadUrl("https://www.facebook.com/");
//
//	}
//
//	@When("User wants to clik create account button")
//	public void user_wants_to_clik_create_account_button() {
//
//		f = new FaceBookSignup();
//		click(f.getCreateaccount());
//	}
//
//	@When("User check whether the signup page is displayed")
//	public void user_check_whether_the_signup_page_is_displayed() throws InterruptedException {
//		Thread.sleep(3000);
//		WebElement pagedisplayed = driver.findElement(By.xpath("//div[text()='Sign Up']"));
//		
//	}
//
//	@When("User enter the first name in first name textbox")
//	public void user_enter_the_first_name_in_first_name_textbox(DataTable d) throws InterruptedException  {
//		 List<String> l = d.asList();
//		f = new FaceBookSignup();
//		Thread.sleep(3000);
//		passText(f.getFirstname(),l.get(1));
//
//	}
//
//	@When("User ener the second name in second name textbox")
//	public void user_ener_the_second_name_in_second_name_textbox(DataTable d) {
//		List<List<String>> l = d.asLists();
//		f = new FaceBookSignup();
//		passText(f.getLastname(), l.get(1).get(1));
//
//	}
//
//	@When("User enter the email or phoneno in email textbox")
//	public void user_enter_the_email_or_phoneno_in_email_textbox(DataTable d) {
//		Map<String, String> m = d.asMap();
//		f = new FaceBookSignup();
//		passText(f.getEmail(),m.get("email1"));
//
//	}
//
//	@When("User enter the password in the password textbox")
//	public void user_enter_the_password_in_the_password_textbox(DataTable d) {
//		List<Map<String, String>> m = d.asMaps(String.class, String.class);
//		f = new FaceBookSignup();
//		passText(f.getPassword(), m.get(1).get("password2"));
//
//	}
//
//	@Then("User close the chrome browser")
//	public void user_close_the_chrome_browser() throws InterruptedException {
//		Thread.sleep(4000);
//		close();
//
//	}

