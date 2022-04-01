// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class TerminateClusterOperationRequest extends TeaModel {
    // terminateClusterOperationParam
    @NameInMap("terminateClusterOperationParam")
    public TerminateClusterOperationParam terminateClusterOperationParam;

    public static TerminateClusterOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateClusterOperationRequest self = new TerminateClusterOperationRequest();
        return TeaModel.build(map, self);
    }

    public TerminateClusterOperationRequest setTerminateClusterOperationParam(TerminateClusterOperationParam terminateClusterOperationParam) {
        this.terminateClusterOperationParam = terminateClusterOperationParam;
        return this;
    }
    public TerminateClusterOperationParam getTerminateClusterOperationParam() {
        return this.terminateClusterOperationParam;
    }

}
