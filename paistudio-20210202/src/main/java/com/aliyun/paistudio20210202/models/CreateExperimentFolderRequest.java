// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentFolderRequest extends TeaModel {
    // 工作空间内可见性 PUBLIC; PRIVATE 默认PUBLIC
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("Source")
    public String source;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateExperimentFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentFolderRequest self = new CreateExperimentFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentFolderRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateExperimentFolderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperimentFolderRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CreateExperimentFolderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateExperimentFolderRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
