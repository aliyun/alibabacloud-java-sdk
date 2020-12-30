// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListNVRChannelDeviceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public String total;

    @NameInMap("Data")
    public java.util.List<ListNVRChannelDeviceResponseBodyData> data;

    public static ListNVRChannelDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNVRChannelDeviceResponseBody self = new ListNVRChannelDeviceResponseBody();
        return TeaModel.build(map, self);
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

    public ListNVRChannelDeviceResponseBody setData(java.util.List<ListNVRChannelDeviceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNVRChannelDeviceResponseBodyData> getData() {
        return this.data;
    }

    public static class ListNVRChannelDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("ComptureStatus")
        public String comptureStatus;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("SampleName")
        public String sampleName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("CorpId")
        public String corpId;

        public static ListNVRChannelDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNVRChannelDeviceResponseBodyData self = new ListNVRChannelDeviceResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListNVRChannelDeviceResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListNVRChannelDeviceResponseBodyData setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListNVRChannelDeviceResponseBodyData setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListNVRChannelDeviceResponseBodyData setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public ListNVRChannelDeviceResponseBodyData setComptureStatus(String comptureStatus) {
            this.comptureStatus = comptureStatus;
            return this;
        }
        public String getComptureStatus() {
            return this.comptureStatus;
        }

        public ListNVRChannelDeviceResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListNVRChannelDeviceResponseBodyData setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public ListNVRChannelDeviceResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListNVRChannelDeviceResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

}
