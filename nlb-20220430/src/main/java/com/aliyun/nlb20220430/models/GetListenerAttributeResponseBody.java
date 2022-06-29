// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    // 用户uid
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AlpnEnabled")
    public Boolean alpnEnabled;

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

    @NameInMap("Code")
    public String code;

    @NameInMap("Cps")
    public Integer cps;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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

    @NameInMap("Message")
    public String message;

    @NameInMap("ProxyProtocolEnabled")
    public String proxyProtocolEnabled;

    // 业务location
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecSensorEnabled")
    public String secSensorEnabled;

    // Tclssl监听的安全策略
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    // servergroupId
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    @NameInMap("Success")
    public Boolean success;

    public static GetListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeResponseBody self = new GetListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListenerAttributeResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetListenerAttributeResponseBody setAlpnEnabled(Boolean alpnEnabled) {
        this.alpnEnabled = alpnEnabled;
        return this;
    }
    public Boolean getAlpnEnabled() {
        return this.alpnEnabled;
    }

    public GetListenerAttributeResponseBody setAlpnPolicy(String alpnPolicy) {
        this.alpnPolicy = alpnPolicy;
        return this;
    }
    public String getAlpnPolicy() {
        return this.alpnPolicy;
    }

    public GetListenerAttributeResponseBody setCaCertificateIds(java.util.List<String> caCertificateIds) {
        this.caCertificateIds = caCertificateIds;
        return this;
    }
    public java.util.List<String> getCaCertificateIds() {
        return this.caCertificateIds;
    }

    public GetListenerAttributeResponseBody setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public GetListenerAttributeResponseBody setCertificateIds(java.util.List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
    public java.util.List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public GetListenerAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetListenerAttributeResponseBody setCps(Integer cps) {
        this.cps = cps;
        return this;
    }
    public Integer getCps() {
        return this.cps;
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

    public GetListenerAttributeResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public GetListenerAttributeResponseBody setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public GetListenerAttributeResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public GetListenerAttributeResponseBody setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public GetListenerAttributeResponseBody setListenerStatus(String listenerStatus) {
        this.listenerStatus = listenerStatus;
        return this;
    }
    public String getListenerStatus() {
        return this.listenerStatus;
    }

    public GetListenerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public GetListenerAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetListenerAttributeResponseBody setProxyProtocolEnabled(String proxyProtocolEnabled) {
        this.proxyProtocolEnabled = proxyProtocolEnabled;
        return this;
    }
    public String getProxyProtocolEnabled() {
        return this.proxyProtocolEnabled;
    }

    public GetListenerAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListenerAttributeResponseBody setSecSensorEnabled(String secSensorEnabled) {
        this.secSensorEnabled = secSensorEnabled;
        return this;
    }
    public String getSecSensorEnabled() {
        return this.secSensorEnabled;
    }

    public GetListenerAttributeResponseBody setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public GetListenerAttributeResponseBody setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public GetListenerAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
