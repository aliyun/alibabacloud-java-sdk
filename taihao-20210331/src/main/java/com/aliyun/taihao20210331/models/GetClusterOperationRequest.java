// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationRequest extends TeaModel {
    // getClusterOperationParam
    @NameInMap("getClusterOperationParam")
    public GetClusterOperationParam getClusterOperationParam;

    public static GetClusterOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationRequest self = new GetClusterOperationRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationRequest setGetClusterOperationParam(GetClusterOperationParam getClusterOperationParam) {
        this.getClusterOperationParam = getClusterOperationParam;
        return this;
    }
    public GetClusterOperationParam getGetClusterOperationParam() {
        return this.getClusterOperationParam;
    }

}
