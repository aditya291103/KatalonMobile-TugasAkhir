package shopping

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil



public class scroll {

	@Keyword
	def swipeUp() {

		KeywordUtil.logInfo("Swipe up")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * (9/10)
		int endY = device_Height * (1/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeUpSlightly() {

		KeywordUtil.logInfo("Swipe Slight")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * (9/10)
		int endY = device_Height * (8.5/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeUpSlightly2() {

		KeywordUtil.logInfo("Swipe Slight")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * (9/10)
		int endY = device_Height * (6/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeBrowser() {

		KeywordUtil.logInfo("Swipe Slight")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * (4/10)
		int endY = device_Height * (3/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeYear() {

		KeywordUtil.logInfo("Swipe Year")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width * (6/8)
		int endX = startX
		int startY = device_Height * (7/10)
		int endY = device_Height * (10/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeDate() {

		KeywordUtil.logInfo("Swipe Date")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width * (4/ 6)
		int endX = startX
		int startY = device_Height * (8/10)
		int endY = device_Height * (9/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeMonth() {

		KeywordUtil.logInfo("Swipe Month")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width * (3/4)
		int endX = startX
		int startY = device_Height * (8/10)
		int endY = device_Height * (9/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeUp2() {

		KeywordUtil.logInfo("Swipe up Slight 2")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * (5/10)
		int endY = device_Height * (2/10)

		//Swipe Vertical from bottom to top
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def down() {

		KeywordUtil.logInfo("Swipe Down")

		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()

		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * (9/10)
		int endY = device_Height * (1/10)
		int startY2 = device_Height * (2/10)
		int endY2 = device_Height * (9/10)

		//Swipe down to refresh
		Mobile.swipe(startX, startY2, endX, endY2)
	}
}
