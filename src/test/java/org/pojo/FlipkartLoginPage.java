package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage extends LibGlobal{
	
	public FlipkartLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
		@FindBy(id = "inputEmail")
		WebElement username;
		
		@FindBy(id = "inputPassword")
		WebElement password;
		
		@FindBy(id ="submitLogin")
		WebElement login;

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}
		
	
	
	
	
	

}
