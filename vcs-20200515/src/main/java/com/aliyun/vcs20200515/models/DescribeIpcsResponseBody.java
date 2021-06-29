// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeIpcsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeIpcsResponseBodyData data;

    public static DescribeIpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpcsResponseBody self = new DescribeIpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpcsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeIpcsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpcsResponseBody setData(DescribeIpcsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeIpcsResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeIpcsResponseBodyDataRecords extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("InProtocol")
        public String inProtocol;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("StreamAction")
        public String streamAction;

        @NameInMap("DeviceVendor")
        public String deviceVendor;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Password")
        public String password;

        @NameInMap("ServerPort")
        public String serverPort;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("DeviceSite")
        public String deviceSite;

        @NameInMap("DeviceResolution")
        public String deviceResolution;

        @NameInMap("DeviceRate")
        public String deviceRate;

        @NameInMap("ParentDeviceId")
        public String parentDeviceId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("Vap")
        public String vap;

        @NameInMap("CameraType")
        public String cameraType;

        public static DescribeIpcsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpcsResponseBodyDataRecords self = new DescribeIpcsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeIpcsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeIpcsResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeIpcsResponseBodyDataRecords setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeIpcsResponseBodyDataRecords setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeIpcsResponseBodyDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public DescribeIpcsResponseBodyDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public DescribeIpcsResponseBodyDataRecords setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public DescribeIpcsResponseBodyDataRecords setStreamAction(String streamAction) {
            this.streamAction = streamAction;
            return this;
        }
        public String getStreamAction() {
            return this.streamAction;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceVendor(String deviceVendor) {
            this.deviceVendor = deviceVendor;
            return this;
        }
        public String getDeviceVendor() {
            return this.deviceVendor;
        }

        public DescribeIpcsResponseBodyDataRecords setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeIpcsResponseBodyDataRecords setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeIpcsResponseBodyDataRecords setServerPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public String getServerPort() {
            return this.serverPort;
        }

        public DescribeIpcsResponseBodyDataRecords setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceSite(String deviceSite) {
            this.deviceSite = deviceSite;
            return this;
        }
        public String getDeviceSite() {
            return this.deviceSite;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceResolution(String deviceResolution) {
            this.deviceResolution = deviceResolution;
            return this;
        }
        public String getDeviceResolution() {
            return this.deviceResolution;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceRate(String deviceRate) {
            this.deviceRate = deviceRate;
            return this;
        }
        public String getDeviceRate() {
            return this.deviceRate;
        }

        public DescribeIpcsResponseBodyDataRecords setParentDeviceId(String parentDeviceId) {
            this.parentDeviceId = parentDeviceId;
            return this;
        }
        public String getParentDeviceId() {
            return this.parentDeviceId;
        }

        public DescribeIpcsResponseBodyDataRecords setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeIpcsResponseBodyDataRecords setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public DescribeIpcsResponseBodyDataRecords setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeIpcsResponseBodyDataRecords setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeIpcsResponseBodyDataRecords setVap(String vap) {
            this.vap = vap;
            return this;
        }
        public String getVap() {
            return this.vap;
        }

        public DescribeIpcsResponseBodyDataRecords setCameraType(String cameraType) {
            this.cameraType = cameraType;
            return this;
        }
        public String getCameraType() {
            return this.cameraType;
        }

    }

    public static class DescribeIpcsResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("Records")
        public java.util.List<DescribeIpcsResponseBodyDataRecords> records;

        public static DescribeIpcsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpcsResponseBodyData self = new DescribeIpcsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeIpcsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeIpcsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeIpcsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeIpcsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public DescribeIpcsResponseBodyData setRecords(java.util.List<DescribeIpcsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeIpcsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
