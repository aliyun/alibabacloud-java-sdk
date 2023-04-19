// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("AlpnEnabled")
    public Boolean alpnEnabled;

    /**
     * <p>The ALPN policy.</p>
     */
    @NameInMap("AlpnPolicy")
    public String alpnPolicy;

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

    @NameInMap("CertificateIds")
    public java.util.List<String> certificateIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** of each API request may be different.</p>
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

    public static UpdateListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerAttributeRequest self = new UpdateListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateListenerAttributeRequest setAlpnEnabled(Boolean alpnEnabled) {
        this.alpnEnabled = alpnEnabled;
        return this;
    }
    public Boolean getAlpnEnabled() {
        return this.alpnEnabled;
    }

    public UpdateListenerAttributeRequest setAlpnPolicy(String alpnPolicy) {
        this.alpnPolicy = alpnPolicy;
        return this;
    }
    public String getAlpnPolicy() {
        return this.alpnPolicy;
    }

    public UpdateListenerAttributeRequest setCaCertificateIds(java.util.List<String> caCertificateIds) {
        this.caCertificateIds = caCertificateIds;
        return this;
    }
    public java.util.List<String> getCaCertificateIds() {
        return this.caCertificateIds;
    }

    public UpdateListenerAttributeRequest setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public UpdateListenerAttributeRequest setCertificateIds(java.util.List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
    public java.util.List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public UpdateListenerAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateListenerAttributeRequest setCps(Integer cps) {
        this.cps = cps;
        return this;
    }
    public Integer getCps() {
        return this.cps;
    }

    public UpdateListenerAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateListenerAttributeRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public UpdateListenerAttributeRequest setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public UpdateListenerAttributeRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateListenerAttributeRequest setMss(Integer mss) {
        this.mss = mss;
        return this;
    }
    public Integer getMss() {
        return this.mss;
    }

    public UpdateListenerAttributeRequest setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
        this.proxyProtocolEnabled = proxyProtocolEnabled;
        return this;
    }
    public Boolean getProxyProtocolEnabled() {
        return this.proxyProtocolEnabled;
    }

    public UpdateListenerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateListenerAttributeRequest setSecSensorEnabled(Boolean secSensorEnabled) {
        this.secSensorEnabled = secSensorEnabled;
        return this;
    }
    public Boolean getSecSensorEnabled() {
        return this.secSensorEnabled;
    }

    public UpdateListenerAttributeRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public UpdateListenerAttributeRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
