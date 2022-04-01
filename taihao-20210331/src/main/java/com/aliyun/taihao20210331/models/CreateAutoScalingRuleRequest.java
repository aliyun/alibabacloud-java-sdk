// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateAutoScalingRuleRequest extends TeaModel {
    // createAutoScalingRuleParam
    @NameInMap("createAutoScalingRuleParam")
    public CreateAutoScalingRuleParam createAutoScalingRuleParam;

    public static CreateAutoScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingRuleRequest self = new CreateAutoScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingRuleRequest setCreateAutoScalingRuleParam(CreateAutoScalingRuleParam createAutoScalingRuleParam) {
        this.createAutoScalingRuleParam = createAutoScalingRuleParam;
        return this;
    }
    public CreateAutoScalingRuleParam getCreateAutoScalingRuleParam() {
        return this.createAutoScalingRuleParam;
    }

}
