// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTrainTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTrainTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainTaskResponseBody self = new GetTrainTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainTaskResponseBody setData(GetTrainTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainTaskResponseBodyData getData() {
        return this.data;
    }

    public GetTrainTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTrainTaskResponseBodyData extends TeaModel {
        @NameInMap("DatasetId")
        public Long datasetId;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailureReason")
        public String failureReason;

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

        @NameInMap("TrainUseTime")
        public Long trainUseTime;

        public static GetTrainTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainTaskResponseBodyData self = new GetTrainTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainTaskResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public GetTrainTaskResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetTrainTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTrainTaskResponseBodyData setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public GetTrainTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTrainTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTrainTaskResponseBodyData setLabelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }
        public Long getLabelId() {
            return this.labelId;
        }

        public GetTrainTaskResponseBodyData setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public GetTrainTaskResponseBodyData setModelEffect(String modelEffect) {
            this.modelEffect = modelEffect;
            return this;
        }
        public String getModelEffect() {
            return this.modelEffect;
        }

        public GetTrainTaskResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public GetTrainTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTrainTaskResponseBodyData setTrainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }
        public String getTrainMode() {
            return this.trainMode;
        }

        public GetTrainTaskResponseBodyData setTrainStatus(String trainStatus) {
            this.trainStatus = trainStatus;
            return this;
        }
        public String getTrainStatus() {
            return this.trainStatus;
        }

        public GetTrainTaskResponseBodyData setTrainUseTime(Long trainUseTime) {
            this.trainUseTime = trainUseTime;
            return this;
        }
        public Long getTrainUseTime() {
            return this.trainUseTime;
        }

    }

}
