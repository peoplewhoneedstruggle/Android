package com.example.Hello;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pingjia extends Activity{
	
    private static Toast mToast;//利用工具解决Toast消息队列过长的问题
    public static void showToast(Context context, int resId, int duration){  
        showToast(context, context.getString(resId), duration);  
    }
    public static void showToast(Context context, String msg, int duration) {
            if (mToast == null) {
                    mToast = Toast.makeText(context, msg, duration);
            } else {
                    mToast.setText(msg);
            }
            mToast.show();
    }
	
protected void onCreate (Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.pingjia);
    final EditText editText=(EditText)findViewById(R.id.editText1); 
	
	Button getValue=(Button)findViewById(R.id.button1);  
    getValue.setOnClickListener(new OnClickListener() {  
        @Override  
        public void onClick(View v) {  
        	if(editText.getText().toString().length()>40){
        		showToast(getBaseContext(), "提交成功", 2000);
        	}
        	else {
        		showToast(getBaseContext(), "请输入不少于40字", 2000);	
        	}
 
        }  
    }); 
}
}
