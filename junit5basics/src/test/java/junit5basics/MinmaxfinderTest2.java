package junit5basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class MinmaxfinderTest2 {

	

		@Test
		@DisplayName("Test1")
		public void Test1() {
			Minmaxfinder finder=new Minmaxfinder();
			assertArrayEquals(new int[]{1,6}, finder.findMinMax(new int[] {2,3,1,6,5}));
		}
		
}
		
	