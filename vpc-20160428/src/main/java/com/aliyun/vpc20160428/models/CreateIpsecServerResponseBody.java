// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpsecServerResponseBody extends TeaModel {
    /**
     * <p>The time when the IPsec server was created.</p>
     * <p>T is used as a delimiter. Z indicates that the time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-22T03:24:28Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The IPsec server ID.</p>
     * 
     * <strong>example:</strong>
     * <p>iss-bp1jougp8cfsbo8y9****</p>
     */
    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    /**
     * <p>The IPsec server name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    /**
     * <p>The ID of the region where the VPN gateway is deployed.</p>
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
     * <p>690A967E-D4CD-4B69-8C78-94FE828BA10B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp17lofy9fd0dnvzv****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static CreateIpsecServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsecServerResponseBody self = new CreateIpsecServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpsecServerResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public CreateIpsecServerResponseBody setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public CreateIpsecServerResponseBody setIpsecServerName(String ipsecServerName) {
        this.ipsecServerName = ipsecServerName;
        return this;
    }
    public String getIpsecServerName() {
        return this.ipsecServerName;
    }

    public CreateIpsecServerResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpsecServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpsecServerResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
