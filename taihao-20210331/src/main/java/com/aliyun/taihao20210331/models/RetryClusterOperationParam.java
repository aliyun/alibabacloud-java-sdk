// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RetryClusterOperationParam extends TeaModel {
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

    public static RetryClusterOperationParam build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterOperationParam self = new RetryClusterOperationParam();
        return TeaModel.build(map, self);
    }

    public RetryClusterOperationParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RetryClusterOperationParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public RetryClusterOperationParam setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RetryClusterOperationParam setOperationNodeId(Long operationNodeId) {
        this.operationNodeId = operationNodeId;
        return this;
    }
    public Long getOperationNodeId() {
        return this.operationNodeId;
    }

    public RetryClusterOperationParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
