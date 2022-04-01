// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterScriptRequest extends TeaModel {
    // updateClusterScriptParam
    @NameInMap("updateClusterScriptParam")
    public UpdateClusterScriptParam updateClusterScriptParam;

    public static UpdateClusterScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterScriptRequest self = new UpdateClusterScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterScriptRequest setUpdateClusterScriptParam(UpdateClusterScriptParam updateClusterScriptParam) {
        this.updateClusterScriptParam = updateClusterScriptParam;
        return this;
    }
    public UpdateClusterScriptParam getUpdateClusterScriptParam() {
        return this.updateClusterScriptParam;
    }

}
