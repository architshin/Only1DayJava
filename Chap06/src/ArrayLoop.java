public class ArrayLoop {
	public static void main(String[] args) {
		int[] nums = new int[5];

		nums[0] = (int) (10 * Math.random()) + 1;
		nums[1] = nums[0] + 1;
		nums[2] = nums[0] + nums[1];
		nums[3] = nums[1] + nums[2];
		nums[4] = nums[2] + nums[3];

		for(int i = 0; i <= 4; i++) {
			System.out.println((i+1) + "個目: " + nums[i]);
		}
	}
}
