

import com.rational.test.ft.script.RationalTestScript;

/**
 * Description   : Super class for script helper
 * 
 * @author ap028084
 * @since  October 30, 2015
 */
public abstract class mysuperclass extends RationalTestScript
{
	//TODO Insert shared functionality here
	
	public void  Login(String st)
	{
		
		edittext2().click(atPoint(39,9));
		millenniumLogonwindow().inputChars(dpString("Password"));
		okbutton3().click(atPoint(43,11));
	}
	
}
