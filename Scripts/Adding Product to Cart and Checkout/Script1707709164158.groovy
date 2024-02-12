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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.callTestCase(findTestCase('Product Browsing'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/li_SOLD OUT                                _12ddb2'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/span_Color_rabbit'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/div_Quantity_plus'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/button_CHECKOUT  (2,018.00)'))

WebUI.setText(findTestObject('Object Repository/Sample/Page_Advantage Shopping/inputUsernameOrder'), 'advantageuser1')

WebUI.setEncryptedText(findTestObject('Object Repository/Sample/Page_Advantage Shopping/inputPasswordOrder'), 'p4y+y39Ir5OTdtOb306gDg==')

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/button_PAY NOW'))

