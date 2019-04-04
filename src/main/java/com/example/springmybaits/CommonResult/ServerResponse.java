package com.example.springmybaits.CommonResult;

import java.io.Serializable;

//保证序列化对象的时候,如果是null对象,key也会消失
public class ServerResponse<T> implements Serializable {
	
	   private String status;
	    private String msg;
	    private T data;

	    private ServerResponse(String status ){
	        this.status=status;
	    }

	    public ServerResponse(String status , T data){
	        this.status=status;
	        this.data=data;
	    }

	    public ServerResponse(String status, String msg, T data){
	        this.status=status;
	        this.msg=msg;
	        this.data=data;
	    }

	    public ServerResponse(String status, String msg){
	        this.status=status;
	        this.msg=msg;
	    }
	    
        public String getStatus(){
        return status;
    }

    public T getData(){
        return data;
    }

    public String getMsg(){
        return msg;
    }

		public static <T> ServerResponse<T> createBySuccess(){

	        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
	    }

	    public static <T>ServerResponse<T> createBySuccessMessage(String msg){

	        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
	    }

	    public static <T>ServerResponse<T> createBySuccess(T data){

	        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
	    }

	    public static <T>ServerResponse<T> createBySuccess(String msg, T data){

	        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
	    }


	    public static <T>ServerResponse<T> createByError(){

	        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
	    }

	    public static <T>ServerResponse<T> createByErrorMessage(String errorMessage){

	        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMessage);
	    }

//	    public static <T>ServerResponse<T> createByErrorCodeMessage(int errorCode, String errorMessage){
//
//	        return new ServerResponse<T>(errorCode,errorMessage);
//	    }
//    
    
    
}
