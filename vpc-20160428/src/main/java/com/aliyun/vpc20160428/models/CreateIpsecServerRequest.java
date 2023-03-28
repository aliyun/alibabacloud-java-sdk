// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpsecServerRequest extends TeaModel {
    /**
     * <p>The client CIDR block. It refers to the CIDR block that is used to allocate an IP address to the client.</p>
     * <br>
     * <p>>  The client CIDR block must not overlap with the CIDR block of the virtual private cloud (VPC).</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: only prechecks the request. After the request passes the precheck, the system does not create the IPsec server. The system checks the required parameters, the request format, and the service limits. If the request fails the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): prechecks the request. After the request passes the precheck, the system creates the IPsec server.</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether you want the configuration to immediately take effect. Valid values:</p>
     * <br>
     * <p>*   **true**: initiates negotiations after the configuration is completed.</p>
     * <p>*   **false** (default): initiates negotiations when inbound traffic is detected.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>The configuration of Phase 1 negotiations. Valid values:</p>
     * <br>
     * <p>*   **IkeVersion**: the IKE version. Valid values: **ikev1** and **ikev2**. Default value: **ikev2**.</p>
     * <p>*   **IkeMode**: the IKE negotiation mode. Default value: **main**.</p>
     * <p>*   **IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiations. Default value: **aes**.</p>
     * <p>*   **IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations. Default value: **sha1**.</p>
     * <p>*   **IkePfs**: the Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Default value: **group2**.</p>
     * <p>*   **IkeLifetime**: the security association (SA) lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     * <p>*   **LocalId**: the identifier of the IPsec server. The value can be a fully qualified domain name (FQDN) or an IP address. The default value is the public IP address of the VPN gateway.</p>
     * <p>*   **RemoteId**: the identifier of the peer. The value can be an FQDN or an IP address. By default, this parameter is not specified.</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The name of the IPsec server.</p>
     * <br>
     * <p>The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("IpSecServerName")
    public String ipSecServerName;

    /**
     * <p>The configuration of Phase 2 negotiations. Valid values:</p>
     * <br>
     * <p>*   **IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiations. Default value: **aes**.</p>
     * <p>*   **IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiations. Default value: **sha1**.</p>
     * <p>*   **IpsecPfs**: forwards packets of all protocols. The Diffie-Hellman key exchange algorithm used in Phase 2 negotiations. Default value: **group2**.</p>
     * <p>*   **IpsecLifetime**: the SA lifetime determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The local CIDR blocks, which refer to the CIDR blocks on the virtual private cloud (VPC) side.</p>
     * <br>
     * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The pre-shared key.</p>
     * <br>
     * <p>The pre-shared key is used for identity authentication between the IPsec server and the client. The key must be 1 to 100 characters in length.</p>
     * <br>
     * <p>If you do not specify a pre-shared key, the system randomly generates a 16-character string as the pre-shared key. You can call the [ListIpsecServers](~~205453~~) operation to query the pre-shared keys that are generated by the system.</p>
     * <br>
     * <p>>  The pre-shared key of the IPsec server must be the same as the authentication key of the client. Otherwise, a connection cannot be established between the IPsec server and the client.</p>
     */
    @NameInMap("Psk")
    public String psk;

    /**
     * <p>Specifies whether to enable pre-shared key authentication. If you set the value to **true**, pre-shared key authentication is enabled.</p>
     */
    @NameInMap("PskEnabled")
    public Boolean pskEnabled;

    /**
     * <p>The ID of the region where the VPN gateway is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VPN gateway.</p>
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
