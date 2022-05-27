// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetWorkspaceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceRequest self = new GetWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
