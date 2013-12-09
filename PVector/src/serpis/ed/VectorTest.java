package serpis.ed;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

	@Test
	public void sum() {
		int[] v1 = {7, 8, 9, 10};
		int sum1 = 34;
		Assert.assertEquals(sum1, Vector.sum(v1));
	}
	
	@Test
	public void sumEmpty() {
		int[] v1 = {};
		int sum1 = 0;
		Assert.assertEquals(sum1, Vector.sum(v1));
	}
	
	@Test
	public void menor() {
		Assert.assertEquals(7, Vector.menor(new int[]{7, 10, 9, 12}));
		Assert.assertEquals(6, Vector.menor(new int[]{7, 10, 6, 12}));
		Assert.assertEquals(9, Vector.menor(new int[]{12, 10, 15, 9}));
	}
	
	@Test( expected=ArrayIndexOutOfBoundsException.class )
	public void menorEmpty() {
		Vector.menor(new int[]{});
	}
	
	@Test
	public void indexOf() {
		Assert.assertEquals(-1, Vector.indexOf(new int[]{7, 10, 6, 12}, 15));
		Assert.assertEquals(0, Vector.indexOf(new int[]{7, 10, 6, 12}, 7));
		Assert.assertEquals(2, Vector.indexOf(new int[]{7, 10, 6, 12}, 6));
		Assert.assertEquals(3, Vector.indexOf(new int[]{7, 10, 6, 12}, 12));
	}

	@Test
	public void indexOfEmpty() {
		Assert.assertEquals(-1, Vector.indexOf(new int[]{}, 15));
	}
	
	@Test
	public void posMenor() {
		Assert.assertEquals(3, Vector.posMenor(new int[]{17,21,9,8,15}));
		Assert.assertEquals(0, Vector.posMenor(new int[]{6,21,9,8,15}));
		Assert.assertEquals(4, Vector.posMenor(new int[]{17,21,9,8,7}));
	}

	@Test
	public void posMenorLeftIndex() {
		Assert.assertEquals(0, Vector.posMenor(new int[]{7,17,21,8,15}, 0));
		Assert.assertEquals(3, Vector.posMenor(new int[]{7,17,21,8,15}, 1));
		Assert.assertEquals(1, Vector.posMenor(new int[]{17,7,21,8,15}, 0));
		Assert.assertEquals(1, Vector.posMenor(new int[]{17,7,21,8,15}, 1));
		Assert.assertEquals(3, Vector.posMenor(new int[]{17,7,21,8,15}, 2));
		Assert.assertEquals(4, Vector.posMenor(new int[]{17,7,21,8,15}, 4));
	}
	
	@Test
	public void ordenarSeleccionDirecta() {
		int[] v = {17, 7, 6, 12, 8};
		Vector.ordenarSeleccionDirecta(v);
		int[] vExpected = {6, 7, 8, 12, 17};
		Assert.assertArrayEquals(vExpected, v);
	}
}
