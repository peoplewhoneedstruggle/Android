package com.example.Hello;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
    
public class Shuju extends Activity{
	

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
	setContentView(R.layout.shuju);
	

	Button btn1=(Button)findViewById(R.id.button1);
    //给btn1绑定监听事件
    btn1.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
        	AlertDialog.Builder builder  = new Builder(Shuju.this);
            // 给bnt1添加点击响应事件
        	builder.setTitle("确认" ) ;
        	 builder.setMessage("是否确认提交" ) ;
        	 builder.setPositiveButton("是" ,  new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					showToast(getBaseContext(), "提交成功", 2000);
				}} );
        	 builder.setNegativeButton("否" ,  null );
        	 builder.show();
        }
  });
}
}