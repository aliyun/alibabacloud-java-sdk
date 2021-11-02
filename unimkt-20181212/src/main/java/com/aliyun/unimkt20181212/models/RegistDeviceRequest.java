// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class RegistDeviceRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("City")
    public String city;

    @NameInMap("DetailAddr")
    public String detailAddr;

    @NameInMap("DeviceModelNumber")
    public String deviceModelNumber;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("District")
    public String district;

    @NameInMap("FirstScene")
    public String firstScene;

    @NameInMap("Floor")
    public String floor;

    @NameInMap("LocationName")
    public String locationName;

    @NameInMap("OuterCode")
    public String outerCode;

    @NameInMap("Province")
    public String province;

    @NameInMap("SecondScene")
    public String secondScene;

    public static RegistDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegistDeviceRequest self = new RegistDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegistDeviceRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RegistDeviceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public RegistDeviceRequest setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
        return this;
    }
    public String getDetailAddr() {
        return this.detailAddr;
    }

    public RegistDeviceRequest setDeviceModelNumber(String deviceModelNumber) {
        this.deviceModelNumber = deviceModelNumber;
        return this;
    }
    public String getDeviceModelNumber() {
        return this.deviceModelNumber;
    }

    public RegistDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RegistDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public RegistDeviceRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public RegistDeviceRequest setFirstScene(String firstScene) {
        this.firstScene = firstScene;
        return this;
    }
    public String getFirstScene() {
        return this.firstScene;
    }

    public RegistDeviceRequest setFloor(String floor) {
        this.floor = floor;
        return this;
    }
    public String getFloor() {
        return this.floor;
    }

    public RegistDeviceRequest setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public RegistDeviceRequest setOuterCode(String outerCode) {
        this.outerCode = outerCode;
        return this;
    }
    public String getOuterCode() {
        return this.outerCode;
    }

    public RegistDeviceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public RegistDeviceRequest setSecondScene(String secondScene) {
        this.secondScene = secondScene;
        return this;
    }
    public String getSecondScene() {
        return this.secondScene;
    }

}
