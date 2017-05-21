public class DogLauncher {
	public static void main(String[] args) {
		Dog d = new Dog(15);

		Dog d2 = new Dog(100);

		// Dog bigger = Dog.maxDog(d, d2);

		Dog bigger = d.maxDog(d2);
		// d.weightInPounds = 51;
		d.makeNoise();
		bigger.makeNoise();

		System.out.println(d.binomen);
		System.out.println(d2.binomen);
		System.out.println(Dog.binomen);

		Dog[] dogs = new Dog[2];
		dogs[0] = new Dog(8);
		dogs[1] = new Dog(20);
		dogs[0].makeNoise();
		dogs[1].makeNoise();
	}
}