package yangzhen_4;

public class Factory {

	private  Factory() {
		
	//�����췽��˽�У��ⲿ�࣬���ܴ�����������	
	}
	
	public static Dog creatDog(){
		return new Dog();
	}
	
	public static Cat creatCat(){
		return new Cat();
	}
	
	public static Animal creatAnimal(String s){
		if(s.equals("dog")){
			return new Dog();
		}else if(s.equals("cat")){
			return new Cat();
		}else {
			
			return null;
		}
	}
}
