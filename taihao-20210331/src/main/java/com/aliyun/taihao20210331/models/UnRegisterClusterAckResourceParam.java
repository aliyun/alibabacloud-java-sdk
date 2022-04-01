// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UnRegisterClusterAckResourceParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // namespace
    @NameInMap("namespace")
    public String namespace;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // productRoleName
    @NameInMap("productRoleName")
    public String productRoleName;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static UnRegisterClusterAckResourceParam build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterClusterAckResourceParam self = new UnRegisterClusterAckResourceParam();
        return TeaModel.build(map, self);
    }

    public UnRegisterClusterAckResourceParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public UnRegisterClusterAckResourceParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnRegisterClusterAckResourceParam setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UnRegisterClusterAckResourceParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UnRegisterClusterAckResourceParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public UnRegisterClusterAckResourceParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
