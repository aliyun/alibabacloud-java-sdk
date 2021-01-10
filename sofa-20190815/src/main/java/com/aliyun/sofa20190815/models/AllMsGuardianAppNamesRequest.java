// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllMsGuardianAppNamesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static AllMsGuardianAppNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        AllMsGuardianAppNamesRequest self = new AllMsGuardianAppNamesRequest();
        return TeaModel.build(map, self);
    }

    public AllMsGuardianAppNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
