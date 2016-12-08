public class SumArrays {
	public static void main(String[] args) {
		int[] list1 = {4, 5, 84, 7, 1, 15};
		int[] list2 = {54, 47, 5, 358, 2};
		int[] list3 = {5, 87, 8, 11, 41};

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for(int i = 0; i < list1.length; i++) {
			sum1 += list1[i];
		}

		for(int i = 0; i < list2.length; i++) {
			sum2 += list2[i];
		}

		for(int i = 0; i < list3.length; i++) {
			sum3 += list3[i];
		}

		System.out.println("配列1内の合計は、" + sum1 + "です。");
		System.out.println("配列2内の合計は、" + sum2 + "です。");
		System.out.println("配列3内の合計は、" + sum3 + "です。");
	}
}
