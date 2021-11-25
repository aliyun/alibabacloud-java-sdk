// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateScanDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateScanDeviceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateScanDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScanDeviceResponseBody self = new CreateScanDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScanDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateScanDeviceResponseBody setData(CreateScanDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateScanDeviceResponseBodyData getData() {
        return this.data;
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

    public static class CreateScanDeviceResponseBodyDataSubDeviceInfo extends TeaModel {
        @NameInMap("ChannelDeviceId")
        public String channelDeviceId;

        public static CreateScanDeviceResponseBodyDataSubDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateScanDeviceResponseBodyDataSubDeviceInfo self = new CreateScanDeviceResponseBodyDataSubDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreateScanDeviceResponseBodyDataSubDeviceInfo setChannelDeviceId(String channelDeviceId) {
            this.channelDeviceId = channelDeviceId;
            return this;
        }
        public String getChannelDeviceId() {
            return this.channelDeviceId;
        }

    }

    public static class CreateScanDeviceResponseBodyData extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceSn")
        public String deviceSn;

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

        @NameInMap("SipDeviceGbId")
        public String sipDeviceGbId;

        @NameInMap("SubDeviceInfo")
        public java.util.List<CreateScanDeviceResponseBodyDataSubDeviceInfo> subDeviceInfo;

        public static CreateScanDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateScanDeviceResponseBodyData self = new CreateScanDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateScanDeviceResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CreateScanDeviceResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CreateScanDeviceResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public CreateScanDeviceResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateScanDeviceResponseBodyData setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public CreateScanDeviceResponseBodyData setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public CreateScanDeviceResponseBodyData setServerPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public String getServerPort() {
            return this.serverPort;
        }

        public CreateScanDeviceResponseBodyData setServerRealm(String serverRealm) {
            this.serverRealm = serverRealm;
            return this;
        }
        public String getServerRealm() {
            return this.serverRealm;
        }

        public CreateScanDeviceResponseBodyData setSipDeviceGbId(String sipDeviceGbId) {
            this.sipDeviceGbId = sipDeviceGbId;
            return this;
        }
        public String getSipDeviceGbId() {
            return this.sipDeviceGbId;
        }

        public CreateScanDeviceResponseBodyData setSubDeviceInfo(java.util.List<CreateScanDeviceResponseBodyDataSubDeviceInfo> subDeviceInfo) {
            this.subDeviceInfo = subDeviceInfo;
            return this;
        }
        public java.util.List<CreateScanDeviceResponseBodyDataSubDeviceInfo> getSubDeviceInfo() {
            return this.subDeviceInfo;
        }

    }

}
