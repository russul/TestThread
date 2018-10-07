package yangzhen_3;
/*
 * 匿名内部类实现多线程
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
		
		
//		这种情况就是接口里可以写个匿名类实现，Thread类也可以写一个匿名类，那会报错吗？到底执行的是那里面的run方法
//		1、不会报错
//		2、执行的是Thread子类里的方法
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
