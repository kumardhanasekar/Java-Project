package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookSignup extends LibGlobal {
	
	public FaceBookSignup() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Create new account']")
	WebElement createaccount;
	
	@FindBy(id = "u_7_b_0H")
	WebElement firstname;
	
	public WebElement getCreateaccount() {
		return createaccount;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "lastname")
	WebElement lastname;
	
	@FindBy(name = "reg_email__")
	WebElement email;
	
	@FindBy(name = "reg_passwd__")
	WebElement password;

}