package yangzhen_2;
/*
 * ��Դ�࣬��ԴΪѧ��
 * ������ѧ����Դ�Ĳ���ȫ��������Դ���У������ߺ�������ֻҪ�����ҵķ������ɣ���������ʹ����Ľṹ�����£��ɶ�����ǿ
 * 
 */
public class Student {
	private String name;
	private int age;
	//����һ����־��������ʾ��ǰ�Ƿ�����Դ���ڣ�true:�У�false:û��
	private boolean flag = false; 
	//��Ϊ������name��age����˽�����ͣ�����һ��Ҫ�ṩpublic�������Թ��ⲿ������ݽ��в���
//	public String getName(){
//		return name;
//	}
//
//	public int getAge(){
//		return age;
//	}
//	public void setName(String name){
//		this.name = name;
//		
//		
//	}
//	public void setAge(int age){
//		
//		this.age = age;
//		
//	}
	
	public synchronized void set(String name,int age){
		
		//��ʱ��������this����
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
			this.name = name;
			this.age = age;
			
			this.flag = true;
			
			
			this.notify();
		
	}
	
	
	public synchronized void get(){
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
			System.out.println(this.name + "---" + this.age);
			
			
			this.flag = false;
			
			
			this.notify();
		
	}
}
