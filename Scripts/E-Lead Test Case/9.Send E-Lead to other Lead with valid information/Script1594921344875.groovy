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



WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/textarea__description'), findTestData('E-Lead Test Data/D3').getValue(
	10, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__sender com'), findTestData('E-Lead Test Data/D3').getValue(
	11, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__reciever com'), findTestData('E-Lead Test Data/D3').getValue(
	12, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__sender name'), findTestData('E-Lead Test Data/D3').getValue(
	13, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__employee number'), findTestData('E-Lead Test Data/D3').getValue(
	14, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__department'), findTestData('E-Lead Test Data/D3').getValue(
	15, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__entity code'), findTestData('E-Lead Test Data/D3').getValue(
	16, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__sender email'), findTestData('E-Lead Test Data/D3').getValue(
	17, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__sender phone'), findTestData('E-Lead Test Data/D3').getValue(
	18, 1))

WebUI.click(findTestObject('E-Lead repository/Page_E-Lead/button_Save E-Lead'))