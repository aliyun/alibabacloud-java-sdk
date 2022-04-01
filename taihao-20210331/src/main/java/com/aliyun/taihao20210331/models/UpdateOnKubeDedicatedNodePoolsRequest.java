// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateOnKubeDedicatedNodePoolsRequest extends TeaModel {
    // updateOnKubeDedicatedNodePoolsParam
    @NameInMap("updateOnKubeDedicatedNodePoolsParam")
    public UpdateOnKubeDedicatedNodePoolsParam updateOnKubeDedicatedNodePoolsParam;

    public static UpdateOnKubeDedicatedNodePoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnKubeDedicatedNodePoolsRequest self = new UpdateOnKubeDedicatedNodePoolsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOnKubeDedicatedNodePoolsRequest setUpdateOnKubeDedicatedNodePoolsParam(UpdateOnKubeDedicatedNodePoolsParam updateOnKubeDedicatedNodePoolsParam) {
        this.updateOnKubeDedicatedNodePoolsParam = updateOnKubeDedicatedNodePoolsParam;
        return this;
    }
    public UpdateOnKubeDedicatedNodePoolsParam getUpdateOnKubeDedicatedNodePoolsParam() {
        return this.updateOnKubeDedicatedNodePoolsParam;
    }

}
