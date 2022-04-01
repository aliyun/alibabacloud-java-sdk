// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class TerminateClusterOperationShrinkRequest extends TeaModel {
    // terminateClusterOperationParam
    @NameInMap("terminateClusterOperationParam")
    public String terminateClusterOperationParamShrink;

    public static TerminateClusterOperationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateClusterOperationShrinkRequest self = new TerminateClusterOperationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TerminateClusterOperationShrinkRequest setTerminateClusterOperationParamShrink(String terminateClusterOperationParamShrink) {
        this.terminateClusterOperationParamShrink = terminateClusterOperationParamShrink;
        return this;
    }
    public String getTerminateClusterOperationParamShrink() {
        return this.terminateClusterOperationParamShrink;
    }

}
