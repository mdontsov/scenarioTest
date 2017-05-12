package pageobjects.eventztoday;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage {

    @FindBy(css = ".gm-style")
    public WebElement sectionMap;

    @FindBy(css = ".customMapCluster")
    public WebElement customMapCluster;

    @FindBy(css = ".gmnoprint img")
    public WebElement transparentMapFile;
}
