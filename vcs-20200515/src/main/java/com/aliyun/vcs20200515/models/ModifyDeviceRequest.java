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

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("DeviceDirection")
    public String deviceDirection;

    @NameInMap("DeviceSite")
    public String deviceSite;

    @NameInMap("DeviceResolution")
    public String deviceResolution;

    @NameInMap("DeviceRate")
    public String deviceRate;

    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("GovLength")
    public String govLength;

    @NameInMap("EncodeFormat")
    public String encodeFormat;

    @NameInMap("AudioEnable")
    public String audioEnable;

    @NameInMap("OSDTimeEnable")
    public String OSDTimeEnable;

    @NameInMap("OSDTimeType")
    public String OSDTimeType;

    @NameInMap("OSDTimeX")
    public String OSDTimeX;

    @NameInMap("OSDTimeY")
    public String OSDTimeY;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("DeviceSubType")
    public String deviceSubType;

    @NameInMap("DeviceIp")
    public String deviceIp;

    @NameInMap("Password")
    public String password;

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

    public ModifyDeviceRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public ModifyDeviceRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public ModifyDeviceRequest setDeviceDirection(String deviceDirection) {
        this.deviceDirection = deviceDirection;
        return this;
    }
    public String getDeviceDirection() {
        return this.deviceDirection;
    }

    public ModifyDeviceRequest setDeviceSite(String deviceSite) {
        this.deviceSite = deviceSite;
        return this;
    }
    public String getDeviceSite() {
        return this.deviceSite;
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

    public ModifyDeviceRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public ModifyDeviceRequest setGovLength(String govLength) {
        this.govLength = govLength;
        return this;
    }
    public String getGovLength() {
        return this.govLength;
    }

    public ModifyDeviceRequest setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
        return this;
    }
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    public ModifyDeviceRequest setAudioEnable(String audioEnable) {
        this.audioEnable = audioEnable;
        return this;
    }
    public String getAudioEnable() {
        return this.audioEnable;
    }

    public ModifyDeviceRequest setOSDTimeEnable(String OSDTimeEnable) {
        this.OSDTimeEnable = OSDTimeEnable;
        return this;
    }
    public String getOSDTimeEnable() {
        return this.OSDTimeEnable;
    }

    public ModifyDeviceRequest setOSDTimeType(String OSDTimeType) {
        this.OSDTimeType = OSDTimeType;
        return this;
    }
    public String getOSDTimeType() {
        return this.OSDTimeType;
    }

    public ModifyDeviceRequest setOSDTimeX(String OSDTimeX) {
        this.OSDTimeX = OSDTimeX;
        return this;
    }
    public String getOSDTimeX() {
        return this.OSDTimeX;
    }

    public ModifyDeviceRequest setOSDTimeY(String OSDTimeY) {
        this.OSDTimeY = OSDTimeY;
        return this;
    }
    public String getOSDTimeY() {
        return this.OSDTimeY;
    }

    public ModifyDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public ModifyDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public ModifyDeviceRequest setDeviceSubType(String deviceSubType) {
        this.deviceSubType = deviceSubType;
        return this;
    }
    public String getDeviceSubType() {
        return this.deviceSubType;
    }

    public ModifyDeviceRequest setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
        return this;
    }
    public String getDeviceIp() {
        return this.deviceIp;
    }

    public ModifyDeviceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
