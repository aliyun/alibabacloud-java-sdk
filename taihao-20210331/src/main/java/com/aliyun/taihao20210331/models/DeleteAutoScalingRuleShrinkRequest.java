// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteAutoScalingRuleShrinkRequest extends TeaModel {
    // deleteAutoScalingRuleParam
    @NameInMap("deleteAutoScalingRuleParam")
    public String deleteAutoScalingRuleParamShrink;

    public static DeleteAutoScalingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalingRuleShrinkRequest self = new DeleteAutoScalingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalingRuleShrinkRequest setDeleteAutoScalingRuleParamShrink(String deleteAutoScalingRuleParamShrink) {
        this.deleteAutoScalingRuleParamShrink = deleteAutoScalingRuleParamShrink;
        return this;
    }
    public String getDeleteAutoScalingRuleParamShrink() {
        return this.deleteAutoScalingRuleParamShrink;
    }

}
