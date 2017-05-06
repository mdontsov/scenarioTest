package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {

    @FindBy(css = "#rcnt")
    public WebElement resultsBlock;

    @FindBy(css = ".srg .g")
    public List<WebElement> searchResults;
}
