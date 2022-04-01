// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateAutoScalingRuleShrinkRequest extends TeaModel {
    // createAutoScalingRuleParam
    @NameInMap("createAutoScalingRuleParam")
    public String createAutoScalingRuleParamShrink;

    public static CreateAutoScalingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingRuleShrinkRequest self = new CreateAutoScalingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingRuleShrinkRequest setCreateAutoScalingRuleParamShrink(String createAutoScalingRuleParamShrink) {
        this.createAutoScalingRuleParamShrink = createAutoScalingRuleParamShrink;
        return this;
    }
    public String getCreateAutoScalingRuleParamShrink() {
        return this.createAutoScalingRuleParamShrink;
    }

}
