// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAutoScalingRuleShrinkRequest extends TeaModel {
    // updateAutoScalingRuleParam
    @NameInMap("updateAutoScalingRuleParam")
    public String updateAutoScalingRuleParamShrink;

    public static UpdateAutoScalingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScalingRuleShrinkRequest self = new UpdateAutoScalingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScalingRuleShrinkRequest setUpdateAutoScalingRuleParamShrink(String updateAutoScalingRuleParamShrink) {
        this.updateAutoScalingRuleParamShrink = updateAutoScalingRuleParamShrink;
        return this;
    }
    public String getUpdateAutoScalingRuleParamShrink() {
        return this.updateAutoScalingRuleParamShrink;
    }

}
