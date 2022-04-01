// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("createClusterParam")
    public CreateClusterParam createClusterParam;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setCreateClusterParam(CreateClusterParam createClusterParam) {
        this.createClusterParam = createClusterParam;
        return this;
    }
    public CreateClusterParam getCreateClusterParam() {
        return this.createClusterParam;
    }

}
