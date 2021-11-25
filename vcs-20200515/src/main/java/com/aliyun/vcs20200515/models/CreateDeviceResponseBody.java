// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDeviceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceResponseBody self = new CreateDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeviceResponseBody setData(CreateDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceResponseBodyData getData() {
        return this.data;
    }

    public CreateDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDeviceResponseBodyDataSubDeviceInfo extends TeaModel {
        @NameInMap("SubDeviceId")
        public String subDeviceId;

        public static CreateDeviceResponseBodyDataSubDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceResponseBodyDataSubDeviceInfo self = new CreateDeviceResponseBodyDataSubDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreateDeviceResponseBodyDataSubDeviceInfo setSubDeviceId(String subDeviceId) {
            this.subDeviceId = subDeviceId;
            return this;
        }
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

    }

    public static class CreateDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

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

        @NameInMap("SubDeviceInfo")
        public java.util.List<CreateDeviceResponseBodyDataSubDeviceInfo> subDeviceInfo;

        public static CreateDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceResponseBodyData self = new CreateDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CreateDeviceResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDeviceResponseBodyData setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public CreateDeviceResponseBodyData setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public CreateDeviceResponseBodyData setServerPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public String getServerPort() {
            return this.serverPort;
        }

        public CreateDeviceResponseBodyData setServerRealm(String serverRealm) {
            this.serverRealm = serverRealm;
            return this;
        }
        public String getServerRealm() {
            return this.serverRealm;
        }

        public CreateDeviceResponseBodyData setSubDeviceInfo(java.util.List<CreateDeviceResponseBodyDataSubDeviceInfo> subDeviceInfo) {
            this.subDeviceInfo = subDeviceInfo;
            return this;
        }
        public java.util.List<CreateDeviceResponseBodyDataSubDeviceInfo> getSubDeviceInfo() {
            return this.subDeviceInfo;
        }

    }

}
