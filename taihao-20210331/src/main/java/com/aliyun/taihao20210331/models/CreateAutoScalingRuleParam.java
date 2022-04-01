// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateAutoScalingRuleParam extends TeaModel {
    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scalingPolicyId
    @NameInMap("scalingPolicyId")
    public String scalingPolicyId;

    // scalingRuleSpec
    @NameInMap("scalingRuleSpec")
    public ScalingRuleSpec scalingRuleSpec;

    public static CreateAutoScalingRuleParam build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingRuleParam self = new CreateAutoScalingRuleParam();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingRuleParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateAutoScalingRuleParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public CreateAutoScalingRuleParam setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

    public CreateAutoScalingRuleParam setScalingRuleSpec(ScalingRuleSpec scalingRuleSpec) {
        this.scalingRuleSpec = scalingRuleSpec;
        return this;
    }
    public ScalingRuleSpec getScalingRuleSpec() {
        return this.scalingRuleSpec;
    }

}
