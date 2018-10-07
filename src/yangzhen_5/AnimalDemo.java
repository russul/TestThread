package yangzhen_5;

public class AnimalDemo {
	public static void main(String[] args) {
		Factory ff = new DogFactory();
		Animal a1 = ff.creatAnimal();
		a1.voice();
		
	}
}
