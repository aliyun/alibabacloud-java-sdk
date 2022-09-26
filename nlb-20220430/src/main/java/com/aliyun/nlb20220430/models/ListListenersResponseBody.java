// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersResponseBody self = new ListListenersResponseBody();
        return TeaModel.build(map, self);
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

    public ListListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenersResponseBodyListeners extends TeaModel {
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
        public Boolean proxyProtocolEnabled;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecSensorEnabled")
        public Boolean secSensorEnabled;

        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("StartPort")
        public String startPort;

        public static ListListenersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListeners self = new ListListenersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListeners setAlpnEnabled(Boolean alpnEnabled) {
            this.alpnEnabled = alpnEnabled;
            return this;
        }
        public Boolean getAlpnEnabled() {
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

        public ListListenersResponseBodyListeners setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public ListListenersResponseBodyListeners setEndPort(String endPort) {
            this.endPort = endPort;
            return this;
        }
        public String getEndPort() {
            return this.endPort;
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

        public ListListenersResponseBodyListeners setMss(Integer mss) {
            this.mss = mss;
            return this;
        }
        public Integer getMss() {
            return this.mss;
        }

        public ListListenersResponseBodyListeners setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
            this.proxyProtocolEnabled = proxyProtocolEnabled;
            return this;
        }
        public Boolean getProxyProtocolEnabled() {
            return this.proxyProtocolEnabled;
        }

        public ListListenersResponseBodyListeners setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListListenersResponseBodyListeners setSecSensorEnabled(Boolean secSensorEnabled) {
            this.secSensorEnabled = secSensorEnabled;
            return this;
        }
        public Boolean getSecSensorEnabled() {
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

        public ListListenersResponseBodyListeners setStartPort(String startPort) {
            this.startPort = startPort;
            return this;
        }
        public String getStartPort() {
            return this.startPort;
        }

    }

}
