// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqRouterRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RouterId")
    public Long routerId;

    public static DeleteMqSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqRouterRequest self = new DeleteMqSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMqSofamqRouterRequest setRouterId(Long routerId) {
        this.routerId = routerId;
        return this;
    }
    public Long getRouterId() {
        return this.routerId;
    }

}
