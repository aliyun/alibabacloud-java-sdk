// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveGlobalAccelerationInstanceIpRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    @NameInMap("IpInstanceId")
    @Validation(required = true)
    public String ipInstanceId;

    public static RemoveGlobalAccelerationInstanceIpRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGlobalAccelerationInstanceIpRequest self = new RemoveGlobalAccelerationInstanceIpRequest();
        return TeaModel.build(map, self);
    }

}
