// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterUserRequest extends TeaModel {
    @NameInMap("deleteClusterUserParam")
    public DeleteClusterUserParam deleteClusterUserParam;

    public static DeleteClusterUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterUserRequest self = new DeleteClusterUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterUserRequest setDeleteClusterUserParam(DeleteClusterUserParam deleteClusterUserParam) {
        this.deleteClusterUserParam = deleteClusterUserParam;
        return this;
    }
    public DeleteClusterUserParam getDeleteClusterUserParam() {
        return this.deleteClusterUserParam;
    }

}
