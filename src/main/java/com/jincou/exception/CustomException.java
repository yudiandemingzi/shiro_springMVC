package com.jincou.exception;

/**
 * @Description: 系统自定义的异常类型，实际开发中可能要定义多种异常类型
 *
 * @author xub
 * @date 2018/7/18 上午11:46
 */
public class CustomException extends Exception {

	/**
	 * 异常信息
	 */
	private String message;

	public CustomException(String message){
		super(message);
		this.message = message;

	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
