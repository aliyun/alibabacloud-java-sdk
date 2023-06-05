// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultList")
    public java.util.List<AddAiotDevicesResponseBodyResultList> resultList;

    public static AddAiotDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAiotDevicesResponseBody self = new AddAiotDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAiotDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAiotDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAiotDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAiotDevicesResponseBody setResultList(java.util.List<AddAiotDevicesResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<AddAiotDevicesResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class AddAiotDevicesResponseBodyResultList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("Password")
        public String password;

        @NameInMap("ServerHost")
        public String serverHost;

        @NameInMap("ServerHostInternal")
        public String serverHostInternal;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerIpInternal")
        public String serverIpInternal;

        @NameInMap("ServerPort")
        public String serverPort;

        @NameInMap("ServerWssPort")
        public String serverWssPort;

        @NameInMap("UserId")
        public String userId;

        public static AddAiotDevicesResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotDevicesResponseBodyResultList self = new AddAiotDevicesResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public AddAiotDevicesResponseBodyResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddAiotDevicesResponseBodyResultList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public AddAiotDevicesResponseBodyResultList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddAiotDevicesResponseBodyResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddAiotDevicesResponseBodyResultList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public AddAiotDevicesResponseBodyResultList setServerHost(String serverHost) {
            this.serverHost = serverHost;
            return this;
        }
        public String getServerHost() {
            return this.serverHost;
        }

        public AddAiotDevicesResponseBodyResultList setServerHostInternal(String serverHostInternal) {
            this.serverHostInternal = serverHostInternal;
            return this;
        }
        public String getServerHostInternal() {
            return this.serverHostInternal;
        }

        public AddAiotDevicesResponseBodyResultList setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public AddAiotDevicesResponseBodyResultList setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public AddAiotDevicesResponseBodyResultList setServerIpInternal(String serverIpInternal) {
            this.serverIpInternal = serverIpInternal;
            return this;
        }
        public String getServerIpInternal() {
            return this.serverIpInternal;
        }

        public AddAiotDevicesResponseBodyResultList setServerPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public String getServerPort() {
            return this.serverPort;
        }

        public AddAiotDevicesResponseBodyResultList setServerWssPort(String serverWssPort) {
            this.serverWssPort = serverWssPort;
            return this;
        }
        public String getServerWssPort() {
            return this.serverWssPort;
        }

        public AddAiotDevicesResponseBodyResultList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
