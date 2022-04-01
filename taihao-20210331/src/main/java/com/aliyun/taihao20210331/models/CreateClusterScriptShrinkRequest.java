// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterScriptShrinkRequest extends TeaModel {
    // createClusterScriptParam
    @NameInMap("createClusterScriptParam")
    public String createClusterScriptParamShrink;

    public static CreateClusterScriptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterScriptShrinkRequest self = new CreateClusterScriptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterScriptShrinkRequest setCreateClusterScriptParamShrink(String createClusterScriptParamShrink) {
        this.createClusterScriptParamShrink = createClusterScriptParamShrink;
        return this;
    }
    public String getCreateClusterScriptParamShrink() {
        return this.createClusterScriptParamShrink;
    }

}
