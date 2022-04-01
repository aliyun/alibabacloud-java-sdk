// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodesRequest extends TeaModel {
    // updateAckClusterNodesParam
    @NameInMap("updateAckClusterNodesParam")
    public UpdateAckClusterNodesParam updateAckClusterNodesParam;

    public static UpdateAckClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodesRequest self = new UpdateAckClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodesRequest setUpdateAckClusterNodesParam(UpdateAckClusterNodesParam updateAckClusterNodesParam) {
        this.updateAckClusterNodesParam = updateAckClusterNodesParam;
        return this;
    }
    public UpdateAckClusterNodesParam getUpdateAckClusterNodesParam() {
        return this.updateAckClusterNodesParam;
    }

}
