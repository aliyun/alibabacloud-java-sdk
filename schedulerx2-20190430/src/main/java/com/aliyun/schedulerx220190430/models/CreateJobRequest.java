// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    @NameInMap("Calendar")
    public String calendar;

    @NameInMap("ClassName")
    public String className;

    @NameInMap("ConsumerSize")
    public Integer consumerSize;

    @NameInMap("ContactInfo")
    public java.util.List<CreateJobRequestContactInfo> contactInfo;

    @NameInMap("Content")
    public String content;

    @NameInMap("DataOffset")
    public Integer dataOffset;

    @NameInMap("Description")
    public String description;

    @NameInMap("DispatcherSize")
    public Integer dispatcherSize;

    @NameInMap("ExecuteMode")
    public String executeMode;

    @NameInMap("FailEnable")
    public Boolean failEnable;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JarUrl")
    public String jarUrl;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    @NameInMap("MissWorkerEnable")
    public Boolean missWorkerEnable;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("QueueSize")
    public Integer queueSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SendChannel")
    public String sendChannel;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TaskAttemptInterval")
    public Integer taskAttemptInterval;

    @NameInMap("TaskMaxAttempt")
    public Integer taskMaxAttempt;

    @NameInMap("TimeExpression")
    public String timeExpression;

    @NameInMap("TimeType")
    public Integer timeType;

    @NameInMap("Timeout")
    public Long timeout;

    @NameInMap("TimeoutEnable")
    public Boolean timeoutEnable;

    @NameInMap("TimeoutKillEnable")
    public Boolean timeoutKillEnable;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setAttemptInterval(Integer attemptInterval) {
        this.attemptInterval = attemptInterval;
        return this;
    }
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    public CreateJobRequest setCalendar(String calendar) {
        this.calendar = calendar;
        return this;
    }
    public String getCalendar() {
        return this.calendar;
    }

    public CreateJobRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreateJobRequest setConsumerSize(Integer consumerSize) {
        this.consumerSize = consumerSize;
        return this;
    }
    public Integer getConsumerSize() {
        return this.consumerSize;
    }

    public CreateJobRequest setContactInfo(java.util.List<CreateJobRequestContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public java.util.List<CreateJobRequestContactInfo> getContactInfo() {
        return this.contactInfo;
    }

    public CreateJobRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateJobRequest setDataOffset(Integer dataOffset) {
        this.dataOffset = dataOffset;
        return this;
    }
    public Integer getDataOffset() {
        return this.dataOffset;
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setDispatcherSize(Integer dispatcherSize) {
        this.dispatcherSize = dispatcherSize;
        return this;
    }
    public Integer getDispatcherSize() {
        return this.dispatcherSize;
    }

    public CreateJobRequest setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public CreateJobRequest setFailEnable(Boolean failEnable) {
        this.failEnable = failEnable;
        return this;
    }
    public Boolean getFailEnable() {
        return this.failEnable;
    }

    public CreateJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateJobRequest setJarUrl(String jarUrl) {
        this.jarUrl = jarUrl;
        return this;
    }
    public String getJarUrl() {
        return this.jarUrl;
    }

    public CreateJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateJobRequest setMaxAttempt(Integer maxAttempt) {
        this.maxAttempt = maxAttempt;
        return this;
    }
    public Integer getMaxAttempt() {
        return this.maxAttempt;
    }

    public CreateJobRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public CreateJobRequest setMissWorkerEnable(Boolean missWorkerEnable) {
        this.missWorkerEnable = missWorkerEnable;
        return this;
    }
    public Boolean getMissWorkerEnable() {
        return this.missWorkerEnable;
    }

    public CreateJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateJobRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public CreateJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateJobRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateJobRequest setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
        return this;
    }
    public Integer getQueueSize() {
        return this.queueSize;
    }

    public CreateJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateJobRequest setSendChannel(String sendChannel) {
        this.sendChannel = sendChannel;
        return this;
    }
    public String getSendChannel() {
        return this.sendChannel;
    }

    public CreateJobRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateJobRequest setTaskAttemptInterval(Integer taskAttemptInterval) {
        this.taskAttemptInterval = taskAttemptInterval;
        return this;
    }
    public Integer getTaskAttemptInterval() {
        return this.taskAttemptInterval;
    }

    public CreateJobRequest setTaskMaxAttempt(Integer taskMaxAttempt) {
        this.taskMaxAttempt = taskMaxAttempt;
        return this;
    }
    public Integer getTaskMaxAttempt() {
        return this.taskMaxAttempt;
    }

    public CreateJobRequest setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
        return this;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public CreateJobRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

    public CreateJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public CreateJobRequest setTimeoutEnable(Boolean timeoutEnable) {
        this.timeoutEnable = timeoutEnable;
        return this;
    }
    public Boolean getTimeoutEnable() {
        return this.timeoutEnable;
    }

    public CreateJobRequest setTimeoutKillEnable(Boolean timeoutKillEnable) {
        this.timeoutKillEnable = timeoutKillEnable;
        return this;
    }
    public Boolean getTimeoutKillEnable() {
        return this.timeoutKillEnable;
    }

    public static class CreateJobRequestContactInfo extends TeaModel {
        @NameInMap("Ding")
        public String ding;

        @NameInMap("UserMail")
        public String userMail;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserPhone")
        public String userPhone;

        public static CreateJobRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestContactInfo self = new CreateJobRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestContactInfo setDing(String ding) {
            this.ding = ding;
            return this;
        }
        public String getDing() {
            return this.ding;
        }

        public CreateJobRequestContactInfo setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

        public CreateJobRequestContactInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateJobRequestContactInfo setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

}
