package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement searchInput = $x("//input[@type='text']");


    public MainPage(String url){
        Selenide.open(url);
    }

    public void clickOnSearchField(){
        searchInput.click();
    }

    public void inputText(String text){
        searchInput.setValue(text);
    }

    public void pressEnter(){
        searchInput.sendKeys(Keys.ENTER);
    }

}
