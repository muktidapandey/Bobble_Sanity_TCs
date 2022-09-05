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

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Allow (7)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Select your language (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - English (India) (9)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Choose input method (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Hinglish (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (6)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Try out your Keyboard (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (34)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Allow (7)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Select App (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Photos (5)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Select a photo (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (16)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Party (5)'), 'Party')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Done (7)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Welcome (1)'), 0)

Mobile.closeApplication()

