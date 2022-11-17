import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchResultPage;

public class TestExamples extends Setup {

    private static String BASE_URL = "https://github.com";
    private static String SEARCH_PHRASE = "Appium";


    @Test
    public void exampleTest(){

        MainPage main = new MainPage(BASE_URL);
        main.clickOnSearchField();
        main.inputText(SEARCH_PHRASE);
        main.pressEnter();
        SearchResultPage results = new SearchResultPage();
        results.getCountOfElements();
        results.searchResultsCounter();
    }
}
