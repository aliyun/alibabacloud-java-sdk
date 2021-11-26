// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetPrecisionTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPrecisionTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPrecisionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrecisionTaskResponseBody self = new GetPrecisionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrecisionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPrecisionTaskResponseBody setData(GetPrecisionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPrecisionTaskResponseBodyData getData() {
        return this.data;
    }

    public GetPrecisionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrecisionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPrecisionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPrecisionTaskResponseBodyDataPrecisionsPrecision extends TeaModel {
        @NameInMap("ModelId")
        public Long modelId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Precision")
        public Float precision;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        public static GetPrecisionTaskResponseBodyDataPrecisionsPrecision build(java.util.Map<String, ?> map) throws Exception {
            GetPrecisionTaskResponseBodyDataPrecisionsPrecision self = new GetPrecisionTaskResponseBodyDataPrecisionsPrecision();
            return TeaModel.build(map, self);
        }

        public GetPrecisionTaskResponseBodyDataPrecisionsPrecision setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public GetPrecisionTaskResponseBodyDataPrecisionsPrecision setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetPrecisionTaskResponseBodyDataPrecisionsPrecision setPrecision(Float precision) {
            this.precision = precision;
            return this;
        }
        public Float getPrecision() {
            return this.precision;
        }

        public GetPrecisionTaskResponseBodyDataPrecisionsPrecision setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetPrecisionTaskResponseBodyDataPrecisionsPrecision setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetPrecisionTaskResponseBodyDataPrecisions extends TeaModel {
        @NameInMap("Precision")
        public java.util.List<GetPrecisionTaskResponseBodyDataPrecisionsPrecision> precision;

        public static GetPrecisionTaskResponseBodyDataPrecisions build(java.util.Map<String, ?> map) throws Exception {
            GetPrecisionTaskResponseBodyDataPrecisions self = new GetPrecisionTaskResponseBodyDataPrecisions();
            return TeaModel.build(map, self);
        }

        public GetPrecisionTaskResponseBodyDataPrecisions setPrecision(java.util.List<GetPrecisionTaskResponseBodyDataPrecisionsPrecision> precision) {
            this.precision = precision;
            return this;
        }
        public java.util.List<GetPrecisionTaskResponseBodyDataPrecisionsPrecision> getPrecision() {
            return this.precision;
        }

    }

    public static class GetPrecisionTaskResponseBodyData extends TeaModel {
        @NameInMap("DataSetId")
        public Long dataSetId;

        @NameInMap("DataSetName")
        public String dataSetName;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("IncorrectWords")
        public Integer incorrectWords;

        @NameInMap("Name")
        public String name;

        @NameInMap("Precisions")
        public GetPrecisionTaskResponseBodyDataPrecisions precisions;

        @NameInMap("Source")
        public Integer source;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VerifiedCount")
        public Integer verifiedCount;

        public static GetPrecisionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrecisionTaskResponseBodyData self = new GetPrecisionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrecisionTaskResponseBodyData setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetPrecisionTaskResponseBodyData setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetPrecisionTaskResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetPrecisionTaskResponseBodyData setIncorrectWords(Integer incorrectWords) {
            this.incorrectWords = incorrectWords;
            return this;
        }
        public Integer getIncorrectWords() {
            return this.incorrectWords;
        }

        public GetPrecisionTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPrecisionTaskResponseBodyData setPrecisions(GetPrecisionTaskResponseBodyDataPrecisions precisions) {
            this.precisions = precisions;
            return this;
        }
        public GetPrecisionTaskResponseBodyDataPrecisions getPrecisions() {
            return this.precisions;
        }

        public GetPrecisionTaskResponseBodyData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public GetPrecisionTaskResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetPrecisionTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetPrecisionTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetPrecisionTaskResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetPrecisionTaskResponseBodyData setVerifiedCount(Integer verifiedCount) {
            this.verifiedCount = verifiedCount;
            return this;
        }
        public Integer getVerifiedCount() {
            return this.verifiedCount;
        }

    }

}
