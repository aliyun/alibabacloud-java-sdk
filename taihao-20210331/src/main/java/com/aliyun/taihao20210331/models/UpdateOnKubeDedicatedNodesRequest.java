// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateOnKubeDedicatedNodesRequest extends TeaModel {
    // updateOnKubeDedicatedNodesParam
    @NameInMap("updateOnKubeDedicatedNodesParam")
    public UpdateOnKubeDedicatedNodesParam updateOnKubeDedicatedNodesParam;

    public static UpdateOnKubeDedicatedNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnKubeDedicatedNodesRequest self = new UpdateOnKubeDedicatedNodesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOnKubeDedicatedNodesRequest setUpdateOnKubeDedicatedNodesParam(UpdateOnKubeDedicatedNodesParam updateOnKubeDedicatedNodesParam) {
        this.updateOnKubeDedicatedNodesParam = updateOnKubeDedicatedNodesParam;
        return this;
    }
    public UpdateOnKubeDedicatedNodesParam getUpdateOnKubeDedicatedNodesParam() {
        return this.updateOnKubeDedicatedNodesParam;
    }

}
