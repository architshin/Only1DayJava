public class ArrayOperations2 {
	public int getSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		return sum;
	}

	public void showSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		System.out.println("配列内の合計: " + sum);
	}
}
