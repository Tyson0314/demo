/**   
* @Title: ThreadRunnable.java 
* @Package com.tyson.seesee 
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午11:39:47 
* @version V1.0   
*/
package com.tyson.seesee;

import java.util.HashMap;

/**  
* @ClassName: ThreadRunnable  
* @Description: TODO 
* @author Tyson
* @date 2018年5月31日 下午11:39:47  
*    
*/
public class ThreadRunnable {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		//myThread1.start();
		//myThread2.start();
		
		MyThread1 myThread3 = new MyThread1();
		//new Thread(myThread3).start();
		//new Thread(myThread3).start();
		//new Thread(myThread3).start();
		
		Ticket ticket = new Ticket(0);
		MyThread2 ticketThread = new MyThread2(ticket);
		
		new Thread(ticketThread).start();;
		new Thread(ticketThread).start();;
		new Thread(ticketThread).start();;
	}
}

class MyThread extends Thread {
	private int ticket = 10;

	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			if(ticket <= 0)
				break;
			System.out.print("The ticket left is ");
			System.out.println(ticket--);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 implements Runnable {
	private int ticket = 10;
	
	public  void run() {
		for(int i=0;i<=10;i++) {
			if(ticket <= 0)
				break;
			System.out.print("The ticket left: ");
			System.out.println(ticket--);

		}
	}
}

class MyThread2 implements Runnable {
	Ticket ticket;
	
	public MyThread2(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			ticket.add();
		}
	}
}

class Ticket {
	private int num;
	private HashMap map;
	
	public Ticket(int num) {
		this.num = num;
		map = new HashMap();
	}
	
	public synchronized void add() {
		num++;
		map.put(num, num);
		System.out.println(map);
	}
}