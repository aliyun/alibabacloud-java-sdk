// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationNodeParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // operationId
    @NameInMap("operationId")
    public String operationId;

    // operationNodeId
    @NameInMap("operationNodeId")
    public Long operationNodeId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static GetClusterOperationNodeParam build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationNodeParam self = new GetClusterOperationNodeParam();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationNodeParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterOperationNodeParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public GetClusterOperationNodeParam setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public GetClusterOperationNodeParam setOperationNodeId(Long operationNodeId) {
        this.operationNodeId = operationNodeId;
        return this;
    }
    public Long getOperationNodeId() {
        return this.operationNodeId;
    }

    public GetClusterOperationNodeParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
