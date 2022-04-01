// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateAutoScalingPolicyShrinkRequest extends TeaModel {
    // createAutoScalingPolicyParam
    @NameInMap("createAutoScalingPolicyParam")
    public String createAutoScalingPolicyParamShrink;

    public static CreateAutoScalingPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingPolicyShrinkRequest self = new CreateAutoScalingPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingPolicyShrinkRequest setCreateAutoScalingPolicyParamShrink(String createAutoScalingPolicyParamShrink) {
        this.createAutoScalingPolicyParamShrink = createAutoScalingPolicyParamShrink;
        return this;
    }
    public String getCreateAutoScalingPolicyParamShrink() {
        return this.createAutoScalingPolicyParamShrink;
    }

}
