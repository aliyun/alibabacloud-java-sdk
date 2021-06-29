// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateNewDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public CreateNewDeviceResponseBodyData data;

    public static CreateNewDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNewDeviceResponseBody self = new CreateNewDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNewDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNewDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNewDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNewDeviceResponseBody setData(CreateNewDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateNewDeviceResponseBodyData getData() {
        return this.data;
    }

    public static class CreateNewDeviceResponseBodyDataSubDeviceInfo extends TeaModel {
        @NameInMap("ChannelDeviceId")
        public String channelDeviceId;

        public static CreateNewDeviceResponseBodyDataSubDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateNewDeviceResponseBodyDataSubDeviceInfo self = new CreateNewDeviceResponseBodyDataSubDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreateNewDeviceResponseBodyDataSubDeviceInfo setChannelDeviceId(String channelDeviceId) {
            this.channelDeviceId = channelDeviceId;
            return this;
        }
        public String getChannelDeviceId() {
            return this.channelDeviceId;
        }

    }

    public static class CreateNewDeviceResponseBodyData extends TeaModel {
        @NameInMap("SipRealm")
        public String sipRealm;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("ServerPort")
        public String serverPort;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Password")
        public String password;

        @NameInMap("SubDeviceInfo")
        public java.util.List<CreateNewDeviceResponseBodyDataSubDeviceInfo> subDeviceInfo;

        public static CreateNewDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateNewDeviceResponseBodyData self = new CreateNewDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateNewDeviceResponseBodyData setSipRealm(String sipRealm) {
            this.sipRealm = sipRealm;
            return this;
        }
        public String getSipRealm() {
            return this.sipRealm;
        }

        public CreateNewDeviceResponseBodyData setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public CreateNewDeviceResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CreateNewDeviceResponseBodyData setServerPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public String getServerPort() {
            return this.serverPort;
        }

        public CreateNewDeviceResponseBodyData setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public CreateNewDeviceResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateNewDeviceResponseBodyData setSubDeviceInfo(java.util.List<CreateNewDeviceResponseBodyDataSubDeviceInfo> subDeviceInfo) {
            this.subDeviceInfo = subDeviceInfo;
            return this;
        }
        public java.util.List<CreateNewDeviceResponseBodyDataSubDeviceInfo> getSubDeviceInfo() {
            return this.subDeviceInfo;
        }

    }

}
