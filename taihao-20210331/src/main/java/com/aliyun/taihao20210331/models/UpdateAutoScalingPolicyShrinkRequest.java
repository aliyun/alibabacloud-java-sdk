// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAutoScalingPolicyShrinkRequest extends TeaModel {
    @NameInMap("updateAutoScalingPolicyParam")
    public String updateAutoScalingPolicyParamShrink;

    public static UpdateAutoScalingPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScalingPolicyShrinkRequest self = new UpdateAutoScalingPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScalingPolicyShrinkRequest setUpdateAutoScalingPolicyParamShrink(String updateAutoScalingPolicyParamShrink) {
        this.updateAutoScalingPolicyParamShrink = updateAutoScalingPolicyParamShrink;
        return this;
    }
    public String getUpdateAutoScalingPolicyParamShrink() {
        return this.updateAutoScalingPolicyParamShrink;
    }

}
