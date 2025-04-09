// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsResponseBody extends TeaModel {
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

    @NameInMap("Jobs")
    public QueryJobsResponseBodyJobs jobs;

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
        /**
         * <strong>example:</strong>
         * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Honorific")
        public String honorific;

        /**
         * <strong>example:</strong>
         * <p>72dcd26b-f12d-4c27-b3af-18f6aed5b160</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>djrq</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>2019-08-21 09:49:59.0</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>098b9b09-9223-4a8b-a422-99726f0457f3</p>
         */
        @NameInMap("ConversationDetailId")
        public String conversationDetailId;

        /**
         * <strong>example:</strong>
         * <p>ba1ba502-d044-48c0-b710-0f1f840a7c53</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>994b8baf-7ef8-480c-b141-b7b6db77c4df</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>dc67d544-df06-4625-ae48-13e3c9f72d8a</p>
         */
        @NameInMap("SummaryId")
        public String summaryId;

        /**
         * <strong>example:</strong>
         * <p>score</p>
         */
        @NameInMap("SummaryName")
        public String summaryName;

        /**
         * <strong>example:</strong>
         * <p>9fdf7a81-6781-4ab8-92fb-1d4231ef365e</p>
         */
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

    public static class QueryJobsResponseBodyJobsListTagHits extends TeaModel {
        @NameInMap("TagGroup")
        public String tagGroup;

        @NameInMap("TagName")
        public String tagName;

        public static QueryJobsResponseBodyJobsListTagHits build(java.util.Map<String, ?> map) throws Exception {
            QueryJobsResponseBodyJobsListTagHits self = new QueryJobsResponseBodyJobsListTagHits();
            return TeaModel.build(map, self);
        }

        public QueryJobsResponseBodyJobsListTagHits setTagGroup(String tagGroup) {
            this.tagGroup = tagGroup;
            return this;
        }
        public String getTagGroup() {
            return this.tagGroup;
        }

        public QueryJobsResponseBodyJobsListTagHits setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class QueryJobsResponseBodyJobsListTasksContact extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Honorific")
        public String honorific;

        /**
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Brief")
        public String brief;

        /**
         * <strong>example:</strong>
         * <p>1528189846043</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <strong>example:</strong>
         * <p>0571****3106</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("Contact")
        public QueryJobsResponseBodyJobsListTasksContact contact;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        @NameInMap("PlanedTime")
        public Long planedTime;

        /**
         * <strong>example:</strong>
         * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>ff44709e-39a6-43ba-959b-20fcabe3e496</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>NoAnswer</p>
         */
        @NameInMap("FailureReason")
        public String failureReason;

        /**
         * <strong>example:</strong>
         * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <strong>example:</strong>
         * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <strong>example:</strong>
         * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>c8a2b7f2-ad1a-4865-b872-d0080d9802d9</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("Summary")
        public java.util.List<QueryJobsResponseBodyJobsListSummary> summary;

        @NameInMap("TagHits")
        public java.util.List<QueryJobsResponseBodyJobsListTagHits> tagHits;

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

        public QueryJobsResponseBodyJobsList setTagHits(java.util.List<QueryJobsResponseBodyJobsListTagHits> tagHits) {
            this.tagHits = tagHits;
            return this;
        }
        public java.util.List<QueryJobsResponseBodyJobsListTagHits> getTagHits() {
            return this.tagHits;
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
