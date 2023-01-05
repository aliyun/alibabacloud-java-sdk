// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobGroup")
    public DescribeJobGroupResponseBodyJobGroup jobGroup;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeJobGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobGroupResponseBody self = new DescribeJobGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeJobGroupResponseBody setJobGroup(DescribeJobGroupResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public DescribeJobGroupResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public DescribeJobGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeJobGroupResponseBodyJobGroupExportProgress extends TeaModel {
        @NameInMap("FileHttpUrl")
        public String fileHttpUrl;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeJobGroupResponseBodyJobGroupExportProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupExportProgress self = new DescribeJobGroupResponseBodyJobGroupExportProgress();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupExportProgress setFileHttpUrl(String fileHttpUrl) {
            this.fileHttpUrl = fileHttpUrl;
            return this;
        }
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        public DescribeJobGroupResponseBodyJobGroupExportProgress setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeJobGroupResponseBodyJobGroupExportProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupProgressBriefs extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeJobGroupResponseBodyJobGroupProgressBriefs build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupProgressBriefs self = new DescribeJobGroupResponseBodyJobGroupProgressBriefs();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupProgressBriefs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeJobGroupResponseBodyJobGroupProgressBriefs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupProgressCategories extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeJobGroupResponseBodyJobGroupProgressCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupProgressCategories self = new DescribeJobGroupResponseBodyJobGroupProgressCategories();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupProgressCategories setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeJobGroupResponseBodyJobGroupProgressCategories setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupProgress extends TeaModel {
        @NameInMap("Briefs")
        public java.util.List<DescribeJobGroupResponseBodyJobGroupProgressBriefs> briefs;

        @NameInMap("Cancelled")
        public Integer cancelled;

        @NameInMap("Categories")
        public java.util.List<DescribeJobGroupResponseBodyJobGroupProgressCategories> categories;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Executing")
        public Integer executing;

        @NameInMap("Failed")
        public Integer failed;

        @NameInMap("Paused")
        public Integer paused;

        @NameInMap("Scheduling")
        public Integer scheduling;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        @NameInMap("TotalJobs")
        public Integer totalJobs;

        @NameInMap("TotalNotAnswered")
        public Integer totalNotAnswered;

        public static DescribeJobGroupResponseBodyJobGroupProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupProgress self = new DescribeJobGroupResponseBodyJobGroupProgress();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setBriefs(java.util.List<DescribeJobGroupResponseBodyJobGroupProgressBriefs> briefs) {
            this.briefs = briefs;
            return this;
        }
        public java.util.List<DescribeJobGroupResponseBodyJobGroupProgressBriefs> getBriefs() {
            return this.briefs;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setCancelled(Integer cancelled) {
            this.cancelled = cancelled;
            return this;
        }
        public Integer getCancelled() {
            return this.cancelled;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setCategories(java.util.List<DescribeJobGroupResponseBodyJobGroupProgressCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<DescribeJobGroupResponseBodyJobGroupProgressCategories> getCategories() {
            return this.categories;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setExecuting(Integer executing) {
            this.executing = executing;
            return this;
        }
        public Integer getExecuting() {
            return this.executing;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setPaused(Integer paused) {
            this.paused = paused;
            return this;
        }
        public Integer getPaused() {
            return this.paused;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setScheduling(Integer scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Integer getScheduling() {
            return this.scheduling;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setTotalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
            return this;
        }
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public DescribeJobGroupResponseBodyJobGroupProgress setTotalNotAnswered(Integer totalNotAnswered) {
            this.totalNotAnswered = totalNotAnswered;
            return this;
        }
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupRecallStrategy extends TeaModel {
        @NameInMap("EmptyNumberIgnore")
        public Boolean emptyNumberIgnore;

        @NameInMap("InArrearsIgnore")
        public Boolean inArrearsIgnore;

        @NameInMap("OutOfServiceIgnore")
        public Boolean outOfServiceIgnore;

        public static DescribeJobGroupResponseBodyJobGroupRecallStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupRecallStrategy self = new DescribeJobGroupResponseBodyJobGroupRecallStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupRecallStrategy setEmptyNumberIgnore(Boolean emptyNumberIgnore) {
            this.emptyNumberIgnore = emptyNumberIgnore;
            return this;
        }
        public Boolean getEmptyNumberIgnore() {
            return this.emptyNumberIgnore;
        }

        public DescribeJobGroupResponseBodyJobGroupRecallStrategy setInArrearsIgnore(Boolean inArrearsIgnore) {
            this.inArrearsIgnore = inArrearsIgnore;
            return this;
        }
        public Boolean getInArrearsIgnore() {
            return this.inArrearsIgnore;
        }

        public DescribeJobGroupResponseBodyJobGroupRecallStrategy setOutOfServiceIgnore(Boolean outOfServiceIgnore) {
            this.outOfServiceIgnore = outOfServiceIgnore;
            return this;
        }
        public Boolean getOutOfServiceIgnore() {
            return this.outOfServiceIgnore;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupResult extends TeaModel {
        @NameInMap("ClientHangupNum")
        public Integer clientHangupNum;

        @NameInMap("FinishedNum")
        public Integer finishedNum;

        @NameInMap("NoInteractNum")
        public Integer noInteractNum;

        @NameInMap("TimeoutHangupNum")
        public Integer timeoutHangupNum;

        @NameInMap("UnrecognizedNum")
        public Integer unrecognizedNum;

        public static DescribeJobGroupResponseBodyJobGroupResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupResult self = new DescribeJobGroupResponseBodyJobGroupResult();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupResult setClientHangupNum(Integer clientHangupNum) {
            this.clientHangupNum = clientHangupNum;
            return this;
        }
        public Integer getClientHangupNum() {
            return this.clientHangupNum;
        }

        public DescribeJobGroupResponseBodyJobGroupResult setFinishedNum(Integer finishedNum) {
            this.finishedNum = finishedNum;
            return this;
        }
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        public DescribeJobGroupResponseBodyJobGroupResult setNoInteractNum(Integer noInteractNum) {
            this.noInteractNum = noInteractNum;
            return this;
        }
        public Integer getNoInteractNum() {
            return this.noInteractNum;
        }

        public DescribeJobGroupResponseBodyJobGroupResult setTimeoutHangupNum(Integer timeoutHangupNum) {
            this.timeoutHangupNum = timeoutHangupNum;
            return this;
        }
        public Integer getTimeoutHangupNum() {
            return this.timeoutHangupNum;
        }

        public DescribeJobGroupResponseBodyJobGroupResult setUnrecognizedNum(Integer unrecognizedNum) {
            this.unrecognizedNum = unrecognizedNum;
            return this;
        }
        public Integer getUnrecognizedNum() {
            return this.unrecognizedNum;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        public static DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime self = new DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupStrategy extends TeaModel {
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
        public java.util.List<DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime;

        public static DescribeJobGroupResponseBodyJobGroupStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupStrategy self = new DescribeJobGroupResponseBodyJobGroupStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeJobGroupResponseBodyJobGroupStrategy setWorkingTime(java.util.List<DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<DescribeJobGroupResponseBodyJobGroupStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroup extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("ExportProgress")
        public DescribeJobGroupResponseBodyJobGroupExportProgress exportProgress;

        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

        @NameInMap("JobFilePath")
        public String jobFilePath;

        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        @NameInMap("MinConcurrency")
        public Long minConcurrency;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Progress")
        public DescribeJobGroupResponseBodyJobGroupProgress progress;

        @NameInMap("RecallStrategy")
        public DescribeJobGroupResponseBodyJobGroupRecallStrategy recallStrategy;

        @NameInMap("Result")
        public DescribeJobGroupResponseBodyJobGroupResult result;

        @NameInMap("RingingDuration")
        public Long ringingDuration;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("ScriptVersion")
        public String scriptVersion;

        @NameInMap("Status")
        public String status;

        @NameInMap("Strategy")
        public DescribeJobGroupResponseBodyJobGroupStrategy strategy;

        public static DescribeJobGroupResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroup self = new DescribeJobGroupResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroup setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public DescribeJobGroupResponseBodyJobGroup setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeJobGroupResponseBodyJobGroup setExportProgress(DescribeJobGroupResponseBodyJobGroupExportProgress exportProgress) {
            this.exportProgress = exportProgress;
            return this;
        }
        public DescribeJobGroupResponseBodyJobGroupExportProgress getExportProgress() {
            return this.exportProgress;
        }

        public DescribeJobGroupResponseBodyJobGroup setJobDataParsingTaskId(String jobDataParsingTaskId) {
            this.jobDataParsingTaskId = jobDataParsingTaskId;
            return this;
        }
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        public DescribeJobGroupResponseBodyJobGroup setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public DescribeJobGroupResponseBodyJobGroup setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public DescribeJobGroupResponseBodyJobGroup setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public DescribeJobGroupResponseBodyJobGroup setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public DescribeJobGroupResponseBodyJobGroup setMinConcurrency(Long minConcurrency) {
            this.minConcurrency = minConcurrency;
            return this;
        }
        public Long getMinConcurrency() {
            return this.minConcurrency;
        }

        public DescribeJobGroupResponseBodyJobGroup setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeJobGroupResponseBodyJobGroup setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeJobGroupResponseBodyJobGroup setProgress(DescribeJobGroupResponseBodyJobGroupProgress progress) {
            this.progress = progress;
            return this;
        }
        public DescribeJobGroupResponseBodyJobGroupProgress getProgress() {
            return this.progress;
        }

        public DescribeJobGroupResponseBodyJobGroup setRecallStrategy(DescribeJobGroupResponseBodyJobGroupRecallStrategy recallStrategy) {
            this.recallStrategy = recallStrategy;
            return this;
        }
        public DescribeJobGroupResponseBodyJobGroupRecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        public DescribeJobGroupResponseBodyJobGroup setResult(DescribeJobGroupResponseBodyJobGroupResult result) {
            this.result = result;
            return this;
        }
        public DescribeJobGroupResponseBodyJobGroupResult getResult() {
            return this.result;
        }

        public DescribeJobGroupResponseBodyJobGroup setRingingDuration(Long ringingDuration) {
            this.ringingDuration = ringingDuration;
            return this;
        }
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        public DescribeJobGroupResponseBodyJobGroup setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public DescribeJobGroupResponseBodyJobGroup setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public DescribeJobGroupResponseBodyJobGroup setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public DescribeJobGroupResponseBodyJobGroup setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        public DescribeJobGroupResponseBodyJobGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJobGroupResponseBodyJobGroup setStrategy(DescribeJobGroupResponseBodyJobGroupStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public DescribeJobGroupResponseBodyJobGroupStrategy getStrategy() {
            return this.strategy;
        }

    }

}
