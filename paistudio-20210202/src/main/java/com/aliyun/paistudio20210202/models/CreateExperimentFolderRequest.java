// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentFolderRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("Source")
    public String source;

    public static CreateExperimentFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentFolderRequest self = new CreateExperimentFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentFolderRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
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

}
