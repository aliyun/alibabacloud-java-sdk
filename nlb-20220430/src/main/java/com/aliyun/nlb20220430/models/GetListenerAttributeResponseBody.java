// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    @NameInMap("AlpnEnabled")
    public Boolean alpnEnabled;

    @NameInMap("AlpnPolicy")
    public String alpnPolicy;

    @NameInMap("CaCertificateIds")
    public java.util.List<String> caCertificateIds;

    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    @NameInMap("Cps")
    public Integer cps;

    @NameInMap("EndPort")
    public String endPort;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("ListenerDescription")
    public String listenerDescription;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    @NameInMap("ListenerStatus")
    public String listenerStatus;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("Mss")
    public Integer mss;

    @NameInMap("ProxyProtocolEnabled")
    public String proxyProtocolEnabled;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecSensorEnabled")
    public String secSensorEnabled;

    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    @NameInMap("ServerGroupId")
    public String serverGroupId;

    @NameInMap("StartPort")
    public String startPort;

    public static GetListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeResponseBody self = new GetListenerAttributeResponseBody();
        return TeaModel.build(map, self);
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

    public GetListenerAttributeResponseBody setCps(Integer cps) {
        this.cps = cps;
        return this;
    }
    public Integer getCps() {
        return this.cps;
    }

    public GetListenerAttributeResponseBody setEndPort(String endPort) {
        this.endPort = endPort;
        return this;
    }
    public String getEndPort() {
        return this.endPort;
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

    public GetListenerAttributeResponseBody setMss(Integer mss) {
        this.mss = mss;
        return this;
    }
    public Integer getMss() {
        return this.mss;
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

    public GetListenerAttributeResponseBody setStartPort(String startPort) {
        this.startPort = startPort;
        return this;
    }
    public String getStartPort() {
        return this.startPort;
    }

}
