package com.zcq.hostmodeble.ble.callback;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.os.Build;

import com.zcq.hostmodeble.ble.entity.BleDevice;
import com.zcq.hostmodeble.ble.exception.BleException;

/**
 * Create by zcq on 7/8/22 11:44 AM
 */
@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
public abstract class BleGattCallback extends BluetoothGattCallback {

    public abstract void onStartConnect();

    public abstract void onConnectFail(BleDevice bleDevice, BleException exception);

    public abstract void onConnectSuccess(BleDevice bleDevice, BluetoothGatt gatt, int status);

    public abstract void onDisConnected(boolean isActiveDisConnected, BleDevice device, BluetoothGatt gatt, int status);

}
