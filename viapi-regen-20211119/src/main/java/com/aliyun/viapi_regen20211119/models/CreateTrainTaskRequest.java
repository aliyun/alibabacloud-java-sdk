// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateTrainTaskRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("LabelId")
    public Long labelId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TrainMode")
    public String trainMode;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainTaskRequest self = new CreateTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrainTaskRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public CreateTrainTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTrainTaskRequest setLabelId(Long labelId) {
        this.labelId = labelId;
        return this;
    }
    public Long getLabelId() {
        return this.labelId;
    }

    public CreateTrainTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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
