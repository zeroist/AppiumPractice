package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class EtsyLogin {
    public EtsyLogin() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
