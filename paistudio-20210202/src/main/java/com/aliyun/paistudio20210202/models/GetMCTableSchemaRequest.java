// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetMCTableSchemaRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMCTableSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMCTableSchemaRequest self = new GetMCTableSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetMCTableSchemaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
