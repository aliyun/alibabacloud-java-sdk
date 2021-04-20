// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateDeviceRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CityCode")
    public String cityCode;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceVendor")
    public String deviceVendor;

    @NameInMap("DeviceGroupName")
    public String deviceGroupName;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("SubDeviceCount")
    public Long subDeviceCount;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("FilePath")
    public String filePath;

    public static CreateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceRequest self = new CreateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateDeviceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CreateDeviceRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public CreateDeviceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateDeviceRequest setDeviceVendor(String deviceVendor) {
        this.deviceVendor = deviceVendor;
        return this;
    }
    public String getDeviceVendor() {
        return this.deviceVendor;
    }

    public CreateDeviceRequest setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
        return this;
    }
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    public CreateDeviceRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public CreateDeviceRequest setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public CreateDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateDeviceRequest setSubDeviceCount(Long subDeviceCount) {
        this.subDeviceCount = subDeviceCount;
        return this;
    }
    public Long getSubDeviceCount() {
        return this.subDeviceCount;
    }

    public CreateDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CreateDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public CreateDeviceRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
