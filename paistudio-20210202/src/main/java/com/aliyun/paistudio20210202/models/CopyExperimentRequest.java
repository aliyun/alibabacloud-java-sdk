// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CopyExperimentRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Description")
    public String description;

    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Source")
    public String source;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CopyExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyExperimentRequest self = new CopyExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CopyExperimentRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CopyExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CopyExperimentRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public CopyExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyExperimentRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CopyExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
