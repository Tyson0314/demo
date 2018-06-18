/**   
* @Title: Singleton.java 
* @Package com.tyson.patternDesign 
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午11:45:53 
* @version V1.0   
*/
package com.tyson.patternDesign.singleton;

/**  
* @ClassName: Singleton  
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午11:45:53  
*    
*/
public class Singleton {
	private Singleton() {
		System.out.println("construct method...");
	}
	
	private static class SingletonHolder {
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		System.out.println("getInstance...");
		return SingletonHolder.instance;
	}
	
	public static void main(String[] args) {
		Singleton.getInstance();
	}
}
