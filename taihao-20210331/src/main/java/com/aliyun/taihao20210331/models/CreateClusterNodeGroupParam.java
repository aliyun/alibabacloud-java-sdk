// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterNodeGroupParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeGroupParam
    @NameInMap("nodeGroupParam")
    public NodeGroupParam nodeGroupParam;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static CreateClusterNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodeGroupParam self = new CreateClusterNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodeGroupParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterNodeGroupParam setNodeGroupParam(NodeGroupParam nodeGroupParam) {
        this.nodeGroupParam = nodeGroupParam;
        return this;
    }
    public NodeGroupParam getNodeGroupParam() {
        return this.nodeGroupParam;
    }

    public CreateClusterNodeGroupParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateClusterNodeGroupParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
