// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyJobGroupResponseBody extends TeaModel {
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
    public ModifyJobGroupResponseBodyJobGroup jobGroup;

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

    public static ModifyJobGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyJobGroupResponseBody self = new ModifyJobGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyJobGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyJobGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyJobGroupResponseBody setJobGroup(ModifyJobGroupResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public ModifyJobGroupResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public ModifyJobGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyJobGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyJobGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyJobGroupResponseBodyJobGroupExportProgress extends TeaModel {
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

        public static ModifyJobGroupResponseBodyJobGroupExportProgress build(java.util.Map<String, ?> map) throws Exception {
            ModifyJobGroupResponseBodyJobGroupExportProgress self = new ModifyJobGroupResponseBodyJobGroupExportProgress();
            return TeaModel.build(map, self);
        }

        public ModifyJobGroupResponseBodyJobGroupExportProgress setFileHttpUrl(String fileHttpUrl) {
            this.fileHttpUrl = fileHttpUrl;
            return this;
        }
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        public ModifyJobGroupResponseBodyJobGroupExportProgress setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ModifyJobGroupResponseBodyJobGroupExportProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ModifyJobGroupResponseBodyJobGroupRecallStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EmptyNumberIgnore")
        public Boolean emptyNumberIgnore;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InArrearsIgnore")
        public Boolean inArrearsIgnore;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutOfServiceIgnore")
        public Boolean outOfServiceIgnore;

        public static ModifyJobGroupResponseBodyJobGroupRecallStrategy build(java.util.Map<String, ?> map) throws Exception {
            ModifyJobGroupResponseBodyJobGroupRecallStrategy self = new ModifyJobGroupResponseBodyJobGroupRecallStrategy();
            return TeaModel.build(map, self);
        }

        public ModifyJobGroupResponseBodyJobGroupRecallStrategy setEmptyNumberIgnore(Boolean emptyNumberIgnore) {
            this.emptyNumberIgnore = emptyNumberIgnore;
            return this;
        }
        public Boolean getEmptyNumberIgnore() {
            return this.emptyNumberIgnore;
        }

        public ModifyJobGroupResponseBodyJobGroupRecallStrategy setInArrearsIgnore(Boolean inArrearsIgnore) {
            this.inArrearsIgnore = inArrearsIgnore;
            return this;
        }
        public Boolean getInArrearsIgnore() {
            return this.inArrearsIgnore;
        }

        public ModifyJobGroupResponseBodyJobGroupRecallStrategy setOutOfServiceIgnore(Boolean outOfServiceIgnore) {
            this.outOfServiceIgnore = outOfServiceIgnore;
            return this;
        }
        public Boolean getOutOfServiceIgnore() {
            return this.outOfServiceIgnore;
        }

    }

    public static class ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime extends TeaModel {
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

        public static ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime self = new ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class ModifyJobGroupResponseBodyJobGroupStrategy extends TeaModel {
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
        public java.util.List<ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime;

        public static ModifyJobGroupResponseBodyJobGroupStrategy build(java.util.Map<String, ?> map) throws Exception {
            ModifyJobGroupResponseBodyJobGroupStrategy self = new ModifyJobGroupResponseBodyJobGroupStrategy();
            return TeaModel.build(map, self);
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyJobGroupResponseBodyJobGroupStrategy setWorkingTime(java.util.List<ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<ModifyJobGroupResponseBodyJobGroupStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class ModifyJobGroupResponseBodyJobGroup extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        /**
         * <strong>example:</strong>
         * <p>1578550074361</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("ExportProgress")
        public ModifyJobGroupResponseBodyJobGroupExportProgress exportProgress;

        @NameInMap("FlashSmsExtras")
        public String flashSmsExtras;

        /**
         * <strong>example:</strong>
         * <p>e37d28cb-0413-4816-85ed-fd354d025ea3</p>
         */
        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

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

        @NameInMap("RecallStrategy")
        public ModifyJobGroupResponseBodyJobGroupRecallStrategy recallStrategy;

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
        public ModifyJobGroupResponseBodyJobGroupStrategy strategy;

        public static ModifyJobGroupResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyJobGroupResponseBodyJobGroup self = new ModifyJobGroupResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public ModifyJobGroupResponseBodyJobGroup setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ModifyJobGroupResponseBodyJobGroup setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ModifyJobGroupResponseBodyJobGroup setExportProgress(ModifyJobGroupResponseBodyJobGroupExportProgress exportProgress) {
            this.exportProgress = exportProgress;
            return this;
        }
        public ModifyJobGroupResponseBodyJobGroupExportProgress getExportProgress() {
            return this.exportProgress;
        }

        public ModifyJobGroupResponseBodyJobGroup setFlashSmsExtras(String flashSmsExtras) {
            this.flashSmsExtras = flashSmsExtras;
            return this;
        }
        public String getFlashSmsExtras() {
            return this.flashSmsExtras;
        }

        public ModifyJobGroupResponseBodyJobGroup setJobDataParsingTaskId(String jobDataParsingTaskId) {
            this.jobDataParsingTaskId = jobDataParsingTaskId;
            return this;
        }
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        public ModifyJobGroupResponseBodyJobGroup setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public ModifyJobGroupResponseBodyJobGroup setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public ModifyJobGroupResponseBodyJobGroup setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ModifyJobGroupResponseBodyJobGroup setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public ModifyJobGroupResponseBodyJobGroup setMinConcurrency(Long minConcurrency) {
            this.minConcurrency = minConcurrency;
            return this;
        }
        public Long getMinConcurrency() {
            return this.minConcurrency;
        }

        public ModifyJobGroupResponseBodyJobGroup setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ModifyJobGroupResponseBodyJobGroup setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifyJobGroupResponseBodyJobGroup setRecallStrategy(ModifyJobGroupResponseBodyJobGroupRecallStrategy recallStrategy) {
            this.recallStrategy = recallStrategy;
            return this;
        }
        public ModifyJobGroupResponseBodyJobGroupRecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        public ModifyJobGroupResponseBodyJobGroup setRingingDuration(Long ringingDuration) {
            this.ringingDuration = ringingDuration;
            return this;
        }
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        public ModifyJobGroupResponseBodyJobGroup setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ModifyJobGroupResponseBodyJobGroup setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public ModifyJobGroupResponseBodyJobGroup setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        public ModifyJobGroupResponseBodyJobGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyJobGroupResponseBodyJobGroup setStrategy(ModifyJobGroupResponseBodyJobGroupStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ModifyJobGroupResponseBodyJobGroupStrategy getStrategy() {
            return this.strategy;
        }

    }

}
