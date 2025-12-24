// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ListJobsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobsResponseBody setData(ListJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobsResponseBodyData getData() {
        return this.data;
    }

    public ListJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobsResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AttemptInterval")
        public Integer attemptInterval;

        /**
         * <strong>example:</strong>
         * <p>work-day</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        @NameInMap("ChildJobId")
        public String childJobId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;cleanMode&quot;:&quot;NUM_ONLY&quot;,&quot;totalRemain&quot;:300}</p>
         */
        @NameInMap("CleanMode")
        public String cleanMode;

        /**
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurrentExecuteStatus")
        public Integer currentExecuteStatus;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataOffset")
        public Integer dataOffset;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DependentStrategy")
        public Integer dependentStrategy;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExecutorBlockStrategy")
        public String executorBlockStrategy;

        /**
         * <strong>example:</strong>
         * <p>jobDemoHandler</p>
         */
        @NameInMap("JobHandler")
        public String jobHandler;

        /**
         * <strong>example:</strong>
         * <p>74</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        @NameInMap("JobType")
        public String jobType;

        @NameInMap("LastExecuteEndTime")
        public String lastExecuteEndTime;

        @NameInMap("LastExecuteStatus")
        public Integer lastExecuteStatus;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxAttempt")
        public Integer maxAttempt;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <strong>example:</strong>
         * <p>job01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <strong>example:</strong>
         * <p>{&quot;failLimitTimes&quot;:1,&quot;failEnable&quot;:true,&quot;timeoutKillEnable&quot;:false,&quot;missWorkerEnable&quot;:true,&quot;timeoutEnable&quot;:true,&quot;sendChannel&quot;:&quot;&quot;,&quot;timeout&quot;:300,&quot;successNotice&quot;:false}</p>
         */
        @NameInMap("NoticeConfig")
        public String noticeConfig;

        @NameInMap("NoticeContacts")
        public String noticeContacts;

        /**
         * <strong>example:</strong>
         * <p>name=10</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteStrategy")
        public Integer routeStrategy;

        @NameInMap("Script")
        public String script;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartTimeType")
        public Integer startTimeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>0 0 12 * * ?</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <strong>example:</strong>
         * <p>HangKong</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <strong>example:</strong>
         * <p>HangKong</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Updater")
        public String updater;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("Xattrs")
        public String xattrs;

        public static ListJobsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataRecords self = new ListJobsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListJobsResponseBodyDataRecords setAttemptInterval(Integer attemptInterval) {
            this.attemptInterval = attemptInterval;
            return this;
        }
        public Integer getAttemptInterval() {
            return this.attemptInterval;
        }

        public ListJobsResponseBodyDataRecords setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public ListJobsResponseBodyDataRecords setChildJobId(String childJobId) {
            this.childJobId = childJobId;
            return this;
        }
        public String getChildJobId() {
            return this.childJobId;
        }

        public ListJobsResponseBodyDataRecords setCleanMode(String cleanMode) {
            this.cleanMode = cleanMode;
            return this;
        }
        public String getCleanMode() {
            return this.cleanMode;
        }

        public ListJobsResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListJobsResponseBodyDataRecords setCurrentExecuteStatus(Integer currentExecuteStatus) {
            this.currentExecuteStatus = currentExecuteStatus;
            return this;
        }
        public Integer getCurrentExecuteStatus() {
            return this.currentExecuteStatus;
        }

        public ListJobsResponseBodyDataRecords setDataOffset(Integer dataOffset) {
            this.dataOffset = dataOffset;
            return this;
        }
        public Integer getDataOffset() {
            return this.dataOffset;
        }

        public ListJobsResponseBodyDataRecords setDependentStrategy(Integer dependentStrategy) {
            this.dependentStrategy = dependentStrategy;
            return this;
        }
        public Integer getDependentStrategy() {
            return this.dependentStrategy;
        }

        public ListJobsResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobsResponseBodyDataRecords setExecutorBlockStrategy(String executorBlockStrategy) {
            this.executorBlockStrategy = executorBlockStrategy;
            return this;
        }
        public String getExecutorBlockStrategy() {
            return this.executorBlockStrategy;
        }

        public ListJobsResponseBodyDataRecords setJobHandler(String jobHandler) {
            this.jobHandler = jobHandler;
            return this;
        }
        public String getJobHandler() {
            return this.jobHandler;
        }

        public ListJobsResponseBodyDataRecords setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyDataRecords setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobsResponseBodyDataRecords setLastExecuteEndTime(String lastExecuteEndTime) {
            this.lastExecuteEndTime = lastExecuteEndTime;
            return this;
        }
        public String getLastExecuteEndTime() {
            return this.lastExecuteEndTime;
        }

        public ListJobsResponseBodyDataRecords setLastExecuteStatus(Integer lastExecuteStatus) {
            this.lastExecuteStatus = lastExecuteStatus;
            return this;
        }
        public Integer getLastExecuteStatus() {
            return this.lastExecuteStatus;
        }

        public ListJobsResponseBodyDataRecords setMaxAttempt(Integer maxAttempt) {
            this.maxAttempt = maxAttempt;
            return this;
        }
        public Integer getMaxAttempt() {
            return this.maxAttempt;
        }

        public ListJobsResponseBodyDataRecords setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListJobsResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobsResponseBodyDataRecords setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public ListJobsResponseBodyDataRecords setNoticeConfig(String noticeConfig) {
            this.noticeConfig = noticeConfig;
            return this;
        }
        public String getNoticeConfig() {
            return this.noticeConfig;
        }

        public ListJobsResponseBodyDataRecords setNoticeContacts(String noticeContacts) {
            this.noticeContacts = noticeContacts;
            return this;
        }
        public String getNoticeContacts() {
            return this.noticeContacts;
        }

        public ListJobsResponseBodyDataRecords setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListJobsResponseBodyDataRecords setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListJobsResponseBodyDataRecords setRouteStrategy(Integer routeStrategy) {
            this.routeStrategy = routeStrategy;
            return this;
        }
        public Integer getRouteStrategy() {
            return this.routeStrategy;
        }

        public ListJobsResponseBodyDataRecords setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListJobsResponseBodyDataRecords setStartTimeType(Integer startTimeType) {
            this.startTimeType = startTimeType;
            return this;
        }
        public Integer getStartTimeType() {
            return this.startTimeType;
        }

        public ListJobsResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyDataRecords setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public ListJobsResponseBodyDataRecords setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public ListJobsResponseBodyDataRecords setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public ListJobsResponseBodyDataRecords setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListJobsResponseBodyDataRecords setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public ListJobsResponseBodyDataRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ListJobsResponseBodyDataRecords setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListJobsResponseBodyDataRecords setXattrs(String xattrs) {
            this.xattrs = xattrs;
            return this;
        }
        public String getXattrs() {
            return this.xattrs;
        }

    }

    public static class ListJobsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListJobsResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyData self = new ListJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobsResponseBodyData setRecords(java.util.List<ListJobsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListJobsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListJobsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
