// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

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

    public static class ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo extends TeaModel {
        @NameInMap("Ding")
        public String ding;

        @NameInMap("UserMail")
        public String userMail;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserPhone")
        public String userPhone;

        public static ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo self = new ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

    public static class ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig extends TeaModel {
        @NameInMap("FailEnable")
        public Boolean failEnable;

        @NameInMap("MissWorkerEnable")
        public Boolean missWorkerEnable;

        @NameInMap("SendChannel")
        public String sendChannel;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        @NameInMap("TimeoutKillEnable")
        public Boolean timeoutKillEnable;

        public static ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig self = new ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setFailEnable(Boolean failEnable) {
            this.failEnable = failEnable;
            return this;
        }
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setMissWorkerEnable(Boolean missWorkerEnable) {
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }
        public Boolean getMissWorkerEnable() {
            return this.missWorkerEnable;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setSendChannel(String sendChannel) {
            this.sendChannel = sendChannel;
            return this;
        }
        public String getSendChannel() {
            return this.sendChannel;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setTimeoutEnable(Boolean timeoutEnable) {
            this.timeoutEnable = timeoutEnable;
            return this;
        }
        public Boolean getTimeoutEnable() {
            return this.timeoutEnable;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig setTimeoutKillEnable(Boolean timeoutKillEnable) {
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }
        public Boolean getTimeoutKillEnable() {
            return this.timeoutKillEnable;
        }

    }

    public static class ListJobsResponseBodyDataJobsJobMonitorInfo extends TeaModel {
        @NameInMap("ContactInfo")
        public java.util.List<ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo> contactInfo;

        @NameInMap("MonitorConfig")
        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig monitorConfig;

        public static ListJobsResponseBodyDataJobsJobMonitorInfo build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsJobMonitorInfo self = new ListJobsResponseBodyDataJobsJobMonitorInfo();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfo setContactInfo(java.util.List<ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo> contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public java.util.List<ListJobsResponseBodyDataJobsJobMonitorInfoContactInfo> getContactInfo() {
            return this.contactInfo;
        }

        public ListJobsResponseBodyDataJobsJobMonitorInfo setMonitorConfig(ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public ListJobsResponseBodyDataJobsJobMonitorInfoMonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

    }

    public static class ListJobsResponseBodyDataJobsMapTaskXAttrs extends TeaModel {
        @NameInMap("ConsumerSize")
        public Integer consumerSize;

        @NameInMap("DispatcherSize")
        public Integer dispatcherSize;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("QueueSize")
        public Integer queueSize;

        @NameInMap("TaskAttemptInterval")
        public Integer taskAttemptInterval;

        @NameInMap("TaskMaxAttempt")
        public Integer taskMaxAttempt;

        public static ListJobsResponseBodyDataJobsMapTaskXAttrs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsMapTaskXAttrs self = new ListJobsResponseBodyDataJobsMapTaskXAttrs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setConsumerSize(Integer consumerSize) {
            this.consumerSize = consumerSize;
            return this;
        }
        public Integer getConsumerSize() {
            return this.consumerSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setDispatcherSize(Integer dispatcherSize) {
            this.dispatcherSize = dispatcherSize;
            return this;
        }
        public Integer getDispatcherSize() {
            return this.dispatcherSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setQueueSize(Integer queueSize) {
            this.queueSize = queueSize;
            return this;
        }
        public Integer getQueueSize() {
            return this.queueSize;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setTaskAttemptInterval(Integer taskAttemptInterval) {
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }
        public Integer getTaskAttemptInterval() {
            return this.taskAttemptInterval;
        }

        public ListJobsResponseBodyDataJobsMapTaskXAttrs setTaskMaxAttempt(Integer taskMaxAttempt) {
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }
        public Integer getTaskMaxAttempt() {
            return this.taskMaxAttempt;
        }

    }

    public static class ListJobsResponseBodyDataJobsTimeConfig extends TeaModel {
        @NameInMap("Calendar")
        public String calendar;

        @NameInMap("DataOffset")
        public Integer dataOffset;

        @NameInMap("TimeExpression")
        public String timeExpression;

        @NameInMap("TimeType")
        public Integer timeType;

        public static ListJobsResponseBodyDataJobsTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobsTimeConfig self = new ListJobsResponseBodyDataJobsTimeConfig();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobsTimeConfig setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public ListJobsResponseBodyDataJobsTimeConfig setDataOffset(Integer dataOffset) {
            this.dataOffset = dataOffset;
            return this;
        }
        public Integer getDataOffset() {
            return this.dataOffset;
        }

        public ListJobsResponseBodyDataJobsTimeConfig setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public ListJobsResponseBodyDataJobsTimeConfig setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

    }

    public static class ListJobsResponseBodyDataJobs extends TeaModel {
        @NameInMap("AttemptInterval")
        public Integer attemptInterval;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("Content")
        public String content;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExecuteMode")
        public String executeMode;

        @NameInMap("JarUrl")
        public String jarUrl;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobMonitorInfo")
        public ListJobsResponseBodyDataJobsJobMonitorInfo jobMonitorInfo;

        @NameInMap("MapTaskXAttrs")
        public ListJobsResponseBodyDataJobsMapTaskXAttrs mapTaskXAttrs;

        @NameInMap("MaxAttempt")
        public Integer maxAttempt;

        @NameInMap("MaxConcurrency")
        public String maxConcurrency;

        @NameInMap("Name")
        public String name;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TimeConfig")
        public ListJobsResponseBodyDataJobsTimeConfig timeConfig;

        public static ListJobsResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataJobs self = new ListJobsResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataJobs setAttemptInterval(Integer attemptInterval) {
            this.attemptInterval = attemptInterval;
            return this;
        }
        public Integer getAttemptInterval() {
            return this.attemptInterval;
        }

        public ListJobsResponseBodyDataJobs setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public ListJobsResponseBodyDataJobs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListJobsResponseBodyDataJobs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobsResponseBodyDataJobs setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public ListJobsResponseBodyDataJobs setJarUrl(String jarUrl) {
            this.jarUrl = jarUrl;
            return this;
        }
        public String getJarUrl() {
            return this.jarUrl;
        }

        public ListJobsResponseBodyDataJobs setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyDataJobs setJobMonitorInfo(ListJobsResponseBodyDataJobsJobMonitorInfo jobMonitorInfo) {
            this.jobMonitorInfo = jobMonitorInfo;
            return this;
        }
        public ListJobsResponseBodyDataJobsJobMonitorInfo getJobMonitorInfo() {
            return this.jobMonitorInfo;
        }

        public ListJobsResponseBodyDataJobs setMapTaskXAttrs(ListJobsResponseBodyDataJobsMapTaskXAttrs mapTaskXAttrs) {
            this.mapTaskXAttrs = mapTaskXAttrs;
            return this;
        }
        public ListJobsResponseBodyDataJobsMapTaskXAttrs getMapTaskXAttrs() {
            return this.mapTaskXAttrs;
        }

        public ListJobsResponseBodyDataJobs setMaxAttempt(Integer maxAttempt) {
            this.maxAttempt = maxAttempt;
            return this;
        }
        public Integer getMaxAttempt() {
            return this.maxAttempt;
        }

        public ListJobsResponseBodyDataJobs setMaxConcurrency(String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListJobsResponseBodyDataJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobsResponseBodyDataJobs setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListJobsResponseBodyDataJobs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyDataJobs setTimeConfig(ListJobsResponseBodyDataJobsTimeConfig timeConfig) {
            this.timeConfig = timeConfig;
            return this;
        }
        public ListJobsResponseBodyDataJobsTimeConfig getTimeConfig() {
            return this.timeConfig;
        }

    }

    public static class ListJobsResponseBodyData extends TeaModel {
        @NameInMap("Jobs")
        public java.util.List<ListJobsResponseBodyDataJobs> jobs;

        public static ListJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyData self = new ListJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyData setJobs(java.util.List<ListJobsResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<ListJobsResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

    }

}
