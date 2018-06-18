/**   
* @Title: LazySingleton.java 
* @Package com.tyson.patternDesign 
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午10:32:24 
* @version V1.0   
*/
package com.tyson.patternDesign.singleton;

/**  
* @ClassName: LazySingleton  
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午10:32:24  
*    
*/
public class LazySingleton {
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		System.out.println("构造函数");
	}
	
	public static synchronized LazySingleton getInstance() {
		if(instance == null)
			instance =  new LazySingleton();
		
		System.out.println("getInstance...");
		return instance;
	}
	
	public static void main(String[] args) {
		LazySingleton.getInstance();
	}
}
