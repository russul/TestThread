package yangzhen_3;
/*
 * �����ڲ���ʵ�ֶ��߳�
 * 
 * 
 */
public class NoInnerThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new Thread(){
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("hello");
//			}
//		}.start();
//		
		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("hello");
//			}
//		}){}.start();
		
		
//		����������ǽӿ������д��������ʵ�֣�Thread��Ҳ����дһ�������࣬�ǻᱨ���𣿵���ִ�е����������run����
//		1�����ᱨ��
//		2��ִ�е���Thread������ķ���
		new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("hello");
				}
			}){
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("world");
			}
		}.start();	
		
	}

}
