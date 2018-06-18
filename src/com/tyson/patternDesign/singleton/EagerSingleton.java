/**   
* @Title: Singleton.java 
* @Package com.tyson.patternDesign 
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午9:44:57 
* @version V1.0   
*/
package com.tyson.patternDesign.singleton;

/**  
* @ClassName: Singleton  
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午9:44:57  
*    
*/
public class EagerSingleton {
	private static EagerSingleton instance =  new EagerSingleton();
	
	/**
	 * 
	* @Title: getInstance  
	* @Description: 私有构造函数
	* @param @return    
	* @return EagerSingleton  
	* @throws
	 */
	private EagerSingleton() {
		System.out.println("构造函数");
	}
	
	/**
	 * 
	* @Title: getInstance  
	* @Description: 静态工厂方法
	* @param @return    
	* @return EagerSingleton  
	* @throws
	 */
	public static EagerSingleton getInstance() {
		System.out.println("I was born...");
		return instance;
	}
	
	/*@Test
	public void test5() {
		EagerSingleton instance =  new EagerSingleton();
		System.out.println(instance);
	}*/
	
	public static void main(String[] args) {
		EagerSingleton instance = EagerSingleton.getInstance();
		System.out.println(instance);
	}
}
