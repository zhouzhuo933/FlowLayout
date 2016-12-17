package com.example.zhouzhuo.myflowlayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.zhouzhuo.flowlayout.FlowLayout;

public class MainActivity extends AppCompatActivity {
    private FlowLayout flowLayout;

    private String [] listTabs = {"一","两个","重中之重","为什么","微博发送","八个字啊八个字啊","dvcddfdfdfdfdfd"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowLayout = (FlowLayout) findViewById(R.id.fl);

        initData();
    }

    private void initData() {

        for(int i=0;i<listTabs.length;i++){
            final TextView tv=new TextView(this);

            tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,13);

                tv.setTextColor(Color.WHITE);
                tv.setBackgroundResource(R.mipmap.ic_launcher);
                tv.setText(" "+listTabs[i]+" ");

            tv.setGravity(Gravity.CENTER);


            int textPaddingV = 4;
            int textPaddingH = 7;
            tv.setPadding(textPaddingH, textPaddingV, textPaddingH, textPaddingV);
            tv.setClickable(true);



            flowLayout.addView(tv,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.
                    WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        

    }


}
