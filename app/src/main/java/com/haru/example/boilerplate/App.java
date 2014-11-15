package com.haru.example.boilerplate;

import android.app.Application;

import com.haru.Haru;
import com.haru.push.Push;

/**
 * 애플리케이션 클래스이다. AndroidManifest.xml의 application 태그에 등록되어 있다.
 */
public class App extends Application {

    /**
     * 애플리케이션이 서비스로든 액티비티로든 실행될 때 가장 먼저 호출된다.
     */
    @Override
    public void onCreate() {
        super.onCreate();

        // TODO: 여기에 App Key와 Sdk Key를 집어 넣으시오.
        // 이 키들은 Haru 관리자 콘솔 > 설정 > 키 관리에서 볼 수 있습니다.
        Haru.init(this, "App Key Here", "Sdk Key Here");

        // Push 받기 설정
        Push.init(this);
    }
}
