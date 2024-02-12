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

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/a_CHECKOUT  (0.00)_hrefUserIcon'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input__usernameRegisterPage'), username)

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input__emailRegisterPage'), email)

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input__passwordRegisterPage'), password)

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_Confirm password_confirm_passwordRegi_51cd5c'),
	confirmPassword)

//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Advantage Shopping/input_Confirm password_confirm_passwordRegi_51cd5c'), 
//    'p4y+y39Ir5OTdtOb306gDg==')

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_PERSONAL DETAILS_first_nameRegisterPage'), 
    'John')

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_- Use maximum 30 character_last_nameR_6ef033'), 
    'Doe')

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_- Use maximum 30 character_phone_numb_7c938a'), 
    '081334923095')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:250', true)

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_Country_cityRegisterPage'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_- Use maximum 25 character_addressReg_9e23b3'), 
    'Jalan Kemang Selatan')

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_- Use maximum 50 character_state__pro_272a54'), 
    'Jaksel')

WebUI.setText(findTestObject('Object Repository/Page_Advantage Shopping/input_- Use maximum 10 character_postal_cod_639c2f'), 
    '53152')

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/input_Receive exclusive offers and promotio_5c7450'))

WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/button_REGISTER'))

