package yangzhen_6;

/*
 * d����ģʽ��1 ����ʽ ����һ���ؾʹ�������
 *         2 ����ʽ���õ���ʱ���ȥ��������
 *         ����ʽ�ǰ�ȫ��
 *         ����ʽ�Ǵ����̰߳�ȫ����ģ����ڴ��ڶ������Թ������ݽ��в���
 * 
 * 
 */

public class StudentDemo {
	public static void main(String[] args) {
	Student s1 = Student.getStudent();
	Student s2 = Student.getStudent();
	//�����������ǲ���һ��
	System.out.println(s1.equals(s2));
	System.out.println(s1);
	System.out.println(s2);
		
		
	}
}
