// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingPolicyShrinkRequest extends TeaModel {
    @NameInMap("getAutoScalingPolicyParam")
    public String getAutoScalingPolicyParamShrink;

    public static GetAutoScalingPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingPolicyShrinkRequest self = new GetAutoScalingPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingPolicyShrinkRequest setGetAutoScalingPolicyParamShrink(String getAutoScalingPolicyParamShrink) {
        this.getAutoScalingPolicyParamShrink = getAutoScalingPolicyParamShrink;
        return this;
    }
    public String getGetAutoScalingPolicyParamShrink() {
        return this.getAutoScalingPolicyParamShrink;
    }

}
