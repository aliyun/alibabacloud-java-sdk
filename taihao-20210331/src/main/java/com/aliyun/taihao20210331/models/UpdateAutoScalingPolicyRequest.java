// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAutoScalingPolicyRequest extends TeaModel {
    @NameInMap("updateAutoScalingPolicyParam")
    public UpdateAutoScalingPolicyParam updateAutoScalingPolicyParam;

    public static UpdateAutoScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScalingPolicyRequest self = new UpdateAutoScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScalingPolicyRequest setUpdateAutoScalingPolicyParam(UpdateAutoScalingPolicyParam updateAutoScalingPolicyParam) {
        this.updateAutoScalingPolicyParam = updateAutoScalingPolicyParam;
        return this;
    }
    public UpdateAutoScalingPolicyParam getUpdateAutoScalingPolicyParam() {
        return this.updateAutoScalingPolicyParam;
    }

}
