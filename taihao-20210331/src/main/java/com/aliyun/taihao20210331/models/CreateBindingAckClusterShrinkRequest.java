// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateBindingAckClusterShrinkRequest extends TeaModel {
    // createBindingAckClusterParam
    @NameInMap("createBindingAckClusterParam")
    public String createBindingAckClusterParamShrink;

    public static CreateBindingAckClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingAckClusterShrinkRequest self = new CreateBindingAckClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBindingAckClusterShrinkRequest setCreateBindingAckClusterParamShrink(String createBindingAckClusterParamShrink) {
        this.createBindingAckClusterParamShrink = createBindingAckClusterParamShrink;
        return this;
    }
    public String getCreateBindingAckClusterParamShrink() {
        return this.createBindingAckClusterParamShrink;
    }

}
