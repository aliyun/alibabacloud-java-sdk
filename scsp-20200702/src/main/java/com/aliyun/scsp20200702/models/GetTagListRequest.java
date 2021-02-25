// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetTagListRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTagListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagListRequest self = new GetTagListRequest();
        return TeaModel.build(map, self);
    }

    public GetTagListRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public GetTagListRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetTagListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
