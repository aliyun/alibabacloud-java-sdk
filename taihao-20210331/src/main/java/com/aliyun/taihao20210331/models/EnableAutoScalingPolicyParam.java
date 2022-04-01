// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class EnableAutoScalingPolicyParam extends TeaModel {
    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scalingPolicyId
    @NameInMap("scalingPolicyId")
    public String scalingPolicyId;

    public static EnableAutoScalingPolicyParam build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoScalingPolicyParam self = new EnableAutoScalingPolicyParam();
        return TeaModel.build(map, self);
    }

    public EnableAutoScalingPolicyParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public EnableAutoScalingPolicyParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public EnableAutoScalingPolicyParam setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

}
