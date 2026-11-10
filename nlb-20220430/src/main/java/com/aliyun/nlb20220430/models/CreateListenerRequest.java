// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable ALPN. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables ALPN.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables ALPN.</p>
     * </li>
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
     * <li><strong>HTTP1Only</strong>: negotiates only HTTP/1.x. The priority is HTTP/1.1 &gt; HTTP/1.0.</li>
     * <li><strong>HTTP2Only</strong>: negotiates only HTTP/2.</li>
     * <li><strong>HTTP2Optional</strong>: prefers HTTP/1.x but also accepts HTTP/2. The priority is HTTP/1.1 &gt; HTTP/1.0 &gt; HTTP/2.</li>
     * <li><strong>HTTP2Preferred</strong>: prefers HTTP/2 but also accepts HTTP/1.x. The priority is HTTP/2 &gt; HTTP/1.1 &gt; HTTP/1.0.</li>
     * </ul>
     * <blockquote>
     * <p>You must configure this parameter after <strong>AlpnEnabled</strong> is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1Only</p>
     */
    @NameInMap("AlpnPolicy")
    public String alpnPolicy;

    /**
     * <p>The CA certificate list. This parameter takes effect only for TCPSSL listeners.</p>
     * <blockquote>
     * <p>Currently, you can add only one CA certificate.</p>
     * </blockquote>
     */
    @NameInMap("CaCertificateIds")
    public java.util.List<String> caCertificateIds;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables mutual authentication.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables mutual authentication.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The server certificate list. This parameter takes effect only for TCPSSL listeners.</p>
     * <blockquote>
     * <p>Currently, you can add only one server certificate.</p>
     * </blockquote>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The limit on the number of new connections processed per second by the listener in each zone (VIP). Valid values: <strong>0</strong> to <strong>1000000</strong>. <strong>0</strong> indicates that no limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a precheck request without creating the listener. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): sends a regular request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The end port for all-port listening. Valid values: <strong>1</strong> to <strong>65535</strong>.
     * The end port must be greater than the start port.</p>
     * <blockquote>
     * <p>You must configure this parameter when <strong>ListenerPort</strong> is set to <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>566</p>
     */
    @NameInMap("EndPort")
    public Integer endPort;

    /**
     * <p>The idle timeout period for connections. Unit: seconds.</p>
     * <ul>
     * <li><p>If <strong>ListenerProtocol</strong> is set to <strong>TCP</strong> or <strong>TCPSSL</strong>, the valid values are <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>.</p>
     * </li>
     * <li><p>If <strong>ListenerProtocol</strong> is set to <strong>UDP</strong>, the valid values are <strong>10</strong> to <strong>90</strong>. Default value: <strong>90</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The custom listener name.</p>
     * <p>The name must be 2 to 256 characters in length, and can contain Chinese characters, English letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>tcp_80</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The listener port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <p><strong>0</strong>: indicates that the all-port feature is used. If you set this parameter to <strong>0</strong>, you must configure <strong>StartPort</strong> and <strong>EndPort</strong>.</p>
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
     * <p>The Network Load Balancer (NLB) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-83ckzc8d4xlp8o****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The maximum segment size (MSS) of TCP packets. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>.
     * <strong>0</strong>: indicates that the MSS value of user TCP packets is not modified.</p>
     * <blockquote>
     * <p>This parameter is supported only by TCP and TCPSSL listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("Mss")
    public Integer mss;

    /**
     * <p>Specifies whether to use the Proxy Protocol to pass the client source IP address to backend servers. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the feature.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProxyProtocolEnabled")
    public Boolean proxyProtocolEnabled;

    /**
     * <p>The configuration for passing the VpcId, PrivateLinkEpId, and PrivateLinkEpsId information to backend servers by using the Proxy Protocol.</p>
     */
    @NameInMap("ProxyProtocolV2Config")
    public CreateListenerRequestProxyProtocolV2Config proxyProtocolV2Config;

    /**
     * <p>The region ID of the Network Load Balancer (NLB) instance. </p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable second-level monitoring. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables second-level monitoring.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables second-level monitoring.</p>
     * </li>
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
     * <li>System policies: <strong>tls_cipher_policy_1_0</strong> (default), <strong>tls_cipher_policy_1_1</strong>, <strong>tls_cipher_policy_1_2</strong>, <strong>tls_cipher_policy_1_2_strict</strong>, and <strong>tls_cipher_policy_1_2_strict_with_1_3</strong>.</li>
     * <li>Custom security policies: Enter the ID of a custom security policy.<ul>
     * <li>To create a custom policy, refer to <a href="https://help.aliyun.com/document_detail/445901.html">CreateSecurityPolicy</a>.</li>
     * <li>To query security policies, refer to <a href="https://help.aliyun.com/document_detail/445900.html">ListSecurityPolicy</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for TCPSSL listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_0</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The ID of the server group.</p>
     * <blockquote>
     * <ul>
     * <li>If <strong>ListenerProtocol</strong> is set to <strong>TCP</strong>, the listener supports server groups whose backend protocol is <strong>TCP</strong> or <strong>TCP_UDP</strong>, but does not support server groups whose backend protocol is <strong>UDP</strong>.</li>
     * <li>If <strong>ListenerProtocol</strong> is set to <strong>UDP</strong>, the listener supports server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>, but does not support server groups whose backend protocol is <strong>TCP</strong>.</li>
     * <li>If <strong>ListenerProtocol</strong> is set to <strong>TCPSSL</strong>, the listener supports server groups whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is disabled</strong>. It does not support server groups whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is enabled</strong>, or server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sgp-ppdpc14gdm3x4o****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The start port for all-port listening. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <blockquote>
     * <p>You must configure this parameter when <strong>ListenerPort</strong> is set to <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>244</p>
     */
    @NameInMap("StartPort")
    public Integer startPort;

    /**
     * <p>The list of tags.</p>
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
         * <p>Ppv2CnIdEnabled</p>
         */
        @NameInMap("Ppv2CnIdEnabled")
        public Boolean ppv2CnIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy Protocol to pass the Ppv2PrivateLinkEpId to backend servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ppv2PrivateLinkEpIdEnabled")
        public Boolean ppv2PrivateLinkEpIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy Protocol to pass the PrivateLinkEpsId to backend servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        public Boolean ppv2PrivateLinkEpsIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy Protocol to pass the VpcId to backend servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the feature.</p>
         * </li>
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

        public CreateListenerRequestProxyProtocolV2Config setPpv2CnIdEnabled(Boolean ppv2CnIdEnabled) {
            this.ppv2CnIdEnabled = ppv2CnIdEnabled;
            return this;
        }
        public Boolean getPpv2CnIdEnabled() {
            return this.ppv2CnIdEnabled;
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
         * <p>The tag key. The key can be up to 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>. Supported characters include letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
         * <p>You can add up to 20 tags in a single call.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>. Supported characters include letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
         * <p>You can add up to 20 tags in a single call.</p>
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
