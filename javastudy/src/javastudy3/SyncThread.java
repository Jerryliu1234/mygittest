package javastudy3;

//class SyncThread implements Runnable {
	class SyncThread extends Thread {
	   private static int count;
	   private static int count2=0;
	   public SyncThread() {
	      count = 0;
	   }
	 
	   public static void method() {
	      synchronized(SyncThread.class) {
	         for (int i = 0; i < 10; i ++) {
	            try {
	               System.out.println(Thread.currentThread().getName() + "--:" + (count++));
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }
	   public synchronized static void method2() {
		      for (int i = 0; i < 10; i ++) {
		         try {
		            System.out.println(Thread.currentThread().getName() + ":" + (count++));
		            Thread.sleep(100);
		         } catch (InterruptedException e) {
		            e.printStackTrace();
		         }
		      }
		   }
	 
	   public synchronized void run() {
		   //if(count2==0){
			   method(); 
			
			   method2(); 
			
	      
	   }
	   public static void main(String[] args) {
		   SyncThread syncThread1 = new SyncThread();
		   SyncThread syncThread2 = new SyncThread();
		  // Thread thread1 = new Thread(syncThread1, "SyncThread1");
		   //Thread thread2 = new Thread(syncThread2, "SyncThread2");
		   syncThread1.start();
		   syncThread2.start();
	    }
	}