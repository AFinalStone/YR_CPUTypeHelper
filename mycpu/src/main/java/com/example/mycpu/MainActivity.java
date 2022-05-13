package com.example.mycpu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kejiee.huaxindou.ndk.CPUFrameworkHelper;


public class MainActivity extends AppCompatActivity {
TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mTextView= (TextView) findViewById(R.id.tv);
        StringBuffer sf=new StringBuffer();
        sf.append("手机CPU型号：\n");
        sf.append("isArmCpu："+ CPUFrameworkHelper.isArmCpu()+"\n");
        sf.append("isArm7Compatible："+ CPUFrameworkHelper.isArm7Compatible()+"\n");
        sf.append("isMipsCpu："+ CPUFrameworkHelper.isMipsCpu()+"\n");
        sf.append("isX86Cpu："+ CPUFrameworkHelper.isX86Cpu()+"\n");
        sf.append("isArm64Cpu："+ CPUFrameworkHelper.isArm64Cpu()+"\n");
        sf.append("isMips64Cpu："+ CPUFrameworkHelper.isMips64Cpu()+"\n");
        sf.append("isX86_64Cpu："+ CPUFrameworkHelper.isX86_64Cpu()+"\n");
        mTextView.setText(sf.toString());

    }
}
