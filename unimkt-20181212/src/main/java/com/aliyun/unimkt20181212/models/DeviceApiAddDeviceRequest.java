// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class DeviceApiAddDeviceRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("City")
    public String city;

    @NameInMap("DeviceModelNumber")
    public String deviceModelNumber;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("District")
    public String district;

    @NameInMap("ExtraMap")
    public java.util.Map<String, ?> extraMap;

    @NameInMap("FirstScene")
    public String firstScene;

    @NameInMap("Floor")
    public String floor;

    @NameInMap("LocationName")
    public String locationName;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OuterCode")
    public String outerCode;

    @NameInMap("Province")
    public String province;

    @NameInMap("SecondScene")
    public String secondScene;

    public static DeviceApiAddDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeviceApiAddDeviceRequest self = new DeviceApiAddDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeviceApiAddDeviceRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DeviceApiAddDeviceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DeviceApiAddDeviceRequest setDeviceModelNumber(String deviceModelNumber) {
        this.deviceModelNumber = deviceModelNumber;
        return this;
    }
    public String getDeviceModelNumber() {
        return this.deviceModelNumber;
    }

    public DeviceApiAddDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeviceApiAddDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public DeviceApiAddDeviceRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public DeviceApiAddDeviceRequest setExtraMap(java.util.Map<String, ?> extraMap) {
        this.extraMap = extraMap;
        return this;
    }
    public java.util.Map<String, ?> getExtraMap() {
        return this.extraMap;
    }

    public DeviceApiAddDeviceRequest setFirstScene(String firstScene) {
        this.firstScene = firstScene;
        return this;
    }
    public String getFirstScene() {
        return this.firstScene;
    }

    public DeviceApiAddDeviceRequest setFloor(String floor) {
        this.floor = floor;
        return this;
    }
    public String getFloor() {
        return this.floor;
    }

    public DeviceApiAddDeviceRequest setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public DeviceApiAddDeviceRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeviceApiAddDeviceRequest setOuterCode(String outerCode) {
        this.outerCode = outerCode;
        return this;
    }
    public String getOuterCode() {
        return this.outerCode;
    }

    public DeviceApiAddDeviceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DeviceApiAddDeviceRequest setSecondScene(String secondScene) {
        this.secondScene = secondScene;
        return this;
    }
    public String getSecondScene() {
        return this.secondScene;
    }

}
