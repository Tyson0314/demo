/**   
* @Title: DoubleCheckSingleton.java 
* @Package com.tyson.patternDesign 
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午11:31:56 
* @version V1.0   
*/
package com.tyson.patternDesign.singleton;

/**  
* @ClassName: DoubleCheckSingleton  
* @Description: TODO 
* @author Tyson
* @date 2018年5月26日 上午11:31:56  
*    
*/
public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton singleton = null;
	
	private DoubleCheckSingleton() {
		System.out.println("construct method...");
	}
	
	public static DoubleCheckSingleton getInstance() {
		if(singleton == null) {
			synchronized(DoubleCheckSingleton.class) {
				if(singleton == null)
					singleton = new DoubleCheckSingleton();
			}
		}
		System.out.println("getInstance");
		return singleton;
	}
	
	public static void main(String[] args) {
		DoubleCheckSingleton.getInstance();
	}
}
