// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ModifyDeviceRequest extends TeaModel {
    // 设备国标编码
    @NameInMap("DeviceId")
    public String deviceId;

    // 设备名称
    @NameInMap("DeviceName")
    public String deviceName;

    // 设备安装地址
    @NameInMap("DeviceAddress")
    public String deviceAddress;

    // 设备IP
    @NameInMap("Ip")
    public String ip;

    // 设备密码
    @NameInMap("Password")
    public String password;

    @NameInMap("DeviceSite")
    public String deviceSite;

    @NameInMap("DeviceDirection")
    public String deviceDirection;

    @NameInMap("DeviceResolution")
    public String deviceResolution;

    @NameInMap("DeviceRate")
    public String deviceRate;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("DeviceModel")
    public String deviceModel;

    public static ModifyDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceRequest self = new ModifyDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ModifyDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ModifyDeviceRequest setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public ModifyDeviceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ModifyDeviceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyDeviceRequest setDeviceSite(String deviceSite) {
        this.deviceSite = deviceSite;
        return this;
    }
    public String getDeviceSite() {
        return this.deviceSite;
    }

    public ModifyDeviceRequest setDeviceDirection(String deviceDirection) {
        this.deviceDirection = deviceDirection;
        return this;
    }
    public String getDeviceDirection() {
        return this.deviceDirection;
    }

    public ModifyDeviceRequest setDeviceResolution(String deviceResolution) {
        this.deviceResolution = deviceResolution;
        return this;
    }
    public String getDeviceResolution() {
        return this.deviceResolution;
    }

    public ModifyDeviceRequest setDeviceRate(String deviceRate) {
        this.deviceRate = deviceRate;
        return this;
    }
    public String getDeviceRate() {
        return this.deviceRate;
    }

    public ModifyDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public ModifyDeviceRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public ModifyDeviceRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public ModifyDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

}
