// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetInstanceResponseBodyData data;

    // 错误详情
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        // 描述说明
        @NameInMap("desc")
        public String desc;

        // 实例 ID
        @NameInMap("instanceId")
        public String instanceId;

        // 自定义参数
        @NameInMap("params")
        public String params;

        // 代理实例 IP
        @NameInMap("proxyIp")
        public String proxyIp;

        // 代理实例私钥
        @NameInMap("proxyPrivateKey")
        public String proxyPrivateKey;

        // 代理实例端口
        @NameInMap("proxyRemotePort")
        public String proxyRemotePort;

        // 远端实例私钥
        @NameInMap("remotePrivateKey")
        public String remotePrivateKey;

        // 远端实例公钥
        @NameInMap("remotePubKey")
        public String remotePubKey;

        // session ID
        @NameInMap("sessionId")
        public String sessionId;

        // 来源
        @NameInMap("source")
        public String source;

        // session状态
        @NameInMap("status")
        public String status;

        // 实例类型
        @NameInMap("type")
        public String type;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public GetInstanceResponseBodyData setProxyIp(String proxyIp) {
            this.proxyIp = proxyIp;
            return this;
        }
        public String getProxyIp() {
            return this.proxyIp;
        }

        public GetInstanceResponseBodyData setProxyPrivateKey(String proxyPrivateKey) {
            this.proxyPrivateKey = proxyPrivateKey;
            return this;
        }
        public String getProxyPrivateKey() {
            return this.proxyPrivateKey;
        }

        public GetInstanceResponseBodyData setProxyRemotePort(String proxyRemotePort) {
            this.proxyRemotePort = proxyRemotePort;
            return this;
        }
        public String getProxyRemotePort() {
            return this.proxyRemotePort;
        }

        public GetInstanceResponseBodyData setRemotePrivateKey(String remotePrivateKey) {
            this.remotePrivateKey = remotePrivateKey;
            return this;
        }
        public String getRemotePrivateKey() {
            return this.remotePrivateKey;
        }

        public GetInstanceResponseBodyData setRemotePubKey(String remotePubKey) {
            this.remotePubKey = remotePubKey;
            return this;
        }
        public String getRemotePubKey() {
            return this.remotePubKey;
        }

        public GetInstanceResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetInstanceResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
