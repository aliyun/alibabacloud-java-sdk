// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnPbrRouteEntriesRequest extends TeaModel {
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

    public static DescribeVpnPbrRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnPbrRouteEntriesRequest self = new DescribeVpnPbrRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

}
