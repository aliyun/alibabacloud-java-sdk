// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class GetSessionResponseBody extends TeaModel {
    // ErrorCode
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetSessionResponseBodyData data;

    // 错误信息
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static GetSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionResponseBody self = new GetSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSessionResponseBody setData(GetSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSessionResponseBodyData getData() {
        return this.data;
    }

    public GetSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSessionResponseBodyData extends TeaModel {
        // 本地实例ID
        @NameInMap("localInstanceId")
        public String localInstanceId;

        // 代理实例ID
        @NameInMap("proxyId")
        public String proxyId;

        // 代理实例公网IP
        @NameInMap("proxyIp")
        public String proxyIp;

        // 代理实例端口
        @NameInMap("proxyRemotePort")
        public String proxyRemotePort;

        // 远端实例ID
        @NameInMap("remoteInstanceId")
        public String remoteInstanceId;

        // session ID
        @NameInMap("sessionId")
        public String sessionId;

        // session 状态
        @NameInMap("status")
        public String status;

        public static GetSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSessionResponseBodyData self = new GetSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSessionResponseBodyData setLocalInstanceId(String localInstanceId) {
            this.localInstanceId = localInstanceId;
            return this;
        }
        public String getLocalInstanceId() {
            return this.localInstanceId;
        }

        public GetSessionResponseBodyData setProxyId(String proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public String getProxyId() {
            return this.proxyId;
        }

        public GetSessionResponseBodyData setProxyIp(String proxyIp) {
            this.proxyIp = proxyIp;
            return this;
        }
        public String getProxyIp() {
            return this.proxyIp;
        }

        public GetSessionResponseBodyData setProxyRemotePort(String proxyRemotePort) {
            this.proxyRemotePort = proxyRemotePort;
            return this;
        }
        public String getProxyRemotePort() {
            return this.proxyRemotePort;
        }

        public GetSessionResponseBodyData setRemoteInstanceId(String remoteInstanceId) {
            this.remoteInstanceId = remoteInstanceId;
            return this;
        }
        public String getRemoteInstanceId() {
            return this.remoteInstanceId;
        }

        public GetSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetSessionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
