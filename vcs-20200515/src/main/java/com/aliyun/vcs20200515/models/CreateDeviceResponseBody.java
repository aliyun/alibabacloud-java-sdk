// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public CreateDeviceResponseBodyData data;

    public static CreateDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceResponseBody self = new CreateDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDeviceResponseBody setData(CreateDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceResponseBodyData getData() {
        return this.data;
    }

    public static class CreateDeviceResponseBodyDataSubDeviceSipInfo extends TeaModel {
        @NameInMap("SundayCaptureStrategy")
        public String sundayCaptureStrategy;

        @NameInMap("MondayCaptureStrategy")
        public String mondayCaptureStrategy;

        @NameInMap("ChannelGbId")
        public String channelGbId;

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

        public static CreateDeviceResponseBodyDataSubDeviceSipInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceResponseBodyDataSubDeviceSipInfo self = new CreateDeviceResponseBodyDataSubDeviceSipInfo();
            return TeaModel.build(map, self);
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setSundayCaptureStrategy(String sundayCaptureStrategy) {
            this.sundayCaptureStrategy = sundayCaptureStrategy;
            return this;
        }
        public String getSundayCaptureStrategy() {
            return this.sundayCaptureStrategy;
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setMondayCaptureStrategy(String mondayCaptureStrategy) {
            this.mondayCaptureStrategy = mondayCaptureStrategy;
            return this;
        }
        public String getMondayCaptureStrategy() {
            return this.mondayCaptureStrategy;
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setChannelGbId(String channelGbId) {
            this.channelGbId = channelGbId;
            return this;
        }
        public String getChannelGbId() {
            return this.channelGbId;
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setFridayCaptureStrategy(String fridayCaptureStrategy) {
            this.fridayCaptureStrategy = fridayCaptureStrategy;
            return this;
        }
        public String getFridayCaptureStrategy() {
            return this.fridayCaptureStrategy;
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setTuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
            this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
            return this;
        }
        public String getTuesdayCaptureStrategy() {
            return this.tuesdayCaptureStrategy;
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setWednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
            this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
            return this;
        }
        public String getWednesdayCaptureStrategy() {
            return this.wednesdayCaptureStrategy;
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setThursdayCaptureStrategy(String thursdayCaptureStrategy) {
            this.thursdayCaptureStrategy = thursdayCaptureStrategy;
            return this;
        }
        public String getThursdayCaptureStrategy() {
            return this.thursdayCaptureStrategy;
        }

        public CreateDeviceResponseBodyDataSubDeviceSipInfo setSaturdayCaptureStrategy(String saturdayCaptureStrategy) {
            this.saturdayCaptureStrategy = saturdayCaptureStrategy;
            return this;
        }
        public String getSaturdayCaptureStrategy() {
            return this.saturdayCaptureStrategy;
        }

    }

    public static class CreateDeviceResponseBodyData extends TeaModel {
        @NameInMap("SipReaml")
        public String sipReaml;

        @NameInMap("SipIp")
        public String sipIp;

        @NameInMap("SipDeviceGbId")
        public String sipDeviceGbId;

        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("SipPort")
        public String sipPort;

        @NameInMap("SipGbId")
        public String sipGbId;

        @NameInMap("SipPassword")
        public String sipPassword;

        @NameInMap("SubDeviceSipInfo")
        public java.util.List<CreateDeviceResponseBodyDataSubDeviceSipInfo> subDeviceSipInfo;

        public static CreateDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceResponseBodyData self = new CreateDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceResponseBodyData setSipReaml(String sipReaml) {
            this.sipReaml = sipReaml;
            return this;
        }
        public String getSipReaml() {
            return this.sipReaml;
        }

        public CreateDeviceResponseBodyData setSipIp(String sipIp) {
            this.sipIp = sipIp;
            return this;
        }
        public String getSipIp() {
            return this.sipIp;
        }

        public CreateDeviceResponseBodyData setSipDeviceGbId(String sipDeviceGbId) {
            this.sipDeviceGbId = sipDeviceGbId;
            return this;
        }
        public String getSipDeviceGbId() {
            return this.sipDeviceGbId;
        }

        public CreateDeviceResponseBodyData setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public CreateDeviceResponseBodyData setSipPort(String sipPort) {
            this.sipPort = sipPort;
            return this;
        }
        public String getSipPort() {
            return this.sipPort;
        }

        public CreateDeviceResponseBodyData setSipGbId(String sipGbId) {
            this.sipGbId = sipGbId;
            return this;
        }
        public String getSipGbId() {
            return this.sipGbId;
        }

        public CreateDeviceResponseBodyData setSipPassword(String sipPassword) {
            this.sipPassword = sipPassword;
            return this;
        }
        public String getSipPassword() {
            return this.sipPassword;
        }

        public CreateDeviceResponseBodyData setSubDeviceSipInfo(java.util.List<CreateDeviceResponseBodyDataSubDeviceSipInfo> subDeviceSipInfo) {
            this.subDeviceSipInfo = subDeviceSipInfo;
            return this;
        }
        public java.util.List<CreateDeviceResponseBodyDataSubDeviceSipInfo> getSubDeviceSipInfo() {
            return this.subDeviceSipInfo;
        }

    }

}
