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

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities/button_CLONE opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities/input__closingdate clone opp'), '02/02/2020')

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities/stage clone opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities/input stage clone opp'), 'Prospect')

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Opportunities/input stage clone opp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities/button_Save CLONE opp'))

WebUI.delay(2)

