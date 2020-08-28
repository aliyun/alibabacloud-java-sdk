// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnRouteEntriesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RouteEntryType")
    public String routeEntryType;

    public static DescribeVpnRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnRouteEntriesRequest self = new DescribeVpnRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

}
