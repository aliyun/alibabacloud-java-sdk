// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetJobInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoResponseBody self = new GetJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobInfoResponseBody setData(GetJobInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInfoResponseBodyData getData() {
        return this.data;
    }

    public GetJobInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo extends TeaModel {
        @NameInMap("Ding")
        public String ding;

        @NameInMap("UserMail")
        public String userMail;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserPhone")
        public String userPhone;

        public static GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo self = new GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig extends TeaModel {
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

        public static GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig self = new GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setFailEnable(Boolean failEnable) {
            this.failEnable = failEnable;
            return this;
        }
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setMissWorkerEnable(Boolean missWorkerEnable) {
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }
        public Boolean getMissWorkerEnable() {
            return this.missWorkerEnable;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setSendChannel(String sendChannel) {
            this.sendChannel = sendChannel;
            return this;
        }
        public String getSendChannel() {
            return this.sendChannel;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setTimeoutEnable(Boolean timeoutEnable) {
            this.timeoutEnable = timeoutEnable;
            return this;
        }
        public Boolean getTimeoutEnable() {
            return this.timeoutEnable;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig setTimeoutKillEnable(Boolean timeoutKillEnable) {
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }
        public Boolean getTimeoutKillEnable() {
            return this.timeoutKillEnable;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo extends TeaModel {
        @NameInMap("ContactInfo")
        public java.util.List<GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo> contactInfo;

        @NameInMap("MonitorConfig")
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig monitorConfig;

        public static GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo self = new GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo setContactInfo(java.util.List<GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo> contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public java.util.List<GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoContactInfo> getContactInfo() {
            return this.contactInfo;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo setMonitorConfig(GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig monitorConfig) {
            this.monitorConfig = monitorConfig;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfoMonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs extends TeaModel {
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

        public static GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs self = new GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setConsumerSize(Integer consumerSize) {
            this.consumerSize = consumerSize;
            return this;
        }
        public Integer getConsumerSize() {
            return this.consumerSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setDispatcherSize(Integer dispatcherSize) {
            this.dispatcherSize = dispatcherSize;
            return this;
        }
        public Integer getDispatcherSize() {
            return this.dispatcherSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setQueueSize(Integer queueSize) {
            this.queueSize = queueSize;
            return this;
        }
        public Integer getQueueSize() {
            return this.queueSize;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setTaskAttemptInterval(Integer taskAttemptInterval) {
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }
        public Integer getTaskAttemptInterval() {
            return this.taskAttemptInterval;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs setTaskMaxAttempt(Integer taskMaxAttempt) {
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }
        public Integer getTaskMaxAttempt() {
            return this.taskMaxAttempt;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfoTimeConfig extends TeaModel {
        @NameInMap("Calendar")
        public String calendar;

        @NameInMap("DataOffset")
        public Integer dataOffset;

        @NameInMap("TimeExpression")
        public String timeExpression;

        @NameInMap("TimeType")
        public Integer timeType;

        public static GetJobInfoResponseBodyDataJobConfigInfoTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfoTimeConfig self = new GetJobInfoResponseBodyDataJobConfigInfoTimeConfig();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setDataOffset(Integer dataOffset) {
            this.dataOffset = dataOffset;
            return this;
        }
        public Integer getDataOffset() {
            return this.dataOffset;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

    }

    public static class GetJobInfoResponseBodyDataJobConfigInfo extends TeaModel {
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
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo jobMonitorInfo;

        @NameInMap("MapTaskXAttrs")
        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs mapTaskXAttrs;

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
        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig timeConfig;

        public static GetJobInfoResponseBodyDataJobConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobConfigInfo self = new GetJobInfoResponseBodyDataJobConfigInfo();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setAttemptInterval(Integer attemptInterval) {
            this.attemptInterval = attemptInterval;
            return this;
        }
        public Integer getAttemptInterval() {
            return this.attemptInterval;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setJarUrl(String jarUrl) {
            this.jarUrl = jarUrl;
            return this;
        }
        public String getJarUrl() {
            return this.jarUrl;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setJobMonitorInfo(GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo jobMonitorInfo) {
            this.jobMonitorInfo = jobMonitorInfo;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoJobMonitorInfo getJobMonitorInfo() {
            return this.jobMonitorInfo;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setMapTaskXAttrs(GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs mapTaskXAttrs) {
            this.mapTaskXAttrs = mapTaskXAttrs;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoMapTaskXAttrs getMapTaskXAttrs() {
            return this.mapTaskXAttrs;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setMaxAttempt(Integer maxAttempt) {
            this.maxAttempt = maxAttempt;
            return this;
        }
        public Integer getMaxAttempt() {
            return this.maxAttempt;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setMaxConcurrency(String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobInfoResponseBodyDataJobConfigInfo setTimeConfig(GetJobInfoResponseBodyDataJobConfigInfoTimeConfig timeConfig) {
            this.timeConfig = timeConfig;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfoTimeConfig getTimeConfig() {
            return this.timeConfig;
        }

    }

    public static class GetJobInfoResponseBodyData extends TeaModel {
        @NameInMap("JobConfigInfo")
        public GetJobInfoResponseBodyDataJobConfigInfo jobConfigInfo;

        public static GetJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyData self = new GetJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyData setJobConfigInfo(GetJobInfoResponseBodyDataJobConfigInfo jobConfigInfo) {
            this.jobConfigInfo = jobConfigInfo;
            return this;
        }
        public GetJobInfoResponseBodyDataJobConfigInfo getJobConfigInfo() {
            return this.jobConfigInfo;
        }

    }

}
