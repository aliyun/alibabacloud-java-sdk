// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ExecuteClusterScriptShrinkRequest extends TeaModel {
    // executeClusterScriptParam
    @NameInMap("executeClusterScriptParam")
    public String executeClusterScriptParamShrink;

    public static ExecuteClusterScriptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteClusterScriptShrinkRequest self = new ExecuteClusterScriptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteClusterScriptShrinkRequest setExecuteClusterScriptParamShrink(String executeClusterScriptParamShrink) {
        this.executeClusterScriptParamShrink = executeClusterScriptParamShrink;
        return this;
    }
    public String getExecuteClusterScriptParamShrink() {
        return this.executeClusterScriptParamShrink;
    }

}
