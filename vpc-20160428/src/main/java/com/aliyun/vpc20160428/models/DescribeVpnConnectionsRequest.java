// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static DescribeVpnConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionsRequest self = new DescribeVpnConnectionsRequest();
        return TeaModel.build(map, self);
    }

}
