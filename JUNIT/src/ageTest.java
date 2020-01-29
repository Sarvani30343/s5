import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ageTest {
/*age age;
@Before 
public void inti() {
	age =new age();
}*/
	@Test
	public void test() {
		age age=new age();
		assertEquals("true",age.prime(23));
	}
	@Test
	public void test1() {
		age age=new age();
		assertEquals("true",age.prime(19));
	}

}
