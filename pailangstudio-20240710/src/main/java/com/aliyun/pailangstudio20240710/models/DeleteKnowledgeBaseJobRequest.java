// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteKnowledgeBaseJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseJobRequest self = new DeleteKnowledgeBaseJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
