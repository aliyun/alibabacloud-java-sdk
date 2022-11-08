// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateTrainTaskRequest extends TeaModel {
    @NameInMap("AdvancedParameters")
    public String advancedParameters;

    @NameInMap("DatasetIds")
    public String datasetIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("LabelIds")
    public String labelIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("PreTrainTaskFlag")
    public Boolean preTrainTaskFlag;

    @NameInMap("PreTrainTaskId")
    public Long preTrainTaskId;

    @NameInMap("TrainMode")
    public String trainMode;

    public static UpdateTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainTaskRequest self = new UpdateTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrainTaskRequest setAdvancedParameters(String advancedParameters) {
        this.advancedParameters = advancedParameters;
        return this;
    }
    public String getAdvancedParameters() {
        return this.advancedParameters;
    }

    public UpdateTrainTaskRequest setDatasetIds(String datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public String getDatasetIds() {
        return this.datasetIds;
    }

    public UpdateTrainTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTrainTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTrainTaskRequest setLabelIds(String labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public String getLabelIds() {
        return this.labelIds;
    }

    public UpdateTrainTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTrainTaskRequest setPreTrainTaskFlag(Boolean preTrainTaskFlag) {
        this.preTrainTaskFlag = preTrainTaskFlag;
        return this;
    }
    public Boolean getPreTrainTaskFlag() {
        return this.preTrainTaskFlag;
    }

    public UpdateTrainTaskRequest setPreTrainTaskId(Long preTrainTaskId) {
        this.preTrainTaskId = preTrainTaskId;
        return this;
    }
    public Long getPreTrainTaskId() {
        return this.preTrainTaskId;
    }

    public UpdateTrainTaskRequest setTrainMode(String trainMode) {
        this.trainMode = trainMode;
        return this;
    }
    public String getTrainMode() {
        return this.trainMode;
    }

}
