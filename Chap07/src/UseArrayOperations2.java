public class UseArrayOperations2 {
	public static void main(String[] args) {
		int[] list1 = {4, 5, 84, 7, 1, 15};
		int[] list2 = {54, 47, 5, 358, 2};
		int[] list3 = {5, 87, 8, 11, 41};

		ArrayOperations2 arrayOpe = new ArrayOperations2();

		int sum1 = arrayOpe.getSumArray(list1);
		int sum2 = arrayOpe.getSumArray(list2);
		int sum3 = arrayOpe.getSumArray(list3);

		arrayOpe.showSumArray(list1);
		arrayOpe.showSumArray(list2);
		arrayOpe.showSumArray(list3);

		int total = sum1 + sum2 + sum3;
		System.out.println("全配列の総合計: " + total);
	}
}
