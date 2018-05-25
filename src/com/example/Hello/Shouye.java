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
	         //给btn1绑定监听事件
	         btn1.setOnClickListener(new OnClickListener() { 
	             @Override
	             public void onClick(View v) {
	                 
	                 // 给bnt1添加点击响应事件
	                Intent intent =new Intent(Shouye.this,Mudi.class);
	                //启动
	                 startActivity(intent);
	             }
	       });
	  Button btn2=(Button)findViewById(R.id.button2);
	         //给btn2绑定监听事件
	         btn2.setOnClickListener(new OnClickListener() {   
	             @Override
	             public void onClick(View v) {
	                 
	                 // 给bnt2添加点击响应事件
	                Intent intent =new Intent(Shouye.this,Yuanli.class);
	                //启动
	                 startActivity(intent);
	             }
	       });	         
	  Button btn3=(Button)findViewById(R.id.button3);
	         //给btn3绑定监听事件
	         btn3.setOnClickListener(new OnClickListener() {
	             @Override
	             public void onClick(View v) {
	                 
	                 // 给bnt3添加点击响应事件
	                Intent intent =new Intent(Shouye.this,Yiqi.class);
	                //启动
	                 startActivity(intent);
	             }
	       });         	         
	  Button btn4=(Button)findViewById(R.id.button4);
	         //给btn4绑定监听事件
	         btn4.setOnClickListener(new OnClickListener() {
	             
	             @Override
	             public void onClick(View v) {
	                 
	                 // 给bnt4添加点击响应事件
	                Intent intent =new Intent(Shouye.this,Buzhou.class);
	                //启动
	                 startActivity(intent);
	             }
	       });                 
	  Button btn5=(Button)findViewById(R.id.button5);
	         //给btn5绑定监听事件
	         btn5.setOnClickListener(new OnClickListener() {
	             
	             @Override
	             public void onClick(View v) {
	                 
	                 // 给bnt5添加点击响应事件
	                Intent intent =new Intent(Shouye.this,Shuju.class);
	                //启动
	                 startActivity(intent);
	             }
	       });	         	         
	  Button btn6=(Button)findViewById(R.id.button6);
	         //给btn6绑定监听事件
	         btn6.setOnClickListener(new OnClickListener() {
	             
	             @Override
	             public void onClick(View v) {
	                 
	                 // 给bnt6添加点击响应事件
	                Intent intent =new Intent(Shouye.this,Pingjia.class);
	                //启动
	                 startActivity(intent);
	             }
	       });	         
}
}
