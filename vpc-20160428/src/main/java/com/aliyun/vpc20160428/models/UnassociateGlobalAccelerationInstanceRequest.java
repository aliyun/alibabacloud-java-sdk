// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateGlobalAccelerationInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    public static UnassociateGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateGlobalAccelerationInstanceRequest self = new UnassociateGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

}
