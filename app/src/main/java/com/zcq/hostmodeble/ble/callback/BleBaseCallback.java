package com.zcq.hostmodeble.ble.callback;

import android.os.Handler;

/**
 * Create by zcq on 7/8/22 11:43 AM
 */
public abstract class BleBaseCallback {

    private String key;
    private Handler handler;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}