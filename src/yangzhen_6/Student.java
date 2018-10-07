package yangzhen_6;

public class Student {
	private Student(){}
//	// 饿汉式 ：类一加载就创建对象
//	private static Student s = new Student();
//	public static Student getStudent(){
//		return s;
//	}
	
//2 懒汉式：用到的时候才去创建对象
	
	//这样做会存在线程安全问题
	private static Student s =null;//没有创建对象
//	public static Student getStudent(){
//		if(s==null){
//		  s = new Student();	
//		}
//		return s;
//	}
	
	//这样解决安全问题
	public synchronized static Student getStudent(){
		if(s==null){
		  s = new Student();	
		}
		return s;
}
	
	
}
