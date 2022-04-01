// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationNodeRequest extends TeaModel {
    // getClusterOperationNodeParam
    @NameInMap("getClusterOperationNodeParam")
    public GetClusterOperationNodeParam getClusterOperationNodeParam;

    public static GetClusterOperationNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationNodeRequest self = new GetClusterOperationNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationNodeRequest setGetClusterOperationNodeParam(GetClusterOperationNodeParam getClusterOperationNodeParam) {
        this.getClusterOperationNodeParam = getClusterOperationNodeParam;
        return this;
    }
    public GetClusterOperationNodeParam getGetClusterOperationNodeParam() {
        return this.getClusterOperationNodeParam;
    }

}
