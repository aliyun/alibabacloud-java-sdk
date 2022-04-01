// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationShrinkRequest extends TeaModel {
    // getClusterOperationParam
    @NameInMap("getClusterOperationParam")
    public String getClusterOperationParamShrink;

    public static GetClusterOperationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationShrinkRequest self = new GetClusterOperationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationShrinkRequest setGetClusterOperationParamShrink(String getClusterOperationParamShrink) {
        this.getClusterOperationParamShrink = getClusterOperationParamShrink;
        return this;
    }
    public String getGetClusterOperationParamShrink() {
        return this.getClusterOperationParamShrink;
    }

}
