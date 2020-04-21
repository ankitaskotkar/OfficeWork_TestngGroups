package suite1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GP {
	
	@Test(groups = {"Group1"})
	  public void method1() {
		  
		System.out.println("Group1 ");
	  }
	  
	  @Test(groups= {"Group2"})
	  public void method2() {
		  System.out.println("Group2");
	  }
	  
	  @Test(groups= {"Group1", "Group2"})
	  public void method3() {
		  System.out.println("Either Group1 or Group2");
	  }
}
