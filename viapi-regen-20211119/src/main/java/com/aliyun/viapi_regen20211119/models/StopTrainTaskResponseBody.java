// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StopTrainTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public StopTrainTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static StopTrainTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTrainTaskResponseBody self = new StopTrainTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTrainTaskResponseBody setData(StopTrainTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopTrainTaskResponseBodyData getData() {
        return this.data;
    }

    public StopTrainTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopTrainTaskResponseBodyData extends TeaModel {
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

        public static StopTrainTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopTrainTaskResponseBodyData self = new StopTrainTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopTrainTaskResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public StopTrainTaskResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public StopTrainTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public StopTrainTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public StopTrainTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public StopTrainTaskResponseBodyData setLabelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }
        public Long getLabelId() {
            return this.labelId;
        }

        public StopTrainTaskResponseBodyData setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public StopTrainTaskResponseBodyData setModelEffect(String modelEffect) {
            this.modelEffect = modelEffect;
            return this;
        }
        public String getModelEffect() {
            return this.modelEffect;
        }

        public StopTrainTaskResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public StopTrainTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public StopTrainTaskResponseBodyData setTrainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }
        public String getTrainMode() {
            return this.trainMode;
        }

        public StopTrainTaskResponseBodyData setTrainStatus(String trainStatus) {
            this.trainStatus = trainStatus;
            return this;
        }
        public String getTrainStatus() {
            return this.trainStatus;
        }

    }

}
