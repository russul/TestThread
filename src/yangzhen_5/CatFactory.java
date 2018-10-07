package yangzhen_5;

public class CatFactory extends Factory {

	@Override
	public  Animal creatAnimal() {
		// TODO Auto-generated method stub
		
		
		return new Cat();
	}

}
