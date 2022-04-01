// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RegisterClusterAckResourceParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // namespace
    @NameInMap("namespace")
    public String namespace;

    // nodeLabel
    @NameInMap("nodeLabel")
    public String nodeLabel;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // ossPath
    @NameInMap("ossPath")
    public String ossPath;

    // productRoleName
    @NameInMap("productRoleName")
    public String productRoleName;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static RegisterClusterAckResourceParam build(java.util.Map<String, ?> map) throws Exception {
        RegisterClusterAckResourceParam self = new RegisterClusterAckResourceParam();
        return TeaModel.build(map, self);
    }

    public RegisterClusterAckResourceParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public RegisterClusterAckResourceParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RegisterClusterAckResourceParam setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RegisterClusterAckResourceParam setNodeLabel(String nodeLabel) {
        this.nodeLabel = nodeLabel;
        return this;
    }
    public String getNodeLabel() {
        return this.nodeLabel;
    }

    public RegisterClusterAckResourceParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public RegisterClusterAckResourceParam setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public RegisterClusterAckResourceParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public RegisterClusterAckResourceParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
