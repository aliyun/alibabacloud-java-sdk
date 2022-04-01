// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateBindingAckClusterRequest extends TeaModel {
    // createBindingAckClusterParam
    @NameInMap("createBindingAckClusterParam")
    public CreateBindingAckClusterParam createBindingAckClusterParam;

    public static CreateBindingAckClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingAckClusterRequest self = new CreateBindingAckClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateBindingAckClusterRequest setCreateBindingAckClusterParam(CreateBindingAckClusterParam createBindingAckClusterParam) {
        this.createBindingAckClusterParam = createBindingAckClusterParam;
        return this;
    }
    public CreateBindingAckClusterParam getCreateBindingAckClusterParam() {
        return this.createBindingAckClusterParam;
    }

}
