// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class GetOnlineEvalTaskResponseBody extends TeaModel {
    /**
     * <p>Internal error code. Set only when the response is in error.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response error message. Set only when the response is in error.</p>
     * 
     * <strong>example:</strong>
     * <p>task id is empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>POP request ID</p>
     * 
     * <strong>example:</strong>
     * <p>6F352A02-9C0D-54A7-B57C-663CF71D5714</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Task information</p>
     */
    @NameInMap("Task")
    public GetOnlineEvalTaskResponseBodyTask task;

    public static GetOnlineEvalTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineEvalTaskResponseBody self = new GetOnlineEvalTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnlineEvalTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOnlineEvalTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOnlineEvalTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnlineEvalTaskResponseBody setTask(GetOnlineEvalTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetOnlineEvalTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetOnlineEvalTaskResponseBodyTaskFilters extends TeaModel {
        /**
         * <p>Key of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceId
         * ServiceName
         * Input
         * Output
         * Status
         * TraceType
         * SpanType
         * TraceName
         * SpanName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Filter condition match operator.</p>
         * 
         * <strong>example:</strong>
         * <p>=
         * StartsWith
         * Contains</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Value of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetOnlineEvalTaskResponseBodyTaskFilters build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineEvalTaskResponseBodyTaskFilters self = new GetOnlineEvalTaskResponseBodyTaskFilters();
            return TeaModel.build(map, self);
        }

        public GetOnlineEvalTaskResponseBodyTaskFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetOnlineEvalTaskResponseBodyTaskFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetOnlineEvalTaskResponseBodyTaskFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetOnlineEvalTaskResponseBodyTask extends TeaModel {
        /**
         * <p>The Alibaba Cloud account (primary account) of the task creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1195531608511111</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The name of the user application targeted by this task.</p>
         * 
         * <strong>example:</strong>
         * <p>my-llm-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Task description information</p>
         * 
         * <strong>example:</strong>
         * <p>这个任务做了这些事。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Deprecated. Will be removed.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated. Will be removed.</p>
         */
        @NameInMap("EvalResults")
        public String evalResults;

        /**
         * <p>Extract specific path values from JSON-formatted trace data as input for the evaluation operation. These JSON paths are defined within this EvaluationConfig structure.</p>
         */
        @NameInMap("EvaluationConfig")
        public EvaluationConfig evaluationConfig;

        /**
         * <p>The evaluation task needs to search for a certain amount of trace data generated by the user application as input data for the evaluation operation. This is a list that defines the search filter conditions.</p>
         */
        @NameInMap("Filters")
        public java.util.List<GetOnlineEvalTaskResponseBodyTaskFilters> filters;

        /**
         * <p>UTC creation time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-31 08:30:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>UTC end time of the trace data.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-10 13:20:00</p>
         */
        @NameInMap("GmtEndTime")
        public String gmtEndTime;

        /**
         * <p>UTC upper bound of the last sampling window</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-10 13:14:00</p>
         */
        @NameInMap("GmtLastSamplingWindowEndTime")
        public String gmtLastSamplingWindowEndTime;

        /**
         * <p>UTC lower bound of the last sampling window.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-10 13:11:00</p>
         */
        @NameInMap("GmtLastSamplingWindowStartTime")
        public String gmtLastSamplingWindowStartTime;

        /**
         * <p>UTC start time of the trace data.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-02</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>0839a02d-aa24-4174-90bb-7a773885934d</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Access configuration structure for the large model used internally by the evaluation task.</p>
         */
        @NameInMap("ModelConfig")
        public ModelConfig modelConfig;

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-eval-task-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Number of evaluation records</p>
         * 
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("RecordCount")
        public Integer recordCount;

        /**
         * <p>The evaluation task needs to search for a certain amount of trace data generated by the user application as input data for the evaluation operation. This defines the width of the time window for each search of input data.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SamplingFrequencyMinutes")
        public Integer samplingFrequencyMinutes;

        /**
         * <p>The percentage of the data found within a time window that is actually used as input for the evaluation task. For example, 100 means all the found data is used as input, 20 means 20% of the found data is randomly selected as input.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("SamplingRatio")
        public Integer samplingRatio;

        /**
         * <p>Task status</p>
         * 
         * <strong>example:</strong>
         * <p>CREATED
         * RUNNING
         * FINISHED
         * USER_CANCELED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Alibaba Cloud sub-account of the task creator.</p>
         * 
         * <strong>example:</strong>
         * <p>222222222222222222</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetOnlineEvalTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineEvalTaskResponseBodyTask self = new GetOnlineEvalTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetOnlineEvalTaskResponseBodyTask setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public GetOnlineEvalTaskResponseBodyTask setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetOnlineEvalTaskResponseBodyTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOnlineEvalTaskResponseBodyTask setEvalResults(String evalResults) {
            this.evalResults = evalResults;
            return this;
        }
        public String getEvalResults() {
            return this.evalResults;
        }

        public GetOnlineEvalTaskResponseBodyTask setEvaluationConfig(EvaluationConfig evaluationConfig) {
            this.evaluationConfig = evaluationConfig;
            return this;
        }
        public EvaluationConfig getEvaluationConfig() {
            return this.evaluationConfig;
        }

        public GetOnlineEvalTaskResponseBodyTask setFilters(java.util.List<GetOnlineEvalTaskResponseBodyTaskFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<GetOnlineEvalTaskResponseBodyTaskFilters> getFilters() {
            return this.filters;
        }

        public GetOnlineEvalTaskResponseBodyTask setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetOnlineEvalTaskResponseBodyTask setGmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
            return this;
        }
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        public GetOnlineEvalTaskResponseBodyTask setGmtLastSamplingWindowEndTime(String gmtLastSamplingWindowEndTime) {
            this.gmtLastSamplingWindowEndTime = gmtLastSamplingWindowEndTime;
            return this;
        }
        public String getGmtLastSamplingWindowEndTime() {
            return this.gmtLastSamplingWindowEndTime;
        }

        public GetOnlineEvalTaskResponseBodyTask setGmtLastSamplingWindowStartTime(String gmtLastSamplingWindowStartTime) {
            this.gmtLastSamplingWindowStartTime = gmtLastSamplingWindowStartTime;
            return this;
        }
        public String getGmtLastSamplingWindowStartTime() {
            return this.gmtLastSamplingWindowStartTime;
        }

        public GetOnlineEvalTaskResponseBodyTask setGmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        public GetOnlineEvalTaskResponseBodyTask setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOnlineEvalTaskResponseBodyTask setModelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public ModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public GetOnlineEvalTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOnlineEvalTaskResponseBodyTask setRecordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Integer getRecordCount() {
            return this.recordCount;
        }

        public GetOnlineEvalTaskResponseBodyTask setSamplingFrequencyMinutes(Integer samplingFrequencyMinutes) {
            this.samplingFrequencyMinutes = samplingFrequencyMinutes;
            return this;
        }
        public Integer getSamplingFrequencyMinutes() {
            return this.samplingFrequencyMinutes;
        }

        public GetOnlineEvalTaskResponseBodyTask setSamplingRatio(Integer samplingRatio) {
            this.samplingRatio = samplingRatio;
            return this;
        }
        public Integer getSamplingRatio() {
            return this.samplingRatio;
        }

        public GetOnlineEvalTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetOnlineEvalTaskResponseBodyTask setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
