public class TriangleDrawer {
	public static void drawTriangle(int N) {
		int x = 0;
		while (x < N) {
			int m = x;
			while (m > 0) {
				System.out.print("*");
				m -= 1;
			}
			System.out.println("*");
			x += 1;
		}
	}
	public static void main(String[] args) {
		drawTriangle(10);
	}
}