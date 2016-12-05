package com.shikun.crashhandler;

import java.net.HttpURLConnection;
import java.net.URL;

import android.util.Log;

public class httpBase {

	//发送一个GET请求
	 public static void get(String path) throws Exception{
		 try{  
			    HttpURLConnection urlConn = null;  
	            //通过openConnection 连接  
	            URL url = new java.net.URL(path);  
	            urlConn=(HttpURLConnection)url.openConnection();  
	            Log.i("get", path);

	            Log.i("get", urlConn.getResponseMessage().toString());
	            //设置输入和输出流   
//	            urlConn.setDoOutput(true);  
//	            urlConn.setDoInput(true);  
//	            //关闭连接  
	            urlConn.disconnect();  
	        }catch(Exception e){  
	           
	            e.printStackTrace();  
	        }  
	 
	 }



}
