/**   
* @Title: ThreadLocalDemo.java 
* @Package com.tyson.seesee 
* @Description: TODO 
* @author Tyson
* @date 2018年6月15日 上午12:07:12 
* @version V1.0   
*/
package com.tyson.seesee;

/**  
* @ClassName: ThreadLocalDemo  
* @Description: TODO 
* @author Tyson
* @date 2018年6月15日 上午12:07:12  
*    
*/
public class ThreadLocalDemo {
		ThreadLocal<Long> longLocal = new ThreadLocal<Long>() {

			@Override
			protected Long initialValue() {
				// TODO Auto-generated method stub
				return Thread.currentThread().getId();
			}
		};
		
		ThreadLocal<String> stringLocal = new ThreadLocal<String>() {
			protected String initialValue() {
				return Thread.currentThread().getName();
			}
		};
		
		public void set() {
	        longLocal.set(Thread.currentThread().getId());
	        stringLocal.set(Thread.currentThread().getName());
	    }

		public long getLong() {
			return longLocal.get();
		}
		
		public String getString() {
			return stringLocal.get();
		}
		
		public static void main(String[] args) throws InterruptedException {
			final ThreadLocalDemo tld = new ThreadLocalDemo();
			
			//tld.set();
			
			System.out.println(tld.getLong());
			System.out.println(tld.getString());
			
			Thread t = new Thread() {
				public void run() {
					tld.set();
					System.out.println(tld.getLong());
					System.out.println(tld.getString());
				}
			};
			
			t.start();
			t.join();
			
			System.out.println(tld.getLong());
			System.out.println(tld.getString());
		}
}
