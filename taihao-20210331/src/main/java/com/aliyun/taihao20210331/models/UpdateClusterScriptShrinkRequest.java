// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterScriptShrinkRequest extends TeaModel {
    // updateClusterScriptParam
    @NameInMap("updateClusterScriptParam")
    public String updateClusterScriptParamShrink;

    public static UpdateClusterScriptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterScriptShrinkRequest self = new UpdateClusterScriptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterScriptShrinkRequest setUpdateClusterScriptParamShrink(String updateClusterScriptParamShrink) {
        this.updateClusterScriptParamShrink = updateClusterScriptParamShrink;
        return this;
    }
    public String getUpdateClusterScriptParamShrink() {
        return this.updateClusterScriptParamShrink;
    }

}
