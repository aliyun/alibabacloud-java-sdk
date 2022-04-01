// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AddClusterApplicationShrinkRequest extends TeaModel {
    @NameInMap("addApplicationParam")
    public String addApplicationParamShrink;

    public static AddClusterApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClusterApplicationShrinkRequest self = new AddClusterApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddClusterApplicationShrinkRequest setAddApplicationParamShrink(String addApplicationParamShrink) {
        this.addApplicationParamShrink = addApplicationParamShrink;
        return this;
    }
    public String getAddApplicationParamShrink() {
        return this.addApplicationParamShrink;
    }

}
