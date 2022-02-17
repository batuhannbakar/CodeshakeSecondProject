package codeshake.base;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class BasePage extends BaseTest {

    WebDriver webDriver;
    WebDriverWait webDriverWait;


    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 10, 400);
    }

    public WebElement find(By locator) {
        return webDriver.findElement(locator);
    }

    public String getTitle(){
        return webDriver.getTitle();
    }

    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    public void waitUntilElementIsNotVisible(By by){

        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(by));

    }

    public void waitUntilElementIsVisible(By by){

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public WebElement findElement(By by) {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void sendKeys(By by, CharSequence text) {
        WebElement element = findElement(by);
        element.clear();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }

    public void click(By by) {

        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        WebElement element = findElement(by);
        element.click();
    }

    public void clickWithJs(By by) {
        WebElement ele = findElement(by);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(ele));
        JavascriptExecutor executor = (JavascriptExecutor)webDriver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public String getValue(By by) {
        return findElement(by).getAttribute("value");

    }

    public void switchToSecondTab() {
        Set<String> allWindows = webDriver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(allWindows);
        webDriver.switchTo().window(tabs.get(1));
        log.info("Switched to second Tab");

    }

    public void hoverElement(By by) {
        sleep(5);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(findElement(by)).build().perform();
        sleep(5);
    }

    public void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollToElement(By by) {
        sleep(2);
        WebElement element = webDriver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        sleep(1);
    }

    public Integer getSizeofPeople() {
        return webDriver.findElements(By.xpath("//div[1]/div/h3")).size();
    }


    public List<String> getName() {
        List<String> names = new ArrayList<>();

        String comma = "";
        for (int i = 1; i <= getSizeofPeople(); i++) {

            names.add(i - 1, webDriver.findElement(By.xpath("(//div[1]/div/h3)[" + i + "]")).getText());
            System.out.print(comma + names.get(i - 1));
            comma = ", ";

        }

        System.out.println();
        return names;

    }


    public Set<String> getDuplicatesForAllDepartments(List<List<String>> departments) {

        Map<String, Integer> nameToCount = new HashMap<>();

        for (int i=0;i<departments.size();i++){
            for (int k=0;k<departments.get(i).size();k++){
                nameToCount.merge(departments.get(i).get(k), 1, Integer::sum);
            }
        }

        Set<String> duplicates = new HashSet<>();
        for (Map.Entry<String, Integer> entry : nameToCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}