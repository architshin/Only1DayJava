public class WithoutArray {
	public static void main(String[] args) {
		int num1 = (int) (10 * Math.random()) + 1;
		int num2 = num1 + 1;
		int num3 = num1 + num2;
		int num4 = num2 + num3;
		int num5 = num3 + num4;

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);
		System.out.println("num5: " + num5);
	}
}
