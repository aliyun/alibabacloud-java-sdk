// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeServerRelatedGlobalAccelerationInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ServerId")
    @Validation(required = true)
    public String serverId;

    @NameInMap("ServerType")
    public String serverType;

    public static DescribeServerRelatedGlobalAccelerationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerRelatedGlobalAccelerationInstancesRequest self = new DescribeServerRelatedGlobalAccelerationInstancesRequest();
        return TeaModel.build(map, self);
    }

}
