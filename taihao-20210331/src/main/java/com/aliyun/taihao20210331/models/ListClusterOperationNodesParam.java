// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationNodesParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // operationId
    @NameInMap("operationId")
    public String operationId;

    // parentOperationNodeId
    @NameInMap("parentOperationNodeId")
    public Long parentOperationNodeId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static ListClusterOperationNodesParam build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationNodesParam self = new ListClusterOperationNodesParam();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationNodesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterOperationNodesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListClusterOperationNodesParam setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ListClusterOperationNodesParam setParentOperationNodeId(Long parentOperationNodeId) {
        this.parentOperationNodeId = parentOperationNodeId;
        return this;
    }
    public Long getParentOperationNodeId() {
        return this.parentOperationNodeId;
    }

    public ListClusterOperationNodesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
