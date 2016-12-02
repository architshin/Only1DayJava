public class WithArray2 {
	public static void main(String[] args) {
		int[] nums = new int[5];

		nums[0] = (int) (10 * Math.random()) + 1;
		nums[1] = nums[0] + 1;
		nums[2] = nums[0] + nums[1];
		nums[3] = nums[1] + nums[2];
		nums[4] = nums[2] + nums[3];

		System.out.println("1個目: " + nums[0]);
		System.out.println("2個目: " + nums[1]);
		System.out.println("3個目: " + nums[2]);
		System.out.println("4個目: " + nums[3]);
		System.out.println("5個目: " + nums[4]);

		System.out.println("5個目: " + nums[5]);
	}
}
