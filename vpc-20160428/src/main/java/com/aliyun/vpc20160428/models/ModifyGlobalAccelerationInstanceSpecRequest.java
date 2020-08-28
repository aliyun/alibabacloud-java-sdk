// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceSpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    public static ModifyGlobalAccelerationInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceSpecRequest self = new ModifyGlobalAccelerationInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

}
