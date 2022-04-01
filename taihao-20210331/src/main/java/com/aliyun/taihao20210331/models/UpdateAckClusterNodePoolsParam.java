// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodePoolsParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

    // ackNodePools
    @NameInMap("ackNodePools")
    public java.util.List<AckNodePools> ackNodePools;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // product
    @NameInMap("product")
    public String product;

    // productRoleName
    @NameInMap("productRoleName")
    public String productRoleName;

    @NameInMap("productSelectors")
    public NodeSelector productSelectors;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static UpdateAckClusterNodePoolsParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodePoolsParam self = new UpdateAckClusterNodePoolsParam();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodePoolsParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public UpdateAckClusterNodePoolsParam setAckNodePools(java.util.List<AckNodePools> ackNodePools) {
        this.ackNodePools = ackNodePools;
        return this;
    }
    public java.util.List<AckNodePools> getAckNodePools() {
        return this.ackNodePools;
    }

    public UpdateAckClusterNodePoolsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateAckClusterNodePoolsParam setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public UpdateAckClusterNodePoolsParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public UpdateAckClusterNodePoolsParam setProductSelectors(NodeSelector productSelectors) {
        this.productSelectors = productSelectors;
        return this;
    }
    public NodeSelector getProductSelectors() {
        return this.productSelectors;
    }

    public UpdateAckClusterNodePoolsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public static class AckNodePools extends TeaModel {
        // nodePoolId
        @NameInMap("nodePoolId")
        public String nodePoolId;

        @NameInMap("nodeSelector")
        public NodeSelector nodeSelector;

        public static AckNodePools build(java.util.Map<String, ?> map) throws Exception {
            AckNodePools self = new AckNodePools();
            return TeaModel.build(map, self);
        }

        public AckNodePools setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public AckNodePools setNodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

    }

}
