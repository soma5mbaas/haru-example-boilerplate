package com.haru.example.boilerplate;

import android.content.Context;
import android.widget.Toast;

import com.haru.push.Push;
import com.haru.push.PushReceiver;

/**
 * Push를 받는 리시버이다.
 * NOTE: AndroidManifest.xml에 반드시 등록이 되어 있어야 한다!
 */
public class MyPushReceiver extends PushReceiver {

    /**
     * 푸시 메세지가 올 경우 호출된다.
     */
    @Override
    public void onMessage(Context context, Push push) {
        Toast.makeText(context, "푸시 수신 : " + push.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
