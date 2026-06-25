// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. A value of <code>200</code> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li>The returned data.</li>
     * </ul>
     */
    @NameInMap("Data")
    public ListJobsResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A unique ID that Alibaba Cloud generates for each request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1DF6732E-15D8-5E1F-95E3-C10077F556B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The retry interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AttemptInterval")
        public Integer attemptInterval;

        /**
         * <p>The calendar.</p>
         * 
         * <strong>example:</strong>
         * <p>work-day</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <p>The child job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1246</p>
         */
        @NameInMap("ChildJobId")
        public String childJobId;

        /**
         * <p>The cleanup mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cleanMode&quot;:&quot;NUM_ONLY&quot;,&quot;totalRemain&quot;:300}</p>
         */
        @NameInMap("CleanMode")
        public String cleanMode;

        /**
         * <p>The ID of the user who created the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The current execution status. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: Not Started</p>
         * </li>
         * <li><p><code>1</code>: Running</p>
         * </li>
         * <li><p><code>2</code>: Queued</p>
         * </li>
         * <li><p><code>3</code>: Waiting</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurrentExecuteStatus")
        public Integer currentExecuteStatus;

        /**
         * <p>The data offset.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataOffset")
        public Integer dataOffset;

        /**
         * <p>The dependency check strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DependentStrategy")
        public Integer dependentStrategy;

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>job01单机任务</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The executor blocking strategy. Valid values:</p>
         * <ul>
         * <li><p><code>1</code>: Serial Execution</p>
         * </li>
         * <li><p><code>2</code>: Discard Later</p>
         * </li>
         * <li><p><code>3</code>: Cover Earlier</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecutorBlockStrategy")
        public String executorBlockStrategy;

        /**
         * <p>The name of the job handler.</p>
         * 
         * <strong>example:</strong>
         * <p>jobDemoHandler</p>
         */
        @NameInMap("JobHandler")
        public String jobHandler;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The time when the last execution ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-29 15:56:36</p>
         */
        @NameInMap("LastExecuteEndTime")
        public String lastExecuteEndTime;

        /**
         * <p>The status of the last execution. Valid values:</p>
         * <ul>
         * <li><p><code>4</code>: Success</p>
         * </li>
         * <li><p><code>5</code>: Failure</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("LastExecuteStatus")
        public Integer lastExecuteStatus;

        /**
         * <p>The maximum number of retries for a failed job.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxAttempt")
        public Integer maxAttempt;

        /**
         * <p>The maximum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>job01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The notification configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failLimitTimes&quot;:1,&quot;failEnable&quot;:true,&quot;timeoutKillEnable&quot;:false,&quot;missWorkerEnable&quot;:true,&quot;timeoutEnable&quot;:true,&quot;sendChannel&quot;:&quot;&quot;,&quot;timeout&quot;:300,&quot;successNotice&quot;:false}</p>
         */
        @NameInMap("NoticeConfig")
        public String noticeConfig;

        /**
         * <p>The notification contacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;contactType&quot;:1,&quot;name&quot;:&quot;恰橙&quot;}]</p>
         */
        @NameInMap("NoticeContacts")
        public String noticeContacts;

        /**
         * <p>The job parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>name=10</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The job priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The routing strategy. Valid values:</p>
         * <ul>
         * <li><p><code>1</code>: Round-robin</p>
         * </li>
         * <li><p><code>2</code>: Random</p>
         * </li>
         * <li><p><code>3</code>: First</p>
         * </li>
         * <li><p><code>4</code>: Last</p>
         * </li>
         * <li><p><code>5</code>: Least Frequently Used</p>
         * </li>
         * <li><p><code>6</code>: Least Recently Used</p>
         * </li>
         * <li><p><code>7</code>: Consistent Hashing</p>
         * </li>
         * <li><p><code>8</code>: Sharded Broadcast</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteStrategy")
        public Integer routeStrategy;

        /**
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * echo &quot;xxl-job: hello shell&quot;
         * echo &quot;Good bye!&quot;
         * exit 0</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The type of the start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartTimeType")
        public Integer startTimeType;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: Disabled</p>
         * </li>
         * <li><p><code>1</code>: Enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 12 * * ?</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <p>The time type. Valid values:</p>
         * <ul>
         * <li><p><code>-1</code>: none</p>
         * </li>
         * <li><p><code>1</code>: cron</p>
         * </li>
         * <li><p><code>3</code>: fix_rate</p>
         * </li>
         * <li><p><code>5</code>: one_time</p>
         * </li>
         * <li><p><code>100</code>: api</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Hongkong</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>HangKong</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The ID of the user who last updated the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Updater")
        public String updater;

        /**
         * <p>The job weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <p>The extended attributes.</p>
         * <blockquote>
         * <p>This parameter is not currently supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>暂无</p>
         */
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li>A list of jobs.</li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListJobsResponseBodyDataRecords> records;

        /**
         * <p>The total number of jobs returned.</p>
         * 
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
