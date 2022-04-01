// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAutoScalingRuleRequest extends TeaModel {
    // updateAutoScalingRuleParam
    @NameInMap("updateAutoScalingRuleParam")
    public UpdateAutoScalingRuleParam updateAutoScalingRuleParam;

    public static UpdateAutoScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScalingRuleRequest self = new UpdateAutoScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScalingRuleRequest setUpdateAutoScalingRuleParam(UpdateAutoScalingRuleParam updateAutoScalingRuleParam) {
        this.updateAutoScalingRuleParam = updateAutoScalingRuleParam;
        return this;
    }
    public UpdateAutoScalingRuleParam getUpdateAutoScalingRuleParam() {
        return this.updateAutoScalingRuleParam;
    }

}
