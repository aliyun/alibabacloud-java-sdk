// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPDbnodesRelatedPhysicalSchemasRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    public static QueryODPDbnodesRelatedPhysicalSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPDbnodesRelatedPhysicalSchemasRequest self = new QueryODPDbnodesRelatedPhysicalSchemasRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPDbnodesRelatedPhysicalSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryODPDbnodesRelatedPhysicalSchemasRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
