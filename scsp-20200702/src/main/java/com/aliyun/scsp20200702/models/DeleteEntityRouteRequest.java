// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DeleteEntityRouteRequest extends TeaModel {
    @NameInMap("UniqueId")
    public Long uniqueId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteEntityRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityRouteRequest self = new DeleteEntityRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEntityRouteRequest setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public Long getUniqueId() {
        return this.uniqueId;
    }

    public DeleteEntityRouteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
