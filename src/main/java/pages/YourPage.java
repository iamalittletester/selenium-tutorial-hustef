package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourPage {
    @FindBy(id = "buttonToClick") public WebElement buttonToClick;
    @FindBy(css = "[type='checkbox']") public WebElement checkboxToClick;

    @FindBy(css = "[type='text']") public WebElement inputToTypeInto;
    @FindBy(css = "textarea") public WebElement textAreaToTypeInto;

    @FindBy(css = "h5") public WebElement h5Element;

    @FindBy(css = "[name='coffee']") public WebElement firstDropdownElement;
    @FindBy(css = "[name='refreshment']") public WebElement multipleDropdownElement;

    @FindBy(id = "linkToClick") public WebElement linkToClick;

    @FindBy(id = "btnForFrameWithId") public WebElement buttonInsideFirstFrame;
    @FindBy(id = "btnForFrameWithIndex") public WebElement buttonInsideFrameWithIndex;
    @FindBy(id = "btnForFrameAsWebElement") public WebElement buttonInsideFrameAsWebElement;
    @FindBy(css = "[src*='forFrameAsWebElement']") public WebElement frameAsWebElement;

    @FindBy(css = "a") public List<WebElement> listOfLinks;

    @FindBy(css = "h4") public WebElement h4Element;

    @FindBy(id = "alertButton") public WebElement alertButton;
    @FindBy(id = "confirmButton") public WebElement confirmButton;
    @FindBy(id = "promptButton") public WebElement promptButton;



}
