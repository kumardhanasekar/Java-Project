package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage extends LibGlobal {
	
	public FbLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id = "email")
private WebElement email;

@FindBy(name = "pass")
private WebElement password;

@FindBy(name = "login")
private WebElement loginbtn;

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbtn() {
	return loginbtn;
}


	
}
