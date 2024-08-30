// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class WorkspaceIdName extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ws123456</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static WorkspaceIdName build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceIdName self = new WorkspaceIdName();
        return TeaModel.build(map, self);
    }

    public WorkspaceIdName setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
