// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DisableAutoScalingPolicyShrinkRequest extends TeaModel {
    // disableAutoScalingPolicyParam
    @NameInMap("disableAutoScalingPolicyParam")
    public String disableAutoScalingPolicyParamShrink;

    public static DisableAutoScalingPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoScalingPolicyShrinkRequest self = new DisableAutoScalingPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DisableAutoScalingPolicyShrinkRequest setDisableAutoScalingPolicyParamShrink(String disableAutoScalingPolicyParamShrink) {
        this.disableAutoScalingPolicyParamShrink = disableAutoScalingPolicyParamShrink;
        return this;
    }
    public String getDisableAutoScalingPolicyParamShrink() {
        return this.disableAutoScalingPolicyParamShrink;
    }

}
