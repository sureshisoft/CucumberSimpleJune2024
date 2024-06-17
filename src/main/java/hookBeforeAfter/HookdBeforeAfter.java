package hookBeforeAfter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookdBeforeAfter {

	@Before
	public void befoedatadisplay()
	{
		System.out.println("User  should have connected internet beore launching chromebrowser");
	}
	
	@After
	public void afterdatadisplay()
	{
		System.out.println("The user should shutdown the Computer");
	}
}
