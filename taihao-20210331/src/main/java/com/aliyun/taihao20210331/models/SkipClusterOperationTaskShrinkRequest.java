// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SkipClusterOperationTaskShrinkRequest extends TeaModel {
    // skipClusterOperationTaskParam
    @NameInMap("skipClusterOperationTaskParam")
    public String skipClusterOperationTaskParamShrink;

    public static SkipClusterOperationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipClusterOperationTaskShrinkRequest self = new SkipClusterOperationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SkipClusterOperationTaskShrinkRequest setSkipClusterOperationTaskParamShrink(String skipClusterOperationTaskParamShrink) {
        this.skipClusterOperationTaskParamShrink = skipClusterOperationTaskParamShrink;
        return this;
    }
    public String getSkipClusterOperationTaskParamShrink() {
        return this.skipClusterOperationTaskParamShrink;
    }

}
