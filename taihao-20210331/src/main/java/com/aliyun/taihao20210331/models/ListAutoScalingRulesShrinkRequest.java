// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingRulesShrinkRequest extends TeaModel {
    // listAutoScalingRulesParam
    @NameInMap("listAutoScalingRulesParam")
    public String listAutoScalingRulesParamShrink;

    public static ListAutoScalingRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRulesShrinkRequest self = new ListAutoScalingRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRulesShrinkRequest setListAutoScalingRulesParamShrink(String listAutoScalingRulesParamShrink) {
        this.listAutoScalingRulesParamShrink = listAutoScalingRulesParamShrink;
        return this;
    }
    public String getListAutoScalingRulesParamShrink() {
        return this.listAutoScalingRulesParamShrink;
    }

}
