// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables ALPN.</p>
     * </li>
     * <li><p><strong>false</strong>: disables ALPN.</p>
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
     * <p>You must configure this parameter after ALPN is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1Only</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AlpnPolicy")
    public String alpnPolicy;

    /**
     * <p>The CA certificates. You can add only one CA certificate.</p>
     * <blockquote>
     * <p>This parameter takes effect only for TCPSSL listeners.</p>
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
     * <p>The server certificates. You can add only one server certificate.</p>
     * <blockquote>
     * <p>This parameter takes effect only for TCPSSL listeners.</p>
     * </blockquote>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>The maximum number of new connections per second that the listener can process in each zone (VIP). Valid values: <strong>0</strong> to <strong>1000000</strong>. A value of <strong>0</strong> indicates that no limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without updating the listener. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The idle connection timeout period. Unit: seconds.</p>
     * <ul>
     * <li><p>If the listener is a <strong>TCP</strong> or <strong>TCPSSL</strong> listener, valid values are <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>.</p>
     * </li>
     * <li><p>If the listener is a <strong>UDP</strong> listener, valid values are <strong>10</strong> to <strong>90</strong>. Default value: <strong>90</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The custom name of the listener.</p>
     * <p>The name must be 2 to 256 characters in length, and can contain Chinese characters, English letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>tcpssl_443</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The listener instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-bp1bpn0kn908w4nbw****@443</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The maximum segment size (MSS) of a TCP packet. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>. A value of <strong>0</strong> indicates that the MSS value of user TCP packets is not modified. This parameter is supported only by TCP and TCPSSL listeners.</p>
     * 
     * <strong>example:</strong>
     * <p>344</p>
     */
    @NameInMap("Mss")
    public Integer mss;

    /**
     * <p>Specifies whether to use the Proxy Protocol to pass the client source IP address to backend servers. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * <li><p><strong>false</strong>: no.</p>
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
    public String proxyProtocolV2ConfigShrink;

    /**
     * <p>The ID of the region where the Network Load Balancer (NLB) instance is deployed. </p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to retrieve the region ID.</p>
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
     * <li><p><strong>false</strong>: disables second-level monitoring.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecSensorEnabled")
    public Boolean secSensorEnabled;

    /**
     * <p>The ID of the security policy.</p>
     * <blockquote>
     * <p>This parameter takes effect only for TCPSSL listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_1</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The ID of the server group.</p>
     * <blockquote>
     * <ul>
     * <li>If the listener is a <strong>TCP</strong> listener, you can select a server group whose backend protocol is <strong>TCP</strong> or <strong>TCP_UDP</strong>. You cannot select a server group whose backend protocol is <strong>UDP</strong>.</li>
     * <li>If the listener is a <strong>UDP</strong> listener, you can select a server group whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>. You cannot select a server group whose backend protocol is <strong>TCP</strong>.</li>
     * <li>If the listener is a <strong>TCPSSL</strong> listener, you can select a server group whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is disabled</strong>. You cannot select a server group whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is enabled</strong>, or a server group whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sgp-ppdpc14gdm3x4o****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static UpdateListenerAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerAttributeShrinkRequest self = new UpdateListenerAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateListenerAttributeShrinkRequest setAlpnEnabled(Boolean alpnEnabled) {
        this.alpnEnabled = alpnEnabled;
        return this;
    }
    public Boolean getAlpnEnabled() {
        return this.alpnEnabled;
    }

    public UpdateListenerAttributeShrinkRequest setAlpnPolicy(String alpnPolicy) {
        this.alpnPolicy = alpnPolicy;
        return this;
    }
    public String getAlpnPolicy() {
        return this.alpnPolicy;
    }

    public UpdateListenerAttributeShrinkRequest setCaCertificateIds(java.util.List<String> caCertificateIds) {
        this.caCertificateIds = caCertificateIds;
        return this;
    }
    public java.util.List<String> getCaCertificateIds() {
        return this.caCertificateIds;
    }

    public UpdateListenerAttributeShrinkRequest setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public UpdateListenerAttributeShrinkRequest setCertificateIds(java.util.List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
    public java.util.List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public UpdateListenerAttributeShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateListenerAttributeShrinkRequest setCps(Integer cps) {
        this.cps = cps;
        return this;
    }
    public Integer getCps() {
        return this.cps;
    }

    public UpdateListenerAttributeShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateListenerAttributeShrinkRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public UpdateListenerAttributeShrinkRequest setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public UpdateListenerAttributeShrinkRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateListenerAttributeShrinkRequest setMss(Integer mss) {
        this.mss = mss;
        return this;
    }
    public Integer getMss() {
        return this.mss;
    }

    public UpdateListenerAttributeShrinkRequest setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
        this.proxyProtocolEnabled = proxyProtocolEnabled;
        return this;
    }
    public Boolean getProxyProtocolEnabled() {
        return this.proxyProtocolEnabled;
    }

    public UpdateListenerAttributeShrinkRequest setProxyProtocolV2ConfigShrink(String proxyProtocolV2ConfigShrink) {
        this.proxyProtocolV2ConfigShrink = proxyProtocolV2ConfigShrink;
        return this;
    }
    public String getProxyProtocolV2ConfigShrink() {
        return this.proxyProtocolV2ConfigShrink;
    }

    public UpdateListenerAttributeShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateListenerAttributeShrinkRequest setSecSensorEnabled(Boolean secSensorEnabled) {
        this.secSensorEnabled = secSensorEnabled;
        return this;
    }
    public Boolean getSecSensorEnabled() {
        return this.secSensorEnabled;
    }

    public UpdateListenerAttributeShrinkRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public UpdateListenerAttributeShrinkRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
