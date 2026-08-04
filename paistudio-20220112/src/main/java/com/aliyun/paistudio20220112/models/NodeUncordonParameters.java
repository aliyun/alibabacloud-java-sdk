// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeUncordonParameters extends TeaModel {
    /**
     * <p>Quota ID. You can use this ID when you start a workspace or disable scheduling nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>quota1ci8g793pgm</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The ID of the workspace that contains the node to uncordon.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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
