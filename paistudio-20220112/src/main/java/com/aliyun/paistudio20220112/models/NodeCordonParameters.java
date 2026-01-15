// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeCordonParameters extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static NodeCordonParameters build(java.util.Map<String, ?> map) throws Exception {
        NodeCordonParameters self = new NodeCordonParameters();
        return TeaModel.build(map, self);
    }

    public NodeCordonParameters setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public NodeCordonParameters setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public NodeCordonParameters setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
