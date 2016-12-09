public class UseAArrayOperationsWithField {
	public static void main(String[] args) {
		int[] list = {4, 5, 84, 7, 1, 15};

		ArrayOperationsWithField arrayOpe = new ArrayOperationsWithField();
		int sum = arrayOpe.getSumArray(list);
		arrayOpe.showSumArray();
		System.out.println("戻り値を表示: " + sum);
	}
}
