// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpsecServerRequest extends TeaModel {
    /**
     * <p>The client CIDR block from which an IP address is allocated to the virtual network interface controller (NIC) of the client.</p>
     * <blockquote>
     * <p> The client CIDR block must not overlap with the CIDR blocks of the VPC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck this request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without modifying the configurations of the IPsec server. The system checks the required parameters, request format, and service limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: sends the request. This is the default value. If the request passes the precheck, the system modifies the configurations of the IPsec server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether to delete the negotiated IPsec tunnel and initiate the negotiation again. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: immediately initiates negotiations after the configuration is complete.</li>
     * <li><strong>false</strong>: initiates negotiations when inbound traffic is detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>The configuration of Phase 1 negotiations. Valid values:</p>
     * <ul>
     * <li><strong>IkeVersion</strong>: The IKE version. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</li>
     * <li><strong>IkeMode</strong>: The IKE negotiation mode. Default value: <strong>main</strong>.</li>
     * <li><strong>IkeEncAlg</strong>: the encryption algorithm that is used in Phase 1 negotiation. Default value: <strong>aes</strong>.</li>
     * <li><strong>IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiation. Default value: <strong>sha1</strong>.</li>
     * <li><strong>IkePfs</strong>: The Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Default value: <strong>group2</strong>.</li>
     * <li><strong>IkeLifetime</strong>: The SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
     * <li><strong>LocalId</strong>: The identifier of the IPsec server. Only FQDN and IP address formats are supported.</li>
     * <li><strong>RemoteId</strong>: the peer identifier. Only FQDN and IP address formats are supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IkeVersion&quot;:&quot;ikev2&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The configuration of Phase 2 negotiation. Valid values:</p>
     * <ul>
     * <li><strong>IpsecEncAlg</strong>: the encryption algorithm that is used in Phase 2 negotiation. Default value: <strong>aes</strong>.</li>
     * <li><strong>IpsecAuthAlg</strong>: the authentication algorithm that is used in Phase 2 negotiation. Default value: <strong>sha1</strong>.</li>
     * <li><strong>IpsecPfs</strong>: forwards packets of all protocols. The Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiation. Default value: <strong>group2</strong>.</li>
     * <li><strong>IpsecLifetime</strong>: the SA lifetime determined by Phase 2 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The IPsec server ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iss-bp1bo3xuvcxo7ixll****</p>
     */
    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    /**
     * <p>The name of the IPsec server.</p>
     * <p>It must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    /**
     * <p>The local CIDR blocks, which are the CIDR blocks of the virtual private cloud (VPC) for the client to access.</p>
     * <p>Multiple CIDR blocks are separated with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24,172.17.0.0/16</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The pre-shared key.</p>
     * <p>The pre-shared key that is used for authentication between the IPsec-VPN server and the client. It must be 1 to 100 characters in length.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2794120.html">ListIpsecServers</a> to query keys generated by the system.</p>
     * <blockquote>
     * <p> The pre-shared key of the IPsec server key must be the same as that of the client. Otherwise, the connection between the IPsec server and the client cannot be established.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cfd123****</p>
     */
    @NameInMap("Psk")
    public String psk;

    /**
     * <p>Specifies whether to enable pre-shared key authentication. If you set the value to <strong>true</strong>, pre-shared key authentication is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PskEnabled")
    public Boolean pskEnabled;

    /**
     * <p>The ID of the region where the IPsec server is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
