// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class EnableAutoScalingPolicyRequest extends TeaModel {
    // enableAutoScalingPolicyParam
    @NameInMap("enableAutoScalingPolicyParam")
    public EnableAutoScalingPolicyParam enableAutoScalingPolicyParam;

    public static EnableAutoScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoScalingPolicyRequest self = new EnableAutoScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public EnableAutoScalingPolicyRequest setEnableAutoScalingPolicyParam(EnableAutoScalingPolicyParam enableAutoScalingPolicyParam) {
        this.enableAutoScalingPolicyParam = enableAutoScalingPolicyParam;
        return this;
    }
    public EnableAutoScalingPolicyParam getEnableAutoScalingPolicyParam() {
        return this.enableAutoScalingPolicyParam;
    }

}
