package Rgr;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StTest {
	Rachet_1 rachet_1;
	Rach_2 rachet_2;

		@Before
		public void setUp() throws Exception {
			rachet_1 = new Rachet_1 ("1","1","1","1");// ������� ��������� ������ calculate - ������� ������ �� ������ ��������
			rachet_2 = new Rach_2 ("1","1","1","1","1","1","1","1");// ������� ��������� ������ calculate - ������� ������ �� ������ ��������
			
		}

		@Test
		public void test() {
			System.out.println(rachet_1.getFinal_1());//������� ��������� � �������
			System.out.println(rachet_2.getFinal_2());//������� ��������� � �������
			
			assertTrue(rachet_1.getFinal_1() == 4.0f); // ���������� ��� ��������� �����
			assertTrue(rachet_2.getFinal_2() == -2.4f); // ���������� ��� ��������� �����
		}

}
