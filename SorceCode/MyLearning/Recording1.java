
import resources.Recording1Helper;
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
public class Recording1 extends Recording1Helper
{
	/**
	 * Script Name   : <b>Recording1</b>
	 * Generated     : <b>Oct 15, 2015 6:24:09 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/10/15
	 * @author ap028084
	 */
	public void testMain(Object[] args) 
	{
		startApp("powerchart");
		
		// Window: cernserver.exe: Millennium Logon
		comboBoxcomboBox().dragToScreenPoint(atPoint(72,9), comboBoxcomboBox().getScreenPoint(atText("SYSTEM")));
		millenniumLogonwindow().inputKeys("^c{BKSP}^v");
		edittext().click(atPoint(67,13));
		millenniumLogonwindow().inputChars("mr");
		okbutton().click(atPoint(53,10));
	}
}

