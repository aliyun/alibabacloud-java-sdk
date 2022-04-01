// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityRequest extends TeaModel {
    @NameInMap("getAutoScalingActivityParam")
    public GetAutoScalingActivityParam getAutoScalingActivityParam;

    public static GetAutoScalingActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityRequest self = new GetAutoScalingActivityRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityRequest setGetAutoScalingActivityParam(GetAutoScalingActivityParam getAutoScalingActivityParam) {
        this.getAutoScalingActivityParam = getAutoScalingActivityParam;
        return this;
    }
    public GetAutoScalingActivityParam getGetAutoScalingActivityParam() {
        return this.getAutoScalingActivityParam;
    }

}
