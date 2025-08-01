// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTasksResponseBody extends TeaModel {
    /**
     * <p>Internal error code. Set only when the response has an error.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response error message. Set only when the response has an error.</p>
     * 
     * <strong>example:</strong>
     * <p>page number should be greater than 0</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6F352A02-9C0D-54A7-B57C-663CF71D5714</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListOnlineEvalTasksResponseBodyTasks> tasks;

    /**
     * <p>Total number of tasks that meet the criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOnlineEvalTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineEvalTasksResponseBody self = new ListOnlineEvalTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOnlineEvalTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOnlineEvalTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOnlineEvalTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOnlineEvalTasksResponseBody setTasks(java.util.List<ListOnlineEvalTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListOnlineEvalTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListOnlineEvalTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOnlineEvalTasksResponseBodyTasksFilters extends TeaModel {
        /**
         * <p>The key of the filter condition.</p>
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
         * <p>The matching operator of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>=
         * StartsWith
         * Contains</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListOnlineEvalTasksResponseBodyTasksFilters build(java.util.Map<String, ?> map) throws Exception {
            ListOnlineEvalTasksResponseBodyTasksFilters self = new ListOnlineEvalTasksResponseBodyTasksFilters();
            return TeaModel.build(map, self);
        }

        public ListOnlineEvalTasksResponseBodyTasksFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListOnlineEvalTasksResponseBodyTasksFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListOnlineEvalTasksResponseBodyTasksFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListOnlineEvalTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The Alibaba Cloud account (primary account) of the task creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1512522691911111</p>
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
         * <p>this task is for application evaluation</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EvalResults")
        public String evalResults;

        /**
         * <p>Extract specific path values from JSON-formatted trace data as input for the evaluation operation. These JSON paths are defined in this EvaluationConfig structure.</p>
         */
        @NameInMap("EvaluationConfig")
        public EvaluationConfig evaluationConfig;

        /**
         * <p>The list define the search filter conditions for the evaluation task to search a certain amount of trace data generated by the user application, which serves as input data for the evaluation operation.</p>
         */
        @NameInMap("Filters")
        public java.util.List<ListOnlineEvalTasksResponseBodyTasksFilters> filters;

        /**
         * <p>The UTC creation time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-07 13:24:35</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Task UTC end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-09 13:24:35</p>
         */
        @NameInMap("GmtEndTime")
        public String gmtEndTime;

        /**
         * <p>The UTC start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-08 13:24:35</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9f50cd72efcf36535152ee811a911115</p>
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
         * <p>my-foo-evaluation-task</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RecordCount")
        public Integer recordCount;

        /**
         * <p>The evaluation task needs to search for a certain amount of trace data generated by the user\&quot;s application as input data for the evaluation operation. This defines the time window for each data search.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("SamplingFrequencyMinutes")
        public Integer samplingFrequencyMinutes;

        /**
         * <p>The percentage of the data searched within a time window that is used as input data for the evaluation. For example, 100 means all the searched data is used as input, 20 means 20% of the searched data is randomly selected as input.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>2222222222</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListOnlineEvalTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListOnlineEvalTasksResponseBodyTasks self = new ListOnlineEvalTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListOnlineEvalTasksResponseBodyTasks setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListOnlineEvalTasksResponseBodyTasks setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListOnlineEvalTasksResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOnlineEvalTasksResponseBodyTasks setEvalResults(String evalResults) {
            this.evalResults = evalResults;
            return this;
        }
        public String getEvalResults() {
            return this.evalResults;
        }

        public ListOnlineEvalTasksResponseBodyTasks setEvaluationConfig(EvaluationConfig evaluationConfig) {
            this.evaluationConfig = evaluationConfig;
            return this;
        }
        public EvaluationConfig getEvaluationConfig() {
            return this.evaluationConfig;
        }

        public ListOnlineEvalTasksResponseBodyTasks setFilters(java.util.List<ListOnlineEvalTasksResponseBodyTasksFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<ListOnlineEvalTasksResponseBodyTasksFilters> getFilters() {
            return this.filters;
        }

        public ListOnlineEvalTasksResponseBodyTasks setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListOnlineEvalTasksResponseBodyTasks setGmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
            return this;
        }
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        public ListOnlineEvalTasksResponseBodyTasks setGmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        public ListOnlineEvalTasksResponseBodyTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOnlineEvalTasksResponseBodyTasks setModelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public ModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public ListOnlineEvalTasksResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOnlineEvalTasksResponseBodyTasks setRecordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Integer getRecordCount() {
            return this.recordCount;
        }

        public ListOnlineEvalTasksResponseBodyTasks setSamplingFrequencyMinutes(Integer samplingFrequencyMinutes) {
            this.samplingFrequencyMinutes = samplingFrequencyMinutes;
            return this;
        }
        public Integer getSamplingFrequencyMinutes() {
            return this.samplingFrequencyMinutes;
        }

        public ListOnlineEvalTasksResponseBodyTasks setSamplingRatio(Integer samplingRatio) {
            this.samplingRatio = samplingRatio;
            return this;
        }
        public Integer getSamplingRatio() {
            return this.samplingRatio;
        }

        public ListOnlineEvalTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOnlineEvalTasksResponseBodyTasks setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
