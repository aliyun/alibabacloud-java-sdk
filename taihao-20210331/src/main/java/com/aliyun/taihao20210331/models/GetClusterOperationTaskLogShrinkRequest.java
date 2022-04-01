// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationTaskLogShrinkRequest extends TeaModel {
    // getClusterOperationTaskLogParam
    @NameInMap("getClusterOperationTaskLogParam")
    public String getClusterOperationTaskLogParamShrink;

    public static GetClusterOperationTaskLogShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationTaskLogShrinkRequest self = new GetClusterOperationTaskLogShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationTaskLogShrinkRequest setGetClusterOperationTaskLogParamShrink(String getClusterOperationTaskLogParamShrink) {
        this.getClusterOperationTaskLogParamShrink = getClusterOperationTaskLogParamShrink;
        return this;
    }
    public String getGetClusterOperationTaskLogParamShrink() {
        return this.getClusterOperationTaskLogParamShrink;
    }

}
