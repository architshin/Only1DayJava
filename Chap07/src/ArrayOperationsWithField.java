public class ArrayOperationsWithField {
	public int _sum;

	public int getSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		_sum = sum;
		return sum;
	}

	public void showSumArray() {
		System.out.println("フィールドの合計値: " + _sum);
	}
}
