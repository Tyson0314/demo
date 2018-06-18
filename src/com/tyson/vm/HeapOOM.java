/**   
* @Title: HeapOOM.java 
* @Package com.tyson.vm 
* @Description: TODO 
* @author Tyson
* @date 2018年6月14日 下午10:24:10 
* @version V1.0   
*/
package com.tyson.vm;

import java.util.ArrayList;
import java.util.List;

/**  
* @ClassName: HeapOOM  
* @Description: TODO 
* @author Tyson
* @date 2018年6月14日 下午10:24:10  
*    
*/
public class HeapOOM {
	static class OOMObject {
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		
		while(true) {
			list.add(new OOMObject());
		}
	}
}
