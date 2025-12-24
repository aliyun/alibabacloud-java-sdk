// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobExecutionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ListJobExecutionsResponseBodyData data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6BCE89B3-E882-511D-9A75-D452A56EC4B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListJobExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutionsResponseBody self = new ListJobExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobExecutionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobExecutionsResponseBody setData(ListJobExecutionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobExecutionsResponseBodyData getData() {
        return this.data;
    }

    public ListJobExecutionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobExecutionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobExecutionsResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attempt")
        public Integer attempt;

        /**
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1827811800526000</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <strong>example:</strong>
         * <p>1310630367761285120</p>
         */
        @NameInMap("JobExecutionId")
        public String jobExecutionId;

        /**
         * <strong>example:</strong>
         * <p>74</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>name=zhangsan</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteStrategy")
        public Integer routeStrategy;

        /**
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <strong>example:</strong>
         * <p>28.0.168.46</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TotalTokens")
        public Integer totalTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://192.168.1.9:9999/">http://192.168.1.9:9999/</a></p>
         */
        @NameInMap("WorkAddr")
        public String workAddr;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WorkflowExecutionId")
        public String workflowExecutionId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        @NameInMap("WorkflowName")
        public String workflowName;

        public static ListJobExecutionsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutionsResponseBodyDataRecords self = new ListJobExecutionsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListJobExecutionsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListJobExecutionsResponseBodyDataRecords setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public ListJobExecutionsResponseBodyDataRecords setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public ListJobExecutionsResponseBodyDataRecords setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListJobExecutionsResponseBodyDataRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListJobExecutionsResponseBodyDataRecords setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobExecutionsResponseBodyDataRecords setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobExecutionsResponseBodyDataRecords setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListJobExecutionsResponseBodyDataRecords setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListJobExecutionsResponseBodyDataRecords setRouteStrategy(Integer routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public Integer getRouteStrategy() {
            return this.routeStrategy;
        }

        public ListJobExecutionsResponseBodyDataRecords setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListJobExecutionsResponseBodyDataRecords setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public ListJobExecutionsResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListJobExecutionsResponseBodyDataRecords setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public ListJobExecutionsResponseBodyDataRecords setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        public ListJobExecutionsResponseBodyDataRecords setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkAddr(String workAddr) {
            this.workAddr = workAddr;
            return this;
        }
        public String getWorkAddr() {
            return this.workAddr;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkflowExecutionId(String workflowExecutionId) {
            this.workflowExecutionId = workflowExecutionId;
            return this;
        }
        public String getWorkflowExecutionId() {
            return this.workflowExecutionId;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListJobExecutionsResponseBodyDataRecords setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListJobExecutionsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListJobExecutionsResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListJobExecutionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutionsResponseBodyData self = new ListJobExecutionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobExecutionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobExecutionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobExecutionsResponseBodyData setRecords(java.util.List<ListJobExecutionsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListJobExecutionsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListJobExecutionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
