// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterScriptShrinkRequest extends TeaModel {
    // deleteClusterScriptParam
    @NameInMap("deleteClusterScriptParam")
    public String deleteClusterScriptParamShrink;

    public static DeleteClusterScriptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterScriptShrinkRequest self = new DeleteClusterScriptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterScriptShrinkRequest setDeleteClusterScriptParamShrink(String deleteClusterScriptParamShrink) {
        this.deleteClusterScriptParamShrink = deleteClusterScriptParamShrink;
        return this;
    }
    public String getDeleteClusterScriptParamShrink() {
        return this.deleteClusterScriptParamShrink;
    }

}
