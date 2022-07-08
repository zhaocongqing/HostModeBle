package com.zcq.hostmodeble.ble.callback;

import com.zcq.hostmodeble.ble.exception.BleException;

/**
 * Create by zcq on 7/8/22 11:46 AM
 */
public abstract class BleMtuChangedCallback extends BleBaseCallback {

    public abstract void onSetMTUFailure(BleException exception);

    public abstract void onMtuChanged(int mtu);

}