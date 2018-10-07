package yangzhen_4;
/*
 * 简单工厂模式
 * 
 * 
 */
public class AnimalDemo {

	public static void main(String[] args) {
		
//		//具体类的调用
//		Dog d = new Dog();
//		Cat c = new Cat();
//		d.voice();
//		c.voice();
		
//		
//		//简单工厂模式，把造对象的工作交给工厂，新建工厂类
//		
//		Dog d = Factory.creatDog();
//		Cat c = Factory.creatCat();
//		d.voice();
//		c.voice();
		
		//改进工厂，让其多态调用，a1,a2都用Animal类型返回，但它指向的是自己具体的子类数据类型
		Animal a1 = Factory.creatAnimal("dog");
		Animal a2 = Factory.creatAnimal("cat");
		Animal a3 = Factory.creatAnimal("pig");
		a1.voice();
		a2.voice();
		//防止没有这种对象，在使用之前先测试一下
		if(a3!=null){
			a3.voice();
			
		}else{
			System.out.println("暂时没有这种对象");
		}
	}
	
}
