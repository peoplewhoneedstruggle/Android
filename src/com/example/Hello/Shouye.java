package com.example.Hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Shouye extends Activity{
protected void onCreate (Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.shouye);
	Button btn1=(Button)findViewById(R.id.button1);  
	         btn1.setOnClickListener(new OnClickListener() { //给btn1绑定监听事件
	             @Override
	            public void onClick(View v) {
	               Intent intent =new Intent(Shouye.this,Mudi.class);// 给bnt1添加点击响应事件
	               startActivity(intent); //启动
	           }
	       });
	  Button btn2=(Button)findViewById(R.id.button2);
	         btn2.setOnClickListener(new OnClickListener() {   //给btn2绑定监听事件
	             @Override
	             public void onClick(View v) {
	                Intent intent =new Intent(Shouye.this,Yuanli.class);// 给bnt2添加点击响应事件
	                 startActivity(intent);//启动
	             }
	       });	         
	  Button btn3=(Button)findViewById(R.id.button3);
	         btn3.setOnClickListener(new OnClickListener() { //给btn3绑定监听事件
	             @Override
	             public void onClick(View v) {
	                 Intent intent =new Intent(Shouye.this,Yiqi.class);// 给bnt3添加点击响应事件
	                startActivity(intent);//启动
	             }
	       });         	         
	  Button btn4=(Button)findViewById(R.id.button4);
	         btn4.setOnClickListener(new OnClickListener() { //给btn4绑定监听事件
	             @Override
	             public void onClick(View v) {
	               Intent intent =new Intent(Shouye.this,Buzhou.class);// 给bnt4添加点击响应事件
	               startActivity(intent); //启动
	             }
	       });                 
	  Button btn5=(Button)findViewById(R.id.button5);
	         
	         btn5.setOnClickListener(new OnClickListener() {//给btn5绑定监听事件
	             @Override
	             public void onClick(View v) {
	                Intent intent =new Intent(Shouye.this,Shuju.class);// 给bnt5添加点击响应事件
	                startActivity(intent);//启动
	             }
	       });	         	         
	  Button btn6=(Button)findViewById(R.id.button6);
	         btn6.setOnClickListener(new OnClickListener() { //给btn6绑定监听事件
	             @Override
	             public void onClick(View v) {
	               Intent intent =new Intent(Shouye.this,Pingjia.class);// 给bnt6添加点击响应事件
	               startActivity(intent); //启动
	             }
	       });	         
}
}
