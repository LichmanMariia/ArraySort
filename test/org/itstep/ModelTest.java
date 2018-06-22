package org.itstep;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {

	@Test
	public void testGetIndexArray() {
		
		int number = 3;
		ArrayList list = new ArrayList(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8));
		Model model = new Model(number, list);
		ArrayList<Integer> result = model.getIndexArray();
		ArrayList<Integer> result2 = new ArrayList(Arrays.asList(2, 3));
		assertEquals(result.size(), result2.size());
		
		
	}

	@Test
	public void testGetIndexArray1() {
		
		int number = 3;
		ArrayList list = new ArrayList(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8));
		Model model = new Model(number, list);
		ArrayList<Integer> result = model.getIndexArray();
		assertNotNull(result);
		
		
	}
	
	@Test
	public void testGetIndexArray2() {
		
		int number = 1;
		ArrayList list = new ArrayList(Arrays.asList(1, 2, 3, 3, 4, 1, 6, 7, 8));
		Model model = new Model(number, list);
		ArrayList<Integer> result = model.getIndexArray();
		ArrayList<Integer> result2 = new ArrayList(Arrays.asList(0, 5));
		assertEquals(result.get(1), result2.get(1));

		
		
	}
	
	@Ignore
	@Test
	public void testGetStringIndex() {
		
		int number = 3;
		ArrayList list = new ArrayList(Arrays.asList(1, 3, 5, 8, 9, 3, 11, 12));
		Model model = new Model(number, list);
		ArrayList<Integer> result2 = new ArrayList(Arrays.asList(1, 5));
		assertEquals("1, 5", result2);
		
		
		
	}
}


