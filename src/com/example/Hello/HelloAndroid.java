package com.example.Hello;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class HelloAndroid extends Activity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_hello_android);
        final SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        final EditText accountEdit = (EditText)findViewById(R.id.editText2);
        final EditText passwordEdit = (EditText)findViewById(R.id.editText1);
        Button login = (Button)findViewById(R.id.button1);
        final CheckBox rememberPass = (CheckBox)findViewById(R.id.remember_pass);
        
        boolean isRemenber=pref.getBoolean("remember_password", false);
        
        if(isRemenber){
            //将账号和密码都设置到文本中
            String account=pref.getString("editText2","");
            String password=pref.getString("editText1","");
            accountEdit.setText(account);
            passwordEdit.setText(password);
            rememberPass.setChecked(true);//设置默认情况是否勾选
        }
        login.setOnClickListener(new OnClickListener() {              
            @Override 
            public void onClick(View v) { 
            String account=accountEdit.getText().toString();
            String password=passwordEdit.getText().toString();
            //如果账号密码相同且是10位数就认为登陆成功
            if(account.equals("")&&password.equals("")){ showToast(getBaseContext(), "学号和密码不能为空", 2000);}
            else if(account.equals("")&&password!= null)  { showToast(getBaseContext(), "学号不能为空", 2000);}
            else if(password.equals("")&&account!= null )  { showToast(getBaseContext(), "密码不能为空", 2000);}
            else if(account.length()==10&&account.equals(password)
            		){
            	showToast(getBaseContext(), "登录.成功", 2000);
                Editor editor = pref.edit();
                if(rememberPass.isChecked()){
                    editor.putBoolean("remember_password",true);
                    editor.putString("account",account);
                    editor.putString("password",password);
                    editor.commit();  
                }else {
                    editor.clear();
                }
                editor.apply();
              //通过调用intent函数切换到新的activity
                Intent intent=new Intent(HelloAndroid.this,Shouye.class);
                startActivity(intent);
            }else {
            	showToast(getBaseContext(), "学号或者密码不正确", 2000);
            	password="";
            }
            }
        });   
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_android, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
