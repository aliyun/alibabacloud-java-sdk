// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersResponseBody self = new ListListenersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListListenersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListListenersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListListenersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListListenersResponseBody setListeners(java.util.List<ListListenersResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListListenersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenersResponseBodyListeners extends TeaModel {
        // 用户uid
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AlpnEnabled")
        public String alpnEnabled;

        @NameInMap("AlpnPolicy")
        public String alpnPolicy;

        // ca 证书列表
        @NameInMap("CaCertificateIds")
        public java.util.List<String> caCertificateIds;

        @NameInMap("CaEnabled")
        public Boolean caEnabled;

        // server证书列表
        @NameInMap("CertificateIds")
        public java.util.List<String> certificateIds;

        // 空闲超时时间
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        // 监听描述
        @NameInMap("ListenerDescription")
        public String listenerDescription;

        // 自己生成后赋值
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

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("ProxyProtocolEnabled")
        public String proxyProtocolEnabled;

        // 业务location
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecSensorEnabled")
        public String secSensorEnabled;

        // Tclssl监听的安全策略
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        // servergroupId
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static ListListenersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListeners self = new ListListenersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListeners setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListListenersResponseBodyListeners setAlpnEnabled(String alpnEnabled) {
            this.alpnEnabled = alpnEnabled;
            return this;
        }
        public String getAlpnEnabled() {
            return this.alpnEnabled;
        }

        public ListListenersResponseBodyListeners setAlpnPolicy(String alpnPolicy) {
            this.alpnPolicy = alpnPolicy;
            return this;
        }
        public String getAlpnPolicy() {
            return this.alpnPolicy;
        }

        public ListListenersResponseBodyListeners setCaCertificateIds(java.util.List<String> caCertificateIds) {
            this.caCertificateIds = caCertificateIds;
            return this;
        }
        public java.util.List<String> getCaCertificateIds() {
            return this.caCertificateIds;
        }

        public ListListenersResponseBodyListeners setCaEnabled(Boolean caEnabled) {
            this.caEnabled = caEnabled;
            return this;
        }
        public Boolean getCaEnabled() {
            return this.caEnabled;
        }

        public ListListenersResponseBodyListeners setCertificateIds(java.util.List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }
        public java.util.List<String> getCertificateIds() {
            return this.certificateIds;
        }

        public ListListenersResponseBodyListeners setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public ListListenersResponseBodyListeners setListenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }
        public String getListenerDescription() {
            return this.listenerDescription;
        }

        public ListListenersResponseBodyListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListListenersResponseBodyListeners setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public ListListenersResponseBodyListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListListenersResponseBodyListeners setListenerStatus(String listenerStatus) {
            this.listenerStatus = listenerStatus;
            return this;
        }
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        public ListListenersResponseBodyListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListListenersResponseBodyListeners setProxyProtocolEnabled(String proxyProtocolEnabled) {
            this.proxyProtocolEnabled = proxyProtocolEnabled;
            return this;
        }
        public String getProxyProtocolEnabled() {
            return this.proxyProtocolEnabled;
        }

        public ListListenersResponseBodyListeners setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListListenersResponseBodyListeners setSecSensorEnabled(String secSensorEnabled) {
            this.secSensorEnabled = secSensorEnabled;
            return this;
        }
        public String getSecSensorEnabled() {
            return this.secSensorEnabled;
        }

        public ListListenersResponseBodyListeners setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListListenersResponseBodyListeners setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

}
