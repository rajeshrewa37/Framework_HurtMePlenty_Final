package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    private By devSiteSearch = By.className("devsite-search-form");
    private By googleSearch = By.xpath("//input[@class='devsite-search-field devsite-search-query']");
    private By switchToCalculator = By.xpath("//div[@class='gs-title']//b[contains(text(),'Google Cloud Pricing Calculator')]");
    private By newFirstFrame = By.xpath("//iframe[contains(@name,'goog_')]");
    private By instancesField = By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']");
    private By seriesOfMachine = By.xpath("//md-select[@name='series']/parent::md-input-container");
    private By seriesOfMachineModel = By.xpath("//md-option[@value='n1']");
    private By machineType = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    private By computeEngine = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    private By gpusCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");
   private By gpuTypeModel =By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGpusModel = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");
    private By localSsd = By.xpath("//md-select[@placeholder='Local SSD']");
    private By localSsdModel = By.xpath("//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']");
    private By dataCenterLocation = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By dataCenterLocationInFrankfurt = By.cssSelector("md-select-menu[class='md-overflow']" + " md-option[value='europe-west3'][ng-repeat*='fullRegionList']");
    private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");
    private By oneYearUsage = By.cssSelector("div[class='md-select-menu-container md-active md-clickable']" + " md-option[value='1'][class='md-ink-ripple']");
    private By addToEstimateButton = By.xpath("//button[@aria-label='Add to Estimate']");
    private By informationInVmClassIsRegular = By.xpath("//div[contains (text(),'Provisioning model: Regular')]");
    private By InformationInInstanceTypeIncludeN1Standard8 =
            By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");

    private By localSsdSpace2x375Gib = By.xpath("//div[contains (text(),'Local SSD: 2x375 GiB')]");

    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");


    public void openCloudPage() {
        driver.get("https://cloud.google.com/");
    }

    public void goToGoogleCloudPlatformPricingCalculatorPage(String keyForCalculatorPageOpening) throws InterruptedException {
        driver.findElement(devSiteSearch).click();
        WebElement textForGoogleSearch = driver.findElement(googleSearch);
        textForGoogleSearch.click();
        textForGoogleSearch.sendKeys(keyForCalculatorPageOpening);
        textForGoogleSearch.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(switchToCalculator).click();
    }

    public CalculatorPage sendKeyInToNumberOfInstancesField(String keyForNumberOfInstances) throws InterruptedException {
        WebElement element = driver.findElement(newFirstFrame);
        driver.switchTo().frame(element);
        driver.switchTo().frame("myFrame");
        Thread.sleep(5000);
        WebElement numberOfInstancesField = driver.findElement(instancesField);
        numberOfInstancesField.sendKeys(keyForNumberOfInstances);
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectSeriesOfMachine() throws InterruptedException {
        driver.findElement(seriesOfMachine).click();
        Thread.sleep(5000);
        driver.findElement(seriesOfMachineModel).click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectMachineType() throws InterruptedException {
        driver.findElement(machineType).click();
        Thread.sleep(5000);
        driver.findElement(computeEngine).click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage clickAddGpusCheckBox() throws InterruptedException {
        driver.findElement(gpusCheckBox).click();
        Thread.sleep(5000);
        return this;
    }



    public CalculatorPage selectGpuType() throws InterruptedException {
        driver.findElement(gpuType).click();
        Thread.sleep(5000);
        driver.findElement(gpuTypeModel).click();
        Thread.sleep(2000);
        return this;
    }
    public CalculatorPage selectNumberOfGpus() throws InterruptedException {
        driver.findElement(numberOfGpus).click();
        Thread.sleep(5000);
        driver.findElement(numberOfGpusModel).click();
        Thread.sleep(5000);
        return this;
    }
    public CalculatorPage selectLocalSsd() throws InterruptedException {
        driver.findElement(localSsd).click();
        Thread.sleep(5000);
        driver.findElement(localSsdModel).click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectDataCenterLocation() throws InterruptedException {
        driver.findElement(dataCenterLocation).click();
        Thread.sleep(5000);
        driver.findElement(dataCenterLocationInFrankfurt).click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage selectCommittedUsage() throws InterruptedException {
        driver.findElement(committedUsage).click();
        Thread.sleep(5000);
        driver.findElement(oneYearUsage).click();
        Thread.sleep(5000);
        return this;
    }

    public CalculatorPage pushAddToEstimate() throws InterruptedException {
        driver.findElement(addToEstimateButton).click();
        Thread.sleep(5000);
        return this;
    }

   public CalculatorPage checkInformationInVmClassIsRegular() {

        driver.findElement(informationInVmClassIsRegular);
       return this;
    }
   public CalculatorPage checkInformationInInstanceTypeIncludeN1Standard8()
   {
        driver.findElement(InformationInInstanceTypeIncludeN1Standard8);
       return this;
   }

    public CalculatorPage checkRegionIsFrankfurt() {

        driver.findElement(regionIsFrankfurt);
        return this;
   }

   public CalculatorPage checkLocalSsdSpace2x375Gib() {

        driver.findElement(localSsdSpace2x375Gib);
       return this;
   }

    public CalculatorPage checkCommitmentTermOneYear() {

        driver.findElement(commitmentTermOneYear);
        return this;

    }
}
