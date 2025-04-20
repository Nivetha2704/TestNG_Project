
package Testng;


import org.testng.annotations.Test;

public class AnnotationsExample extends BaseClass {
	

@Test(groups= {"sanity"})
	public void test1() {
		
		System.out.println("Inside test case1");
	}
	
	@Test(enabled = false)
	public void test2() {
		
		System.out.println("Inside test case2");
	}

}


