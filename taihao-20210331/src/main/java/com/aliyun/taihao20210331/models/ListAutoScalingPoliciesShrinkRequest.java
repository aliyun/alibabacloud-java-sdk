// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingPoliciesShrinkRequest extends TeaModel {
    // listAutoScalingPoliciesParam
    @NameInMap("listAutoScalingPoliciesParam")
    public String listAutoScalingPoliciesParamShrink;

    public static ListAutoScalingPoliciesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingPoliciesShrinkRequest self = new ListAutoScalingPoliciesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingPoliciesShrinkRequest setListAutoScalingPoliciesParamShrink(String listAutoScalingPoliciesParamShrink) {
        this.listAutoScalingPoliciesParamShrink = listAutoScalingPoliciesParamShrink;
        return this;
    }
    public String getListAutoScalingPoliciesParamShrink() {
        return this.listAutoScalingPoliciesParamShrink;
    }

}
