// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfaceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribeRouterInterfaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfaceAttributeRequest self = new DescribeRouterInterfaceAttributeRequest();
        return TeaModel.build(map, self);
    }

}
