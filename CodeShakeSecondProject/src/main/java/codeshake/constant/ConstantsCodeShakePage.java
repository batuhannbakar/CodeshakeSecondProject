package codeshake.constant;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class ConstantsCodeShakePage {

   public static final By MEET_OUR_PARTNER = By.xpath("//span[normalize-space(text())='Meet our partner, Cloudwise!']");
   public static final By VISIT_BUTTON = By.id("comp-knd6ow3j");
   public static final By THIS_IS_CLOUDWISE = By.xpath("//a[normalize-space(text())='Dit is Cloudwise']");
   public static final By ALL_CLOUDWISERS = By.xpath("//a[normalize-space(text())='Alle Cloudwisers']");
   public static final By ALL_CLOUDWISERS_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/']//span[normalize-space(text())='Ontmoet het team']");

   public static final By MANAGEMENT = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Directie']");
   public static final By MANAGEMENT_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/directie/']//span[normalize-space(text())='Wie zijn wij']");

   public static final By SUPPORT = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Support']");
   public static final By SUPPORT_LINK = By.xpath("//a[@href='https://cloudwise.nl/dit-is-cloudwise/alle-cloudwisers/supportteam/']//span[normalize-space(text())='Wie zijn wij?']");

   public static final By PROJECT_AND_SUPPORT = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Projecten & Support']");
   public static final By PROJECT_AND_SUPPORT_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/projecten-support/']//span[normalize-space(text())='Wie zijn wij?']");

   public static final By SALES = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Sales']");
   public static final By SALES_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/sales/']//span[normalize-space(text())='Wie zijn wij?']");

   public static final By MARKETING = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Marketing']");
   public static final By MARKETING_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/marketing/']//span[normalize-space(text())='Wie zijn wij?']");

   public static final By ACADEMY = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Academy']");
   public static final By ACADEMY_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/academy/']//span[normalize-space(text())='Wie zijn wij?']");

   public static final By DEVELOPMENT = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Development']");
   public static final By DEVELOPMENT_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/development/']//span[normalize-space(text())='Wie zijn wij?']");

   public static final By HR_AND_ADMINISTRATION = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='HR & Administratie']");
   public static final By HR_AND_ADMINISTRATION_LINK = By.xpath("//a[@href='https://cloudwise.nl/alle-cloudwisers/hr-administratie/']//span[normalize-space(text())='Wie zijn wij?']");

   public static final By WAREHOUSE = By.xpath("//div[@class='flip-box-front']//div//h3[normalize-space(text())='Logistiek & Service']");
   public static final By WAREHOUSE_LINK = By.xpath("//a[@href='https://cloudwise.nl/dit-is-cloudwise/alle-cloudwisers/logistiek-en-service/']//span[normalize-space(text())='Wie zijn wij?']");

   public static  List<String> MANAGEMENT_NAMES = new ArrayList<>();
   public static  List<String> SUPPORT_NAMES = new  ArrayList<>();
   public static  List<String> PROJECT_AND_SUPPORT_NAMES = new ArrayList<>();
   public static  List<String> SALES_NAMES = new ArrayList<>();
   public static  List<String> MARKETING_NAMES = new ArrayList<>();
   public static  List<String> ACADEMY_NAMES = new ArrayList<>();
   public static  List<String> DEVELOPMENT_NAMES = new ArrayList<>();
   public static  List<String> HR_AND_ADMINISTRATION_NAMES = new ArrayList<>();
   public static  List<String> WAREHOUSE_NAMES = new ArrayList<>();

   public static List<List<String>> listOfLists = new ArrayList<>();

   public static String title ;


}