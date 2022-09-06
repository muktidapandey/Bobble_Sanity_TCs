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

Mobile.startExistingApplication('com.touchtalent.bobbleapp')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (18)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Keyboard Settings (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Keyboard (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Auto-Correct (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (6)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Off (4)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Modest (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Aggressive (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Light (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Height (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (7)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Extra Short (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Mid Short (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Short (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Mid Tall (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Tall (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Extra Tall (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Normal (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Vibration (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (8)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Default (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Custom (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Off (5)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Key pop up (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Key Border (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Top Keys (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Sound (1)'), 0)

Mobile.scrollToText('Additional Settings')

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Sticker, GIF Suggestion (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Emoji Number Row (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Story of the Day Notification (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Live Cricket Score Bar (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Pop-Text Suggestion (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Additional Settings (1)'), 0)

Mobile.scrollToText('Version')

Mobile.verifyElementVisible(findTestObject('Object Repository/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

