public class Triangle {
	public static void main(String[] args) {
		int x = 0;
		while (x < 5) {
			int y = x;
			while (y > 0) {
		 		System.out.print("*");
				y -= 1;
			}
			System.out.println("*");
			x += 1;
		}
	}
}