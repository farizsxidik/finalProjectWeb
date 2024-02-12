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

String productCategory = 'TABLETS' // Misalnya kita ingin membuka kategori Tablets

switch (productCategory) { 
	case 'TABLETS':
		WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/categoryTablets'))
		WebUI.comment('Navigasi ke halaman Tablets.')
		break
	case 'LAPTOPS':
		WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/categoryLaptops'))
		WebUI.comment('Navigasi ke halaman Laptops.')
		break
	case 'HEADPHONES':
		WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/categoryHeadphones'))
		WebUI.comment('Navigasi ke halaman Headphones.')
		break
	case 'MICE':
		WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/categoryMice'))
		WebUI.comment('Navigasi ke halaman Mice.')
	case 'SPEAKERS':
		WebUI.click(findTestObject('Object Repository/Page_Advantage Shopping/categorySpeakers'))
		WebUI.comment('Navigasi ke halaman Speakers.')
	default:
		WebUI.comment('Kategori produk tidak dikenali.')
}
