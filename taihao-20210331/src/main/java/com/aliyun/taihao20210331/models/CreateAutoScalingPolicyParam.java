// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateAutoScalingPolicyParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // ACK集群 此字段为空
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // 弹性伸缩规则列表
    @NameInMap("scalingRules")
    public java.util.List<ScalingRule> scalingRules;

    public static CreateAutoScalingPolicyParam build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingPolicyParam self = new CreateAutoScalingPolicyParam();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingPolicyParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateAutoScalingPolicyParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public CreateAutoScalingPolicyParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateAutoScalingPolicyParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public CreateAutoScalingPolicyParam setScalingRules(java.util.List<ScalingRule> scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }
    public java.util.List<ScalingRule> getScalingRules() {
        return this.scalingRules;
    }

}
