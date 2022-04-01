// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterNodeGroupRequest extends TeaModel {
    // updateClusterNodeGroupParam
    @NameInMap("updateClusterNodeGroupParam")
    public UpdateClusterNodeGroupParam updateClusterNodeGroupParam;

    public static UpdateClusterNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNodeGroupRequest self = new UpdateClusterNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNodeGroupRequest setUpdateClusterNodeGroupParam(UpdateClusterNodeGroupParam updateClusterNodeGroupParam) {
        this.updateClusterNodeGroupParam = updateClusterNodeGroupParam;
        return this;
    }
    public UpdateClusterNodeGroupParam getUpdateClusterNodeGroupParam() {
        return this.updateClusterNodeGroupParam;
    }

}
