// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AlpnEnabled")
    public Boolean alpnEnabled;

    /**
     * <p>The ALPN policy. Valid values:</p>
     * <ul>
     * <li><strong>HTTP1Only</strong>: uses only HTTP 1.x. The priority of HTTP 1.1 is higher than that of HTTP 1.0.</li>
     * <li><strong>HTTP2Only</strong>: uses only HTTP 2.0.</li>
     * <li><strong>HTTP2Optional</strong>: preferentially uses HTTP 1.x over HTTP 2.0. The priority of HTTP 1.1 is higher than that of HTTP 1.0, and the priority of HTTP 1.0 is higher than that of HTTP 2.0.</li>
     * <li><strong>HTTP2Preferred</strong>: preferentially uses HTTP 2.0 over HTTP 1.x. The priority of HTTP 2.0 is higher than that of HTTP 1.1, and the priority of HTTP 1.1 is higher than that of HTTP 1.0.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if <strong>AlpnEnabled</strong> is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1Only</p>
     */
    @NameInMap("AlpnPolicy")
    public String alpnPolicy;

    /**
     * <p>The certificate authority (CA) certificate. This parameter is supported only by TCLSSL listeners.</p>
     * <blockquote>
     * <p> You can specify only one CA certificate.</p>
     * </blockquote>
     */
    @NameInMap("CaCertificateIds")
    public java.util.List<String> caCertificateIds;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The server certificate. This parameter is supported only by TCLSSL listeners.</p>
     * <blockquote>
     * <p> You can specify only one server certificate.</p>
     * </blockquote>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The maximum number of new connections per second supported by the listener in each zone (virtual IP address). Valid values: <strong>0</strong> to <strong>1000000</strong>. <strong>0</strong> indicates that the number of connections is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>Specifies whether to perform a dry run, without sending the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The last port in the listener port range. Valid values: <strong>0</strong> to <strong>65535</strong>. The port number of the last port must be greater than the port number of the first port.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>ListenerPort</strong> is set to <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>566</p>
     */
    @NameInMap("EndPort")
    public Integer endPort;

    /**
     * <p>The timeout period for idle connections. Unit: seconds.</p>
     * <ul>
     * <li>If you set <strong>ListenerProtocol</strong> to <strong>TCP</strong> or <strong>TCPSSL</strong>, this parameter can be set to a value ranging from <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>.</li>
     * <li>If <strong>ListenerProtocol</strong> is set to <strong>UDP</strong>, this parameter can be set to a value ranging from <strong>10</strong> to <strong>20</strong>. Default value: <strong>20</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The name of the listener.</p>
     * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>tcp_80</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The listener port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <p>If you set this parameter to <strong>0</strong>, the listener listens by port range. If you set this parameter to <strong>0</strong>, you must also set the <strong>StartPort</strong> and <strong>EndPort</strong> parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol. Valid values: <strong>TCP</strong>, <strong>UDP</strong>, and <strong>TCPSSL</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the NLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-83ckzc8d4xlp8o****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The size of the largest TCP packet segment. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>. <strong>0</strong> indicates that the maximum segment size (MSS) value of TCP packets remains unchanged.</p>
     * <blockquote>
     * <p> This parameter takes effect only for TCP and TCPSSL listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("Mss")
    public Integer mss;

    /**
     * <p>Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProxyProtocolEnabled")
    public Boolean proxyProtocolEnabled;

    /**
     * <p>Specifies whether to use the Proxy protocol to pass the VpcId, PrivateLinkEpId, and PrivateLinkEpsId parameters to backend servers.</p>
     */
    @NameInMap("ProxyProtocolV2Config")
    public CreateListenerRequestProxyProtocolV2Config proxyProtocolV2Config;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable fine-grained monitoring. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecSensorEnabled")
    public Boolean secSensorEnabled;

    /**
     * <p>The ID of the security policy. System security policies and custom security policies are supported.</p>
     * <ul>
     * <li><p>Valid values for system security policies: <strong>tls_cipher_policy_1_0</strong> (default), <strong>tls_cipher_policy_1_1</strong>, <strong>tls_cipher_policy_1_2</strong>, <strong>tls_cipher_policy_1_2_strict</strong>, and <strong>tls_cipher_policy_1_2_strict_with_1_3</strong>.</p>
     * </li>
     * <li><p>For a custom security policy, enter the policy ID.</p>
     * <ul>
     * <li>For information about creating a custom security policy, see <a href="https://help.aliyun.com/document_detail/445901.html">CreateSecurityPolicy</a>.</li>
     * <li>For information about querying security policies, see <a href="https://help.aliyun.com/document_detail/445900.html">ListSecurityPolicy</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only for TCPSSL listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_0</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The server group ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you set <strong>ListenerProtocol</strong> to <strong>TCP</strong>, you can associate the listener with server groups whose backend protocol is <strong>TCP</strong> or <strong>TCP_UDP</strong>. You cannot associate the listener with server groups whose backend protocol is <strong>UDP</strong>.</li>
     * <li>If you set <strong>ListenerProtocol</strong> to <strong>UDP</strong>, you can associate the listener with server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>. You cannot associate the listener with server groups whose backend protocol is <strong>TCP</strong>.</li>
     * <li>If you set <strong>ListenerProtocol</strong> to <strong>TCPSSL</strong>, you can associate the listener with server groups whose backend protocol is <strong>TCP</strong> and have <strong>client IP preservation disabled</strong>. You cannot associate the listener with server groups whose backend protocol is <strong>TCP</strong> and have <strong>client IP preservation enabled</strong> or server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sgp-ppdpc14gdm3x4o****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The first port in the listener port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>ListenerPort</strong> is set to <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>244</p>
     */
    @NameInMap("StartPort")
    public Integer startPort;

    /**
     * <p>The tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
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
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ppv2PrivateLinkEpIdEnabled")
        public Boolean ppv2PrivateLinkEpIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy protocol to pass the PrivateLinkEpsId parameter to backend servers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        public Boolean ppv2PrivateLinkEpsIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy protocol to pass the VpcId parameter to backend servers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The key of the tag. The tag key can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can contain letters, digits, and the following special characters: _ . : / = + - @</p>
         * <p>You can specify up to 20 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be up to 128 characters in length, cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can contain letters, digits, and the following special characters: _ . : / = + - @</p>
         * <p>You can specify up to 20 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
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
