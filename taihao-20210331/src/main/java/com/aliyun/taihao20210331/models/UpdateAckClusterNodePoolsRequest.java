// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodePoolsRequest extends TeaModel {
    // updateAckClusterNodePoolsParam
    @NameInMap("updateAckClusterNodePoolsParam")
    public UpdateAckClusterNodePoolsParam updateAckClusterNodePoolsParam;

    public static UpdateAckClusterNodePoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodePoolsRequest self = new UpdateAckClusterNodePoolsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodePoolsRequest setUpdateAckClusterNodePoolsParam(UpdateAckClusterNodePoolsParam updateAckClusterNodePoolsParam) {
        this.updateAckClusterNodePoolsParam = updateAckClusterNodePoolsParam;
        return this;
    }
    public UpdateAckClusterNodePoolsParam getUpdateAckClusterNodePoolsParam() {
        return this.updateAckClusterNodePoolsParam;
    }

}
