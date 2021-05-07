package Rgr;

import static org.junit.Assert.*;


import javax.swing.JFrame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class third {
	protected JFrame main_GUI;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}


	
	@Test
	public void Infor() {
		main_GUI = new JFrame("subversion");
		main_GUI.setBounds(500,400,400,300);
        int height=main_GUI.getHeight();
        int width=main_GUI.getWidth();
        int x=main_GUI.getX();
        int y=main_GUI.getY();
        assertEquals(500,x);
        assertEquals(400,y);
        assertEquals(300,height);
        assertEquals(400,width);
		

}
}