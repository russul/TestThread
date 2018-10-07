package yangzhen_3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo2 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Callable<Integer> my1 = new MyCallable(50);
		Callable<Integer> my2 = new MyCallable(100);
		
		Future<Integer> f1 = pool.submit(my1);
		Future<Integer> f2 = pool.submit(my2);
		
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		pool.shutdown();
		
	}
}




class MyCallable implements Callable<Integer>{

	private int x;
	public MyCallable(int x){
		this.x=x;
	}
	// Callable可以有返回值类型，这是Runnable实现不了的
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=1;i<=x;i++){
			sum = sum + i;
		}
		return sum;
	}

	
	
	
}	