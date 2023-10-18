// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpsecServerRequest extends TeaModel {
    /**
     * <p>The client CIDR block from which an IP address is allocated to the virtual network interface controller (NIC) of the client.</p>
     * <br>
     * <p>>  The client CIDR block must not overlap with the CIDR blocks of the VPC.</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck this request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without modifying the configurations of the IPsec server. The system checks the required parameters, request format, and service limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the request. This is the default value. If the request passes the precheck, the system modifies the configurations of the IPsec server.</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>Specifies whether to delete the current IPsec tunnel and initiate negotiations again. Valid values:</p>
     * <br>
     * <p>*   **true**: immediately initiates negotiations after the configuration is complete.</p>
     * <p>*   **false**: initiates negotiations when inbound traffic is detected. This is the default value.</p>
     */
    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    /**
     * <p>The configuration of Phase 1 negotiation. Valid values:</p>
     * <br>
     * <p>*   **IkeVersion**: the IKE version. Valid values: **ikev1** and **ikev2**. Default value: **ikev2**.</p>
     * <p>*   **IkeMode**: the IKE negotiation mode. Default value: **main**.</p>
     * <p>*   **IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiation. Default value: **aes**.</p>
     * <p>*   **IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiation. Default value: **sha1**.</p>
     * <p>*   **IkePfs**: the Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiation. Default value: **group2**.</p>
     * <p>*   **IkeLifetime**: the security association (SA) lifetime determined by Phase 1 negotiation. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     * <p>*   **LocalId**: the identifier of the IPsec server. The value can be a fully qualified domain name (FQDN) or an IP address. The default value is the public IP address of the VPN gateway.</p>
     * <p>*   **RemoteId**: the peer identifier. The value can be an FQDN or an IP address. The default value is empty.</p>
     */
    @NameInMap("IkeConfig")
    public String ikeConfig;

    /**
     * <p>The configuration of Phase 2 negotiation. Valid values:</p>
     * <br>
     * <p>*   **IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiation. Default value: **aes**.</p>
     * <p>*   **IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiation. Default value: **sha1**.</p>
     * <p>*   **IpsecPfs**: forwards packets of all protocols. The Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiation. Default value: **group2**.</p>
     * <p>*   **IpsecLifetime**: the SA lifetime determined by Phase 2 negotiation. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.</p>
     */
    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    /**
     * <p>The IPsec server ID.</p>
     */
    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    /**
     * <p>The IPsec server name.</p>
     * <br>
     * <p>The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    /**
     * <p>The local CIDR blocks, which are the CIDR blocks of the virtual private cloud (VPC) for the client to access.</p>
     * <br>
     * <p>Multiple CIDR blocks are separated with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
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
     * <p>>  The pre-shared key of the IPsec server must be the same as the client key. Otherwise, the IPsec server cannot be connected to the client.</p>
     */
    @NameInMap("Psk")
    public String psk;

    /**
     * <p>Specifies whether to enable pre-shared key authentication. If you set the value to **true**, pre-shared key authentication is enabled.</p>
     */
    @NameInMap("PskEnabled")
    public Boolean pskEnabled;

    /**
     * <p>The ID of the region where the IPsec server is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
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
