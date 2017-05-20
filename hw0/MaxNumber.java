public class MaxNumber {
	public static int max(int[] m) {
		int maxNum = m[0];
		for (int x : m) {
			maxNum = maxNum > x ? maxNum : x;
		}
		return maxNum;
	}
	public static void main(String[] args) {
		int[] number = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(number));
	}
}