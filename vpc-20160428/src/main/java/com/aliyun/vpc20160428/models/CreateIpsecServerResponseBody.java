// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpsecServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    public static CreateIpsecServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsecServerResponseBody self = new CreateIpsecServerResponseBody();
        return TeaModel.build(map, self);
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

    public CreateIpsecServerResponseBody setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public CreateIpsecServerResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public CreateIpsecServerResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpsecServerResponseBody setIpsecServerName(String ipsecServerName) {
        this.ipsecServerName = ipsecServerName;
        return this;
    }
    public String getIpsecServerName() {
        return this.ipsecServerName;
    }

}
