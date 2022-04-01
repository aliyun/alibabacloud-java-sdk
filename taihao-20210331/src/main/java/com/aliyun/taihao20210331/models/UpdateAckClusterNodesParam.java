// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodesParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

    // ackNodes
    @NameInMap("ackNodes")
    public java.util.List<AckNodes> ackNodes;

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

    public static UpdateAckClusterNodesParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodesParam self = new UpdateAckClusterNodesParam();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodesParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public UpdateAckClusterNodesParam setAckNodes(java.util.List<AckNodes> ackNodes) {
        this.ackNodes = ackNodes;
        return this;
    }
    public java.util.List<AckNodes> getAckNodes() {
        return this.ackNodes;
    }

    public UpdateAckClusterNodesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateAckClusterNodesParam setProductSelectors(NodeSelector productSelectors) {
        this.productSelectors = productSelectors;
        return this;
    }
    public NodeSelector getProductSelectors() {
        return this.productSelectors;
    }

    public UpdateAckClusterNodesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public UpdateAckClusterNodesParam setSkippedNodePools(java.util.List<String> skippedNodePools) {
        this.skippedNodePools = skippedNodePools;
        return this;
    }
    public java.util.List<String> getSkippedNodePools() {
        return this.skippedNodePools;
    }

    public static class AckNodes extends TeaModel {
        // nodeId
        @NameInMap("nodeId")
        public String nodeId;

        @NameInMap("nodeSelector")
        public NodeSelector nodeSelector;

        public static AckNodes build(java.util.Map<String, ?> map) throws Exception {
            AckNodes self = new AckNodes();
            return TeaModel.build(map, self);
        }

        public AckNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public AckNodes setNodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

    }

}
