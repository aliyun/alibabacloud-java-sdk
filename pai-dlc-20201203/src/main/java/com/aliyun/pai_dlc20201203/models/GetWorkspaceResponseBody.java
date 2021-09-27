// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    // 工作空间
    @NameInMap("Workspace")
    public Workspace workspace;

    // 是否是当前工作空间的管理员
    @NameInMap("IsWorkspaceAdmin")
    public Boolean isWorkspaceAdmin;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setWorkspace(Workspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public Workspace getWorkspace() {
        return this.workspace;
    }

    public GetWorkspaceResponseBody setIsWorkspaceAdmin(Boolean isWorkspaceAdmin) {
        this.isWorkspaceAdmin = isWorkspaceAdmin;
        return this;
    }
    public Boolean getIsWorkspaceAdmin() {
        return this.isWorkspaceAdmin;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
