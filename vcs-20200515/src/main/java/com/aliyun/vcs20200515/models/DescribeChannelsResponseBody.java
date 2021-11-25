// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeChannelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeChannelsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelsResponseBody self = new DescribeChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeChannelsResponseBody setData(DescribeChannelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeChannelsResponseBodyData getData() {
        return this.data;
    }

    public DescribeChannelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChannelsResponseBodyDataRecords extends TeaModel {
        @NameInMap("AudioEnable")
        public String audioEnable;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("DeviceDirection")
        public String deviceDirection;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceIp")
        public String deviceIp;

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

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("DeviceSubType")
        public String deviceSubType;

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

        @NameInMap("ModifyTime")
        public String modifyTime;

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

        @NameInMap("Password")
        public String password;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerPort")
        public String serverPort;

        @NameInMap("ServerRealm")
        public String serverRealm;

        @NameInMap("StreamAction")
        public String streamAction;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("Vap")
        public String vap;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribeChannelsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelsResponseBodyDataRecords self = new DescribeChannelsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeChannelsResponseBodyDataRecords setAudioEnable(String audioEnable) {
            this.audioEnable = audioEnable;
            return this;
        }
        public String getAudioEnable() {
            return this.audioEnable;
        }

        public DescribeChannelsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeChannelsResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeChannelsResponseBodyDataRecords setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceDirection(String deviceDirection) {
            this.deviceDirection = deviceDirection;
            return this;
        }
        public String getDeviceDirection() {
            return this.deviceDirection;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceRate(String deviceRate) {
            this.deviceRate = deviceRate;
            return this;
        }
        public String getDeviceRate() {
            return this.deviceRate;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceResolution(String deviceResolution) {
            this.deviceResolution = deviceResolution;
            return this;
        }
        public String getDeviceResolution() {
            return this.deviceResolution;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceSite(String deviceSite) {
            this.deviceSite = deviceSite;
            return this;
        }
        public String getDeviceSite() {
            return this.deviceSite;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceSubType(String deviceSubType) {
            this.deviceSubType = deviceSubType;
            return this;
        }
        public String getDeviceSubType() {
            return this.deviceSubType;
        }

        public DescribeChannelsResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeChannelsResponseBodyDataRecords setEncodeFormat(String encodeFormat) {
            this.encodeFormat = encodeFormat;
            return this;
        }
        public String getEncodeFormat() {
            return this.encodeFormat;
        }

        public DescribeChannelsResponseBodyDataRecords setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public DescribeChannelsResponseBodyDataRecords setGovLength(String govLength) {
            this.govLength = govLength;
            return this;
        }
        public String getGovLength() {
            return this.govLength;
        }

        public DescribeChannelsResponseBodyDataRecords setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeChannelsResponseBodyDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public DescribeChannelsResponseBodyDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public DescribeChannelsResponseBodyDataRecords setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeChannelsResponseBodyDataRecords setOSDTimeEnable(String OSDTimeEnable) {
            this.OSDTimeEnable = OSDTimeEnable;
            return this;
        }
        public String getOSDTimeEnable() {
            return this.OSDTimeEnable;
        }

        public DescribeChannelsResponseBodyDataRecords setOSDTimeType(String OSDTimeType) {
            this.OSDTimeType = OSDTimeType;
            return this;
        }
        public String getOSDTimeType() {
            return this.OSDTimeType;
        }

        public DescribeChannelsResponseBodyDataRecords setOSDTimeX(String OSDTimeX) {
            this.OSDTimeX = OSDTimeX;
            return this;
        }
        public String getOSDTimeX() {
            return this.OSDTimeX;
        }

        public DescribeChannelsResponseBodyDataRecords setOSDTimeY(String OSDTimeY) {
            this.OSDTimeY = OSDTimeY;
            return this;
        }
        public String getOSDTimeY() {
            return this.OSDTimeY;
        }

        public DescribeChannelsResponseBodyDataRecords setParentDeviceId(String parentDeviceId) {
            this.parentDeviceId = parentDeviceId;
            return this;
        }
        public String getParentDeviceId() {
            return this.parentDeviceId;
        }

        public DescribeChannelsResponseBodyDataRecords setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeChannelsResponseBodyDataRecords setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeChannelsResponseBodyDataRecords setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeChannelsResponseBodyDataRecords setServerPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public String getServerPort() {
            return this.serverPort;
        }

        public DescribeChannelsResponseBodyDataRecords setServerRealm(String serverRealm) {
            this.serverRealm = serverRealm;
            return this;
        }
        public String getServerRealm() {
            return this.serverRealm;
        }

        public DescribeChannelsResponseBodyDataRecords setStreamAction(String streamAction) {
            this.streamAction = streamAction;
            return this;
        }
        public String getStreamAction() {
            return this.streamAction;
        }

        public DescribeChannelsResponseBodyDataRecords setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public DescribeChannelsResponseBodyDataRecords setVap(String vap) {
            this.vap = vap;
            return this;
        }
        public String getVap() {
            return this.vap;
        }

        public DescribeChannelsResponseBodyDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class DescribeChannelsResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeChannelsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("UnConfigList")
        public java.util.List<String> unConfigList;

        public static DescribeChannelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelsResponseBodyData self = new DescribeChannelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeChannelsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeChannelsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeChannelsResponseBodyData setRecords(java.util.List<DescribeChannelsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeChannelsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeChannelsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeChannelsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public DescribeChannelsResponseBodyData setUnConfigList(java.util.List<String> unConfigList) {
            this.unConfigList = unConfigList;
            return this;
        }
        public java.util.List<String> getUnConfigList() {
            return this.unConfigList;
        }

    }

}
