package com.zcq.hostmodeble.ble.callback;

import com.zcq.hostmodeble.ble.entity.BleDevice;

import java.util.List;

/**
 * Create by zcq on 7/8/22 11:50 AM
 */
public abstract class BleScanCallback implements BleScanPresenterImp {

    public abstract void onScanFinished(List<BleDevice> scanResultList);

    public void onLeScan(BleDevice bleDevice) {}

}