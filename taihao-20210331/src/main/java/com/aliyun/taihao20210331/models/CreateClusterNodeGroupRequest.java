// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterNodeGroupRequest extends TeaModel {
    @NameInMap("createClusterNodeGroupParam")
    public CreateClusterNodeGroupParam createClusterNodeGroupParam;

    public static CreateClusterNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodeGroupRequest self = new CreateClusterNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodeGroupRequest setCreateClusterNodeGroupParam(CreateClusterNodeGroupParam createClusterNodeGroupParam) {
        this.createClusterNodeGroupParam = createClusterNodeGroupParam;
        return this;
    }
    public CreateClusterNodeGroupParam getCreateClusterNodeGroupParam() {
        return this.createClusterNodeGroupParam;
    }

}
