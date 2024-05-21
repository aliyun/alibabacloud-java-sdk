// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceRolesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListWorkspaceRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRolesRequest self = new ListWorkspaceRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRolesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
