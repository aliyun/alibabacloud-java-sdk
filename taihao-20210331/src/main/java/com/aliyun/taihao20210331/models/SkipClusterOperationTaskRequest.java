// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SkipClusterOperationTaskRequest extends TeaModel {
    // skipClusterOperationTaskParam
    @NameInMap("skipClusterOperationTaskParam")
    public SkipClusterOperationTaskParam skipClusterOperationTaskParam;

    public static SkipClusterOperationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipClusterOperationTaskRequest self = new SkipClusterOperationTaskRequest();
        return TeaModel.build(map, self);
    }

    public SkipClusterOperationTaskRequest setSkipClusterOperationTaskParam(SkipClusterOperationTaskParam skipClusterOperationTaskParam) {
        this.skipClusterOperationTaskParam = skipClusterOperationTaskParam;
        return this;
    }
    public SkipClusterOperationTaskParam getSkipClusterOperationTaskParam() {
        return this.skipClusterOperationTaskParam;
    }

}
