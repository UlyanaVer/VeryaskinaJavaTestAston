public class Task3 {
	public static void main(String[] args) {

		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < array.length; i++) {
			int elem = array[i];
			if (elem%2 == 0){
				System.out.print(elem + " ");
			}
		}
	}
}
