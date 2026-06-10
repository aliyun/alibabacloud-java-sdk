// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobGroupResponseBody extends TeaModel {
    /**
     * <p>API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Job information.</p>
     */
    @NameInMap("JobGroup")
    public DescribeJobGroupResponseBodyJobGroup jobGroup;

    /**
     * <p>API message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>File URL. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-shanghai.aliyuncs.com/xx.zip">https://oss-cn-shanghai.aliyuncs.com/xx.zip</a></p>
         */
        @NameInMap("FileHttpUrl")
        public String fileHttpUrl;

        /**
         * <p>Export progress. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>Export status. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
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

    public static class DescribeJobGroupResponseBodyJobGroupFlashSmsExtras extends TeaModel {
        /**
         * <p>Flash SMS configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bebe23e6e2604f50bbeb12900c07703d</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>Flash SMS template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e080d737-5c0b-4350-b7d4-1162530579e7</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeJobGroupResponseBodyJobGroupFlashSmsExtras build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobGroupResponseBodyJobGroupFlashSmsExtras self = new DescribeJobGroupResponseBodyJobGroupFlashSmsExtras();
            return TeaModel.build(map, self);
        }

        public DescribeJobGroupResponseBodyJobGroupFlashSmsExtras setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeJobGroupResponseBodyJobGroupFlashSmsExtras setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class DescribeJobGroupResponseBodyJobGroupProgressBriefs extends TeaModel {
        /**
         * <p>Business result name.</p>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Business result value.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>Custom statistics field name.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Custom statistics value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>Business result information. This field is deprecated.</p>
         */
        @NameInMap("Briefs")
        public java.util.List<DescribeJobGroupResponseBodyJobGroupProgressBriefs> briefs;

        /**
         * <p>Number of cancelled jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Cancelled")
        public Integer cancelled;

        /**
         * <p>Statistics in key-value format. This field is deprecated.</p>
         */
        @NameInMap("Categories")
        public java.util.List<DescribeJobGroupResponseBodyJobGroupProgressCategories> categories;

        /**
         * <p>Job execution time. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>Number of jobs in execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Executing")
        public Integer executing;

        /**
         * <p>Number of failed jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failed")
        public Integer failed;

        /**
         * <p>Number of paused jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Paused")
        public Integer paused;

        /**
         * <p>Number of jobs being scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Scheduling")
        public Integer scheduling;

        /**
         * <p>Start time of execution. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1578881227404</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Overall job execution status. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Total number of completed jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        /**
         * <p>Total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalJobs")
        public Integer totalJobs;

        /**
         * <p>This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Do not dial nonexistent numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EmptyNumberIgnore")
        public Boolean emptyNumberIgnore;

        /**
         * <p>Do not dial numbers with overdue payments.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InArrearsIgnore")
        public Boolean inArrearsIgnore;

        /**
         * <p>Do not dial out-of-service numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>Number of calls hung up by the customer. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClientHangupNum")
        public Integer clientHangupNum;

        /**
         * <p>Number of completed jobs. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishedNum")
        public Integer finishedNum;

        /**
         * <p>Number of calls with no interaction. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoInteractNum")
        public Integer noInteractNum;

        /**
         * <p>Number of calls hung up due to timeout. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeoutHangupNum")
        public Integer timeoutHangupNum;

        /**
         * <p>Number of unrecognized responses. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>End time</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>12:00:00</p>
         */
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
        /**
         * <p>Custom data for the strategy. This is a legacy parameter and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Customized")
        public String customized;

        /**
         * <p>End time of the scheduling strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>1579881227404</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Action to take after the execution period ends. This is a legacy parameter and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("FollowUpStrategy")
        public String followUpStrategy;

        /**
         * <p>Indicates whether this is a template.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        /**
         * <p>Maximum number of calls per day when the call is not answered.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        /**
         * <p>Minimum interval between retry attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        /**
         * <p>Job repetition method.</p>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        @NameInMap("RepeatBy")
        public String repeatBy;

        /**
         * <p>Days on which the job repeats. Use with RepeatBy.</p>
         * <ul>
         * <li><p>If the recurrence is weekly, 0 means Sunday, and 1–6 mean Monday through Saturday.</p>
         * </li>
         * <li><p>If the recurrence is monthly, 1–31 mean the 1st through 31st days of the month. Months without the specified day skip the job. For example, if you select the 30th, February skips it.</p>
         * </li>
         * </ul>
         */
        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        /**
         * <p>Indicates whether this is a recurring job.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Repeatable")
        public Boolean repeatable;

        /**
         * <p>Phone number routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>LocalFirst</p>
         */
        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        /**
         * <p>Start time of the strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>1578881227404</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Strategy description.</p>
         * 
         * <strong>example:</strong>
         * <p>催收策略</p>
         */
        @NameInMap("StrategyDescription")
        public String strategyDescription;

        /**
         * <p>Strategy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2bff22c-2604-4df2-83d6-5952e2438c5a</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>Strategy name.</p>
         * 
         * <strong>example:</strong>
         * <p>催收策略名字</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>Strategy type.</p>
         * 
         * <strong>example:</strong>
         * <p>Repeatable</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Working hours.</p>
         */
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

        public DescribeJobGroupResponseBodyJobGroupStrategy setRepeatable(Boolean repeatable) {
            this.repeatable = repeatable;
            return this;
        }
        public Boolean getRepeatable() {
            return this.repeatable;
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
        /**
         * <p>Caller number list.</p>
         */
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1578881227404</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>Export progress. This field is deprecated.</p>
         * <blockquote>
         * <p>Get this information from the ListJobGroups API instead.</p>
         * </blockquote>
         */
        @NameInMap("ExportProgress")
        public DescribeJobGroupResponseBodyJobGroupExportProgress exportProgress;

        /**
         * <p>Configuration parameters for flash SMS delivery. This is a JSON object that contains third-party flash SMS configuration details.</p>
         */
        @NameInMap("FlashSmsExtras")
        public DescribeJobGroupResponseBodyJobGroupFlashSmsExtras flashSmsExtras;

        /**
         * <p>Job list parsing task ID. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>da37319b-6c83-4268-9f19-814aed62e401/a5a9a310-b902-4674-a6e1-29975cbaa312_100.xlsx</p>
         */
        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

        /**
         * <p>OSS file key for the uploaded job list. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>da37319b-6c83-4268-9f19-814aed62e401/a5a9a310-b902-4674-a6e1-29975cbaa312_100.xlsx</p>
         */
        @NameInMap("JobFilePath")
        public String jobFilePath;

        /**
         * <p>Job description.</p>
         * 
         * <strong>example:</strong>
         * <p>催收作业组</p>
         */
        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        /**
         * <p>Job group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46a9ad0c-3e11-44da-a9a7-2c21bf5ce185</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>Job group name.</p>
         * 
         * <strong>example:</strong>
         * <p>催收作业组</p>
         */
        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <p>Minimum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinConcurrency")
        public Long minConcurrency;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1578881227404</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>Job progress.</p>
         */
        @NameInMap("Progress")
        public DescribeJobGroupResponseBodyJobGroupProgress progress;

        /**
         * <p>Caller number list for redials. These numbers are used only when the first call fails. If not specified, the system uses the main caller number list.</p>
         */
        @NameInMap("RecallCallingNumbers")
        public java.util.List<String> recallCallingNumbers;

        /**
         * <p>Redial strategy.</p>
         */
        @NameInMap("RecallStrategy")
        public DescribeJobGroupResponseBodyJobGroupRecallStrategy recallStrategy;

        /**
         * <p>Statistics. This is a legacy parameter and is no longer provided. This field is deprecated.</p>
         */
        @NameInMap("Result")
        public DescribeJobGroupResponseBodyJobGroupResult result;

        /**
         * <p>Ringing duration.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RingingDuration")
        public Long ringingDuration;

        /**
         * <p>Scenario ID. This is a legacy canvas parameter. For new canvases, this value is the same as ScriptId.</p>
         * 
         * <strong>example:</strong>
         * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <p>Script scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49f00b0d-78ac-4d51-91de-a9e8e92b8470</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>Script scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>催收话术</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("ScriptNluEngine")
        public String scriptNluEngine;

        /**
         * <p>Script scenario version number.</p>
         * 
         * <strong>example:</strong>
         * <p>49f00b0d-78ac-4d51-91de-a9e8e92b8470</p>
         */
        @NameInMap("ScriptVersion")
        public String scriptVersion;

        /**
         * <p>Job status.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Job execution strategy.</p>
         */
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

        public DescribeJobGroupResponseBodyJobGroup setFlashSmsExtras(DescribeJobGroupResponseBodyJobGroupFlashSmsExtras flashSmsExtras) {
            this.flashSmsExtras = flashSmsExtras;
            return this;
        }
        public DescribeJobGroupResponseBodyJobGroupFlashSmsExtras getFlashSmsExtras() {
            return this.flashSmsExtras;
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

        public DescribeJobGroupResponseBodyJobGroup setRecallCallingNumbers(java.util.List<String> recallCallingNumbers) {
            this.recallCallingNumbers = recallCallingNumbers;
            return this;
        }
        public java.util.List<String> getRecallCallingNumbers() {
            return this.recallCallingNumbers;
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

        public DescribeJobGroupResponseBodyJobGroup setScriptNluEngine(String scriptNluEngine) {
            this.scriptNluEngine = scriptNluEngine;
            return this;
        }
        public String getScriptNluEngine() {
            return this.scriptNluEngine;
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
