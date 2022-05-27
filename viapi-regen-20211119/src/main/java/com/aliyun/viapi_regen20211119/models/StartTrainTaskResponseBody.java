// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StartTrainTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public StartTrainTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static StartTrainTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTrainTaskResponseBody self = new StartTrainTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTrainTaskResponseBody setData(StartTrainTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartTrainTaskResponseBodyData getData() {
        return this.data;
    }

    public StartTrainTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartTrainTaskResponseBodyData extends TeaModel {
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

        public static StartTrainTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartTrainTaskResponseBodyData self = new StartTrainTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartTrainTaskResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public StartTrainTaskResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public StartTrainTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public StartTrainTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public StartTrainTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public StartTrainTaskResponseBodyData setLabelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }
        public Long getLabelId() {
            return this.labelId;
        }

        public StartTrainTaskResponseBodyData setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public StartTrainTaskResponseBodyData setModelEffect(String modelEffect) {
            this.modelEffect = modelEffect;
            return this;
        }
        public String getModelEffect() {
            return this.modelEffect;
        }

        public StartTrainTaskResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public StartTrainTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public StartTrainTaskResponseBodyData setTrainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }
        public String getTrainMode() {
            return this.trainMode;
        }

        public StartTrainTaskResponseBodyData setTrainStatus(String trainStatus) {
            this.trainStatus = trainStatus;
            return this;
        }
        public String getTrainStatus() {
            return this.trainStatus;
        }

    }

}
