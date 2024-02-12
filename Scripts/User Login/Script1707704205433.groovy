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

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/a_My account                        My orde_124641'))

String expectedUsername = 'advantageuser1'

WebUI.setText(findTestObject('Object Repository/Sample/Page_Advantage Shopping/InputUsername'), expectedUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Sample/Page_Advantage Shopping/InputPassword'), 'p4y+y39Ir5OTdtOb306gDg==')

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/button_SIGN IN'))

String actualUsername = WebUI.getText(findTestObject('Object Repository/Sample/Page_Advantage Shopping/userLogin'))

if (actualUsername.equals(expectedUsername)) {
	WebUI.comment('Username sesuai dengan yang diharapkan.')
} else {
	WebUI.comment('Username tidak sesuai. Diharapkan: ' + expectedUsername + ', tapi ditemukan: ' + actualUsername)
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Sample/Page_Advantage Shopping/userLogin'))



