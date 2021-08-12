// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeNvrsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public DescribeNvrsResponseBodyData data;

    public static DescribeNvrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNvrsResponseBody self = new DescribeNvrsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNvrsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNvrsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNvrsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNvrsResponseBody setData(DescribeNvrsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNvrsResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeNvrsResponseBodyDataRecordsSubDeviceInfo extends TeaModel {
        @NameInMap("SubDeviceId")
        public String subDeviceId;

        public static DescribeNvrsResponseBodyDataRecordsSubDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNvrsResponseBodyDataRecordsSubDeviceInfo self = new DescribeNvrsResponseBodyDataRecordsSubDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeNvrsResponseBodyDataRecordsSubDeviceInfo setSubDeviceId(String subDeviceId) {
            this.subDeviceId = subDeviceId;
            return this;
        }
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

    }

    public static class DescribeNvrsResponseBodyDataRecords extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerRealm")
        public String serverRealm;

        @NameInMap("ServerPort")
        public String serverPort;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Password")
        public String password;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("InProtocol")
        public String inProtocol;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("SubDeviceCount")
        public String subDeviceCount;

        @NameInMap("SubDeviceInfo")
        public java.util.List<DescribeNvrsResponseBodyDataRecordsSubDeviceInfo> subDeviceInfo;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("DeviceModel")
        public String deviceModel;

        public static DescribeNvrsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeNvrsResponseBodyDataRecords self = new DescribeNvrsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeNvrsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeNvrsResponseBodyDataRecords setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeNvrsResponseBodyDataRecords setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeNvrsResponseBodyDataRecords setServerRealm(String serverRealm) {
            this.serverRealm = serverRealm;
            return this;
        }
        public String getServerRealm() {
            return this.serverRealm;
        }

        public DescribeNvrsResponseBodyDataRecords setServerPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public String getServerPort() {
            return this.serverPort;
        }

        public DescribeNvrsResponseBodyDataRecords setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeNvrsResponseBodyDataRecords setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeNvrsResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeNvrsResponseBodyDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public DescribeNvrsResponseBodyDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public DescribeNvrsResponseBodyDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public DescribeNvrsResponseBodyDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeNvrsResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeNvrsResponseBodyDataRecords setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeNvrsResponseBodyDataRecords setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public DescribeNvrsResponseBodyDataRecords setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public DescribeNvrsResponseBodyDataRecords setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public DescribeNvrsResponseBodyDataRecords setSubDeviceCount(String subDeviceCount) {
            this.subDeviceCount = subDeviceCount;
            return this;
        }
        public String getSubDeviceCount() {
            return this.subDeviceCount;
        }

        public DescribeNvrsResponseBodyDataRecords setSubDeviceInfo(java.util.List<DescribeNvrsResponseBodyDataRecordsSubDeviceInfo> subDeviceInfo) {
            this.subDeviceInfo = subDeviceInfo;
            return this;
        }
        public java.util.List<DescribeNvrsResponseBodyDataRecordsSubDeviceInfo> getSubDeviceInfo() {
            return this.subDeviceInfo;
        }

        public DescribeNvrsResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeNvrsResponseBodyDataRecords setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeNvrsResponseBodyDataRecords setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

    }

    public static class DescribeNvrsResponseBodyData extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeNvrsResponseBodyDataRecords> records;

        public static DescribeNvrsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNvrsResponseBodyData self = new DescribeNvrsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNvrsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeNvrsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public DescribeNvrsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeNvrsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeNvrsResponseBodyData setRecords(java.util.List<DescribeNvrsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeNvrsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
