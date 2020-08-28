// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteGlobalAccelerationInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    public static DeleteGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalAccelerationInstanceRequest self = new DeleteGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

}
