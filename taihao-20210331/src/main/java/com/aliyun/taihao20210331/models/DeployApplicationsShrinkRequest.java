// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeployApplicationsShrinkRequest extends TeaModel {
    // deployApplicationParam
    @NameInMap("deployApplicationParam")
    public String deployApplicationParamShrink;

    public static DeployApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationsShrinkRequest self = new DeployApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationsShrinkRequest setDeployApplicationParamShrink(String deployApplicationParamShrink) {
        this.deployApplicationParamShrink = deployApplicationParamShrink;
        return this;
    }
    public String getDeployApplicationParamShrink() {
        return this.deployApplicationParamShrink;
    }

}
