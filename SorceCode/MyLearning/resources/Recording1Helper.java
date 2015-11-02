// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Recording1</b><br>
 * Generated     : <b>2015/10/15 6:26:13 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  October 15, 2015
 * @author ap028084
 */
public abstract class Recording1Helper extends RationalTestScript
{
	/**
	 * ComboBox: with default state.
	 *		.text : null
	 * 		.class : ComboBox
	 * 		.name : null
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject comboBoxcomboBox() 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("comboBoxcomboBox"));
	}
	/**
	 * ComboBox: with specific test context and state.
	 *		.text : null
	 * 		.class : ComboBox
	 * 		.name : null
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject comboBoxcomboBox(TestObject anchor, long flags) 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("comboBoxcomboBox"), anchor, flags);
	}
	
	/**
	 * Edit: with default state.
	 *		.text : null
	 * 		.class : Edit
	 * 		.name : null
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject edittext() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("edittext"));
	}
	/**
	 * Edit: with specific test context and state.
	 *		.text : null
	 * 		.class : Edit
	 * 		.name : null
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject edittext(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("edittext"), anchor, flags);
	}
	
	/**
	 * MillenniumLogon: with default state.
	 *		.text : Millennium Logon
	 * 		.class : #32770
	 * 		.processName : cernserver.exe
	 * 		.name : Millennium Logon
	 */
	protected TopLevelSubitemTestObject millenniumLogonwindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("millenniumLogonwindow"));
	}
	/**
	 * MillenniumLogon: with specific test context and state.
	 *		.text : Millennium Logon
	 * 		.class : #32770
	 * 		.processName : cernserver.exe
	 * 		.name : Millennium Logon
	 */
	protected TopLevelSubitemTestObject millenniumLogonwindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("millenniumLogonwindow"), anchor, flags);
	}
	
	/**
	 * MillenniumLogon: with default state.
	 *		.text : Millennium Logon
	 * 		.class : Afx:01390000:8:00010003:00000000:002E06F3
	 * 		.processName : cernserver.exe
	 * 		.name : Millennium Logon
	 */
	protected TopLevelSubitemTestObject millenniumLogonwindow2() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("millenniumLogonwindow2"));
	}
	/**
	 * MillenniumLogon: with specific test context and state.
	 *		.text : Millennium Logon
	 * 		.class : Afx:01390000:8:00010003:00000000:002E06F3
	 * 		.processName : cernserver.exe
	 * 		.name : Millennium Logon
	 */
	protected TopLevelSubitemTestObject millenniumLogonwindow2(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("millenniumLogonwindow2"), anchor, flags);
	}
	
	/**
	 * OK: with default state.
	 *		.text : OK
	 * 		.class : .Pushbutton
	 * 		.name : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject okbutton() 
	{
		return new GuiTestObject(
                        getMappedTestObject("okbutton"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.text : OK
	 * 		.class : .Pushbutton
	 * 		.name : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject okbutton(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("okbutton"), anchor, flags);
	}
	
	

	protected Recording1Helper()
	{
		setScriptName("Recording1");
	}
	
}

