package com.gc.x42_doubleevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * ģ��˫���¼�
 * @author guochang
 *
 */
public class MainActivity extends Activity {

    private long firstClickTime;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void onClick(View view){
	   
	   if(firstClickTime >0){//�Ѿ��й�һ�ε��
		   if(System.currentTimeMillis() - firstClickTime < 500){//���ε���¼������500����
			   Toast.makeText(this, "˫��", Toast.LENGTH_SHORT).show();
			   //˫���¼���ɺ��ʼ��firstClickTime
			   firstClickTime = 0;
			   return;
		   }
		   
	   }
	   
	   firstClickTime = System.currentTimeMillis();
   }
    
}
