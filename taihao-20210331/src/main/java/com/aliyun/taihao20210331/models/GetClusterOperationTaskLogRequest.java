// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationTaskLogRequest extends TeaModel {
    // getClusterOperationTaskLogParam
    @NameInMap("getClusterOperationTaskLogParam")
    public GetClusterOperationTaskLogParam getClusterOperationTaskLogParam;

    public static GetClusterOperationTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationTaskLogRequest self = new GetClusterOperationTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationTaskLogRequest setGetClusterOperationTaskLogParam(GetClusterOperationTaskLogParam getClusterOperationTaskLogParam) {
        this.getClusterOperationTaskLogParam = getClusterOperationTaskLogParam;
        return this;
    }
    public GetClusterOperationTaskLogParam getGetClusterOperationTaskLogParam() {
        return this.getClusterOperationTaskLogParam;
    }

}
