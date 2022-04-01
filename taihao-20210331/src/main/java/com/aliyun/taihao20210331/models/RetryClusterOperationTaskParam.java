// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryClusterOperationTaskParam extends TeaModel {
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

    public static RetryClusterOperationTaskParam build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterOperationTaskParam self = new RetryClusterOperationTaskParam();
        return TeaModel.build(map, self);
    }

    public RetryClusterOperationTaskParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RetryClusterOperationTaskParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public RetryClusterOperationTaskParam setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RetryClusterOperationTaskParam setOperationNodeId(Long operationNodeId) {
        this.operationNodeId = operationNodeId;
        return this;
    }
    public Long getOperationNodeId() {
        return this.operationNodeId;
    }

    public RetryClusterOperationTaskParam setOperationTaskId(Long operationTaskId) {
        this.operationTaskId = operationTaskId;
        return this;
    }
    public Long getOperationTaskId() {
        return this.operationTaskId;
    }

    public RetryClusterOperationTaskParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
