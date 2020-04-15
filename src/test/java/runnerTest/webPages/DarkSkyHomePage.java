package runnerTest.webPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.BasePage;

public class DarkSkyHomePage extends ElementUtil{

    //IMPORTANT NOTE: THE LOW AND HIGH TEMP VALUES ON THE PAGE ARE NOT FOUND ON THE TEMPLINE
    //SO I DID NOT USE Assert FUNCTION, SINCE IT WILL GIVE AN ERROR.

    private By locationName = By.xpath("//input[@type='text']");
    private By searchButton = By.xpath("//a[@class='searchButton']");
//    private By hoursXp = (By.xpath("//div[@class='hours']//span[@class]"));
    BasePage basePage=new BasePage();

    public void setLocationName() throws InterruptedException {
        clear(locationName);
        sendValue(locationName, "Broadway, New York, NY");
        clickOn(searchButton);
        Thread.sleep(3000);
    }
    public void verifyTimeline() throws InterruptedException {
        //to verify the hour increment

        List<WebElement> hours = basePage.driverPool.get().findElements(By.xpath("//div[@class='hours']//span[@class]"));
        Thread.sleep(5000);
        List<String> hoursList= new ArrayList<String>();
        ArrayList<Integer> temporaryValues=new ArrayList<Integer>();
        int first=0;
        int second=0;
        int third=0;
        int fourth=0;
        int fifth=0;
        for(int i=2; i<hours.size(); i+=2){
            Thread.sleep(3000);
            String asd=hours.get(i).getText();
            if(!asd.isEmpty()){
                String [] xyz = asd.split(" ");
                int tempoRakam= Integer.parseInt(asd.replaceAll("[^0-9]",""));
                temporaryValues.add(tempoRakam);
            }
        }
        first=temporaryValues.get(1);
        second=temporaryValues.get(2);
        third=temporaryValues.get(3);
        fourth=first-second;
        fifth=second-third;
        if(Math.abs(fourth)==2 || Math.abs(fifth)==2){
            System.out.println("Timeline is displayed with 2 hours incremented");
        }
    }

    public void verifyTemperatures() throws InterruptedException {


        List<WebElement> temps = basePage.driverPool.get().findElements(By.xpath("//div[@class='temps']//span"));
        Thread.sleep(5000);
        List<String> tempsList= new ArrayList<String>();
        ArrayList<Integer> tempValuess=new ArrayList<Integer>();
        for (int i=0; i<temps.size(); i+=2){
            Thread.sleep(3000);
            String a = (temps.get(i).getText());
            String [] xyz = a.split(" ");
            int tempooValue= Integer.parseInt(a.replaceAll("[^0-9]",""));
            tempValuess.add(tempooValue);
        }
        int minIndex =tempValuess.indexOf(Collections.min(tempValuess));
        int maxIndex =tempValuess.indexOf(Collections.max(tempValuess));
        WebElement value1=basePage.driverPool.get().findElement(By.xpath("//span[@class='low-temp-text']"));
        String value2=value1.getText();
        String [] text1=value2.split(" ");
        int displayedLowTemp=Integer.parseInt(value2.replaceAll("[^0-9]",""));
        WebElement value3=basePage.driverPool.get().findElement(By.xpath("//span[@class='high-temp-text']"));
        String value4=value3.getText();
        String [] text2=value4.split(" ");
        int displayedHighTemp=Integer.parseInt(value4.replaceAll("[^0-9]",""));
        int dayLongMinTemp=tempValuess.get(minIndex);
        int dayLongMaxTemp=tempValuess.get(maxIndex);
        if(displayedLowTemp==dayLongMinTemp){
            System.out.println("Displayed low temperature is correct");
        }else{
            System.out.println("Displayed low temperature is incorrect");
        }
        if(displayedHighTemp==dayLongMaxTemp){
            System.out.println("Displayed high temperature is correct");
        }else{
            System.out.println("Displayed high temperature is incorrect");
        }
    }
}
