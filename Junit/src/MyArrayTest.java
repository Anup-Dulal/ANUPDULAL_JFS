import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyArrayTest {
	MaxMinFinder mm;
	@BeforeEach
	void MaxMin() {
		mm = new MaxMinFinder();
	}

	@Test
	@DisplayName("This is Array Test")
	void test() {
		int[] exp = new int[] {2,99};
		int[] exp1 = new int[] {1,97};
		int[] exp2 = new int[] {1,77};
		assertArrayEquals(exp,mm.findMinMax(new int[] {2,12,34,55,3,22,66,77,99}));
		assertArrayEquals(exp1,mm.findMinMax(new int[] {33,1,44,22,55,66,77,97}));
		assertArrayEquals(exp2,mm.findMinMax(new int[] {3,1,4,2,55,66,77,9}));
	}
	@Test
	@DisplayName("Max Test")
	void maxTest() {
		int[] arr = {2,12,34,55,3,22,66,77,99};
		int[] arr1 = {33,1,44,22,55,66,77,97};
		int exp = 99;
		int exp1 = 97;
		assertEquals(exp,mm.findMax(arr));
		assertEquals(exp1,mm.findMax(arr1));
		
		
	}
	@Test
	@DisplayName("Min Test")
	void minText() {
		int[] arr = {2,12,34,55,3,22,66,77,99};
		int[] arr1 = {33,1,44,22,55,66,77,97};
		int exp = 2;
		int exp1 = 1;
		assertEquals(exp,mm.findmin(arr));
		assertEquals(exp1,mm.findmin(arr1));
	}

}
