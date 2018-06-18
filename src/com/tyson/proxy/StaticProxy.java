/**   
* @Title: StaticProxy.java 
* @Package com.tyson.proxy 
* @Description: TODO 
* @author Tyson
* @date 2018年5月19日 上午9:46:13 
* @version V1.0   
*/
package com.tyson.proxy;

/**  
* @ClassName: StaticProxy  
* @Description: TODO 
* @author Tyson
* @date 2018年5月19日 上午9:46:13  
*    
*/
public class StaticProxy {
	private User user;
	
	public StaticProxy(User user) {
		this.user = user;
	}
	
	public void save() {
		user.save();
	}
	
	public static void main(String[] args) {
		User user = new UserImpl();
		
		StaticProxy proxy = new StaticProxy(user);
	
		proxy.save();
	}
}

interface User {
	void save();
}

class UserImpl implements User {

	/* 
	* Title: save
	* Description:    
	* @see com.tyson.proxy.User#save()  
	*/
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save");
	}
	
}