// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeCordonParameters extends TeaModel {
    /**
     * <p>User-configurable reason for disabling scheduling</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Quota ID, used when disabling edge zone scheduling in a workspace</p>
     * 
     * <strong>example:</strong>
     * <p>quota1dkoutl3tj1</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>Workspace ID, used when disabling edge zone scheduling in a workspace</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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
