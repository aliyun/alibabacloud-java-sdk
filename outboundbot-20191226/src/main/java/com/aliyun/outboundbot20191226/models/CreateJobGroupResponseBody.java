// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupResponseBody extends TeaModel {
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
    public CreateJobGroupResponseBodyJobGroup jobGroup;

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

    public static CreateJobGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobGroupResponseBody self = new CreateJobGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateJobGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateJobGroupResponseBody setJobGroup(CreateJobGroupResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public CreateJobGroupResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public CreateJobGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateJobGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateJobGroupResponseBodyJobGroupExportProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>https://***.oss-cn-shanghai.aliyuncs.com/sample</p>
         */
        @NameInMap("FileHttpUrl")
        public String fileHttpUrl;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateJobGroupResponseBodyJobGroupExportProgress build(java.util.Map<String, ?> map) throws Exception {
            CreateJobGroupResponseBodyJobGroupExportProgress self = new CreateJobGroupResponseBodyJobGroupExportProgress();
            return TeaModel.build(map, self);
        }

        public CreateJobGroupResponseBodyJobGroupExportProgress setFileHttpUrl(String fileHttpUrl) {
            this.fileHttpUrl = fileHttpUrl;
            return this;
        }
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        public CreateJobGroupResponseBodyJobGroupExportProgress setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public CreateJobGroupResponseBodyJobGroupExportProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateJobGroupResponseBodyJobGroupRecallStrategy extends TeaModel {
        @NameInMap("EmptyNumberIgnore")
        public Boolean emptyNumberIgnore;

        @NameInMap("InArrearsIgnore")
        public Boolean inArrearsIgnore;

        @NameInMap("OutOfServiceIgnore")
        public Boolean outOfServiceIgnore;

        public static CreateJobGroupResponseBodyJobGroupRecallStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobGroupResponseBodyJobGroupRecallStrategy self = new CreateJobGroupResponseBodyJobGroupRecallStrategy();
            return TeaModel.build(map, self);
        }

        public CreateJobGroupResponseBodyJobGroupRecallStrategy setEmptyNumberIgnore(Boolean emptyNumberIgnore) {
            this.emptyNumberIgnore = emptyNumberIgnore;
            return this;
        }
        public Boolean getEmptyNumberIgnore() {
            return this.emptyNumberIgnore;
        }

        public CreateJobGroupResponseBodyJobGroupRecallStrategy setInArrearsIgnore(Boolean inArrearsIgnore) {
            this.inArrearsIgnore = inArrearsIgnore;
            return this;
        }
        public Boolean getInArrearsIgnore() {
            return this.inArrearsIgnore;
        }

        public CreateJobGroupResponseBodyJobGroupRecallStrategy setOutOfServiceIgnore(Boolean outOfServiceIgnore) {
            this.outOfServiceIgnore = outOfServiceIgnore;
            return this;
        }
        public Boolean getOutOfServiceIgnore() {
            return this.outOfServiceIgnore;
        }

    }

    public static class CreateJobGroupResponseBodyJobGroupStrategyWorkingTime extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>12:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        public static CreateJobGroupResponseBodyJobGroupStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            CreateJobGroupResponseBodyJobGroupStrategyWorkingTime self = new CreateJobGroupResponseBodyJobGroupStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public CreateJobGroupResponseBodyJobGroupStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public CreateJobGroupResponseBodyJobGroupStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class CreateJobGroupResponseBodyJobGroupStrategy extends TeaModel {
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
         * <p>3</p>
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
         * <p>cc9a436e-03b0-4ada-8364-77ec2290aa39</p>
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
        public java.util.List<CreateJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime;

        public static CreateJobGroupResponseBodyJobGroupStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobGroupResponseBodyJobGroupStrategy self = new CreateJobGroupResponseBodyJobGroupStrategy();
            return TeaModel.build(map, self);
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateJobGroupResponseBodyJobGroupStrategy setWorkingTime(java.util.List<CreateJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<CreateJobGroupResponseBodyJobGroupStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class CreateJobGroupResponseBodyJobGroup extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        /**
         * <strong>example:</strong>
         * <p>1578550074361</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("ExportProgress")
        public CreateJobGroupResponseBodyJobGroupExportProgress exportProgress;

        /**
         * <strong>example:</strong>
         * <p>744ff448-2b4c-40d4-94ca-51f246905b0f</p>
         */
        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

        /**
         * <strong>example:</strong>
         * <p>UPLOADED/JOB/b3865dc3-40fa-4afd-9fe4-dc7cda305a24/229eac13-379d-4abe-96e0-8cf026b56c0b_template (1).xlsx</p>
         */
        @NameInMap("JobFilePath")
        public String jobFilePath;

        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        /**
         * <strong>example:</strong>
         * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinConcurrency")
        public Long minConcurrency;

        /**
         * <strong>example:</strong>
         * <p>1628425608429</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("RecallCallingNumbers")
        public java.util.List<String> recallCallingNumbers;

        @NameInMap("RecallStrategy")
        public CreateJobGroupResponseBodyJobGroupRecallStrategy recallStrategy;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RingingDuration")
        public Long ringingDuration;

        /**
         * <strong>example:</strong>
         * <p>6cea9bed-63e6-439e-ae4c-b3333efff53d</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <strong>example:</strong>
         * <p>1628425608429</p>
         */
        @NameInMap("ScriptVersion")
        public String scriptVersion;

        /**
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Strategy")
        public CreateJobGroupResponseBodyJobGroupStrategy strategy;

        public static CreateJobGroupResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateJobGroupResponseBodyJobGroup self = new CreateJobGroupResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public CreateJobGroupResponseBodyJobGroup setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public CreateJobGroupResponseBodyJobGroup setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public CreateJobGroupResponseBodyJobGroup setExportProgress(CreateJobGroupResponseBodyJobGroupExportProgress exportProgress) {
            this.exportProgress = exportProgress;
            return this;
        }
        public CreateJobGroupResponseBodyJobGroupExportProgress getExportProgress() {
            return this.exportProgress;
        }

        public CreateJobGroupResponseBodyJobGroup setJobDataParsingTaskId(String jobDataParsingTaskId) {
            this.jobDataParsingTaskId = jobDataParsingTaskId;
            return this;
        }
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        public CreateJobGroupResponseBodyJobGroup setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public CreateJobGroupResponseBodyJobGroup setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public CreateJobGroupResponseBodyJobGroup setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public CreateJobGroupResponseBodyJobGroup setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public CreateJobGroupResponseBodyJobGroup setMinConcurrency(Long minConcurrency) {
            this.minConcurrency = minConcurrency;
            return this;
        }
        public Long getMinConcurrency() {
            return this.minConcurrency;
        }

        public CreateJobGroupResponseBodyJobGroup setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public CreateJobGroupResponseBodyJobGroup setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CreateJobGroupResponseBodyJobGroup setRecallCallingNumbers(java.util.List<String> recallCallingNumbers) {
            this.recallCallingNumbers = recallCallingNumbers;
            return this;
        }
        public java.util.List<String> getRecallCallingNumbers() {
            return this.recallCallingNumbers;
        }

        public CreateJobGroupResponseBodyJobGroup setRecallStrategy(CreateJobGroupResponseBodyJobGroupRecallStrategy recallStrategy) {
            this.recallStrategy = recallStrategy;
            return this;
        }
        public CreateJobGroupResponseBodyJobGroupRecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        public CreateJobGroupResponseBodyJobGroup setRingingDuration(Long ringingDuration) {
            this.ringingDuration = ringingDuration;
            return this;
        }
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        public CreateJobGroupResponseBodyJobGroup setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public CreateJobGroupResponseBodyJobGroup setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public CreateJobGroupResponseBodyJobGroup setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        public CreateJobGroupResponseBodyJobGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateJobGroupResponseBodyJobGroup setStrategy(CreateJobGroupResponseBodyJobGroupStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public CreateJobGroupResponseBodyJobGroupStrategy getStrategy() {
            return this.strategy;
        }

    }

}
