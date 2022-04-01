// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SkipClusterOperationTaskParam extends TeaModel {
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

    // operationTaskId
    @NameInMap("operationTaskId")
    public Long operationTaskId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static SkipClusterOperationTaskParam build(java.util.Map<String, ?> map) throws Exception {
        SkipClusterOperationTaskParam self = new SkipClusterOperationTaskParam();
        return TeaModel.build(map, self);
    }

    public SkipClusterOperationTaskParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SkipClusterOperationTaskParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public SkipClusterOperationTaskParam setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public SkipClusterOperationTaskParam setOperationNodeId(Long operationNodeId) {
        this.operationNodeId = operationNodeId;
        return this;
    }
    public Long getOperationNodeId() {
        return this.operationNodeId;
    }

    public SkipClusterOperationTaskParam setOperationTaskId(Long operationTaskId) {
        this.operationTaskId = operationTaskId;
        return this;
    }
    public Long getOperationTaskId() {
        return this.operationTaskId;
    }

    public SkipClusterOperationTaskParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
