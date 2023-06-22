package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.Variables;

public class Recruitment extends Variables{
	
	// Constructor to initialize initElements
	// Check this
	
	public Recruitment()
	{
		PageFactory.initElements(driver, this);
	}
}
