package com.emirim.eun01.l01_mycatcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreated가 실행됨");
        Log.v("MainActivity", "oncreated가 실행됨");
        Log.v("MainActivity", "Log.v 실행 : 모두 출력");
        Log.i("MainActivity", "Log.i 실행 : 정보 출력");
        Log.d("MainActivity", "Log.d 실행 : 디버깅 출력");
        Log.w("MainActivity", "Log.w 실행 : 경고 출력");
        Log.e("MainActivity", "Log.e 실행 : 에러 출력");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        Log.v("MainActivity", "onResume이 실행됨");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v("MainActivity", "onStart가 실행됨");
        super.onStart();
    }
}
