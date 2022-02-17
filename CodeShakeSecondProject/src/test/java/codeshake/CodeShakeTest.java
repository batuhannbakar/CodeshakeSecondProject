package codeshake;

import codeshake.base.BaseTest;
import codeshake.page.CodeShakePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static codeshake.constant.ConstantsCodeShakePage.*;


public class CodeShakeTest extends BaseTest {

    CodeShakePage codeShakePage;


    @Before
    public void install() {

        codeShakePage = new CodeShakePage(getWebDriver());
    }

    @Test
    public void SecondProject() {

        title = codeShakePage.getTitle();

        Assert.assertEquals(title,"Codeshake | A Cloudwise Company | Istanbul");

        codeShakePage.scrollToElement(MEET_OUR_PARTNER);
        codeShakePage.click(VISIT_BUTTON);

        codeShakePage.switchToSecondTab();

        title = codeShakePage.getTitle();
        Assert.assertEquals(title,"Cloudwise helpt scholen met moderne ICT oplossingen | Cloudwise");

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);


        title = codeShakePage.getTitle();
        Assert.assertEquals(title,"Alle Cloudwisers - Cloudwise");

        MANAGEMENT_NAMES = codeShakePage.getManagementPeople();
        listOfLists.add(MANAGEMENT_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        SUPPORT_NAMES = codeShakePage.getSupportPeople();
        listOfLists.add(SUPPORT_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        PROJECT_AND_SUPPORT_NAMES = codeShakePage.getProjectsandSupportPeople();
        listOfLists.add(PROJECT_AND_SUPPORT_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        SALES_NAMES = codeShakePage.getSalesPeople();
        listOfLists.add(SALES_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        MARKETING_NAMES = codeShakePage.getMarketingPeople();
        listOfLists.add(MARKETING_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        ACADEMY_NAMES = codeShakePage.getAcademyPeople();
        listOfLists.add(ACADEMY_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        DEVELOPMENT_NAMES = codeShakePage.getDevelopmentPeople();
        listOfLists.add(DEVELOPMENT_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        HR_AND_ADMINISTRATION_NAMES = codeShakePage.getHrandAdministrationPeople();
        listOfLists.add(HR_AND_ADMINISTRATION_NAMES);

        codeShakePage.hoverElement(THIS_IS_CLOUDWISE);
        codeShakePage.clickWithJs(ALL_CLOUDWISERS);

        WAREHOUSE_NAMES = codeShakePage.getWareHousePeople();
        listOfLists.add(WAREHOUSE_NAMES);

        System.out.println("\nList of Duplicated Users:");

        System.out.println(codeShakePage.getDuplicatesForAllDepartments(listOfLists));


    }


}

