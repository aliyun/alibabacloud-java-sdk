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

}
