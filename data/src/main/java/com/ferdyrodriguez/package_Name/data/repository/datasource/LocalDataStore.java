package com.ferdyrodriguez.package_Name.data.repository.datasource;

import com.ferdyrodriguez.package_Name.data.device.DeviceData;

/**
 * Created by ferdyrod on 6/12/17.
 */

public class LocalDataStore implements LocalData {

    private final DeviceData mDeviceData;

    public LocalDataStore(DeviceData deviceData) {
        mDeviceData = deviceData;
    }
}
