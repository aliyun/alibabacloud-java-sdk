// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is a description of the knowledge base job.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>285***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateKnowledgeBaseJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseJobRequest self = new UpdateKnowledgeBaseJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
