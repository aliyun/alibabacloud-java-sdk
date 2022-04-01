// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DisableAutoScalingPolicyRequest extends TeaModel {
    // disableAutoScalingPolicyParam
    @NameInMap("disableAutoScalingPolicyParam")
    public DisableAutoScalingPolicyParam disableAutoScalingPolicyParam;

    public static DisableAutoScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoScalingPolicyRequest self = new DisableAutoScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DisableAutoScalingPolicyRequest setDisableAutoScalingPolicyParam(DisableAutoScalingPolicyParam disableAutoScalingPolicyParam) {
        this.disableAutoScalingPolicyParam = disableAutoScalingPolicyParam;
        return this;
    }
    public DisableAutoScalingPolicyParam getDisableAutoScalingPolicyParam() {
        return this.disableAutoScalingPolicyParam;
    }

}
