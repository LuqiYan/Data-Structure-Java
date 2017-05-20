public class CatAndDog {
	public static void main(String[] args) {
		String c = "Cat";
		String d = "Dog";
		double cPos = 0;
		double dPos = 100;
		double cSpeed = 20;
		double dSpeed = 10;
		double totalTime = 0;
		while (cPos < dPos) {
			System.out.println("At time: " + totalTime);
			System.out.println("    " + c + " is at position " + cPos);
			System.out.println("    " + d + " is at position " + dPos);

			double timeToReach = (dPos - cPos) / cSpeed;
			totalTime = totalTime + timeToReach;
			cPos = cPos + timeToReach * cSpeed;
			dPos = dPos + timeToReach * dSpeed;
		}
	}
}