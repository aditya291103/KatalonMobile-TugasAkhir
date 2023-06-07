package shopping

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil













public class checkout {

	@Keyword
	def checkoutBarang(String Product){

		Mobile.startExistingApplication('com.ecwid.ShopAt.HappyDayShopping')

		if (Product == 'Promo') {
			Mobile.comment('click Promo')
			Mobile.tap(findTestObject('Object Repository/promo/btnPromo'), 0)
		} else if (Product == 'newArrivals') {
			Mobile.comment('click new Arrivals')
			Mobile.tap(	findTestObject('Object Repository/newArrival/btnNewArrivals'), 0)
		}

		if (Product == 'Promo') {
			Mobile.comment('click product promo')
			Mobile.tap(findTestObject('Object Repository/promo/click_product'), 0)
		} else if (Product == 'newArrivals') {
			Mobile.comment('click product new Arrivals')
			Mobile.tap(findTestObject('Object Repository/newArrival/btnProduct'), 0)
		}

		if (Product == 'Promo') {
			Mobile.comment('click add more')
			Mobile.tap(findTestObject('Object Repository/promo/click_addMore'), 0)
		} else if (Product == 'newArrivals') {
			Mobile.comment('click add more')
			Mobile.tap(findTestObject('Object Repository/newArrival/AddMore'), 0)
		}
		Mobile.comment('click')
		Mobile.tap(findTestObject('Object Repository/promo/click_yourBag'), 0)

		Mobile.comment('click')
		Mobile.tap(findTestObject('Object Repository/promo/click_checkout'), 0)

		Mobile.delay(15)

		KeywordUtil.logInfo("=====swipe======")

		new shopping.scroll().swipeUpSlightly()

		Mobile.comment('click')
		Mobile.tap(findTestObject('Object Repository/web/Checkout_inBrowser'), 0)

		Mobile.tap(findTestObject('Object Repository/web/btnCountry'), 0)

		Mobile.tap(findTestObject('Object Repository/web/Indonesia'), 0)

		Mobile.setText(findTestObject('Object Repository/web/fullName'), 'Aditya Nur Fahmi', 0)

		Mobile.setText(findTestObject('Object Repository/web/btnPhone'), '12345690', 0)

		Mobile.setText(findTestObject('Object Repository/web/btnAdressJalan'), 'jl majapahit', 0)

		Mobile.setText(findTestObject('Object Repository/web/btnAdressCity'), 'KLATEN', 0)

		Mobile.delay(2)

		KeywordUtil.logInfo("=====scroll======")
		new shopping.scroll().swipeUpSlightly()

		KeywordUtil.logInfo("=====scroll again======")

		new shopping.scroll().swipeUpSlightly()

		KeywordUtil.logInfo("=====scroll agains======")

		new shopping.scroll().swipeUpSlightly()

		KeywordUtil.logInfo("=====scroll agains======")

		new shopping.scroll().swipeUpSlightly()

		KeywordUtil.logInfo("=====scroll last======")

		new shopping.scroll().swipeUpSlightly()

		Mobile.tap(findTestObject('Object Repository/web/Jateng'), 0)

		Mobile.tap(findTestObject('Object Repository/web/jawaTengah'), 0)

		Mobile.tap(findTestObject('Object Repository/web/BtnLocal_muscatDelivery'), 0)

		Mobile.tap(findTestObject('Object Repository/web/Ruwi'), 0)

		Mobile.tap(findTestObject('Object Repository/web/btnContinue'), 0)

		Mobile.closeApplication()
	}
}
