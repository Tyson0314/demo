/**   
* @Title: JavaVMStackSOF.java 
* @Package com.tyson.vm 
* @Description: TODO 
* @author Tyson
* @date 2018年6月14日 下午11:38:39 
* @version V1.0   
*/
package com.tyson.vm;

/**  
* @ClassName: JavaVMStackSOF  
* @Description: TODO 
* @author Tyson
* @date 2018年6月14日 下午11:38:39  
*    
*/
public class JavaVMStackSOF {
	private int stackLength = 1;
	
	public void stackLeak() {
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch(Throwable e) {
			System.out.println("stack length: " + oom.stackLength);
			throw e;
		}
	}
}
