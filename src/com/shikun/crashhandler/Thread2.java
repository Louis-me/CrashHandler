package com.shikun.crashhandler;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import android.util.Log;

class Thread2 implements Runnable{
	String name;
	public Thread2(String name) {
		this.name = name;
	}
		

	@Override
	public void run() {
		 try {
			httpBase.get(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
}