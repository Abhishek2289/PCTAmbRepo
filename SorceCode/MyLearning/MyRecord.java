
import resources.MyRecordHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author ap028084
 */
public class MyRecord extends MyRecordHelper
{
	/**
	 * Script Name   : <b>MyRecord</b>
	 * Generated     : <b>Oct 18, 2015 8:18:57 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/10/18
	 * @author ap028084
	 */
	public void testMain(Object[] args) 
	{
		
		startApp("powerchart");
		
		// Window: cernserver.exe: Millennium Logon
		edittext().click(atPoint(93,-1));
	
		edittext().click(atPoint(81,15));
		
		millenniumLogonwindow().inputChars(dpString("Password"));
		okbutton().click(atPoint(38,14));
	}
}

