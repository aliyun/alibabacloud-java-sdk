// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateTrainTaskRequest extends TeaModel {
    @NameInMap("AdvancedParameters")
    public String advancedParameters;

    @NameInMap("DatasetIds")
    public String datasetIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("LabelIds")
    public String labelIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("PreTrainTaskId")
    public Long preTrainTaskId;

    @NameInMap("TrainMode")
    public String trainMode;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainTaskRequest self = new CreateTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrainTaskRequest setAdvancedParameters(String advancedParameters) {
        this.advancedParameters = advancedParameters;
        return this;
    }
    public String getAdvancedParameters() {
        return this.advancedParameters;
    }

    public CreateTrainTaskRequest setDatasetIds(String datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public String getDatasetIds() {
        return this.datasetIds;
    }

    public CreateTrainTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTrainTaskRequest setLabelIds(String labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public String getLabelIds() {
        return this.labelIds;
    }

    public CreateTrainTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrainTaskRequest setPreTrainTaskId(Long preTrainTaskId) {
        this.preTrainTaskId = preTrainTaskId;
        return this;
    }
    public Long getPreTrainTaskId() {
        return this.preTrainTaskId;
    }

    public CreateTrainTaskRequest setTrainMode(String trainMode) {
        this.trainMode = trainMode;
        return this;
    }
    public String getTrainMode() {
        return this.trainMode;
    }

    public CreateTrainTaskRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
