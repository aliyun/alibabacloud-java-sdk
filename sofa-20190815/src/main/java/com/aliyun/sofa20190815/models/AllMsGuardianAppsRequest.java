// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllMsGuardianAppsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static AllMsGuardianAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        AllMsGuardianAppsRequest self = new AllMsGuardianAppsRequest();
        return TeaModel.build(map, self);
    }

    public AllMsGuardianAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
