// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletionProtectionRequest extends TeaModel {
    @NameInMap("ProtectionEnable")
    @Validation(required = true)
    public Boolean protectionEnable;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DeletionProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletionProtectionRequest self = new DeletionProtectionRequest();
        return TeaModel.build(map, self);
    }

}
