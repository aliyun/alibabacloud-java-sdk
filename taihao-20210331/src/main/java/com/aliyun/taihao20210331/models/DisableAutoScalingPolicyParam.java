// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DisableAutoScalingPolicyParam extends TeaModel {
    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scalingPolicyId
    @NameInMap("scalingPolicyId")
    public String scalingPolicyId;

    public static DisableAutoScalingPolicyParam build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoScalingPolicyParam self = new DisableAutoScalingPolicyParam();
        return TeaModel.build(map, self);
    }

    public DisableAutoScalingPolicyParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public DisableAutoScalingPolicyParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public DisableAutoScalingPolicyParam setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

}
