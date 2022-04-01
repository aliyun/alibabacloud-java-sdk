// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateFullClusterRequest extends TeaModel {
    @NameInMap("createFullClusterParam")
    public CreateFullClusterParam createFullClusterParam;

    public static CreateFullClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFullClusterRequest self = new CreateFullClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateFullClusterRequest setCreateFullClusterParam(CreateFullClusterParam createFullClusterParam) {
        this.createFullClusterParam = createFullClusterParam;
        return this;
    }
    public CreateFullClusterParam getCreateFullClusterParam() {
        return this.createFullClusterParam;
    }

}
