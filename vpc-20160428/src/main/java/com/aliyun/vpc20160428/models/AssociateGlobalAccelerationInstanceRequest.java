// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateGlobalAccelerationInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    @NameInMap("BackendServerId")
    @Validation(required = true)
    public String backendServerId;

    @NameInMap("BackendServerRegionId")
    @Validation(required = true)
    public String backendServerRegionId;

    @NameInMap("BackendServerType")
    public String backendServerType;

    public static AssociateGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateGlobalAccelerationInstanceRequest self = new AssociateGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

}
