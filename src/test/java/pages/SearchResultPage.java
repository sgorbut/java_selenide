package pages;

import org.junit.jupiter.api.Assertions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SearchResultPage {

    private final ElementsCollection searchResults = $$x("//li[@class='repo-list-item hx_hit-repo d-flex flex-justify-start py-4 public source']");
    private final SelenideElement searchCounter = $(By.xpath(".//div[@class='d-flex flex-column flex-md-row flex-justify-between border-bottom pb-3 position-relative']")).find(By.xpath(".//h3"));;


    public void searchResultsCounter(){
        Assertions.assertTrue(searchCounter.exists());
        Assertions.assertTrue(searchCounter.isDisplayed());
        System.out.println(searchCounter.getText());
    }

    public void getCountOfElements(){
        System.out.println(searchResults.size());
    }

}