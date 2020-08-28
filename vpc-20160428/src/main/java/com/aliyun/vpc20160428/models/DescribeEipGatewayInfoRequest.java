// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipGatewayInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeEipGatewayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipGatewayInfoRequest self = new DescribeEipGatewayInfoRequest();
        return TeaModel.build(map, self);
    }

}
