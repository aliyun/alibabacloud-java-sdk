// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterScriptRequest extends TeaModel {
    // createClusterScriptParam
    @NameInMap("createClusterScriptParam")
    public CreateClusterScriptParam createClusterScriptParam;

    public static CreateClusterScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterScriptRequest self = new CreateClusterScriptRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterScriptRequest setCreateClusterScriptParam(CreateClusterScriptParam createClusterScriptParam) {
        this.createClusterScriptParam = createClusterScriptParam;
        return this;
    }
    public CreateClusterScriptParam getCreateClusterScriptParam() {
        return this.createClusterScriptParam;
    }

}
