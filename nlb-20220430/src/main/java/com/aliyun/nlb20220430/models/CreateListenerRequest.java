// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("AlpnEnabled")
    public Boolean alpnEnabled;

    /**
     * <p>The ALPN policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   HTTP1Only</p>
     * <p>*   HTTP2Only</p>
     * <p>*   HTTP2Preferred</p>
     * <p>*   HTTP2Optional</p>
     */
    @NameInMap("AlpnPolicy")
    public String alpnPolicy;

    /**
     * <p>The certificate authority (CA) certificates. This parameter takes effect only for listeners that use SSL over TCP.</p>
     * <br>
     * <p>> You can specify only one CA certificate.</p>
     */
    @NameInMap("CaCertificateIds")
    public java.util.List<String> caCertificateIds;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The server certificates. This parameter takes effect only for listeners that use SSL over TCP.</p>
     * <br>
     * <p>> You can specify only one server certificate.</p>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**. **0** specifies that the number of connections is unlimited.</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>Specifies whether to perform only a dry run without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The last port in the listener port range. Valid values: **0** to **65535**. The number of the last port must be greater than the number of the first port.</p>
     * <br>
     * <p>> This parameter is required when **ListenerPort** is set to **0**.</p>
     */
    @NameInMap("EndPort")
    public Integer endPort;

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
     * <p>The listener port. Valid values: **0** to **65535**.</p>
     * <br>
     * <p>If you set the value to **0**, the listener listens by port range. If you set the value to **0**, you must specify **StartPort** and **EndPort**.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the Network Load Balancer (NLB) instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The maximum size of a TCP segment. Unit: bytes. Valid values: **0** to **1500**. **0** specifies that the maximum segment size remains unchanged.</p>
     * <br>
     * <p>> This parameter is supported only by TCP listeners and listeners that use SSL over TCP.</p>
     */
    @NameInMap("Mss")
    public Integer mss;

    /**
     * <p>Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("ProxyProtocolEnabled")
    public Boolean proxyProtocolEnabled;

    /**
     * <p>Specifies that the Proxy protocol passes the VpcId, PrivateLinkEpId, and PrivateLinkEpsId parameters to backend servers.</p>
     */
    @NameInMap("ProxyProtocolV2Config")
    public CreateListenerRequestProxyProtocolV2Config proxyProtocolV2Config;

    /**
     * <p>The region ID of the NLB instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable fine-grained monitoring. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("SecSensorEnabled")
    public Boolean secSensorEnabled;

    /**
     * <p>The security policy ID. System security policies and custom security policies are supported.</p>
     * <br>
     * <p>Valid values: **tls_cipher_policy\_1\_0** (default), **tls_cipher_policy\_1\_1**, **tls_cipher_policy\_1\_2**, **tls_cipher_policy\_1\_2\_strict**, and **tls_cipher_policy\_1\_2\_strict_with\_1\_3**.</p>
     * <br>
     * <p>> This parameter takes effect only for listeners that use SSL over TCP.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The server group ID.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The first port in the listener port range. Valid values: **0** to **65535**.</p>
     * <br>
     * <p>> This parameter is required when **ListenerPort** is set to **0**.</p>
     */
    @NameInMap("StartPort")
    public Integer startPort;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateListenerRequestTag> tag;

    public static CreateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerRequest self = new CreateListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateListenerRequest setAlpnEnabled(Boolean alpnEnabled) {
        this.alpnEnabled = alpnEnabled;
        return this;
    }
    public Boolean getAlpnEnabled() {
        return this.alpnEnabled;
    }

    public CreateListenerRequest setAlpnPolicy(String alpnPolicy) {
        this.alpnPolicy = alpnPolicy;
        return this;
    }
    public String getAlpnPolicy() {
        return this.alpnPolicy;
    }

    public CreateListenerRequest setCaCertificateIds(java.util.List<String> caCertificateIds) {
        this.caCertificateIds = caCertificateIds;
        return this;
    }
    public java.util.List<String> getCaCertificateIds() {
        return this.caCertificateIds;
    }

    public CreateListenerRequest setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public CreateListenerRequest setCertificateIds(java.util.List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
    public java.util.List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public CreateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateListenerRequest setCps(Integer cps) {
        this.cps = cps;
        return this;
    }
    public Integer getCps() {
        return this.cps;
    }

    public CreateListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateListenerRequest setEndPort(Integer endPort) {
        this.endPort = endPort;
        return this;
    }
    public Integer getEndPort() {
        return this.endPort;
    }

    public CreateListenerRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateListenerRequest setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public CreateListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateListenerRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public CreateListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateListenerRequest setMss(Integer mss) {
        this.mss = mss;
        return this;
    }
    public Integer getMss() {
        return this.mss;
    }

    public CreateListenerRequest setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
        this.proxyProtocolEnabled = proxyProtocolEnabled;
        return this;
    }
    public Boolean getProxyProtocolEnabled() {
        return this.proxyProtocolEnabled;
    }

    public CreateListenerRequest setProxyProtocolV2Config(CreateListenerRequestProxyProtocolV2Config proxyProtocolV2Config) {
        this.proxyProtocolV2Config = proxyProtocolV2Config;
        return this;
    }
    public CreateListenerRequestProxyProtocolV2Config getProxyProtocolV2Config() {
        return this.proxyProtocolV2Config;
    }

    public CreateListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateListenerRequest setSecSensorEnabled(Boolean secSensorEnabled) {
        this.secSensorEnabled = secSensorEnabled;
        return this;
    }
    public Boolean getSecSensorEnabled() {
        return this.secSensorEnabled;
    }

    public CreateListenerRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public CreateListenerRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public CreateListenerRequest setStartPort(Integer startPort) {
        this.startPort = startPort;
        return this;
    }
    public Integer getStartPort() {
        return this.startPort;
    }

    public CreateListenerRequest setTag(java.util.List<CreateListenerRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateListenerRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateListenerRequestProxyProtocolV2Config extends TeaModel {
        /**
         * <p>Specifies whether to use the Proxy protocol to pass the Ppv2PrivateLinkEpId parameter to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("Ppv2PrivateLinkEpIdEnabled")
        public Boolean ppv2PrivateLinkEpIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy protocol to pass the PrivateLinkEpsId parameter to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        public Boolean ppv2PrivateLinkEpsIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy protocol to pass the VpcId parameter to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("Ppv2VpcIdEnabled")
        public Boolean ppv2VpcIdEnabled;

        public static CreateListenerRequestProxyProtocolV2Config build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestProxyProtocolV2Config self = new CreateListenerRequestProxyProtocolV2Config();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestProxyProtocolV2Config setPpv2PrivateLinkEpIdEnabled(Boolean ppv2PrivateLinkEpIdEnabled) {
            this.ppv2PrivateLinkEpIdEnabled = ppv2PrivateLinkEpIdEnabled;
            return this;
        }
        public Boolean getPpv2PrivateLinkEpIdEnabled() {
            return this.ppv2PrivateLinkEpIdEnabled;
        }

        public CreateListenerRequestProxyProtocolV2Config setPpv2PrivateLinkEpsIdEnabled(Boolean ppv2PrivateLinkEpsIdEnabled) {
            this.ppv2PrivateLinkEpsIdEnabled = ppv2PrivateLinkEpsIdEnabled;
            return this;
        }
        public Boolean getPpv2PrivateLinkEpsIdEnabled() {
            return this.ppv2PrivateLinkEpsIdEnabled;
        }

        public CreateListenerRequestProxyProtocolV2Config setPpv2VpcIdEnabled(Boolean ppv2VpcIdEnabled) {
            this.ppv2VpcIdEnabled = ppv2VpcIdEnabled;
            return this;
        }
        public Boolean getPpv2VpcIdEnabled() {
            return this.ppv2VpcIdEnabled;
        }

    }

    public static class CreateListenerRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can add up to 20 tags in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateListenerRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestTag self = new CreateListenerRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateListenerRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
