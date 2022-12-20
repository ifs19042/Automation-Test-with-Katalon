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

//Open Browser
WebUI.openBrowser('https://www.psegameshop.com')

// Klik icon user
WebUI.click(findTestObject('Object Repository/TC_1 -Login/Page_1 new message/i_Coming Soon_icon-user'))

// Input Username (salah)
WebUI.setText(findTestObject('Object Repository/TC_1 -Login/Page_1 new message/input__username'), 'Username Salah')

// Input Password
WebUI.setText(findTestObject('Object Repository/TC_1 -Login/Page_1 new message/input__password'), 'Password')

// Klik login
WebUI.click(findTestObject('Object Repository/TC_1 -Login/Page_Home - PS Enterprise Gameshop/button_Log in'))

// Verifikasi pesan eror
WebUI.verifyElementText(findTestObject('InvalidLogin/Page_Home - PS Enterprise Gameshop/Pesan Eror'), 'Error: The username Username Salah is not registered on this site. If you are unsure of your username, try your email address instead.')

// Close Browser
WebUI.closeBrowser()

