// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>Specifies whether Application-Layer Protocol Negotiation (ALPN) is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
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
     * <li><strong>HTTP1Only</strong></li>
     * <li><strong>HTTP2Only</strong></li>
     * <li><strong>HTTP2Preferred</strong></li>
     * <li><strong>HTTP2Optional</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP1Only</p>
     */
    @NameInMap("AlpnPolicy")
    public String alpnPolicy;

    /**
     * <p>The CA certificate list. Currently, you can add only one CA certificate.</p>
     * <blockquote>
     * <p>This parameter takes effect only for TCPSSL listeners.</p>
     * </blockquote>
     */
    @NameInMap("CaCertificateIds")
    public java.util.List<String> caCertificateIds;

    /**
     * <p>Specifies whether mutual authentication is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The server certificate list. Currently, you can add only one server certificate.</p>
     * <blockquote>
     * <p>This parameter takes effect only for TCPSSL listeners.</p>
     * </blockquote>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The maximum number of new connections per second that the listener can process in each zone (VIP). Valid values: <strong>0</strong> to <strong>1000000</strong>. <strong>0</strong> indicates that no limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>The end port of the all-port listener. Valid values: <strong>0</strong> to <strong>65535</strong>. The end port must be less than the start port.</p>
     * 
     * <strong>example:</strong>
     * <p>455</p>
     */
    @NameInMap("EndPort")
    public String endPort;

    /**
     * <p>The idle timeout period for connections. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The custom listener name.</p>
     * <p>The name must be 2 to 256 characters in length, and can contain Chinese characters and English letters. It can also contain digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>tcpssl_443</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The listener ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-bp1bpn0kn908w4nbw****@233</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The listener port. Valid values: <strong>0</strong> to <strong>65535</strong>. <strong>0</strong> indicates that all-port listening is used. If you set this parameter to <strong>0</strong>, you must configure <strong>StartPort</strong> and <strong>EndPort</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>233</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol. Valid values: <strong>TCP</strong>, <strong>UDP</strong>, and <strong>TCPSSL</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>TCPSSL</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The current status of the listener. Valid values:</p>
     * <ul>
     * <li><p><strong>Provisioning</strong>: The listener is being created.</p>
     * </li>
     * <li><p><strong>Running</strong>: The listener is running.</p>
     * </li>
     * <li><p><strong>Configuring</strong>: The listener is being configured.</p>
     * </li>
     * <li><p><strong>Stopping</strong>: The listener is being stopped.</p>
     * </li>
     * <li><p><strong>Stopped</strong>: The listener is stopped.</p>
     * </li>
     * <li><p><strong>Starting</strong>: The listener is being started.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The listener is being deleted.</p>
     * </li>
     * <li><p><strong>Deleted</strong>: The listener is deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ListenerStatus")
    public String listenerStatus;

    /**
     * <p>The Network Load Balancer (NLB) instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-83ckzc8d4xlp8o****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The maximum segment size (MSS) of a TCP packet. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>. <strong>0</strong> indicates that the MSS value of user TCP packets is not modified.</p>
     * <blockquote>
     * <p>This field is supported only by TCP and TCPSSL listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>166</p>
     */
    @NameInMap("Mss")
    public Integer mss;

    /**
     * <p>Specifies whether to use the Proxy Protocol to pass the client source IP address to backend servers. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
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
    public GetListenerAttributeResponseBodyProxyProtocolV2Config proxyProtocolV2Config;

    /**
     * <p>The region ID of the Network Load Balancer (NLB) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether to enable the second-level monitoring feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecSensorEnabled")
    public Boolean secSensorEnabled;

    /**
     * <p>The security policy ID. System security policies and custom security policies are supported.</p>
     * <ul>
     * <li>System policies: <strong>tls_cipher_policy_1_0</strong> (default), <strong>tls_cipher_policy_1_1</strong>, <strong>tls_cipher_policy_1_2</strong>, <strong>tls_cipher_policy_1_2_strict</strong>, and <strong>tls_cipher_policy_1_2_strict_with_1_3</strong>.</li>
     * <li>Custom security policies: Enter the ID of the custom security policy.<ul>
     * <li>To create a custom policy, see <a href="https://help.aliyun.com/document_detail/445901.html">CreateSecurityPolicy</a>.</li>
     * <li>To query security policies, see <a href="https://help.aliyun.com/document_detail/445900.html">ListSecurityPolicy</a>.</li>
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
     * <p>The server group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-ppdpc14gdm3x4o****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The start port of the all-port listener. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>233</p>
     */
    @NameInMap("StartPort")
    public String startPort;

    /**
     * <p>The tag list.</p>
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

    public GetListenerAttributeResponseBody setProxyProtocolV2Config(GetListenerAttributeResponseBodyProxyProtocolV2Config proxyProtocolV2Config) {
        this.proxyProtocolV2Config = proxyProtocolV2Config;
        return this;
    }
    public GetListenerAttributeResponseBodyProxyProtocolV2Config getProxyProtocolV2Config() {
        return this.proxyProtocolV2Config;
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

    public static class GetListenerAttributeResponseBodyProxyProtocolV2Config extends TeaModel {
        /**
         * <p>Specifies whether to use the Proxy Protocol to pass the CN-ID to backend servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ppv2CnIdEnabled")
        public Boolean ppv2CnIdEnabled;

        /**
         * <p>Specifies whether to use the Proxy Protocol to pass the PrivateLinkEpId to backend servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
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
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
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
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ppv2VpcIdEnabled")
        public Boolean ppv2VpcIdEnabled;

        public static GetListenerAttributeResponseBodyProxyProtocolV2Config build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyProxyProtocolV2Config self = new GetListenerAttributeResponseBodyProxyProtocolV2Config();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyProxyProtocolV2Config setPpv2CnIdEnabled(Boolean ppv2CnIdEnabled) {
            this.ppv2CnIdEnabled = ppv2CnIdEnabled;
            return this;
        }
        public Boolean getPpv2CnIdEnabled() {
            return this.ppv2CnIdEnabled;
        }

        public GetListenerAttributeResponseBodyProxyProtocolV2Config setPpv2PrivateLinkEpIdEnabled(Boolean ppv2PrivateLinkEpIdEnabled) {
            this.ppv2PrivateLinkEpIdEnabled = ppv2PrivateLinkEpIdEnabled;
            return this;
        }
        public Boolean getPpv2PrivateLinkEpIdEnabled() {
            return this.ppv2PrivateLinkEpIdEnabled;
        }

        public GetListenerAttributeResponseBodyProxyProtocolV2Config setPpv2PrivateLinkEpsIdEnabled(Boolean ppv2PrivateLinkEpsIdEnabled) {
            this.ppv2PrivateLinkEpsIdEnabled = ppv2PrivateLinkEpsIdEnabled;
            return this;
        }
        public Boolean getPpv2PrivateLinkEpsIdEnabled() {
            return this.ppv2PrivateLinkEpsIdEnabled;
        }

        public GetListenerAttributeResponseBodyProxyProtocolV2Config setPpv2VpcIdEnabled(Boolean ppv2VpcIdEnabled) {
            this.ppv2VpcIdEnabled = ppv2VpcIdEnabled;
            return this;
        }
        public Boolean getPpv2VpcIdEnabled() {
            return this.ppv2VpcIdEnabled;
        }

    }

    public static class GetListenerAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-cus-tag-4</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
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
