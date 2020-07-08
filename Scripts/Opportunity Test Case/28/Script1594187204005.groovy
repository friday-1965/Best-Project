import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Opportunity repository/Page_Competitor/Competitor Brand opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Competitor/input__competitor company name opp'), findTestData(
        'Opportunity Test Data/D13').getValue(1, 1))

WebUI.click(findTestObject('Opportunity repository/Page_Competitor/company type competitor opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Competitor/input company type competitor opp'), findTestData('Opportunity Test Data/D13').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Competitor/input company type competitor opp'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

