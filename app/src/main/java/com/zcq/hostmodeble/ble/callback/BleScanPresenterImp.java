package com.zcq.hostmodeble.ble.callback;

import com.zcq.hostmodeble.ble.entity.BleDevice;

/**
 * Create by zcq on 7/8/22 11:49 AM
 */
public interface BleScanPresenterImp {

    void onScanStarted(boolean success);

    void onScanning(BleDevice bleDevice);
}