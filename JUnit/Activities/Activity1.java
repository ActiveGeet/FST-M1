package activities;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Activity1 {
	
	static ArrayList<String> list;

	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<String>();
		
		list.add("ALPHA");
		list.add("BETA");
		list.add("GAMA");
	}
	
	@Test
	@Order(1)
	void insertTest() {
		assertEquals(3, list.size(),"Array size is Correct");
		list.add(3,"DELTA");
		assertEquals(4, list.size(),"Updated Array size is Correct");
		//assertEquals(5, list.size(),"Array size is wrong");
		
		//assertEquals("DELTA", list.get(0),"Wrong Element");
		assertEquals("ALPHA", list.get(0),"Correct Element");
		assertEquals("BETA", list.get(1),"Correct Element");
		assertEquals("GAMA", list.get(2),"Correct Element");
		assertEquals("DELTA", list.get(3),"Correct Element");
	}
	
	@Test
	@Order(2)
	void replaceTest() {
		assertEquals(3, list.size(),"Array size is Correct");
		list.add("EURO");
		assertEquals(4, list.size(),"Updated Array size is Correct");
		
		list.set(1, "DELTA");
		
		assertEquals("ALPHA", list.get(0),"Correct Element");
		assertEquals("DELTA", list.get(1),"Correct Element");
		assertEquals("GAMA", list.get(2),"Correct Element");
		assertEquals("EURO", list.get(3),"Correct Element");
	}
}
