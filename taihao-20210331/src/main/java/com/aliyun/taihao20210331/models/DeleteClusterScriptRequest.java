// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterScriptRequest extends TeaModel {
    // deleteClusterScriptParam
    @NameInMap("deleteClusterScriptParam")
    public DeleteClusterScriptParam deleteClusterScriptParam;

    public static DeleteClusterScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterScriptRequest self = new DeleteClusterScriptRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterScriptRequest setDeleteClusterScriptParam(DeleteClusterScriptParam deleteClusterScriptParam) {
        this.deleteClusterScriptParam = deleteClusterScriptParam;
        return this;
    }
    public DeleteClusterScriptParam getDeleteClusterScriptParam() {
        return this.deleteClusterScriptParam;
    }

}
