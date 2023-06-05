// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListNVRDeviceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListNVRDeviceResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public String total;

    public static ListNVRDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNVRDeviceResponseBody self = new ListNVRDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNVRDeviceResponseBody setData(java.util.List<ListNVRDeviceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNVRDeviceResponseBodyData> getData() {
        return this.data;
    }

    public ListNVRDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNVRDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNVRDeviceResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class ListNVRDeviceResponseBodyData extends TeaModel {
        @NameInMap("AccessQuota")
        public String accessQuota;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("ComptureStatus")
        public String comptureStatus;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RegistrationTime")
        public String registrationTime;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("Type")
        public String type;

        public static ListNVRDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNVRDeviceResponseBodyData self = new ListNVRDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNVRDeviceResponseBodyData setAccessQuota(String accessQuota) {
            this.accessQuota = accessQuota;
            return this;
        }
        public String getAccessQuota() {
            return this.accessQuota;
        }

        public ListNVRDeviceResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListNVRDeviceResponseBodyData setComptureStatus(String comptureStatus) {
            this.comptureStatus = comptureStatus;
            return this;
        }
        public String getComptureStatus() {
            return this.comptureStatus;
        }

        public ListNVRDeviceResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListNVRDeviceResponseBodyData setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListNVRDeviceResponseBodyData setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public ListNVRDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListNVRDeviceResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListNVRDeviceResponseBodyData setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListNVRDeviceResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListNVRDeviceResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListNVRDeviceResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListNVRDeviceResponseBodyData setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        public ListNVRDeviceResponseBodyData setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public ListNVRDeviceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
