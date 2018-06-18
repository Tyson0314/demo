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
public class ClassInitSingleton {
	private ClassInitSingleton() {
		System.out.println("construct method...");
	}
	
	private static class SingletonHolder {
		private static ClassInitSingleton instance = new ClassInitSingleton();
	}
	
	public static ClassInitSingleton getInstance() {
		System.out.println("getInstance...");
		return SingletonHolder.instance;
	}
	
	public static void main(String[] args) {
		ClassInitSingleton.getInstance();
	}
}
