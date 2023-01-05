// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Jobs")
    public QueryJobsResponseBodyJobs jobs;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsResponseBody self = new QueryJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryJobsResponseBody setJobs(QueryJobsResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public QueryJobsResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public QueryJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryJobsResponseBodyJobsListContacts extends TeaModel {
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

        public static QueryJobsResponseBodyJobsListContacts build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobsListContacts self = new QueryJobsResponseBodyJobsListContacts();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobsListContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public QueryJobsResponseBodyJobsListContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryJobsResponseBodyJobsListContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public QueryJobsResponseBodyJobsListContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobsResponseBodyJobsListContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryJobsResponseBodyJobsListContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public QueryJobsResponseBodyJobsListContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryJobsResponseBodyJobsListContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryJobsResponseBodyJobsListExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryJobsResponseBodyJobsListExtras build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobsListExtras self = new QueryJobsResponseBodyJobsListExtras();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobsListExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryJobsResponseBodyJobsListExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryJobsResponseBodyJobsListSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("ConversationDetailId")
        public String conversationDetailId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SummaryId")
        public String summaryId;

        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("TaskId")
        public String taskId;

        public static QueryJobsResponseBodyJobsListSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobsListSummary self = new QueryJobsResponseBodyJobsListSummary();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobsListSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryJobsResponseBodyJobsListSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryJobsResponseBodyJobsListSummary setConversationDetailId(String conversationDetailId) {
            this.conversationDetailId = conversationDetailId;
            return this;
        }
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

        public QueryJobsResponseBodyJobsListSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryJobsResponseBodyJobsListSummary setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobsResponseBodyJobsListSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

        public QueryJobsResponseBodyJobsListSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public QueryJobsResponseBodyJobsListSummary setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryJobsResponseBodyJobsListTasksContact extends TeaModel {
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

        public static QueryJobsResponseBodyJobsListTasksContact build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobsListTasksContact self = new QueryJobsResponseBodyJobsListTasksContact();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobsListTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public QueryJobsResponseBodyJobsListTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryJobsResponseBodyJobsListTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public QueryJobsResponseBodyJobsListTasksContact setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobsResponseBodyJobsListTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryJobsResponseBodyJobsListTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public QueryJobsResponseBodyJobsListTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryJobsResponseBodyJobsListTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryJobsResponseBodyJobsListTasks extends TeaModel {
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
        public QueryJobsResponseBodyJobsListTasksContact contact;

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

        public static QueryJobsResponseBodyJobsListTasks build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobsListTasks self = new QueryJobsResponseBodyJobsListTasks();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobsListTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public QueryJobsResponseBodyJobsListTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public QueryJobsResponseBodyJobsListTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public QueryJobsResponseBodyJobsListTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public QueryJobsResponseBodyJobsListTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public QueryJobsResponseBodyJobsListTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public QueryJobsResponseBodyJobsListTasks setContact(QueryJobsResponseBodyJobsListTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public QueryJobsResponseBodyJobsListTasksContact getContact() {
            return this.contact;
        }

        public QueryJobsResponseBodyJobsListTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryJobsResponseBodyJobsListTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobsResponseBodyJobsListTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public QueryJobsResponseBodyJobsListTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public QueryJobsResponseBodyJobsListTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryJobsResponseBodyJobsListTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryJobsResponseBodyJobsList extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<QueryJobsResponseBodyJobsListContacts> contacts;

        @NameInMap("Extras")
        public java.util.List<QueryJobsResponseBodyJobsListExtras> extras;

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
        public java.util.List<QueryJobsResponseBodyJobsListSummary> summary;

        @NameInMap("Tasks")
        public java.util.List<QueryJobsResponseBodyJobsListTasks> tasks;

        public static QueryJobsResponseBodyJobsList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobsList self = new QueryJobsResponseBodyJobsList();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobsList setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public QueryJobsResponseBodyJobsList setContacts(java.util.List<QueryJobsResponseBodyJobsListContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<QueryJobsResponseBodyJobsListContacts> getContacts() {
            return this.contacts;
        }

        public QueryJobsResponseBodyJobsList setExtras(java.util.List<QueryJobsResponseBodyJobsListExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<QueryJobsResponseBodyJobsListExtras> getExtras() {
            return this.extras;
        }

        public QueryJobsResponseBodyJobsList setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public QueryJobsResponseBodyJobsList setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public QueryJobsResponseBodyJobsList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobsResponseBodyJobsList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryJobsResponseBodyJobsList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public QueryJobsResponseBodyJobsList setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public QueryJobsResponseBodyJobsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryJobsResponseBodyJobsList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public QueryJobsResponseBodyJobsList setSummary(java.util.List<QueryJobsResponseBodyJobsListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<QueryJobsResponseBodyJobsListSummary> getSummary() {
            return this.summary;
        }

        public QueryJobsResponseBodyJobsList setTasks(java.util.List<QueryJobsResponseBodyJobsListTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<QueryJobsResponseBodyJobsListTasks> getTasks() {
            return this.tasks;
        }

    }

    public static class QueryJobsResponseBodyJobs extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryJobsResponseBodyJobsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobs self = new QueryJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobs setList(java.util.List<QueryJobsResponseBodyJobsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryJobsResponseBodyJobsList> getList() {
            return this.list;
        }

        public QueryJobsResponseBodyJobs setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryJobsResponseBodyJobs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryJobsResponseBodyJobs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
