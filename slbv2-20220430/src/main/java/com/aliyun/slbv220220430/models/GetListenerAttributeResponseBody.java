// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetListenerAttributeResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeResponseBody self = new GetListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListenerAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetListenerAttributeResponseBody setData(GetListenerAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetListenerAttributeResponseBodyData getData() {
        return this.data;
    }

    public GetListenerAttributeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetListenerAttributeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetListenerAttributeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetListenerAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListenerAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetListenerAttributeResponseBodyData extends TeaModel {
        // 用户uid
        @NameInMap("AliUid")
        public Long aliUid;

        // ca 证书列表
        @NameInMap("CaCertificateIds")
        public java.util.List<String> caCertificateIds;

        @NameInMap("CaEnabled")
        public Boolean caEnabled;

        // server证书列表
        @NameInMap("CertificateIds")
        public java.util.List<String> certificateIds;

        // 创建时间
        @NameInMap("GmtCreated")
        public String gmtCreated;

        // 空闲超时时间
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        // 监听描述
        @NameInMap("ListenerDescription")
        public String listenerDescription;

        // 监听id
        @NameInMap("ListenerId")
        public String listenerId;

        // 监听端口
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        // 监听协议 (TCP, UDP, TCPSSL, GENEVE)
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        @NameInMap("ListenerStatus")
        public String listenerStatus;

        // 列表id
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        // 业务location
        @NameInMap("RegionId")
        public String regionId;

        // Tclssl监听的安全策略
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        // servergroupId
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static GetListenerAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyData self = new GetListenerAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetListenerAttributeResponseBodyData setCaCertificateIds(java.util.List<String> caCertificateIds) {
            this.caCertificateIds = caCertificateIds;
            return this;
        }
        public java.util.List<String> getCaCertificateIds() {
            return this.caCertificateIds;
        }

        public GetListenerAttributeResponseBodyData setCaEnabled(Boolean caEnabled) {
            this.caEnabled = caEnabled;
            return this;
        }
        public Boolean getCaEnabled() {
            return this.caEnabled;
        }

        public GetListenerAttributeResponseBodyData setCertificateIds(java.util.List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }
        public java.util.List<String> getCertificateIds() {
            return this.certificateIds;
        }

        public GetListenerAttributeResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetListenerAttributeResponseBodyData setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public GetListenerAttributeResponseBodyData setListenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }
        public String getListenerDescription() {
            return this.listenerDescription;
        }

        public GetListenerAttributeResponseBodyData setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public GetListenerAttributeResponseBodyData setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public GetListenerAttributeResponseBodyData setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public GetListenerAttributeResponseBodyData setListenerStatus(String listenerStatus) {
            this.listenerStatus = listenerStatus;
            return this;
        }
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        public GetListenerAttributeResponseBodyData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public GetListenerAttributeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetListenerAttributeResponseBodyData setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public GetListenerAttributeResponseBodyData setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

}
