// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UnRegisterClusterAckResourceRequest extends TeaModel {
    // unRegisterClusterAckResourceParam
    @NameInMap("unRegisterClusterAckResourceParam")
    public UnRegisterClusterAckResourceParam unRegisterClusterAckResourceParam;

    public static UnRegisterClusterAckResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterClusterAckResourceRequest self = new UnRegisterClusterAckResourceRequest();
        return TeaModel.build(map, self);
    }

    public UnRegisterClusterAckResourceRequest setUnRegisterClusterAckResourceParam(UnRegisterClusterAckResourceParam unRegisterClusterAckResourceParam) {
        this.unRegisterClusterAckResourceParam = unRegisterClusterAckResourceParam;
        return this;
    }
    public UnRegisterClusterAckResourceParam getUnRegisterClusterAckResourceParam() {
        return this.unRegisterClusterAckResourceParam;
    }

}
