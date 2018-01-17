/**
 * 验证码接口包
 */
package com.openthinks.libs.check;

/**
 * 验证码接口
 * 
 * @author dmj
 * @version 2010/06/24
 */
public interface Validata {
	/**
	 * 生成随机字符串
	 * 
	 * @return 随机字符串
	 */
	public String create();

	/**
	 * 获取上次的随机验证字符串
	 * 
	 * @return 最近一次的验证字符串
	 */
	public String getLastCheck();

}
