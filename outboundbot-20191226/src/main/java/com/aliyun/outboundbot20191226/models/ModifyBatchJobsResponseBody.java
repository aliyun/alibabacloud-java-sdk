// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBatchJobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobGroup")
    public ModifyBatchJobsResponseBodyJobGroup jobGroup;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyBatchJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBatchJobsResponseBody self = new ModifyBatchJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBatchJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBatchJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyBatchJobsResponseBody setJobGroup(ModifyBatchJobsResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public ModifyBatchJobsResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public ModifyBatchJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBatchJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBatchJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1581937093000</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>1581997093000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        public static ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime self = new ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class ModifyBatchJobsResponseBodyJobGroupStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Customized")
        public String customized;

        /**
         * <strong>example:</strong>
         * <p>2209702074000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("FollowUpStrategy")
        public String followUpStrategy;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        /**
         * <strong>example:</strong>
         * <p>Once</p>
         */
        @NameInMap("RepeatBy")
        public String repeatBy;

        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        /**
         * <strong>example:</strong>
         * <p>LocalFirst</p>
         */
        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        /**
         * <strong>example:</strong>
         * <p>1578550074000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StrategyDescription")
        public String strategyDescription;

        /**
         * <strong>example:</strong>
         * <p>f718798d-96be-40e4-bef6-317b54855708</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <strong>example:</strong>
         * <p>Repeatable</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("WorkingTime")
        public java.util.List<ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime> workingTime;

        public static ModifyBatchJobsResponseBodyJobGroupStrategy build(java.util.Map<String, ?> map) throws Exception {
            ModifyBatchJobsResponseBodyJobGroupStrategy self = new ModifyBatchJobsResponseBodyJobGroupStrategy();
            return TeaModel.build(map, self);
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyBatchJobsResponseBodyJobGroupStrategy setWorkingTime(java.util.List<ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<ModifyBatchJobsResponseBodyJobGroupStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class ModifyBatchJobsResponseBodyJobGroup extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        /**
         * <strong>example:</strong>
         * <p>1579068424000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <strong>example:</strong>
         * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
         */
        @NameInMap("JobFilePath")
        public String jobFilePath;

        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        /**
         * <strong>example:</strong>
         * <p>5a7e8b09-baf9-4cab-b540-c971f47a7146</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <strong>example:</strong>
         * <p>6cea9bed-63e6-439e-ae4c-b3333efff53d</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Strategy")
        public ModifyBatchJobsResponseBodyJobGroupStrategy strategy;

        public static ModifyBatchJobsResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyBatchJobsResponseBodyJobGroup self = new ModifyBatchJobsResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public ModifyBatchJobsResponseBodyJobGroup setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ModifyBatchJobsResponseBodyJobGroup setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ModifyBatchJobsResponseBodyJobGroup setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public ModifyBatchJobsResponseBodyJobGroup setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public ModifyBatchJobsResponseBodyJobGroup setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ModifyBatchJobsResponseBodyJobGroup setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public ModifyBatchJobsResponseBodyJobGroup setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ModifyBatchJobsResponseBodyJobGroup setStrategy(ModifyBatchJobsResponseBodyJobGroupStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ModifyBatchJobsResponseBodyJobGroupStrategy getStrategy() {
            return this.strategy;
        }

    }

}
