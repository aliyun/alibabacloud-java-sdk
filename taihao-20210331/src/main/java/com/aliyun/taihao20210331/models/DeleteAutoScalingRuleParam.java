// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteAutoScalingRuleParam extends TeaModel {
    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scalingRuleId
    @NameInMap("scalingRuleId")
    public String scalingRuleId;

    public static DeleteAutoScalingRuleParam build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalingRuleParam self = new DeleteAutoScalingRuleParam();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalingRuleParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public DeleteAutoScalingRuleParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public DeleteAutoScalingRuleParam setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

}
