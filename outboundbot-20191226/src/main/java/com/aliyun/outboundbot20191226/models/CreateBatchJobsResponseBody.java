// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchJobsResponseBody extends TeaModel {
    @NameInMap("BatchJob")
    public CreateBatchJobsResponseBodyBatchJob batchJob;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateBatchJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchJobsResponseBody self = new CreateBatchJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchJobsResponseBody setBatchJob(CreateBatchJobsResponseBodyBatchJob batchJob) {
        this.batchJob = batchJob;
        return this;
    }
    public CreateBatchJobsResponseBodyBatchJob getBatchJob() {
        return this.batchJob;
    }

    public CreateBatchJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBatchJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBatchJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBatchJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBatchJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        public static CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime self = new CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class CreateBatchJobsResponseBodyBatchJobStrategy extends TeaModel {
        @NameInMap("Customized")
        public String customized;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FollowUpStrategy")
        public String followUpStrategy;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        @NameInMap("RepeatBy")
        public String repeatBy;

        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StrategyDescription")
        public String strategyDescription;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkingTime")
        public java.util.List<CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime> workingTime;

        public static CreateBatchJobsResponseBodyBatchJobStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchJobsResponseBodyBatchJobStrategy self = new CreateBatchJobsResponseBodyBatchJobStrategy();
            return TeaModel.build(map, self);
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateBatchJobsResponseBodyBatchJobStrategy setWorkingTime(java.util.List<CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<CreateBatchJobsResponseBodyBatchJobStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class CreateBatchJobsResponseBodyBatchJob extends TeaModel {
        @NameInMap("BatchJobId")
        public String batchJobId;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("JobFilePath")
        public String jobFilePath;

        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Strategy")
        public CreateBatchJobsResponseBodyBatchJobStrategy strategy;

        public static CreateBatchJobsResponseBodyBatchJob build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchJobsResponseBodyBatchJob self = new CreateBatchJobsResponseBodyBatchJob();
            return TeaModel.build(map, self);
        }

        public CreateBatchJobsResponseBodyBatchJob setBatchJobId(String batchJobId) {
            this.batchJobId = batchJobId;
            return this;
        }
        public String getBatchJobId() {
            return this.batchJobId;
        }

        public CreateBatchJobsResponseBodyBatchJob setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public CreateBatchJobsResponseBodyBatchJob setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public CreateBatchJobsResponseBodyBatchJob setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public CreateBatchJobsResponseBodyBatchJob setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public CreateBatchJobsResponseBodyBatchJob setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public CreateBatchJobsResponseBodyBatchJob setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public CreateBatchJobsResponseBodyBatchJob setStrategy(CreateBatchJobsResponseBodyBatchJobStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public CreateBatchJobsResponseBodyBatchJobStrategy getStrategy() {
            return this.strategy;
        }

    }

}
