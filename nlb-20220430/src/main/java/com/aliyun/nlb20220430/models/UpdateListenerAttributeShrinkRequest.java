// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("AlpnEnabled")
    public Boolean alpnEnabled;

    /**
     * <p>The ALPN policy. Valid values:</p>
     * <br>
     * <p>*   **HTTP1Only**: uses only HTTP 1.x. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0.</p>
     * <p>*   **HTTP2Only**: uses only HTTP 2.0.</p>
     * <p>*   **HTTP2Optional**: preferentially uses HTTP 1.x over HTTP 2.0. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0, and the priority of HTTP 1.0 is higher than the priority of HTTP 2.0.</p>
     * <p>*   **HTTP2Preferred**: preferentially uses HTTP 2.0 over HTTP 1.x. The priority of HTTP 2.0 is higher than the priority of HTTP 1.1, and the priority of HTTP 1.1 is higher than the priority of HTTP 1.0.</p>
     * <br>
     * <p>> This parameter is required if AlpnEnabled is set to true.</p>
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
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The server certificates.</p>
     */
    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
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
     * <p>Specifies whether only to precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request but does not update the configurations of the listener. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **900**.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>Enter a name for the listener.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The size of the largest TCP segment. Unit: bytes. Valid values: **0** to **1500**. **0** specifies that the maximum segment size remains unchanged. This parameter is supported only by listeners that use SSL over TCP.</p>
     */
    @NameInMap("Mss")
    public Integer mss;

    /**
     * <p>Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("ProxyProtocolEnabled")
    public Boolean proxyProtocolEnabled;

    @NameInMap("ProxyProtocolV2Config")
    public String proxyProtocolV2ConfigShrink;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable fine-grained monitoring. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
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
     * <p>The ID of the server group.</p>
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
