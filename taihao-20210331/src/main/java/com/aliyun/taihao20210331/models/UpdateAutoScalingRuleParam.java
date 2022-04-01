// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAutoScalingRuleParam extends TeaModel {
    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scalingRuleId
    @NameInMap("scalingRuleId")
    public String scalingRuleId;

    // scalingRuleSpec
    @NameInMap("scalingRuleSpec")
    public ScalingRuleSpec scalingRuleSpec;

    public static UpdateAutoScalingRuleParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScalingRuleParam self = new UpdateAutoScalingRuleParam();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScalingRuleParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateAutoScalingRuleParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public UpdateAutoScalingRuleParam setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public UpdateAutoScalingRuleParam setScalingRuleSpec(ScalingRuleSpec scalingRuleSpec) {
        this.scalingRuleSpec = scalingRuleSpec;
        return this;
    }
    public ScalingRuleSpec getScalingRuleSpec() {
        return this.scalingRuleSpec;
    }

}
