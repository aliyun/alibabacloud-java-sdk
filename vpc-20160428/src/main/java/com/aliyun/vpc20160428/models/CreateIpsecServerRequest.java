// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpsecServerRequest extends TeaModel {
    /**
     * <p>The client CIDR block from which an IP address is allocated to the virtual network interface controller (NIC) of the client.</p>
     * <blockquote>
     * <p> The client CIDR block must not overlap with the CIDR blocks of the VPC.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d7d24a21-f4ba-4454-9173-b38****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck this request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the IPsec server. The system checks the required parameters, request format, and service limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. This is the default value. If the request passes the precheck, the system creates the IPsec server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specify whether to start connection negotiations immediately. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: immediately initiates negotiations after the configuration is complete.</li>
     * <li><strong>false</strong> (default): initiates negotiations when inbound traffic is detected. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>The configuration of Phase 1 negotiation. Valid values:</p>
     * <ul>
     * <li><strong>IkeVersion</strong>: the IKE version. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>. Default value: <strong>ikev2</strong>.</li>
     * <li><strong>IkeMode</strong>: the IKE negotiation mode. Default value: <strong>main</strong>.</li>
     * <li><strong>IkeEncAlg</strong>: the encryption algorithm that is used in Phase 1 negotiation. Default value: <strong>aes</strong>.</li>
     * <li><strong>IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiation. Default value: <strong>sha1</strong>.</li>
     * <li><strong>IkePfs</strong>: the Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiation. Default value: <strong>group2</strong>.</li>
     * <li><strong>IkeLifetime</strong>: the security association (SA) lifetime determined by Phase 1 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
     * <li><strong>LocalId</strong>: the identifier of the IPsec server. The value can be a fully qualified domain name (FQDN) or an IP address. The default value is the public IP address of the VPN gateway.</li>
     * <li><strong>RemoteId</strong>: the peer identifier. The value can be an FQDN or an IP address. The default value is empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IkeVersion&quot;:&quot;ikev2&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400}</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The name of the IPsec server.</p>
     * <p>The name must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpSecServerName")
    public String ipSecServerName;

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
     * <p>The local CIDR blocks, which are the CIDR blocks of the virtual private cloud (VPC) for the client to access.</p>
     * <p>Multiple CIDR blocks are separated with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The pre-shared key.</p>
     * <p>The pre-shared key is used for identity authentication between the IPsec server and the client. The key must be 1 to 100 characters in length.</p>
     * <p>If you do not specify a pre-shared key, the system randomly generates a 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2794120.html">ListIpsecServers</a> operation to query the pre-shared keys that are generated by the system.</p>
     * <blockquote>
     * <p> The pre-shared key of the IPsec server must be the same as the client key. Otherwise, the IPsec server cannot be connected to the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cfd123****</p>
     */
    @NameInMap("Psk")
    public String psk;

    /**
     * <p>Indicates whether pre-shared key authentication is enabled. If you set the value to <strong>true</strong>, pre-shared key authentication is enabled.</p>
     * <blockquote>
     * <p> This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PskEnabled")
    public Boolean pskEnabled;

    /**
     * <p>The ID of the region where the VPN gateway is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VPN gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp17lofy9fd0dnvzv****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static CreateIpsecServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsecServerRequest self = new CreateIpsecServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpsecServerRequest setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public CreateIpsecServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpsecServerRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CreateIpsecServerRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public CreateIpsecServerRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public CreateIpsecServerRequest setIpSecServerName(String ipSecServerName) {
        this.ipSecServerName = ipSecServerName;
        return this;
    }
    public String getIpSecServerName() {
        return this.ipSecServerName;
    }

    public CreateIpsecServerRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public CreateIpsecServerRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public CreateIpsecServerRequest setPsk(String psk) {
        this.psk = psk;
        return this;
    }
    public String getPsk() {
        return this.psk;
    }

    public CreateIpsecServerRequest setPskEnabled(Boolean pskEnabled) {
        this.pskEnabled = pskEnabled;
        return this;
    }
    public Boolean getPskEnabled() {
        return this.pskEnabled;
    }

    public CreateIpsecServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpsecServerRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
