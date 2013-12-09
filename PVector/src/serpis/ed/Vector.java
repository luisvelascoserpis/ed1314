package serpis.ed;

public class Vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] v = {31,14,7,19,20};
		show(v);
		System.out.println("sum(v)=" + sum(v));
//		System.out.println("sum(new int[]{7,9})=" + sum(new int[]{7,9}));
//		int[] vVacio ={};
//		System.out.println("sum(vVacio)=" + sum(vVacio));
		
	}
	
	private static void show(int[] v) {
		for (int item : v)
			System.out.println(item);
	}
	
	public static int sum(int[] v){
		int sum = 0;
		
		for (int index=0; index < v.length; index++)
			sum = sum + v[index];
		return sum;
	}
	
	public static int menor(int[] v){
		int menor = v[0];
		for (int index = 1; index < v.length; index++)
			if (v[index] < menor)
				menor = v[index];
		return menor;
	}
	
	public static int indexOf(int[] v, int item) {
		int index = 0;
		while (index < v.length && v[index] != item)
			index++;
		if (index == v.length)
			return -1;
		return index;
	}
	
	public static int posMenor(int[] v) {
		int posMenor = 0;
		for (int index = 1; index < v.length; index++)
			if (v[index] < v[posMenor])
				posMenor = index;
		return posMenor;
	}

	public static int posMenor(int[] v, int leftIndex) {
		int posMenor = leftIndex;
		for (int index = leftIndex + 1; index < v.length; index++)
			if (v[index] < v[posMenor])
				posMenor = index;
		return posMenor;
	}

	public static void ordenarSeleccionDirecta(int[] v) {
		for (int index = 0; index < v.length - 1; index++) {
			int posMenor = posMenor(v, index);
			int aux = v[index];
			v[index] = v[posMenor];
			v[posMenor] = aux;
		}
	}
}
