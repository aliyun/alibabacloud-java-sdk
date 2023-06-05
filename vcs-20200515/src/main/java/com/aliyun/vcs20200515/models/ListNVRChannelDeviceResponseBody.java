// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListNVRChannelDeviceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListNVRChannelDeviceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public String total;

    public static ListNVRChannelDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNVRChannelDeviceResponseBody self = new ListNVRChannelDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNVRChannelDeviceResponseBody setData(java.util.List<ListNVRChannelDeviceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNVRChannelDeviceResponseBodyData> getData() {
        return this.data;
    }

    public ListNVRChannelDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNVRChannelDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNVRChannelDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNVRChannelDeviceResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class ListNVRChannelDeviceResponseBodyData extends TeaModel {
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

        @NameInMap("SampleName")
        public String sampleName;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("Vap")
        public String vap;

        public static ListNVRChannelDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNVRChannelDeviceResponseBodyData self = new ListNVRChannelDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNVRChannelDeviceResponseBodyData setComptureStatus(String comptureStatus) {
            this.comptureStatus = comptureStatus;
            return this;
        }
        public String getComptureStatus() {
            return this.comptureStatus;
        }

        public ListNVRChannelDeviceResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListNVRChannelDeviceResponseBodyData setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListNVRChannelDeviceResponseBodyData setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public ListNVRChannelDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListNVRChannelDeviceResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListNVRChannelDeviceResponseBodyData setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListNVRChannelDeviceResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListNVRChannelDeviceResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListNVRChannelDeviceResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListNVRChannelDeviceResponseBodyData setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public ListNVRChannelDeviceResponseBodyData setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public ListNVRChannelDeviceResponseBodyData setVap(String vap) {
            this.vap = vap;
            return this;
        }
        public String getVap() {
            return this.vap;
        }

    }

}
