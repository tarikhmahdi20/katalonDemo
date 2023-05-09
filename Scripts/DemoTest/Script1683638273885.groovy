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

WebUI.navigateToUrl('https://agent.paywellonline.com/')

WebUI.setText(findTestObject('Object Repository/demo/Page_PayWell Agent Application/input__username'), 'cwntcl')

WebUI.setEncryptedText(findTestObject('Object Repository/demo/Page_PayWell Agent Application/input__password'), 'cAc7agN9hgc=')

WebUI.setText(findTestObject('Object Repository/demo/Page_PayWell Agent Application/input__securityAnswer'), '9')

WebUI.click(findTestObject('Object Repository/demo/Page_PayWell Agent Application/button_'))

WebUI.click(findTestObject('Object Repository/demo/Page_PayWell Agent Application/button_OK'))

WebUI.setEncryptedText(findTestObject('Object Repository/demo/Page_PayWell Agent Application/input__password'), '1x4L4Vaz5j0=')

WebUI.setText(findTestObject('Object Repository/demo/Page_PayWell Agent Application/input__securityAnswer'), '9')

WebUI.click(findTestObject('Object Repository/demo/Page_PayWell Agent Application/div_81'))

WebUI.setText(findTestObject('Object Repository/demo/Page_PayWell Agent Application/input__securityAnswer'), '9')

WebUI.click(findTestObject('Object Repository/demo/Page_PayWell Agent Application/button_'))

WebUI.click(findTestObject('Object Repository/demo/Page_PayWell Agent Application/label_'))

WebUI.click(findTestObject('Object Repository/demo/Page_PayWell Agent Application/input__otp'))

WebUI.closeBrowser()

