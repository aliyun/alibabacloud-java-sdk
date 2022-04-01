// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterShrinkRequest extends TeaModel {
    @NameInMap("clusterBaseParam")
    public String clusterBaseParamShrink;

    public static GetClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterShrinkRequest self = new GetClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterShrinkRequest setClusterBaseParamShrink(String clusterBaseParamShrink) {
        this.clusterBaseParamShrink = clusterBaseParamShrink;
        return this;
    }
    public String getClusterBaseParamShrink() {
        return this.clusterBaseParamShrink;
    }

}
