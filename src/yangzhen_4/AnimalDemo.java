package yangzhen_4;
/*
 * �򵥹���ģʽ
 * 
 * 
 */
public class AnimalDemo {

	public static void main(String[] args) {
		
//		//������ĵ���
//		Dog d = new Dog();
//		Cat c = new Cat();
//		d.voice();
//		c.voice();
		
//		
//		//�򵥹���ģʽ���������Ĺ��������������½�������
//		
//		Dog d = Factory.creatDog();
//		Cat c = Factory.creatCat();
//		d.voice();
//		c.voice();
		
		//�Ľ������������̬���ã�a1,a2����Animal���ͷ��أ�����ָ������Լ������������������
		Animal a1 = Factory.creatAnimal("dog");
		Animal a2 = Factory.creatAnimal("cat");
		Animal a3 = Factory.creatAnimal("pig");
		a1.voice();
		a2.voice();
		//��ֹû�����ֶ�����ʹ��֮ǰ�Ȳ���һ��
		if(a3!=null){
			a3.voice();
			
		}else{
			System.out.println("��ʱû�����ֶ���");
		}
	}
	
}
