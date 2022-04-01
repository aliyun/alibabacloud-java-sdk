// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOrdersParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // operationId
    @NameInMap("operationId")
    public String operationId;

    // orderStatus
    @NameInMap("orderStatus")
    public String orderStatus;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static ListClusterOrdersParam build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOrdersParam self = new ListClusterOrdersParam();
        return TeaModel.build(map, self);
    }

    public ListClusterOrdersParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterOrdersParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListClusterOrdersParam setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ListClusterOrdersParam setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ListClusterOrdersParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
