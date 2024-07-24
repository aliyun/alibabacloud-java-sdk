// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetPrecisionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPrecisionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2311</p>
         */
        @NameInMap("ModelId")
        public Long modelId;

        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>0.98</p>
         */
        @NameInMap("Precision")
        public Float precision;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>593A04C0-E6E9-4CDC-8C99-B120C******</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1212</p>
         */
        @NameInMap("DataSetId")
        public Long dataSetId;

        @NameInMap("DataSetName")
        public String dataSetName;

        /**
         * <strong>example:</strong>
         * <p>3423</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("IncorrectWords")
        public Integer incorrectWords;

        @NameInMap("Name")
        public String name;

        @NameInMap("Precisions")
        public GetPrecisionTaskResponseBodyDataPrecisions precisions;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Source")
        public Integer source;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>7C1DEF5F-2C18-4D36-99C6-8C27*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <strong>example:</strong>
         * <p>2020-03-10 20:26:29</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
