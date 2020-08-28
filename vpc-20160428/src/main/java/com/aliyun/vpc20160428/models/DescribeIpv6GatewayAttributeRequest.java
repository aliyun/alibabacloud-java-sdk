// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewayAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    public static DescribeIpv6GatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewayAttributeRequest self = new DescribeIpv6GatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

}
