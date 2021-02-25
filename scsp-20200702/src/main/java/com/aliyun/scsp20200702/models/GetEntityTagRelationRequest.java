// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetEntityTagRelationRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetEntityTagRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEntityTagRelationRequest self = new GetEntityTagRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetEntityTagRelationRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public GetEntityTagRelationRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetEntityTagRelationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
