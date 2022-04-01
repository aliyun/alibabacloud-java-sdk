// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAckClusterNodePoolsParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

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

    public static ListAckClusterNodePoolsParam build(java.util.Map<String, ?> map) throws Exception {
        ListAckClusterNodePoolsParam self = new ListAckClusterNodePoolsParam();
        return TeaModel.build(map, self);
    }

    public ListAckClusterNodePoolsParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public ListAckClusterNodePoolsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListAckClusterNodePoolsParam setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListAckClusterNodePoolsParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public ListAckClusterNodePoolsParam setProductSelectors(NodeSelector productSelectors) {
        this.productSelectors = productSelectors;
        return this;
    }
    public NodeSelector getProductSelectors() {
        return this.productSelectors;
    }

    public ListAckClusterNodePoolsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
