// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    /**
     * <p>A list of listeners.</p>
     */
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, it indicates that no next query is to be sent.</p>
     * <p>*   If a value of **NextToken** is returned, the value is the token used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
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

    public static class ListListenersResponseBodyListenersProxyProtocolV2Config extends TeaModel {
        /**
         * <p>Indicates whether the Proxy protocol passes the PrivateLinkEpId parameter to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Ppv2PrivateLinkEpIdEnabled")
        public Boolean ppv2PrivateLinkEpIdEnabled;

        /**
         * <p>Indicates whether the Proxy protocol passes the PrivateLinkEpsId parameter to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        public Boolean ppv2PrivateLinkEpsIdEnabled;

        /**
         * <p>Indicates whether the Proxy protocol passes the VpcId parameter to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Ppv2VpcIdEnabled")
        public Boolean ppv2VpcIdEnabled;

        public static ListListenersResponseBodyListenersProxyProtocolV2Config build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersProxyProtocolV2Config self = new ListListenersResponseBodyListenersProxyProtocolV2Config();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersProxyProtocolV2Config setPpv2PrivateLinkEpIdEnabled(Boolean ppv2PrivateLinkEpIdEnabled) {
            this.ppv2PrivateLinkEpIdEnabled = ppv2PrivateLinkEpIdEnabled;
            return this;
        }
        public Boolean getPpv2PrivateLinkEpIdEnabled() {
            return this.ppv2PrivateLinkEpIdEnabled;
        }

        public ListListenersResponseBodyListenersProxyProtocolV2Config setPpv2PrivateLinkEpsIdEnabled(Boolean ppv2PrivateLinkEpsIdEnabled) {
            this.ppv2PrivateLinkEpsIdEnabled = ppv2PrivateLinkEpsIdEnabled;
            return this;
        }
        public Boolean getPpv2PrivateLinkEpsIdEnabled() {
            return this.ppv2PrivateLinkEpsIdEnabled;
        }

        public ListListenersResponseBodyListenersProxyProtocolV2Config setPpv2VpcIdEnabled(Boolean ppv2VpcIdEnabled) {
            this.ppv2VpcIdEnabled = ppv2VpcIdEnabled;
            return this;
        }
        public Boolean getPpv2VpcIdEnabled() {
            return this.ppv2VpcIdEnabled;
        }

    }

    public static class ListListenersResponseBodyListenersTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListListenersResponseBodyListenersTags build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersTags self = new ListListenersResponseBodyListenersTags();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListListenersResponseBodyListenersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListListenersResponseBodyListeners extends TeaModel {
        /**
         * <p>Indicates whether Application-Layer Protocol Negotiation (ALPN) is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("AlpnEnabled")
        public Boolean alpnEnabled;

        /**
         * <p>The ALPN policy. Valid values:</p>
         * <br>
         * <p>*   **HTTP1Only**</p>
         * <p>*   **HTTP2Only**</p>
         * <p>*   **HTTP2Preferred**</p>
         * <p>*   **HTTP2Optional**</p>
         */
        @NameInMap("AlpnPolicy")
        public String alpnPolicy;

        /**
         * <p>A list of CA certificates.</p>
         * <br>
         * <p>>  This parameter takes effect only for listeners that use SSL over TCP.</p>
         */
        @NameInMap("CaCertificateIds")
        public java.util.List<String> caCertificateIds;

        /**
         * <p>Indicates whether mutual authentication is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("CaEnabled")
        public Boolean caEnabled;

        /**
         * <p>The server certificate.</p>
         * <br>
         * <p>>  This parameter takes effect only for listeners that use SSL over TCP.</p>
         */
        @NameInMap("CertificateIds")
        public java.util.List<String> certificateIds;

        /**
         * <p>The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**. **0** indicates that the number of connections is unlimited.</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The last port in the listener port range.</p>
         */
        @NameInMap("EndPort")
        public String endPort;

        /**
         * <p>The timeout period of idle connections. Unit: seconds. Valid values: **1** to **900**. Default value: **900**.</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>The name of the listener.</p>
         * <br>
         * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).</p>
         */
        @NameInMap("ListenerDescription")
        public String listenerDescription;

        /**
         * <p>The listener ID.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The information about the listener port of your server.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The listener protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The status of the listener. Valid values:</p>
         * <br>
         * <p>*   **Provisioning**: The listener is being created.</p>
         * <p>*   **Running**: The listener is running.</p>
         * <p>*   **Configuring**: The listener is being configured.</p>
         * <p>*   **Stopping**: The listener is being stopped.</p>
         * <p>*   **Stopped**: The listener is stopped.</p>
         * <p>*   **Starting**: The listener is being started.</p>
         * <p>*   **Deleting**: The listener is being deleted.</p>
         * <p>*   **Deleted**: The listener is deleted.</p>
         */
        @NameInMap("ListenerStatus")
        public String listenerStatus;

        /**
         * <p>The CLB instance ID.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The size of the largest TCP packet segment. Unit: bytes. Valid values: **0** to **1500**. **0** indicates that the Mss value of TCP packets remains unchanged.</p>
         * <br>
         * <p>>  This parameter takes effect only for listeners that use SSL over TCP.</p>
         */
        @NameInMap("Mss")
        public Integer mss;

        /**
         * <p>Indicates whether the Proxy protocol passes source client IP addresses to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ProxyProtocolEnabled")
        public Boolean proxyProtocolEnabled;

        /**
         * <p>Indicates whether the Proxy protocol passes the VpcId, PrivateLinkEpId, and PrivateLinkEpsId parameters to backend servers.</p>
         */
        @NameInMap("ProxyProtocolV2Config")
        public ListListenersResponseBodyListenersProxyProtocolV2Config proxyProtocolV2Config;

        /**
         * <p>The region ID of the NLB instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether fine-grained monitoring is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("SecSensorEnabled")
        public Boolean secSensorEnabled;

        /**
         * <p>The ID of the security policy.</p>
         * <br>
         * <p>>  This parameter takes effect only for listeners that use SSL over TCP.</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The server group ID.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The first port in the listener port range.</p>
         */
        @NameInMap("StartPort")
        public String startPort;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListListenersResponseBodyListenersTags> tags;

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

        public ListListenersResponseBodyListeners setProxyProtocolV2Config(ListListenersResponseBodyListenersProxyProtocolV2Config proxyProtocolV2Config) {
            this.proxyProtocolV2Config = proxyProtocolV2Config;
            return this;
        }
        public ListListenersResponseBodyListenersProxyProtocolV2Config getProxyProtocolV2Config() {
            return this.proxyProtocolV2Config;
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

        public ListListenersResponseBodyListeners setTags(java.util.List<ListListenersResponseBodyListenersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersTags> getTags() {
            return this.tags;
        }

    }

}
