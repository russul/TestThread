package yangzhen_1;
/*
 * ��Դ�࣬��ԴΪѧ��
 * 
 * 
 */
public class Student {
	private String name;
	private int age;
	//����һ����־��������ʾ��ǰ�Ƿ�����Դ���ڣ�true:�У�false:û��
	public boolean flag = false; 
	//��Ϊ������name��age����˽�����ͣ�����һ��Ҫ�ṩpublic�������Թ��ⲿ������ݽ��в���
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
		
		
	}
	public void setAge(int age){
		
		this.age = age;
		
	}
}
