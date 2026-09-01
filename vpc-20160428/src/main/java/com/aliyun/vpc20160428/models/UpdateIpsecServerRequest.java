// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpsecServerRequest extends TeaModel {
    /**
     * <p>The client CIDR block, which is the CIDR block from which IP addresses are assigned to virtual network interface controllers (NICs) of the client.</p>
     * <blockquote>
     * <p>The client CIDR block cannot conflict with the VPC CIDR block.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without modifying the IPsec server configuration. The system checks the required parameters, request format, and service limits. If the check fails, the corresponding error message is returned. If the check succeeds, <code>DryRunOperation</code> is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the request. After the check succeeds, the IPsec server configuration is modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether to delete the currently negotiated IPsec tunnel and re-initiate negotiation. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Negotiation is initiated immediately after the configuration is complete.</p>
     * </li>
     * <li><p><strong>false</strong>: Negotiation is initiated when inbound traffic is detected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>The Phase 1 negotiation parameter settings. Valid values:</p>
     * <ul>
     * <li><p><strong>IkeVersion</strong>: The version of the IKE protocol. Valid values: <strong>ikev1</strong> or <strong>ikev2</strong>.</p>
     * </li>
     * <li><p><strong>IkeMode</strong>: The negotiation pattern of the IKE version. Default value: <strong>main</strong>.</p>
     * </li>
     * <li><p><strong>IkeEncAlg</strong>: The encryption algorithm used in Phase 1 negotiations. Default value: <strong>aes</strong>.</p>
     * </li>
     * <li><p><strong>IkeAuthAlg</strong>: The authentication algorithm used in Phase 1 negotiations. Default value: <strong>sha1</strong>.</p>
     * </li>
     * <li><p><strong>IkePfs</strong>: The Diffie-Hellman key exchange algorithm used in Phase 1 negotiations. Default value: <strong>group2</strong>.</p>
     * </li>
     * <li><p><strong>IkeLifetime</strong>: The lifetime of the SA negotiated in Phase 1. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>. The parameter specifies the SA epoch.</p>
     * </li>
     * <li><p><strong>LocalId</strong>: The identity of the IPsec server. FQDN and IP address formats are supported.</p>
     * </li>
     * <li><p><strong>RemoteId</strong>: The identity of the peer. FQDN and IP address formats are supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IkeVersion&quot;:&quot;ikev2&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The Phase 2 negotiation parameter settings. Valid values:</p>
     * <ul>
     * <li><p><strong>IpsecEncAlg</strong>: The encryption algorithm used in Phase 2 negotiations. Default value: <strong>aes</strong>.</p>
     * </li>
     * <li><p><strong>IpsecAuthAlg</strong>: The authentication algorithm used in Phase 2 negotiations. Default value: <strong>sha1</strong>.</p>
     * </li>
     * <li><p><strong>IpsecPfs</strong>: Forward all protocol packets. The Diffie-Hellman key exchange algorithm used in Phase 2 negotiations. Default value: <strong>group2</strong>.</p>
     * </li>
     * <li><p><strong>IpsecLifetime</strong>: The epoch of the SA negotiated in Phase 2. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The ID of the IPsec server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iss-bp1bo3xuvcxo7ixll****</p>
     */
    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    /**
     * <p>The name of the IPsec server.</p>
     * <p>The name must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    /**
     * <p>The local CIDR block, which is the CIDR block on the VPC side that needs to communicate with the client CIDR block.</p>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24,172.17.0.0/16</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The pre-shared key.</p>
     * <p>The pre-shared key is used for identity authentication between the IPsec server and the client. The key must be 1 to 100 characters in length.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2794120.html">ListIpsecServers</a> operation to query the key generated by the system.</p>
     * <blockquote>
     * <p>The pre-shared key of the IPsec server must be the same as the authentication key of the client. Otherwise, a connection cannot be established between the IPsec server and the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cfd123****</p>
     */
    @NameInMap("Psk")
    public String psk;

    /**
     * <p>Specifies whether to enable pre-shared key authentication. Valid values: <strong>true</strong>, which indicates that pre-shared key authentication is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PskEnabled")
    public Boolean pskEnabled;

    /**
     * <p>The region ID of the IPsec server.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIpsecServerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpsecServerRequest self = new UpdateIpsecServerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpsecServerRequest setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public UpdateIpsecServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpsecServerRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public UpdateIpsecServerRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public UpdateIpsecServerRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public UpdateIpsecServerRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public UpdateIpsecServerRequest setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public UpdateIpsecServerRequest setIpsecServerName(String ipsecServerName) {
        this.ipsecServerName = ipsecServerName;
        return this;
    }
    public String getIpsecServerName() {
        return this.ipsecServerName;
    }

    public UpdateIpsecServerRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public UpdateIpsecServerRequest setPsk(String psk) {
        this.psk = psk;
        return this;
    }
    public String getPsk() {
        return this.psk;
    }

    public UpdateIpsecServerRequest setPskEnabled(Boolean pskEnabled) {
        this.pskEnabled = pskEnabled;
        return this;
    }
    public Boolean getPskEnabled() {
        return this.pskEnabled;
    }

    public UpdateIpsecServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
