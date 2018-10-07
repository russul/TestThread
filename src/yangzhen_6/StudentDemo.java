package yangzhen_6;

/*
 * d单例模式：1 饿汉式 ：类一加载就创建对象
 *         2 懒汉式：用到的时候才去创建对象
 *         饿汉式是安全的
 *         懒汉式是存在线程安全问题的：由于存在多条语句对共享数据进行操作
 * 
 * 
 */

public class StudentDemo {
	public static void main(String[] args) {
	Student s1 = Student.getStudent();
	Student s2 = Student.getStudent();
	//看两个对象是不是一个
	System.out.println(s1.equals(s2));
	System.out.println(s1);
	System.out.println(s2);
		
		
	}
}
