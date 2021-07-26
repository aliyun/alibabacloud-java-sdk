// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Source")
    public String source;

    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Options")
    public String options;

    public static CreateExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentRequest self = new CreateExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperimentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExperimentRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateExperimentRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public CreateExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateExperimentRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateExperimentRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
