// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateTrainTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateTrainTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrainTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainTaskResponseBody self = new UpdateTrainTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrainTaskResponseBody setData(UpdateTrainTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateTrainTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateTrainTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateTrainTaskResponseBodyData extends TeaModel {
        @NameInMap("DatasetId")
        public Long datasetId;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LabelId")
        public Long labelId;

        @NameInMap("LabelName")
        public String labelName;

        @NameInMap("ModelEffect")
        public String modelEffect;

        @NameInMap("ModelId")
        public Long modelId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TrainMode")
        public String trainMode;

        @NameInMap("TrainStatus")
        public String trainStatus;

        public static UpdateTrainTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrainTaskResponseBodyData self = new UpdateTrainTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTrainTaskResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public UpdateTrainTaskResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public UpdateTrainTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateTrainTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateTrainTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateTrainTaskResponseBodyData setLabelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }
        public Long getLabelId() {
            return this.labelId;
        }

        public UpdateTrainTaskResponseBodyData setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public UpdateTrainTaskResponseBodyData setModelEffect(String modelEffect) {
            this.modelEffect = modelEffect;
            return this;
        }
        public String getModelEffect() {
            return this.modelEffect;
        }

        public UpdateTrainTaskResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public UpdateTrainTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public UpdateTrainTaskResponseBodyData setTrainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }
        public String getTrainMode() {
            return this.trainMode;
        }

        public UpdateTrainTaskResponseBodyData setTrainStatus(String trainStatus) {
            this.trainStatus = trainStatus;
            return this;
        }
        public String getTrainStatus() {
            return this.trainStatus;
        }

    }

}
