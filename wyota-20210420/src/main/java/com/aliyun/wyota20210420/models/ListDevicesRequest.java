// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDevicesRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("BuildId")
    public String buildId;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("DeviceIpV4")
    public String deviceIpV4;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceOS")
    public String deviceOS;

    @NameInMap("DevicePlatform")
    public String devicePlatform;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("LabelContent")
    public String labelContent;

    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("LocationInfo")
    public String locationInfo;

    @NameInMap("Model")
    public String model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("Uuid")
    public String uuid;

    public static ListDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesRequest self = new ListDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicesRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ListDevicesRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public ListDevicesRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public ListDevicesRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public ListDevicesRequest setDeviceIpV4(String deviceIpV4) {
        this.deviceIpV4 = deviceIpV4;
        return this;
    }
    public String getDeviceIpV4() {
        return this.deviceIpV4;
    }

    public ListDevicesRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ListDevicesRequest setDeviceOS(String deviceOS) {
        this.deviceOS = deviceOS;
        return this;
    }
    public String getDeviceOS() {
        return this.deviceOS;
    }

    public ListDevicesRequest setDevicePlatform(String devicePlatform) {
        this.devicePlatform = devicePlatform;
        return this;
    }
    public String getDevicePlatform() {
        return this.devicePlatform;
    }

    public ListDevicesRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListDevicesRequest setLabelContent(String labelContent) {
        this.labelContent = labelContent;
        return this;
    }
    public String getLabelContent() {
        return this.labelContent;
    }

    public ListDevicesRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public ListDevicesRequest setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }
    public String getLocationInfo() {
        return this.locationInfo;
    }

    public ListDevicesRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListDevicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDevicesRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public ListDevicesRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ListDevicesRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
