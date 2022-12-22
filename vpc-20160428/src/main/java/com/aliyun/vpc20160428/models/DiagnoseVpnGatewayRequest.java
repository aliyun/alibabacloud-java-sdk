// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DiagnoseVpnGatewayRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IPsecExtendInfo")
    public String IPsecExtendInfo;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static DiagnoseVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseVpnGatewayRequest self = new DiagnoseVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DiagnoseVpnGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DiagnoseVpnGatewayRequest setIPsecExtendInfo(String IPsecExtendInfo) {
        this.IPsecExtendInfo = IPsecExtendInfo;
        return this;
    }
    public String getIPsecExtendInfo() {
        return this.IPsecExtendInfo;
    }

    public DiagnoseVpnGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DiagnoseVpnGatewayRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DiagnoseVpnGatewayRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DiagnoseVpnGatewayRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
