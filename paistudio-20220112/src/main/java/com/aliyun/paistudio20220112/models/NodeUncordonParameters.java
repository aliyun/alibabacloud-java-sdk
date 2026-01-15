// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeUncordonParameters extends TeaModel {
    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static NodeUncordonParameters build(java.util.Map<String, ?> map) throws Exception {
        NodeUncordonParameters self = new NodeUncordonParameters();
        return TeaModel.build(map, self);
    }

    public NodeUncordonParameters setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public NodeUncordonParameters setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
