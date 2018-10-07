package yangzhen_5;

public class DogFactory extends Factory {

	@Override
	public Animal creatAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
