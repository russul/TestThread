package yangzhen_1;
/*
 * ������Դ�ࣨ�����ߣ�
 * ����һ���߳���
 * 
 * 
 */
public class SetStudent implements  Runnable {
	
	//�漰����๲��һ����Դ��ѧ����Դ������ͨ���ⲿ����ͨ�����췽������
	private Student s;
	
	public int i = 0;
	public SetStudent(Student s) {
		
		this.s = s;
	}


	public void run() {
		while(true){
			synchronized(s){ //��������Ľ�Student����������ʡ����ȥ��������
				
				if(s.flag){  //�������Դ�������߾͵ȴ�
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//���û�У��ͽ�������
				if(i%2==0){
					s.setName("Tom");
					s.setAge(3);	
				}else{
					s.setName("Jerry");
					s.setAge(5);	
				}
				i++;
//				
					
				//���������󣬸ı��־λ
				s.flag = true;
				//֪ͨ�����߽�������
				s.notify();
				}
			}
			
	}
}