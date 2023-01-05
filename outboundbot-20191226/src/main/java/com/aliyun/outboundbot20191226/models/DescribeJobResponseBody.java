// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Job")
    public DescribeJobResponseBodyJob job;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResponseBody self = new DescribeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeJobResponseBody setJob(DescribeJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public DescribeJobResponseBodyJob getJob() {
        return this.job;
    }

    public DescribeJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeJobResponseBodyJobContacts extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Honorific")
        public String honorific;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        public static DescribeJobResponseBodyJobContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobContacts self = new DescribeJobResponseBodyJobContacts();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public DescribeJobResponseBodyJobContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public DescribeJobResponseBodyJobContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public DescribeJobResponseBodyJobContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobResponseBodyJobContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public DescribeJobResponseBodyJobContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public DescribeJobResponseBodyJobContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeJobResponseBodyJobContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeJobResponseBodyJobExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeJobResponseBodyJobExtras build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobExtras self = new DescribeJobResponseBodyJobExtras();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeJobResponseBodyJobExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeJobResponseBodyJobScript extends TeaModel {
        @NameInMap("AsrConfig")
        public String asrConfig;

        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("MiniPlaybackConfigEnabled")
        public Boolean miniPlaybackConfigEnabled;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TtsConfig")
        public String ttsConfig;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeJobResponseBodyJobScript build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobScript self = new DescribeJobResponseBodyJobScript();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobScript setAsrConfig(String asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }
        public String getAsrConfig() {
            return this.asrConfig;
        }

        public DescribeJobResponseBodyJobScript setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public DescribeJobResponseBodyJobScript setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public DescribeJobResponseBodyJobScript setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public DescribeJobResponseBodyJobScript setIsDebugDrafted(Boolean isDebugDrafted) {
            this.isDebugDrafted = isDebugDrafted;
            return this;
        }
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        public DescribeJobResponseBodyJobScript setIsDrafted(Boolean isDrafted) {
            this.isDrafted = isDrafted;
            return this;
        }
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        public DescribeJobResponseBodyJobScript setMiniPlaybackConfigEnabled(Boolean miniPlaybackConfigEnabled) {
            this.miniPlaybackConfigEnabled = miniPlaybackConfigEnabled;
            return this;
        }
        public Boolean getMiniPlaybackConfigEnabled() {
            return this.miniPlaybackConfigEnabled;
        }

        public DescribeJobResponseBodyJobScript setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeJobResponseBodyJobScript setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeJobResponseBodyJobScript setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public DescribeJobResponseBodyJobScript setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public DescribeJobResponseBodyJobScript setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJobResponseBodyJobScript setTtsConfig(String ttsConfig) {
            this.ttsConfig = ttsConfig;
            return this;
        }
        public String getTtsConfig() {
            return this.ttsConfig;
        }

        public DescribeJobResponseBodyJobScript setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeJobResponseBodyJobSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryName")
        public String summaryName;

        public static DescribeJobResponseBodyJobSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobSummary self = new DescribeJobResponseBodyJobSummary();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeJobResponseBodyJobSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeJobResponseBodyJobSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

    }

    public static class DescribeJobResponseBodyJobTasksContact extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Honorific")
        public String honorific;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        public static DescribeJobResponseBodyJobTasksContact build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobTasksContact self = new DescribeJobResponseBodyJobTasksContact();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public DescribeJobResponseBodyJobTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public DescribeJobResponseBodyJobTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public DescribeJobResponseBodyJobTasksContact setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobResponseBodyJobTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public DescribeJobResponseBodyJobTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public DescribeJobResponseBodyJobTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeJobResponseBodyJobTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeJobResponseBodyJobTasksConversationSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryName")
        public String summaryName;

        public static DescribeJobResponseBodyJobTasksConversationSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobTasksConversationSummary self = new DescribeJobResponseBodyJobTasksConversationSummary();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobTasksConversationSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeJobResponseBodyJobTasksConversationSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeJobResponseBodyJobTasksConversationSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

    }

    public static class DescribeJobResponseBodyJobTasksConversation extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionParams")
        public String actionParams;

        @NameInMap("Script")
        public String script;

        @NameInMap("SequenceId")
        public String sequenceId;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Summary")
        public java.util.List<DescribeJobResponseBodyJobTasksConversationSummary> summary;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeJobResponseBodyJobTasksConversation build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobTasksConversation self = new DescribeJobResponseBodyJobTasksConversation();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobTasksConversation setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeJobResponseBodyJobTasksConversation setActionParams(String actionParams) {
            this.actionParams = actionParams;
            return this;
        }
        public String getActionParams() {
            return this.actionParams;
        }

        public DescribeJobResponseBodyJobTasksConversation setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public DescribeJobResponseBodyJobTasksConversation setSequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public String getSequenceId() {
            return this.sequenceId;
        }

        public DescribeJobResponseBodyJobTasksConversation setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public DescribeJobResponseBodyJobTasksConversation setSummary(java.util.List<DescribeJobResponseBodyJobTasksConversationSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyJobTasksConversationSummary> getSummary() {
            return this.summary;
        }

        public DescribeJobResponseBodyJobTasksConversation setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeJobResponseBodyJobTasks extends TeaModel {
        @NameInMap("ActualTime")
        public Long actualTime;

        @NameInMap("Brief")
        public String brief;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("Contact")
        public DescribeJobResponseBodyJobTasksContact contact;

        @NameInMap("Conversation")
        public java.util.List<DescribeJobResponseBodyJobTasksConversation> conversation;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EndReason")
        public String endReason;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("HangUpDirection")
        public String hangUpDirection;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PlanedTime")
        public Long planedTime;

        @NameInMap("RingingDuration")
        public Long ringingDuration;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeJobResponseBodyJobTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJobTasks self = new DescribeJobResponseBodyJobTasks();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJobTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public DescribeJobResponseBodyJobTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public DescribeJobResponseBodyJobTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public DescribeJobResponseBodyJobTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public DescribeJobResponseBodyJobTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public DescribeJobResponseBodyJobTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public DescribeJobResponseBodyJobTasks setContact(DescribeJobResponseBodyJobTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public DescribeJobResponseBodyJobTasksContact getContact() {
            return this.contact;
        }

        public DescribeJobResponseBodyJobTasks setConversation(java.util.List<DescribeJobResponseBodyJobTasksConversation> conversation) {
            this.conversation = conversation;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyJobTasksConversation> getConversation() {
            return this.conversation;
        }

        public DescribeJobResponseBodyJobTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeJobResponseBodyJobTasks setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public DescribeJobResponseBodyJobTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeJobResponseBodyJobTasks setHangUpDirection(String hangUpDirection) {
            this.hangUpDirection = hangUpDirection;
            return this;
        }
        public String getHangUpDirection() {
            return this.hangUpDirection;
        }

        public DescribeJobResponseBodyJobTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobResponseBodyJobTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public DescribeJobResponseBodyJobTasks setRingingDuration(Long ringingDuration) {
            this.ringingDuration = ringingDuration;
            return this;
        }
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        public DescribeJobResponseBodyJobTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public DescribeJobResponseBodyJobTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJobResponseBodyJobTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeJobResponseBodyJob extends TeaModel {
        @NameInMap("ActualTime")
        public Long actualTime;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<DescribeJobResponseBodyJobContacts> contacts;

        @NameInMap("DsReport")
        public String dsReport;

        @NameInMap("EndReason")
        public Integer endReason;

        @NameInMap("Extras")
        public java.util.List<DescribeJobResponseBodyJobExtras> extras;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("NextExecutionTime")
        public Long nextExecutionTime;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Script")
        public DescribeJobResponseBodyJobScript script;

        @NameInMap("Status")
        public String status;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("Summary")
        public java.util.List<DescribeJobResponseBodyJobSummary> summary;

        @NameInMap("SystemPriority")
        public Integer systemPriority;

        @NameInMap("Tasks")
        public java.util.List<DescribeJobResponseBodyJobTasks> tasks;

        public static DescribeJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyJob self = new DescribeJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyJob setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public DescribeJobResponseBodyJob setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public DescribeJobResponseBodyJob setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public DescribeJobResponseBodyJob setContacts(java.util.List<DescribeJobResponseBodyJobContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyJobContacts> getContacts() {
            return this.contacts;
        }

        public DescribeJobResponseBodyJob setDsReport(String dsReport) {
            this.dsReport = dsReport;
            return this;
        }
        public String getDsReport() {
            return this.dsReport;
        }

        public DescribeJobResponseBodyJob setEndReason(Integer endReason) {
            this.endReason = endReason;
            return this;
        }
        public Integer getEndReason() {
            return this.endReason;
        }

        public DescribeJobResponseBodyJob setExtras(java.util.List<DescribeJobResponseBodyJobExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyJobExtras> getExtras() {
            return this.extras;
        }

        public DescribeJobResponseBodyJob setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public DescribeJobResponseBodyJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeJobResponseBodyJob setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public DescribeJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobResponseBodyJob setNextExecutionTime(Long nextExecutionTime) {
            this.nextExecutionTime = nextExecutionTime;
            return this;
        }
        public Long getNextExecutionTime() {
            return this.nextExecutionTime;
        }

        public DescribeJobResponseBodyJob setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeJobResponseBodyJob setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public DescribeJobResponseBodyJob setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public DescribeJobResponseBodyJob setScript(DescribeJobResponseBodyJobScript script) {
            this.script = script;
            return this;
        }
        public DescribeJobResponseBodyJobScript getScript() {
            return this.script;
        }

        public DescribeJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJobResponseBodyJob setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeJobResponseBodyJob setSummary(java.util.List<DescribeJobResponseBodyJobSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyJobSummary> getSummary() {
            return this.summary;
        }

        public DescribeJobResponseBodyJob setSystemPriority(Integer systemPriority) {
            this.systemPriority = systemPriority;
            return this;
        }
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

        public DescribeJobResponseBodyJob setTasks(java.util.List<DescribeJobResponseBodyJobTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyJobTasks> getTasks() {
            return this.tasks;
        }

    }

}
