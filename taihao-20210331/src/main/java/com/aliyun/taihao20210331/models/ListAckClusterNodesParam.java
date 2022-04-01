// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAckClusterNodesParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    @NameInMap("productSelectors")
    public NodeSelector productSelectors;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // skippedNodePools
    @NameInMap("skippedNodePools")
    public java.util.List<String> skippedNodePools;

    public static ListAckClusterNodesParam build(java.util.Map<String, ?> map) throws Exception {
        ListAckClusterNodesParam self = new ListAckClusterNodesParam();
        return TeaModel.build(map, self);
    }

    public ListAckClusterNodesParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public ListAckClusterNodesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListAckClusterNodesParam setProductSelectors(NodeSelector productSelectors) {
        this.productSelectors = productSelectors;
        return this;
    }
    public NodeSelector getProductSelectors() {
        return this.productSelectors;
    }

    public ListAckClusterNodesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListAckClusterNodesParam setSkippedNodePools(java.util.List<String> skippedNodePools) {
        this.skippedNodePools = skippedNodePools;
        return this;
    }
    public java.util.List<String> getSkippedNodePools() {
        return this.skippedNodePools;
    }

}
