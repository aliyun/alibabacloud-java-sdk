// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateScanDeviceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateScanDeviceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static CreateScanDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScanDeviceResponseBody self = new CreateScanDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScanDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateScanDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScanDeviceResponseBody setData(CreateScanDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateScanDeviceResponseBodyData getData() {
        return this.data;
    }

    public CreateScanDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateScanDeviceResponseBodyDataSubDeviceSipInfo extends TeaModel {
        @NameInMap("SundayCaptureStrategy")
        public String sundayCaptureStrategy;

        @NameInMap("ChannelGbId")
        public String channelGbId;

        @NameInMap("MondayCaptureStrategy")
        public String mondayCaptureStrategy;

        @NameInMap("FridayCaptureStrategy")
        public String fridayCaptureStrategy;

        @NameInMap("TuesdayCaptureStrategy")
        public String tuesdayCaptureStrategy;

        @NameInMap("WednesdayCaptureStrategy")
        public String wednesdayCaptureStrategy;

        @NameInMap("ThursdayCaptureStrategy")
        public String thursdayCaptureStrategy;

        @NameInMap("SaturdayCaptureStrategy")
        public String saturdayCaptureStrategy;

        public static CreateScanDeviceResponseBodyDataSubDeviceSipInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateScanDeviceResponseBodyDataSubDeviceSipInfo self = new CreateScanDeviceResponseBodyDataSubDeviceSipInfo();
            return TeaModel.build(map, self);
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setSundayCaptureStrategy(String sundayCaptureStrategy) {
            this.sundayCaptureStrategy = sundayCaptureStrategy;
            return this;
        }
        public String getSundayCaptureStrategy() {
            return this.sundayCaptureStrategy;
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setChannelGbId(String channelGbId) {
            this.channelGbId = channelGbId;
            return this;
        }
        public String getChannelGbId() {
            return this.channelGbId;
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setMondayCaptureStrategy(String mondayCaptureStrategy) {
            this.mondayCaptureStrategy = mondayCaptureStrategy;
            return this;
        }
        public String getMondayCaptureStrategy() {
            return this.mondayCaptureStrategy;
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setFridayCaptureStrategy(String fridayCaptureStrategy) {
            this.fridayCaptureStrategy = fridayCaptureStrategy;
            return this;
        }
        public String getFridayCaptureStrategy() {
            return this.fridayCaptureStrategy;
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setTuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
            this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
            return this;
        }
        public String getTuesdayCaptureStrategy() {
            return this.tuesdayCaptureStrategy;
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setWednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
            this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
            return this;
        }
        public String getWednesdayCaptureStrategy() {
            return this.wednesdayCaptureStrategy;
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setThursdayCaptureStrategy(String thursdayCaptureStrategy) {
            this.thursdayCaptureStrategy = thursdayCaptureStrategy;
            return this;
        }
        public String getThursdayCaptureStrategy() {
            return this.thursdayCaptureStrategy;
        }

        public CreateScanDeviceResponseBodyDataSubDeviceSipInfo setSaturdayCaptureStrategy(String saturdayCaptureStrategy) {
            this.saturdayCaptureStrategy = saturdayCaptureStrategy;
            return this;
        }
        public String getSaturdayCaptureStrategy() {
            return this.saturdayCaptureStrategy;
        }

    }

    public static class CreateScanDeviceResponseBodyData extends TeaModel {
        @NameInMap("SipIp")
        public String sipIp;

        @NameInMap("SipReaml")
        public String sipReaml;

        @NameInMap("SipDeviceGbId")
        public String sipDeviceGbId;

        @NameInMap("SipPort")
        public String sipPort;

        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("SipGbId")
        public String sipGbId;

        @NameInMap("SipPassword")
        public String sipPassword;

        @NameInMap("SubDeviceSipInfo")
        public java.util.List<CreateScanDeviceResponseBodyDataSubDeviceSipInfo> subDeviceSipInfo;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("CorpId")
        public String corpId;

        public static CreateScanDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateScanDeviceResponseBodyData self = new CreateScanDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateScanDeviceResponseBodyData setSipIp(String sipIp) {
            this.sipIp = sipIp;
            return this;
        }
        public String getSipIp() {
            return this.sipIp;
        }

        public CreateScanDeviceResponseBodyData setSipReaml(String sipReaml) {
            this.sipReaml = sipReaml;
            return this;
        }
        public String getSipReaml() {
            return this.sipReaml;
        }

        public CreateScanDeviceResponseBodyData setSipDeviceGbId(String sipDeviceGbId) {
            this.sipDeviceGbId = sipDeviceGbId;
            return this;
        }
        public String getSipDeviceGbId() {
            return this.sipDeviceGbId;
        }

        public CreateScanDeviceResponseBodyData setSipPort(String sipPort) {
            this.sipPort = sipPort;
            return this;
        }
        public String getSipPort() {
            return this.sipPort;
        }

        public CreateScanDeviceResponseBodyData setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public CreateScanDeviceResponseBodyData setSipGbId(String sipGbId) {
            this.sipGbId = sipGbId;
            return this;
        }
        public String getSipGbId() {
            return this.sipGbId;
        }

        public CreateScanDeviceResponseBodyData setSipPassword(String sipPassword) {
            this.sipPassword = sipPassword;
            return this;
        }
        public String getSipPassword() {
            return this.sipPassword;
        }

        public CreateScanDeviceResponseBodyData setSubDeviceSipInfo(java.util.List<CreateScanDeviceResponseBodyDataSubDeviceSipInfo> subDeviceSipInfo) {
            this.subDeviceSipInfo = subDeviceSipInfo;
            return this;
        }
        public java.util.List<CreateScanDeviceResponseBodyDataSubDeviceSipInfo> getSubDeviceSipInfo() {
            return this.subDeviceSipInfo;
        }

        public CreateScanDeviceResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public CreateScanDeviceResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

}
