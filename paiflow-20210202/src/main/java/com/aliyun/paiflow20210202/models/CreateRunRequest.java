// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreateRunRequest extends TeaModel {
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PipelineManifest")
    public String pipelineManifest;

    @NameInMap("Arguments")
    public String arguments;

    @NameInMap("NoConfirmRequired")
    public Boolean noConfirmRequired;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("Source")
    public String source;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("Options")
    public String options;

    public static CreateRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRunRequest self = new CreateRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateRunRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public CreateRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRunRequest setPipelineManifest(String pipelineManifest) {
        this.pipelineManifest = pipelineManifest;
        return this;
    }
    public String getPipelineManifest() {
        return this.pipelineManifest;
    }

    public CreateRunRequest setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public CreateRunRequest setNoConfirmRequired(Boolean noConfirmRequired) {
        this.noConfirmRequired = noConfirmRequired;
        return this;
    }
    public Boolean getNoConfirmRequired() {
        return this.noConfirmRequired;
    }

    public CreateRunRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateRunRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateRunRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateRunRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
