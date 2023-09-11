// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Application-Layer Protocol Negotiation (ALPN) is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
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
     * <p>The CA certificates. Only one CA certificate is supported.</p>
     * <br>
     * <p>>  This parameter takes effect only for listeners that use SSL over TCP.</p>
     */
    @NameInMap("CaCertificateIds")
    public java.util.List<String> caCertificateIds;

    /**
     * <p>Indicates whether mutual authentication is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The server certificates. Only one server certificate is supported.</p>
     * <br>
     * <p>>  This parameter takes effect only for listeners that use SSL over TCP.</p>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**. **0** specifies that the number of connections is unlimited.</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>The last port in the listening port range. Valid values: **0** to **65535**. The number of the last port must be smaller than that of the first port.</p>
     */
    @NameInMap("EndPort")
    public String endPort;

    /**
     * <p>The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **900**.</p>
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
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The listening port. Valid values: **0** to **65535**. A value of **0** specifies all ports. If you set the value to **0**, you must also set the **StartPort** and **EndPort** parameters.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listening protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.</p>
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
     * <p>The ID of the NLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The size of the largest TCP segment. Unit: bytes. Valid values: **0** to **1500**. **0** specifies that the maximum segment size remains unchanged.</p>
     * <br>
     * <p>>  This parameter is supported only by listeners that use SSL over TCP.</p>
     */
    @NameInMap("Mss")
    public Integer mss;

    /**
     * <p>Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("ProxyProtocolEnabled")
    public Boolean proxyProtocolEnabled;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether fine-grained monitoring is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("SecSensorEnabled")
    public Boolean secSensorEnabled;

    /**
     * <p>The ID of the security policy. System security policies and custom security policies are supported.</p>
     * <br>
     * <p>Valid values: **tls_cipher_policy\_1\_0**, **tls_cipher_policy\_1\_1**, **tls_cipher_policy\_1\_2**, **tls_cipher_policy\_1\_2\_strict**, and **tls_cipher_policy\_1\_2\_strict_with\_1\_3**.</p>
     * <br>
     * <p>>  This parameter takes effect only for listeners that use SSL over TCP.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The ID of the server group.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The first port in the listening port range. Valid values: **0** to **65535**.</p>
     */
    @NameInMap("StartPort")
    public String startPort;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetListenerAttributeResponseBodyTags> tags;

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

    public GetListenerAttributeResponseBody setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
        this.proxyProtocolEnabled = proxyProtocolEnabled;
        return this;
    }
    public Boolean getProxyProtocolEnabled() {
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

    public GetListenerAttributeResponseBody setSecSensorEnabled(Boolean secSensorEnabled) {
        this.secSensorEnabled = secSensorEnabled;
        return this;
    }
    public Boolean getSecSensorEnabled() {
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

    public GetListenerAttributeResponseBody setTags(java.util.List<GetListenerAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetListenerAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetListenerAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The key of the tag that you want to remove. You can remove up to 20 tags in each call.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetListenerAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyTags self = new GetListenerAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetListenerAttributeResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
