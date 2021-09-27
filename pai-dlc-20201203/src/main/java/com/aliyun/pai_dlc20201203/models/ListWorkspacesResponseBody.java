// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    // 工作空间列表
    @NameInMap("Workspaces")
    public java.util.List<Workspace> workspaces;

    // 结果数
    @NameInMap("TotalCount")
    public Long totalCount;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setWorkspaces(java.util.List<Workspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Workspace> getWorkspaces() {
        return this.workspaces;
    }

    public ListWorkspacesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
