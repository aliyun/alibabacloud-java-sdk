// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyJobGroupResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The job information.</p>
     */
    @NameInMap("JobGroup")
    public ModifyJobGroupResponseBodyJobGroup jobGroup;

    /**
     * <p>The API message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
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
         * <p>The file URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***.oss-cn-shanghai.aliyuncs.com/sample</p>
         */
        @NameInMap("FileHttpUrl")
        public String fileHttpUrl;

        /**
         * <p>The progress.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status.</p>
         * 
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
         * <p>Specifies whether to ignore nonexistent numbers for outbound calls.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EmptyNumberIgnore")
        public Boolean emptyNumberIgnore;

        /**
         * <p>Specifies whether to ignore numbers with overdue payments for outbound calls.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InArrearsIgnore")
        public Boolean inArrearsIgnore;

        /**
         * <p>Specifies whether to ignore out-of-service numbers for outbound calls.</p>
         * 
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
         * <p>The start time. The format is HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The end time. The format is HH:mm:ss.</p>
         * 
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
         * <p>The custom strategy data. This is a legacy parameter and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Customized")
        public String customized;

        /**
         * <p>The end time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2209702074000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The processing method after the execution cycle ends. This is a legacy parameter and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("FollowUpStrategy")
        public String followUpStrategy;

        /**
         * <p>Indicates whether it is a template. This is a legacy parameter and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        /**
         * <p>The maximum number of attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        /**
         * <p>The retry interval after a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        /**
         * <p>The recurrence type. Valid values: Once (no recurrence), Day (daily), Week (weekly), and Month (monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        @NameInMap("RepeatBy")
        public String repeatBy;

        /**
         * <p>The execution days for recurrence.</p>
         * <p>If the recurrence type RepeatBy is Week, 0 indicates Sunday, and 1 to 6 indicate Monday to Saturday.
         * If the recurrence type RepeatBy is Month, 1 to 31 indicate the 1st to the 31st day of the month. If a month does not have the specified day, the job is not executed in that month. For example, if the 30th is selected, the job is not executed in February.</p>
         */
        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        /**
         * <p>The phone number routing strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>LocalFirst</p>
         */
        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        /**
         * <p>The start time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1578550074000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The strategy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Collection job execution strategy</p>
         */
        @NameInMap("StrategyDescription")
        public String strategyDescription;

        /**
         * <p>The strategy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f718798d-96be-40e4-bef6-317b54855708</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Collection strategy</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The strategy type.</p>
         * 
         * <strong>example:</strong>
         * <p>Repeatable</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time period during which outbound calls are allowed.</p>
         */
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
        /**
         * <p>The list of caller numbers.</p>
         */
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        /**
         * <p>The creation time.</p>
         * <blockquote>
         * <p>You can obtain this value from the response of the DescribeJobGroup operation. The value is a UNIX timestamp in milliseconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1578550074361</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The export information. This is a legacy parameter and is no longer used.</p>
         */
        @NameInMap("ExportProgress")
        public ModifyJobGroupResponseBodyJobGroupExportProgress exportProgress;

        /**
         * <p>The configuration parameters for flash message push in JSON format, including the configuration information of third-party flash messages.</p>
         * <p>templateId: the flash message template ID.
         * configId: the flash message configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;configId&quot;:&quot;3157b3c8-3a3e-4ea9-894b-9c8a6&quot;, &quot;templateId&quot;:&quot;1234&quot;}</p>
         */
        @NameInMap("FlashSmsExtras")
        public String flashSmsExtras;

        /**
         * <p><strong>[Deprecated]</strong> The ID of the parsing task corresponding to the outbound job file.</p>
         * 
         * <strong>example:</strong>
         * <p>e37d28cb-0413-4816-85ed-fd354d025ea3</p>
         */
        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

        /**
         * <p><strong>[Deprecated]</strong> The OSS storage path of the job file.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOADED/JOB/d481cebe-0bb6-4d13-9649-42ce5074fb75/6c7d9132-98e1-4f08-8a76-8a266c7532fd_job_template - Copy.xlsx</p>
         */
        @NameInMap("JobFilePath")
        public String jobFilePath;

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>Collection job group</p>
         */
        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>First collection</p>
         */
        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <p>The guaranteed concurrency.
         * When a job starts, a minimum of N concurrent calls are guaranteed.
         * The sum of guaranteed concurrency values for jobs of the same priority cannot exceed the instance concurrency.
         * If the guaranteed concurrency is set to 0, the system intelligently allocates idle concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinConcurrency")
        public Long minConcurrency;

        /**
         * <p>The modification time.</p>
         * <blockquote>
         * <p>You can obtain this value from the response of the DescribeJobGroup operation. The value is a UNIX timestamp in milliseconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1628425608429</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The job group priority. Valid values:</p>
         * <p>Urgent: urgent job.
         * Daily: daily job.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The recall strategy.</p>
         */
        @NameInMap("RecallStrategy")
        public ModifyJobGroupResponseBodyJobGroupRecallStrategy recallStrategy;

        /**
         * <p>The ringing duration.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("RingingDuration")
        public Long ringingDuration;

        /**
         * <p>The scenario ID.</p>
         * <blockquote>
         * <p>This parameter returns a legacy value. You can obtain the specific ScriptId from the response of the DescribeJobGroup operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6cea9bed-63e6-439e-ae4c-b3333efff53d</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>Script</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The script version.</p>
         * 
         * <strong>example:</strong>
         * <p>1628425608429</p>
         */
        @NameInMap("ScriptVersion")
        public String scriptVersion;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The outbound call strategy.</p>
         */
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
