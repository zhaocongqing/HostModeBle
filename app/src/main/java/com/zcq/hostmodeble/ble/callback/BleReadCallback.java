package com.zcq.hostmodeble.ble.callback;

import com.zcq.hostmodeble.ble.exception.BleException;

/**
 * Create by zcq on 7/8/22 11:48 AM
 */
public abstract class BleReadCallback extends BleBaseCallback {

    public abstract void onReadSuccess(byte[] data);

    public abstract void onReadFailure(BleException exception);

}