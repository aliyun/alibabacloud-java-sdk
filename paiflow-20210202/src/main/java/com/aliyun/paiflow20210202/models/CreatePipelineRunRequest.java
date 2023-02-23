// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreatePipelineRunRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Arguments")
    public String arguments;

    @NameInMap("Name")
    public String name;

    @NameInMap("NoConfirmRequired")
    public Boolean noConfirmRequired;

    @NameInMap("Options")
    public String options;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("PipelineManifest")
    public String pipelineManifest;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreatePipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRunRequest self = new CreatePipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRunRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreatePipelineRunRequest setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public CreatePipelineRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePipelineRunRequest setNoConfirmRequired(Boolean noConfirmRequired) {
        this.noConfirmRequired = noConfirmRequired;
        return this;
    }
    public Boolean getNoConfirmRequired() {
        return this.noConfirmRequired;
    }

    public CreatePipelineRunRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreatePipelineRunRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public CreatePipelineRunRequest setPipelineManifest(String pipelineManifest) {
        this.pipelineManifest = pipelineManifest;
        return this;
    }
    public String getPipelineManifest() {
        return this.pipelineManifest;
    }

    public CreatePipelineRunRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreatePipelineRunRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreatePipelineRunRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
