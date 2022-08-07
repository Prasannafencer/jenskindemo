package java_practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	@Parameters("url")
	@Test
	public void parameter(String url)
	{
		System.out.println("the url is:"+url);
		
		
	}

}
