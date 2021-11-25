// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class DeleteEntityRouteRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UniqueId")
    public Long uniqueId;

    public static DeleteEntityRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityRouteRequest self = new DeleteEntityRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEntityRouteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteEntityRouteRequest setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public Long getUniqueId() {
        return this.uniqueId;
    }

}
