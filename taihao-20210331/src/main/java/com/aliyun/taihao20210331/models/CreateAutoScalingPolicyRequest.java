// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateAutoScalingPolicyRequest extends TeaModel {
    // createAutoScalingPolicyParam
    @NameInMap("createAutoScalingPolicyParam")
    public CreateAutoScalingPolicyParam createAutoScalingPolicyParam;

    public static CreateAutoScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoScalingPolicyRequest self = new CreateAutoScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoScalingPolicyRequest setCreateAutoScalingPolicyParam(CreateAutoScalingPolicyParam createAutoScalingPolicyParam) {
        this.createAutoScalingPolicyParam = createAutoScalingPolicyParam;
        return this;
    }
    public CreateAutoScalingPolicyParam getCreateAutoScalingPolicyParam() {
        return this.createAutoScalingPolicyParam;
    }

}
