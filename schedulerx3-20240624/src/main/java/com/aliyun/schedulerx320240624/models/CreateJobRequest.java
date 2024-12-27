// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AttemptInterval")
    public Integer attemptInterval;

    /**
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("Calendar")
    public String calendar;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExecutorBlockStrategy")
    public Integer executorBlockStrategy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testJobVoidHandler</p>
     */
    @NameInMap("JobHandler")
    public String jobHandler;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxAttempt")
    public Integer maxAttempt;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NoticeConfig")
    public CreateJobRequestNoticeConfig noticeConfig;

    @NameInMap("NoticeContacts")
    public java.util.List<CreateJobRequestNoticeContacts> noticeContacts;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteStrategy")
    public Integer routeStrategy;

    /**
     * <strong>example:</strong>
     * <p>1701310327000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>0 0 4 ? * Mon/1</p>
     */
    @NameInMap("TimeExpression")
    public String timeExpression;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    /**
     * <strong>example:</strong>
     * <p>GMT+8</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
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

    public CreateJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setExecutorBlockStrategy(Integer executorBlockStrategy) {
        this.executorBlockStrategy = executorBlockStrategy;
        return this;
    }
    public Integer getExecutorBlockStrategy() {
        return this.executorBlockStrategy;
    }

    public CreateJobRequest setJobHandler(String jobHandler) {
        this.jobHandler = jobHandler;
        return this;
    }
    public String getJobHandler() {
        return this.jobHandler;
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

    public CreateJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJobRequest setNoticeConfig(CreateJobRequestNoticeConfig noticeConfig) {
        this.noticeConfig = noticeConfig;
        return this;
    }
    public CreateJobRequestNoticeConfig getNoticeConfig() {
        return this.noticeConfig;
    }

    public CreateJobRequest setNoticeContacts(java.util.List<CreateJobRequestNoticeContacts> noticeContacts) {
        this.noticeContacts = noticeContacts;
        return this;
    }
    public java.util.List<CreateJobRequestNoticeContacts> getNoticeContacts() {
        return this.noticeContacts;
    }

    public CreateJobRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateJobRequest setRouteStrategy(Integer routeStrategy) {
        this.routeStrategy = routeStrategy;
        return this;
    }
    public Integer getRouteStrategy() {
        return this.routeStrategy;
    }

    public CreateJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateJobRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
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

    public CreateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public static class CreateJobRequestNoticeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailEnable")
        public Boolean failEnable;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailLimitTimes")
        public Integer failLimitTimes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MissWorkerEnable")
        public Boolean missWorkerEnable;

        /**
         * <strong>example:</strong>
         * <p>mail</p>
         */
        @NameInMap("SendChannel")
        public String sendChannel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SuccessNotice")
        public Boolean successNotice;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TimeoutEnable")
        public Boolean timeoutEnable;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TimeoutKillEnable")
        public Boolean timeoutKillEnable;

        public static CreateJobRequestNoticeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestNoticeConfig self = new CreateJobRequestNoticeConfig();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestNoticeConfig setFailEnable(Boolean failEnable) {
            this.failEnable = failEnable;
            return this;
        }
        public Boolean getFailEnable() {
            return this.failEnable;
        }

        public CreateJobRequestNoticeConfig setFailLimitTimes(Integer failLimitTimes) {
            this.failLimitTimes = failLimitTimes;
            return this;
        }
        public Integer getFailLimitTimes() {
            return this.failLimitTimes;
        }

        public CreateJobRequestNoticeConfig setMissWorkerEnable(Boolean missWorkerEnable) {
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }
        public Boolean getMissWorkerEnable() {
            return this.missWorkerEnable;
        }

        public CreateJobRequestNoticeConfig setSendChannel(String sendChannel) {
            this.sendChannel = sendChannel;
            return this;
        }
        public String getSendChannel() {
            return this.sendChannel;
        }

        public CreateJobRequestNoticeConfig setSuccessNotice(Boolean successNotice) {
            this.successNotice = successNotice;
            return this;
        }
        public Boolean getSuccessNotice() {
            return this.successNotice;
        }

        public CreateJobRequestNoticeConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public CreateJobRequestNoticeConfig setTimeoutEnable(Boolean timeoutEnable) {
            this.timeoutEnable = timeoutEnable;
            return this;
        }
        public Boolean getTimeoutEnable() {
            return this.timeoutEnable;
        }

        public CreateJobRequestNoticeConfig setTimeoutKillEnable(Boolean timeoutKillEnable) {
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }
        public Boolean getTimeoutKillEnable() {
            return this.timeoutKillEnable;
        }

    }

    public static class CreateJobRequestNoticeContacts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContactType")
        public Integer contactType;

        /**
         * <strong>example:</strong>
         * <p>xiaoming</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateJobRequestNoticeContacts build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestNoticeContacts self = new CreateJobRequestNoticeContacts();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestNoticeContacts setContactType(Integer contactType) {
            this.contactType = contactType;
            return this;
        }
        public Integer getContactType() {
            return this.contactType;
        }

        public CreateJobRequestNoticeContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
