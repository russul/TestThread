package yangzhen_6;

public class Student {
	private Student(){}
//	// ����ʽ ����һ���ؾʹ�������
//	private static Student s = new Student();
//	public static Student getStudent(){
//		return s;
//	}
	
//2 ����ʽ���õ���ʱ���ȥ��������
	
	//������������̰߳�ȫ����
	private static Student s =null;//û�д�������
//	public static Student getStudent(){
//		if(s==null){
//		  s = new Student();	
//		}
//		return s;
//	}
	
	//���������ȫ����
	public synchronized static Student getStudent(){
		if(s==null){
		  s = new Student();	
		}
		return s;
}
	
	
}
