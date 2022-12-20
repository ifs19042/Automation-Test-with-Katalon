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

WebUI.openBrowser(GlobalVariable.PageURL)

WebUI.click(findTestObject('TC_1 -Login/Page_1 new message/i_Coming Soon_icon-user'))

WebUI.selectOptionByValue(findTestObject('Register/FavoriteGenre'), FavoriteGenre, false)

WebUI.selectOptionByValue(findTestObject('Register/FavoriteConsole'), FavoriteConsole, false)

WebUI.selectOptionByValue(findTestObject('Register/HobbiesAndInterest'), HobbiesAndInterest, false)

WebUI.check(findTestObject('Register/Male'))

WebUI.setText(findTestObject('Register/RegisterEmail'), 'EmailBaru123@gmail.com')

WebUI.setText(findTestObject('Register/RegisterPassword'), 'TestingRiski123')

WebUI.setText(findTestObject('Register/ConfirmRegisPassword'), 'PasswordBeda')

WebUI.click(findTestObject('Register/BtnRegister'))

WebUI.verifyElementText(findTestObject('InvalidLogin/Page_Home - PS Enterprise Gameshop/Pesan Eror'), 'Error: Passwords do not match')

WebUI.delay(5)

WebUI.closeBrowser()

