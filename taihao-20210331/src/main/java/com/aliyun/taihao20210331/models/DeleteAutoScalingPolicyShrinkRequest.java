// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteAutoScalingPolicyShrinkRequest extends TeaModel {
    // deleteAutoScalingPolicyParam
    @NameInMap("deleteAutoScalingPolicyParam")
    public String deleteAutoScalingPolicyParamShrink;

    public static DeleteAutoScalingPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalingPolicyShrinkRequest self = new DeleteAutoScalingPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalingPolicyShrinkRequest setDeleteAutoScalingPolicyParamShrink(String deleteAutoScalingPolicyParamShrink) {
        this.deleteAutoScalingPolicyParamShrink = deleteAutoScalingPolicyParamShrink;
        return this;
    }
    public String getDeleteAutoScalingPolicyParamShrink() {
        return this.deleteAutoScalingPolicyParamShrink;
    }

}
