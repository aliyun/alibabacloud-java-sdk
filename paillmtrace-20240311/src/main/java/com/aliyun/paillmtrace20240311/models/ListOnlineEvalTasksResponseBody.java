// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>page number should be greater than 0</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6F352A02-9C0D-54A7-B57C-663CF71D5714</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ListOnlineEvalTasksResponseBodyTasks> tasks;

    /**
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
         * <strong>example:</strong>
         * <p>=
         * StartsWith
         * Contains</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
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
         * <strong>example:</strong>
         * <p>1512522691911111</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <strong>example:</strong>
         * <p>my-llm-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Description")
        public String description;

        @NameInMap("EvaluationConfig")
        public EvaluationConfig evaluationConfig;

        @NameInMap("Filters")
        public java.util.List<ListOnlineEvalTasksResponseBodyTasksFilters> filters;

        /**
         * <strong>example:</strong>
         * <p>2025-04-07 13:24:35</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2025-04-09 13:24:35</p>
         */
        @NameInMap("GmtEndTime")
        public String gmtEndTime;

        /**
         * <strong>example:</strong>
         * <p>2025-04-08 13:24:35</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <strong>example:</strong>
         * <p>9f50cd72efcf36535152ee811a911115</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("ModelConfig")
        public ModelConfig modelConfig;

        /**
         * <strong>example:</strong>
         * <p>my-foo-evaluation-task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("SamplingFrequencyMinutes")
        public Integer samplingFrequencyMinutes;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("SamplingRatio")
        public Integer samplingRatio;

        /**
         * <strong>example:</strong>
         * <p>CREATED
         * RUNNING
         * FINISHED
         * USER_CANCELED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
