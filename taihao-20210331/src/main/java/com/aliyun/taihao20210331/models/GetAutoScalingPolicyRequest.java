// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingPolicyRequest extends TeaModel {
    @NameInMap("getAutoScalingPolicyParam")
    public GetAutoScalingPolicyParam getAutoScalingPolicyParam;

    public static GetAutoScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingPolicyRequest self = new GetAutoScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingPolicyRequest setGetAutoScalingPolicyParam(GetAutoScalingPolicyParam getAutoScalingPolicyParam) {
        this.getAutoScalingPolicyParam = getAutoScalingPolicyParam;
        return this;
    }
    public GetAutoScalingPolicyParam getGetAutoScalingPolicyParam() {
        return this.getAutoScalingPolicyParam;
    }

}
