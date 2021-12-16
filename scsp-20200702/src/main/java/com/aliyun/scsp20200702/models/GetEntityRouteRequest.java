// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetEntityRouteRequest extends TeaModel {
    @NameInMap("EntityBizCode")
    public String entityBizCode;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityRelationNumber")
    public String entityRelationNumber;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UniqueId")
    public Long uniqueId;

    public static GetEntityRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEntityRouteRequest self = new GetEntityRouteRequest();
        return TeaModel.build(map, self);
    }

    public GetEntityRouteRequest setEntityBizCode(String entityBizCode) {
        this.entityBizCode = entityBizCode;
        return this;
    }
    public String getEntityBizCode() {
        return this.entityBizCode;
    }

    public GetEntityRouteRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public GetEntityRouteRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public GetEntityRouteRequest setEntityRelationNumber(String entityRelationNumber) {
        this.entityRelationNumber = entityRelationNumber;
        return this;
    }
    public String getEntityRelationNumber() {
        return this.entityRelationNumber;
    }

    public GetEntityRouteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEntityRouteRequest setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public Long getUniqueId() {
        return this.uniqueId;
    }

}
