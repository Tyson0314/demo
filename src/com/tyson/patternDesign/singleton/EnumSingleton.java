/**   
* @Title: EnumSingleton.java 
* @Package com.tyson.patternDesign 
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 下午12:09:05 
* @version V1.0   
*/
package com.tyson.patternDesign.singleton;

/**  
* @ClassName: EnumSingleton  
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 下午12:09:05  
*    
*/
public class EnumSingleton {
	private EnumSingleton() {
		System.out.println("EnumSingleton construct method...");
	}
	
	public static EnumSingleton getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
	private static enum Singleton {
		INSTANCE;
		
		private EnumSingleton instance;
		private Singleton() {
			System.out.println("Singleton construct method...");
			instance = new EnumSingleton();
		}
		
		public EnumSingleton getInstance() {
			return instance;
		}
	}
	
	public static void main(String[] args) {
		EnumSingleton.getInstance();
	}
}
