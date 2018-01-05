package com.jlhd.adajlhd.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.jlhd.adajlhd.service.AdaJlhdService;

/**
 * Created by sjj on 2018/1/4.
 */

public class BootCompletedReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("开机广播", "系统启动完毕");
        Intent intent1 = new Intent(context, AdaJlhdService.class);
        context.startService(intent1);
    }
}
