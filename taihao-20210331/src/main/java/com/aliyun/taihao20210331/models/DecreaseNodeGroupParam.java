// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DecreaseNodeGroupParam extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // deleteNodeIds
    @NameInMap("deleteNodeIds")
    public java.util.List<String> deleteNodeIds;

    // deleteNumber
    @NameInMap("deleteNumber")
    public Long deleteNumber;

    // nodeGroupId
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static DecreaseNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodeGroupParam self = new DecreaseNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public DecreaseNodeGroupParam setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DecreaseNodeGroupParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DecreaseNodeGroupParam setDeleteNodeIds(java.util.List<String> deleteNodeIds) {
        this.deleteNodeIds = deleteNodeIds;
        return this;
    }
    public java.util.List<String> getDeleteNodeIds() {
        return this.deleteNodeIds;
    }

    public DecreaseNodeGroupParam setDeleteNumber(Long deleteNumber) {
        this.deleteNumber = deleteNumber;
        return this;
    }
    public Long getDeleteNumber() {
        return this.deleteNumber;
    }

    public DecreaseNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DecreaseNodeGroupParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public DecreaseNodeGroupParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
