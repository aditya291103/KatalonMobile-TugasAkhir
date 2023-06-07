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

Mobile.startExistingApplication('com.ecwid.ShopAt.HappyDayShopping')

Mobile.tap(findTestObject('Object Repository/promo/btnPromo'), 0)

Mobile.tap(findTestObject('Object Repository/promo/click_product'), 0)

Mobile.tap(findTestObject('Object Repository/promo/click_addMore'), 0)

Mobile.tap(findTestObject('Object Repository/promo/click_yourBag'), 0)

Mobile.tap(findTestObject('Object Repository/promo/click_checkout'), 0)

Mobile.delay(15)

'Get Device Height'
device_Height = Mobile.getDeviceHeight()

'Get Width Height'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.10

'Storing the endY value'
int endY = device_Height * 0.30

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/web/btnEmail'), 0)

Mobile.setText(findTestObject('Object Repository/web/btnEmail'), 'horee@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/web/Checkout_inBrowser'), 0)

Mobile.closeApplication()