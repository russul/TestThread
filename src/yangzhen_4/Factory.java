package yangzhen_4;

public class Factory {

	private  Factory() {
		
	//将构造方法私有，外部类，不能创建工厂对象	
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
