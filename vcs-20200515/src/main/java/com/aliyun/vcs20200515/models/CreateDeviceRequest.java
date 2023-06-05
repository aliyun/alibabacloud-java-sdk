// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateDeviceRequest extends TeaModel {
    @NameInMap("ActivateCode")
    public String activateCode;

    @NameInMap("AudioEnable")
    public String audioEnable;

    @NameInMap("CityCode")
    public String cityCode;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("DeviceDirection")
    public String deviceDirection;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceRate")
    public String deviceRate;

    @NameInMap("DeviceResolution")
    public String deviceResolution;

    @NameInMap("DeviceSite")
    public String deviceSite;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("EncodeFormat")
    public String encodeFormat;

    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("GovLength")
    public String govLength;

    @NameInMap("InProtocol")
    public String inProtocol;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("OSDTimeEnable")
    public String OSDTimeEnable;

    @NameInMap("OSDTimeType")
    public String OSDTimeType;

    @NameInMap("OSDTimeX")
    public String OSDTimeX;

    @NameInMap("OSDTimeY")
    public String OSDTimeY;

    @NameInMap("ParentDeviceId")
    public String parentDeviceId;

    @NameInMap("Roi")
    public String roi;

    @NameInMap("SubDeviceCount")
    public Long subDeviceCount;

    @NameInMap("SubDeviceIdList")
    public String subDeviceIdList;

    @NameInMap("Vendor")
    public String vendor;

    public static CreateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceRequest self = new CreateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceRequest setActivateCode(String activateCode) {
        this.activateCode = activateCode;
        return this;
    }
    public String getActivateCode() {
        return this.activateCode;
    }

    public CreateDeviceRequest setAudioEnable(String audioEnable) {
        this.audioEnable = audioEnable;
        return this;
    }
    public String getAudioEnable() {
        return this.audioEnable;
    }

    public CreateDeviceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CreateDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateDeviceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDeviceRequest setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public CreateDeviceRequest setDeviceDirection(String deviceDirection) {
        this.deviceDirection = deviceDirection;
        return this;
    }
    public String getDeviceDirection() {
        return this.deviceDirection;
    }

    public CreateDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CreateDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateDeviceRequest setDeviceRate(String deviceRate) {
        this.deviceRate = deviceRate;
        return this;
    }
    public String getDeviceRate() {
        return this.deviceRate;
    }

    public CreateDeviceRequest setDeviceResolution(String deviceResolution) {
        this.deviceResolution = deviceResolution;
        return this;
    }
    public String getDeviceResolution() {
        return this.deviceResolution;
    }

    public CreateDeviceRequest setDeviceSite(String deviceSite) {
        this.deviceSite = deviceSite;
        return this;
    }
    public String getDeviceSite() {
        return this.deviceSite;
    }

    public CreateDeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public CreateDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateDeviceRequest setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
        return this;
    }
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    public CreateDeviceRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public CreateDeviceRequest setGovLength(String govLength) {
        this.govLength = govLength;
        return this;
    }
    public String getGovLength() {
        return this.govLength;
    }

    public CreateDeviceRequest setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public CreateDeviceRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public CreateDeviceRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public CreateDeviceRequest setOSDTimeEnable(String OSDTimeEnable) {
        this.OSDTimeEnable = OSDTimeEnable;
        return this;
    }
    public String getOSDTimeEnable() {
        return this.OSDTimeEnable;
    }

    public CreateDeviceRequest setOSDTimeType(String OSDTimeType) {
        this.OSDTimeType = OSDTimeType;
        return this;
    }
    public String getOSDTimeType() {
        return this.OSDTimeType;
    }

    public CreateDeviceRequest setOSDTimeX(String OSDTimeX) {
        this.OSDTimeX = OSDTimeX;
        return this;
    }
    public String getOSDTimeX() {
        return this.OSDTimeX;
    }

    public CreateDeviceRequest setOSDTimeY(String OSDTimeY) {
        this.OSDTimeY = OSDTimeY;
        return this;
    }
    public String getOSDTimeY() {
        return this.OSDTimeY;
    }

    public CreateDeviceRequest setParentDeviceId(String parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
        return this;
    }
    public String getParentDeviceId() {
        return this.parentDeviceId;
    }

    public CreateDeviceRequest setRoi(String roi) {
        this.roi = roi;
        return this;
    }
    public String getRoi() {
        return this.roi;
    }

    public CreateDeviceRequest setSubDeviceCount(Long subDeviceCount) {
        this.subDeviceCount = subDeviceCount;
        return this;
    }
    public Long getSubDeviceCount() {
        return this.subDeviceCount;
    }

    public CreateDeviceRequest setSubDeviceIdList(String subDeviceIdList) {
        this.subDeviceIdList = subDeviceIdList;
        return this;
    }
    public String getSubDeviceIdList() {
        return this.subDeviceIdList;
    }

    public CreateDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
