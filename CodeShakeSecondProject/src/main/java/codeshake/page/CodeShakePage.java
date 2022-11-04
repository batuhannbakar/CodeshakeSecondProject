package codeshake.page;

import codeshake.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;

import static codeshake.constant.ConstantsCodeShakePage.*;

public class CodeShakePage extends BasePage {


    public CodeShakePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToCloudWise() {
        scrollToElement(MEET_OUR_PARTNER);
        click(VISIT_BUTTON);

    }

    public void goToAllCloudWisers() {
        hoverElement(THIS_IS_CLOUDWISE);
        clickWithJs(ALL_CLOUDWISERS);
        Assert.assertEquals(title,"Alle Cloudwisers - Cloudwise");
    }

    public List<String> getManagementPeople() {

        sleep(2);
        scrollToElement(MANAGEMENT);

        hoverElement(MANAGEMENT);

        clickWithJs(MANAGEMENT_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Directie - Cloudwise");

        System.out.print("MANAGEMENT - ");

        return getName();
    }

    public List<String> getSupportPeople() {

        sleep(2);
        scrollToElement(SUPPORT);

        hoverElement(SUPPORT);

        clickWithJs(SUPPORT_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Support - Cloudwise");

        System.out.print("SUPPORT - ");

        return getName();
    }

    public List<String> getProjectsandSupportPeople() {

        sleep(2);
        scrollToElement(PROJECT_AND_SUPPORT);

        hoverElement(PROJECT_AND_SUPPORT);

        clickWithJs(PROJECT_AND_SUPPORT_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Projecten en support - Cloudwise");

        System.out.print("PROJECT AND SUPPORT - ");

        return getName();
    }

    public List<String> getSalesPeople() {

        sleep(2);
        scrollToElement(SALES);

        hoverElement(SALES);

        clickWithJs(SALES_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Sales - Cloudwise");

        System.out.print("SALES - ");


        return getName();
    }

    public List<String> getMarketingPeople() {

        sleep(2);
        scrollToElement(MARKETING);

        hoverElement(MARKETING);

        clickWithJs(MARKETING_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Marketing - Cloudwise");

        System.out.print("MARKETING - ");

        return getName();
    }

    public List<String> getAcademyPeople() {

        sleep(2);
        scrollToElement(ACADEMY);

        hoverElement(ACADEMY);

        clickWithJs(ACADEMY_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Academy - Cloudwise");

        System.out.print("ACADEMY - ");

        return getName();
    }

    public List<String> getDevelopmentPeople() {
        sleep(2);
        scrollToElement(DEVELOPMENT);

        hoverElement(DEVELOPMENT);

        clickWithJs(DEVELOPMENT_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Development - Cloudwise");

        System.out.print("DEVELOPMENT - ");

        return getName();
    }

    public List<String> getHrandAdministrationPeople() {

        sleep(2);
        scrollToElement(HR_AND_ADMINISTRATION);

        hoverElement(HR_AND_ADMINISTRATION);

        clickWithJs(HR_AND_ADMINISTRATION_LINK);

        title = getTitle();
        Assert.assertEquals(title, "HR en administratie - Cloudwise");

        System.out.print("HR AND ADMINISTRATION - ");

        return getName();
    }

    public List<String> getWareHousePeople() {

        sleep(2);
        scrollToElement(WAREHOUSE);

        hoverElement(WAREHOUSE);

        clickWithJs(WAREHOUSE_LINK);

        title = getTitle();
        Assert.assertEquals(title, "Logistiek & Service - Cloudwise");

        System.out.print("WAREHOUSE - ");

        return getName();
    }

}
