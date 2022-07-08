package com.zcq.hostmodeble.ble.callback;

import com.zcq.hostmodeble.ble.exception.BleException;

/**
 * Create by zcq on 7/8/22 11:46 AM
 */
public abstract class BleNotifyCallback extends BleBaseCallback {

    public abstract void onNotifySuccess();

    public abstract void onNotifyFailure(BleException exception);

    public abstract void onCharacteristicChanged(byte[] data);

}