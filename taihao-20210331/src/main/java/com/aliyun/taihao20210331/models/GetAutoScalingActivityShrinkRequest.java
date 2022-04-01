// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityShrinkRequest extends TeaModel {
    @NameInMap("getAutoScalingActivityParam")
    public String getAutoScalingActivityParamShrink;

    public static GetAutoScalingActivityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityShrinkRequest self = new GetAutoScalingActivityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityShrinkRequest setGetAutoScalingActivityParamShrink(String getAutoScalingActivityParamShrink) {
        this.getAutoScalingActivityParamShrink = getAutoScalingActivityParamShrink;
        return this;
    }
    public String getGetAutoScalingActivityParamShrink() {
        return this.getAutoScalingActivityParamShrink;
    }

}
