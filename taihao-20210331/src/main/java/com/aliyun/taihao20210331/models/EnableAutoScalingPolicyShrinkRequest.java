// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class EnableAutoScalingPolicyShrinkRequest extends TeaModel {
    // enableAutoScalingPolicyParam
    @NameInMap("enableAutoScalingPolicyParam")
    public String enableAutoScalingPolicyParamShrink;

    public static EnableAutoScalingPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoScalingPolicyShrinkRequest self = new EnableAutoScalingPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnableAutoScalingPolicyShrinkRequest setEnableAutoScalingPolicyParamShrink(String enableAutoScalingPolicyParamShrink) {
        this.enableAutoScalingPolicyParamShrink = enableAutoScalingPolicyParamShrink;
        return this;
    }
    public String getEnableAutoScalingPolicyParamShrink() {
        return this.enableAutoScalingPolicyParamShrink;
    }

}
