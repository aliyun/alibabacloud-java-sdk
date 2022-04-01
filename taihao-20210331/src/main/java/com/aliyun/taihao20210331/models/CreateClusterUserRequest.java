// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterUserRequest extends TeaModel {
    @NameInMap("createClusterUserParam")
    public CreateClusterUserParam createClusterUserParam;

    public static CreateClusterUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterUserRequest self = new CreateClusterUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterUserRequest setCreateClusterUserParam(CreateClusterUserParam createClusterUserParam) {
        this.createClusterUserParam = createClusterUserParam;
        return this;
    }
    public CreateClusterUserParam getCreateClusterUserParam() {
        return this.createClusterUserParam;
    }

}
