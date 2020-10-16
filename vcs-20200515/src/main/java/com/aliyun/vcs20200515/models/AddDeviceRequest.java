// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDeviceRequest extends TeaModel {
    @NameInMap("GbId")
    public String gbId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("DeviceSite")
    public String deviceSite;

    @NameInMap("DeviceDirection")
    public String deviceDirection;

    @NameInMap("DeviceResolution")
    public String deviceResolution;

    @NameInMap("BitRate")
    public String bitRate;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Vendor")
    public String vendor;

    public static AddDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceRequest self = new AddDeviceRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public AddDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public AddDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public AddDeviceRequest setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public AddDeviceRequest setDeviceSite(String deviceSite) {
        this.deviceSite = deviceSite;
        return this;
    }
    public String getDeviceSite() {
        return this.deviceSite;
    }

    public AddDeviceRequest setDeviceDirection(String deviceDirection) {
        this.deviceDirection = deviceDirection;
        return this;
    }
    public String getDeviceDirection() {
        return this.deviceDirection;
    }

    public AddDeviceRequest setDeviceResolution(String deviceResolution) {
        this.deviceResolution = deviceResolution;
        return this;
    }
    public String getDeviceResolution() {
        return this.deviceResolution;
    }

    public AddDeviceRequest setBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public String getBitRate() {
        return this.bitRate;
    }

    public AddDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
