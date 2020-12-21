// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDeviceGroupsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListDeviceGroupsResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    public static ListDeviceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupsResponseBody self = new ListDeviceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceGroupsResponseBody setData(java.util.List<ListDeviceGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeviceGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListDeviceGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListDeviceGroupsResponseBodyDataList extends TeaModel {
        @NameInMap("DeviceStreamStatus")
        public String deviceStreamStatus;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("DeviceComputeStatus")
        public String deviceComputeStatus;

        @NameInMap("InstallAddress")
        public String installAddress;

        @NameInMap("DeviceGroup")
        public String deviceGroup;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("ResolvingPower")
        public String resolvingPower;

        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("BitRate")
        public String bitRate;

        @NameInMap("CodingFormat")
        public String codingFormat;

        @NameInMap("Type")
        public String type;

        public static ListDeviceGroupsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupsResponseBodyDataList self = new ListDeviceGroupsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupsResponseBodyDataList setDeviceStreamStatus(String deviceStreamStatus) {
            this.deviceStreamStatus = deviceStreamStatus;
            return this;
        }
        public String getDeviceStreamStatus() {
            return this.deviceStreamStatus;
        }

        public ListDeviceGroupsResponseBodyDataList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDeviceGroupsResponseBodyDataList setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListDeviceGroupsResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDeviceGroupsResponseBodyDataList setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListDeviceGroupsResponseBodyDataList setDeviceComputeStatus(String deviceComputeStatus) {
            this.deviceComputeStatus = deviceComputeStatus;
            return this;
        }
        public String getDeviceComputeStatus() {
            return this.deviceComputeStatus;
        }

        public ListDeviceGroupsResponseBodyDataList setInstallAddress(String installAddress) {
            this.installAddress = installAddress;
            return this;
        }
        public String getInstallAddress() {
            return this.installAddress;
        }

        public ListDeviceGroupsResponseBodyDataList setDeviceGroup(String deviceGroup) {
            this.deviceGroup = deviceGroup;
            return this;
        }
        public String getDeviceGroup() {
            return this.deviceGroup;
        }

        public ListDeviceGroupsResponseBodyDataList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListDeviceGroupsResponseBodyDataList setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListDeviceGroupsResponseBodyDataList setResolvingPower(String resolvingPower) {
            this.resolvingPower = resolvingPower;
            return this;
        }
        public String getResolvingPower() {
            return this.resolvingPower;
        }

        public ListDeviceGroupsResponseBodyDataList setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public ListDeviceGroupsResponseBodyDataList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public ListDeviceGroupsResponseBodyDataList setCodingFormat(String codingFormat) {
            this.codingFormat = codingFormat;
            return this;
        }
        public String getCodingFormat() {
            return this.codingFormat;
        }

        public ListDeviceGroupsResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDeviceGroupsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListDeviceGroupsResponseBodyDataList> list;

        @NameInMap("TotalCount")
        public String totalCount;

        public static ListDeviceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupsResponseBodyData self = new ListDeviceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupsResponseBodyData setList(java.util.List<ListDeviceGroupsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDeviceGroupsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListDeviceGroupsResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
