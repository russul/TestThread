package yangzhen_2;
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
					
			//���û�У��ͽ�������
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