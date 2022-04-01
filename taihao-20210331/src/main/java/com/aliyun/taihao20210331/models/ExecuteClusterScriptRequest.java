// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ExecuteClusterScriptRequest extends TeaModel {
    // executeClusterScriptParam
    @NameInMap("executeClusterScriptParam")
    public ExecuteClusterScriptParam executeClusterScriptParam;

    public static ExecuteClusterScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteClusterScriptRequest self = new ExecuteClusterScriptRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteClusterScriptRequest setExecuteClusterScriptParam(ExecuteClusterScriptParam executeClusterScriptParam) {
        this.executeClusterScriptParam = executeClusterScriptParam;
        return this;
    }
    public ExecuteClusterScriptParam getExecuteClusterScriptParam() {
        return this.executeClusterScriptParam;
    }

}
