package yangzhen_2;
/*
 * 设置资源类（生产者）
 * 它是一个线程类
 * 
 * 
 */
public class SetStudent implements  Runnable {
	
	//涉及多个类共享一个资源，学生资源，可以通过外部定义通过构造方法传入
	private Student s;
	
	public int i = 0;
	public SetStudent(Student s) {
		
		this.s = s;
	}


	public void run() {
		while(true){
					
			//如果没有，就进行生产
			if (i % 2 == 0) {
					s.set("Tom", 10);	
				}else{
					s.set("Jerry", 6);		
				}
				i++;
//				
					
			}
			
	}
}