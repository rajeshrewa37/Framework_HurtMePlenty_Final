package tests;

import org.testng.annotations.Test;

public class CalculatorPageTests extends BaseTest {
    @Test
    public void checkInformationInVmClassString() throws InterruptedException {
        calculatorPage.openCloudPage();
        calculatorPage.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");

        calculatorPage
                .sendKeyInToNumberOfInstancesField("4")
                .selectSeriesOfMachine()
                .selectMachineType()
                .clickAddGpusCheckBox()
                .selectGpuType()
                .selectNumberOfGpus()
                .selectLocalSsd()
                .selectDataCenterLocation()
                .selectCommittedUsage()
                .pushAddToEstimate()
                .checkInformationInVmClassIsRegular()
                .checkInformationInInstanceTypeIncludeN1Standard8()
                .checkRegionIsFrankfurt()
                .checkLocalSsdSpace2x375Gib()
    .checkCommitmentTermOneYear();


    }
}
