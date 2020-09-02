// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    public static DescribeVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayRequest self = new DescribeVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpnGatewayRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DescribeVpnGatewayRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

}
