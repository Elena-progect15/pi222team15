package Rgr;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		PerOpr_1 InfRaz = new PerOpr_1();
		InfRaz.Odin();
        int height=InfRaz.getHeight();
        int width=InfRaz.getWidth();
        int x=InfRaz.getX();
        int y=InfRaz.getY();
        assertEquals(100,x);
        assertEquals(100,y);
        assertEquals(150,height);
        assertEquals(150,width);
	}

}
