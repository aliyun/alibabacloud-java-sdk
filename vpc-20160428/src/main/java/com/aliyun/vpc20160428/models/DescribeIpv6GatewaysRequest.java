// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewaysRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    public String ipv6GatewayId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeIpv6GatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewaysRequest self = new DescribeIpv6GatewaysRequest();
        return TeaModel.build(map, self);
    }

}
