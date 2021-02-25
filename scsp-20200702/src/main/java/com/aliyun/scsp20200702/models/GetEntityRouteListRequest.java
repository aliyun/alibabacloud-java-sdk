// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetEntityRouteListRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("EntityRelationNumber")
    public String entityRelationNumber;

    @NameInMap("EntityName")
    public String entityName;

    public static GetEntityRouteListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEntityRouteListRequest self = new GetEntityRouteListRequest();
        return TeaModel.build(map, self);
    }

    public GetEntityRouteListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetEntityRouteListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetEntityRouteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEntityRouteListRequest setEntityRelationNumber(String entityRelationNumber) {
        this.entityRelationNumber = entityRelationNumber;
        return this;
    }
    public String getEntityRelationNumber() {
        return this.entityRelationNumber;
    }

    public GetEntityRouteListRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}
