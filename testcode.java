import static org.junit.Assert.*;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.Assert;

@SuppressWarnings({ "deprecation", "unused" })
public class ExampleUnitTest {
	@BeforeClass
	public static void init()
	{
		System.out.println("Before all the Test cases!");
		System.out.println("Started Test:"+ new Date());
	}
	@Test
	public void addTwoNumbers() {
		int result=Example_1.addTwoNumbers(10, 20);
		int resultexp=30;
		Assert.assertEquals(resultexp, result);
	}
	@Test
	public void diffTwoNumbers()
	{
		int result=Example_1.diffTwoNumbers(300, 100);
		int exp=200;
		Assert.assertEquals(exp, result);		
	}

}