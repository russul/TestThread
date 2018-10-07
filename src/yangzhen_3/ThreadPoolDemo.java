package yangzhen_3;

/*
 * ���裺
 * ��1������һ���̳߳ض���ExecutorService
 *      ������Executors�������е�public static ExecutorService newFixedThreadPool(int nThreads)
 * ��2������һ����ʵ��Runnable�ӿڻ���Callable�ӿڣ������������̵߳ĵ����ַ����������������̳߳أ�
 * ��3���������·��������߳�
 * <T> Future<T>	submit(Callable<T> task)
 * Future<?>	submit(Runnable task)
 * ��4���������ֹ�̳߳أ�����
 * void	shutdown()
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		pool.shutdown();
		
	}

}


class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 50;i++){
			System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		
	}
	
	
}