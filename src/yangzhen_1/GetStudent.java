package yangzhen_1;
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
			synchronized(s){    //��������Ľ�Student����������ʡ����ȥ��������
			
				if(!s.flag){ //���û����Դ�������߾͵ȴ�
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			//�������Դ�ͽ�������
			System.out.println(s.getName() + "---" + s.getAge());
			//���ѽ����󣬸��ı�־λ
			s.flag = false;
			//֪ͨ����������
			s.notify();        //���ѱ��������һ��������������������
			}	
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