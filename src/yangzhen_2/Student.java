package yangzhen_2;
/*
 * 资源类，资源为学生
 * 将关于学生资源的操作全部放在资源类中，生产者和消费者只要调用我的方法即可，这样可以使程序的结构更清新，可读性增强
 * 
 */
public class Student {
	private String name;
	private int age;
	//定义一个标志变量，表示当前是非有资源存在，true:有；false:没有
	private boolean flag = false; 
	//因为定义了name和age均是私有类型，所以一定要提供public方法，以供外部类对数据进行操作
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
		
		//此时的锁就是this对象
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
