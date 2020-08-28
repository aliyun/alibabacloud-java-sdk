// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionLOARequest extends TeaModel {
    // description: The ID of the region where the leased line is deployed. ; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: Optional. The token used for client authentication. ; 
    @NameInMap("ClientToken")
    public String clientToken;

    // description: The instance ID of the physical connection interface. ; 
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribePhysicalConnectionLOARequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionLOARequest self = new DescribePhysicalConnectionLOARequest();
        return TeaModel.build(map, self);
    }

}
