// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRequest self = new DeleteWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
