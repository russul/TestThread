package yangzhen_2;
/*
 * 
 * 
 * 
 * 
 * 
 */
public class GetStudent implements Runnable {

	private Student s;
	
	
	public GetStudent(Student s) {
		this.s = s;
	}


	@Override
	public void run() {
		while(true){
		
			s.get();
			}
		
		
	}

}

/*
 * ����һ������
 * 1 ����������������CPUִ��Ȩ
 * 2 Ĭ�ϵ�flagΪ�٣�˵����ʱû����Դ�������߾͵ȴ��������ͷ�������ʱ�������߾ͻ�����ִ��Ȩ
 * 3 û����Դ�������߾ͻ�������������������󣬽�flag��Ϊ�棬����notify()
 * 4 ע��notify()���ѵ��Ǽ������������󣩵��߳��е�ĳһ����Ҳ����Ҫ���߳�ȥ����CPUִ��Ȩ��
 *    �������������1 �����߼�������������flag���棬ֻ�ܼ����ȣ���ʱ�������õ�ִ��Ȩ����������
 *             2 ������������flag���棬�������Ѳ���
 * �����������������ִ�У������Java�ĵȴ����ѻ���
 * 
 * 
 * 
 */