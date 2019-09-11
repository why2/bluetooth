package com.example.android.bluetoothchat.simple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.android.bluetoothchat.R;

public class SimpleChatActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_chat);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        SimpleBluetoothChatFragment fragment = new SimpleBluetoothChatFragment();
        transaction.replace(R.id.fl_chat, fragment);
        transaction.commit();
    }

    /**
     * 连接
     *
     * @param view
     */
    public void connect(View view) {

    }

    /**
     * 断开连接
     *
     * @param view
     */
    public void disConnect(View view) {

    }
}
