// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Jobs")
    public java.util.List<ListJobsResponseBodyJobs> jobs;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobsResponseBody setJobs(java.util.List<ListJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobsResponseBodyJobsContacts extends TeaModel {
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

        public static ListJobsResponseBodyJobsContacts build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsContacts self = new ListJobsResponseBodyJobsContacts();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListJobsResponseBodyJobsContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListJobsResponseBodyJobsContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public ListJobsResponseBodyJobsContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyJobsContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListJobsResponseBodyJobsContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobsResponseBodyJobsContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListJobsResponseBodyJobsContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListJobsResponseBodyJobsExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListJobsResponseBodyJobsExtras build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsExtras self = new ListJobsResponseBodyJobsExtras();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobsResponseBodyJobsExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobsResponseBodyJobsSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryName")
        public String summaryName;

        public static ListJobsResponseBodyJobsSummary build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsSummary self = new ListJobsResponseBodyJobsSummary();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListJobsResponseBodyJobsSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListJobsResponseBodyJobsSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

    }

    public static class ListJobsResponseBodyJobsTasksContact extends TeaModel {
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

        public static ListJobsResponseBodyJobsTasksContact build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsTasksContact self = new ListJobsResponseBodyJobsTasksContact();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListJobsResponseBodyJobsTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListJobsResponseBodyJobsTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public ListJobsResponseBodyJobsTasksContact setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyJobsTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListJobsResponseBodyJobsTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobsResponseBodyJobsTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListJobsResponseBodyJobsTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListJobsResponseBodyJobsTasksConversationSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryName")
        public String summaryName;

        public static ListJobsResponseBodyJobsTasksConversationSummary build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsTasksConversationSummary self = new ListJobsResponseBodyJobsTasksConversationSummary();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsTasksConversationSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListJobsResponseBodyJobsTasksConversationSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListJobsResponseBodyJobsTasksConversationSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

    }

    public static class ListJobsResponseBodyJobsTasksConversation extends TeaModel {
        @NameInMap("Script")
        public String script;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Summary")
        public java.util.List<ListJobsResponseBodyJobsTasksConversationSummary> summary;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ListJobsResponseBodyJobsTasksConversation build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsTasksConversation self = new ListJobsResponseBodyJobsTasksConversation();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsTasksConversation setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListJobsResponseBodyJobsTasksConversation setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public ListJobsResponseBodyJobsTasksConversation setSummary(java.util.List<ListJobsResponseBodyJobsTasksConversationSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsTasksConversationSummary> getSummary() {
            return this.summary;
        }

        public ListJobsResponseBodyJobsTasksConversation setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListJobsResponseBodyJobsTasks extends TeaModel {
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
        public ListJobsResponseBodyJobsTasksContact contact;

        @NameInMap("Conversation")
        public java.util.List<ListJobsResponseBodyJobsTasksConversation> conversation;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PlanedTime")
        public Long planedTime;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static ListJobsResponseBodyJobsTasks build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsTasks self = new ListJobsResponseBodyJobsTasks();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public ListJobsResponseBodyJobsTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public ListJobsResponseBodyJobsTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListJobsResponseBodyJobsTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListJobsResponseBodyJobsTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListJobsResponseBodyJobsTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public ListJobsResponseBodyJobsTasks setContact(ListJobsResponseBodyJobsTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public ListJobsResponseBodyJobsTasksContact getContact() {
            return this.contact;
        }

        public ListJobsResponseBodyJobsTasks setConversation(java.util.List<ListJobsResponseBodyJobsTasksConversation> conversation) {
            this.conversation = conversation;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsTasksConversation> getConversation() {
            return this.conversation;
        }

        public ListJobsResponseBodyJobsTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListJobsResponseBodyJobsTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyJobsTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public ListJobsResponseBodyJobsTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListJobsResponseBodyJobsTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyJobsTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<ListJobsResponseBodyJobsContacts> contacts;

        @NameInMap("Extras")
        public java.util.List<ListJobsResponseBodyJobsExtras> extras;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("Summary")
        public java.util.List<ListJobsResponseBodyJobsSummary> summary;

        @NameInMap("SystemPriority")
        public Integer systemPriority;

        @NameInMap("Tasks")
        public java.util.List<ListJobsResponseBodyJobsTasks> tasks;

        public static ListJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobs self = new ListJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobs setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ListJobsResponseBodyJobs setContacts(java.util.List<ListJobsResponseBodyJobsContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsContacts> getContacts() {
            return this.contacts;
        }

        public ListJobsResponseBodyJobs setExtras(java.util.List<ListJobsResponseBodyJobsExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsExtras> getExtras() {
            return this.extras;
        }

        public ListJobsResponseBodyJobs setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListJobsResponseBodyJobs setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ListJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyJobs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListJobsResponseBodyJobs setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobsResponseBodyJobs setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyJobs setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListJobsResponseBodyJobs setSummary(java.util.List<ListJobsResponseBodyJobsSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsSummary> getSummary() {
            return this.summary;
        }

        public ListJobsResponseBodyJobs setSystemPriority(Integer systemPriority) {
            this.systemPriority = systemPriority;
            return this;
        }
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

        public ListJobsResponseBodyJobs setTasks(java.util.List<ListJobsResponseBodyJobsTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsTasks> getTasks() {
            return this.tasks;
        }

    }

}
