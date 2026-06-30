// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetPrecisionTaskResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates that the request was successful. Other values indicate that the request failed. Use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("Data")
    public GetPrecisionTaskResponseBodyData data;

    /**
     * <p>If the request fails, this field provides the error details. If the request is successful, the value is \<code>successful\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of \<code>true\\</code> indicates success. A value of \<code>false\\</code> or \<code>null\\</code> indicates failure.</p>
     * 
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
        /**
         * <p>If the source is a dataset, this is the dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1212</p>
         */
        @NameInMap("DataSetId")
        public Long dataSetId;

        /**
         * <p>If the source is a dataset, this is the dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>数据集名称</p>
         */
        @NameInMap("DataSetName")
        public String dataSetName;

        /**
         * <p>The total duration of the audio recording.</p>
         * 
         * <strong>example:</strong>
         * <p>3423</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The number of incorrectly transcribed words.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("IncorrectWords")
        public Integer incorrectWords;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>任务名称</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Precisions")
        public GetPrecisionTaskResponseBodyDataPrecisions precisions;

        /**
         * <p>The source of the file. Possible values: 3: Dataset. 0: Call center.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Source")
        public Integer source;

        /**
         * <p>The task status. Possible values: 0: Transcribing. 1: Transcription complete.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7C1DEF5F-2C18-4D36-99C6-8C27*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of files in the task.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The time when the task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-10 20:26:29</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The total number of verified files.</p>
         * 
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
