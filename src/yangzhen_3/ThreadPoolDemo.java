package yangzhen_3;

/*
 * 步骤：
 * （1）创建一个线程池对象ExecutorService
 *      方法：Executors工具类中的public static ExecutorService newFixedThreadPool(int nThreads)
 * （2）创建一个类实现Runnable接口或者Callable接口（这是启动多线程的第三种方法，但必须依赖线程池）
 * （3）调用如下方法启动线程
 * <T> Future<T>	submit(Callable<T> task)
 * Future<?>	submit(Runnable task)
 * （4）如果想终止线程池，调用
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