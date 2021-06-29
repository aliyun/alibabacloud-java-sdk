// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateNewDeviceRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CityCode")
    public String cityCode;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("InProtocol")
    public String inProtocol;

    @NameInMap("SubDeviceCount")
    public Long subDeviceCount;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("FilePath")
    public String filePath;

    public static CreateNewDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNewDeviceRequest self = new CreateNewDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNewDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateNewDeviceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CreateNewDeviceRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public CreateNewDeviceRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public CreateNewDeviceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateNewDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateNewDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public CreateNewDeviceRequest setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public CreateNewDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateNewDeviceRequest setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public CreateNewDeviceRequest setSubDeviceCount(Long subDeviceCount) {
        this.subDeviceCount = subDeviceCount;
        return this;
    }
    public Long getSubDeviceCount() {
        return this.subDeviceCount;
    }

    public CreateNewDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CreateNewDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateNewDeviceRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
