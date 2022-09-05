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

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (13)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Keyboard Settings'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Auto-Correct'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Off'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Light'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Modest'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Aggressive'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Height'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Extra Short'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Mid Short'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Short'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Normal'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Mid Tall'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Tall'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Extra Tall'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Vibration'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Off (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Default'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Custom'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Key pop up'), 0)

Mobile.verifyElementChecked(findTestObject('Object Repository/android.widget.Switch'), 0)

Mobile.verifyElementNotChecked(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.verifyElementChecked(findTestObject('Object Repository/android.widget.Switch (1)'), 0)

Mobile.closeApplication()

