// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDeviceGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListDeviceGroupsResponseData> data;

    public static ListDeviceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupsResponse self = new ListDeviceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceGroupsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceGroupsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceGroupsResponse setData(java.util.List<ListDeviceGroupsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeviceGroupsResponseData> getData() {
        return this.data;
    }

    public static class ListDeviceGroupsResponseDataList extends TeaModel {
        @NameInMap("DeviceGroup")
        @Validation(required = true)
        public String deviceGroup;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("DeviceCode")
        @Validation(required = true)
        public String deviceCode;

        @NameInMap("BitRate")
        @Validation(required = true)
        public String bitRate;

        @NameInMap("CodingFormat")
        @Validation(required = true)
        public String codingFormat;

        @NameInMap("ResolvingPower")
        @Validation(required = true)
        public String resolvingPower;

        @NameInMap("DataSourceType")
        @Validation(required = true)
        public String dataSourceType;

        @NameInMap("RegionName")
        @Validation(required = true)
        public String regionName;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstallAddress")
        @Validation(required = true)
        public String installAddress;

        @NameInMap("DeviceSn")
        @Validation(required = true)
        public String deviceSn;

        @NameInMap("DeviceStatus")
        @Validation(required = true)
        public String deviceStatus;

        @NameInMap("DeviceStreamStatus")
        @Validation(required = true)
        public String deviceStreamStatus;

        @NameInMap("DeviceComputeStatus")
        @Validation(required = true)
        public String deviceComputeStatus;

        public static ListDeviceGroupsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupsResponseDataList self = new ListDeviceGroupsResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupsResponseDataList setDeviceGroup(String deviceGroup) {
            this.deviceGroup = deviceGroup;
            return this;
        }
        public String getDeviceGroup() {
            return this.deviceGroup;
        }

        public ListDeviceGroupsResponseDataList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDeviceGroupsResponseDataList setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public ListDeviceGroupsResponseDataList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public ListDeviceGroupsResponseDataList setCodingFormat(String codingFormat) {
            this.codingFormat = codingFormat;
            return this;
        }
        public String getCodingFormat() {
            return this.codingFormat;
        }

        public ListDeviceGroupsResponseDataList setResolvingPower(String resolvingPower) {
            this.resolvingPower = resolvingPower;
            return this;
        }
        public String getResolvingPower() {
            return this.resolvingPower;
        }

        public ListDeviceGroupsResponseDataList setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListDeviceGroupsResponseDataList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListDeviceGroupsResponseDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDeviceGroupsResponseDataList setInstallAddress(String installAddress) {
            this.installAddress = installAddress;
            return this;
        }
        public String getInstallAddress() {
            return this.installAddress;
        }

        public ListDeviceGroupsResponseDataList setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListDeviceGroupsResponseDataList setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListDeviceGroupsResponseDataList setDeviceStreamStatus(String deviceStreamStatus) {
            this.deviceStreamStatus = deviceStreamStatus;
            return this;
        }
        public String getDeviceStreamStatus() {
            return this.deviceStreamStatus;
        }

        public ListDeviceGroupsResponseDataList setDeviceComputeStatus(String deviceComputeStatus) {
            this.deviceComputeStatus = deviceComputeStatus;
            return this;
        }
        public String getDeviceComputeStatus() {
            return this.deviceComputeStatus;
        }

    }

    public static class ListDeviceGroupsResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public String totalCount;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<ListDeviceGroupsResponseDataList> list;

        public static ListDeviceGroupsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupsResponseData self = new ListDeviceGroupsResponseData();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupsResponseData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public ListDeviceGroupsResponseData setList(java.util.List<ListDeviceGroupsResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDeviceGroupsResponseDataList> getList() {
            return this.list;
        }

    }

}
