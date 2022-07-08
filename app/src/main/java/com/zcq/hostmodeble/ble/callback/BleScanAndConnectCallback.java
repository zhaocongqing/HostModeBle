package com.zcq.hostmodeble.ble.callback;

import com.zcq.hostmodeble.ble.entity.BleDevice;

/**
 * Create by zcq on 7/8/22 11:49 AM
 */
public abstract class BleScanAndConnectCallback extends BleGattCallback implements BleScanPresenterImp {

    public abstract void onScanFinished(BleDevice scanResult);

    public void onLeScan(BleDevice bleDevice) {}

}