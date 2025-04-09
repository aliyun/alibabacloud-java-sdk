// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobsByGroupResponseBody extends TeaModel {
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
    public ListJobsByGroupResponseBodyJobs jobs;

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

    public static ListJobsByGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsByGroupResponseBody self = new ListJobsByGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsByGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobsByGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobsByGroupResponseBody setJobs(ListJobsByGroupResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public ListJobsByGroupResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public ListJobsByGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobsByGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsByGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobsByGroupResponseBodyJobsListContacts extends TeaModel {
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

        public static ListJobsByGroupResponseBodyJobsListContacts build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListContacts self = new ListJobsByGroupResponseBodyJobsListContacts();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListJobsByGroupResponseBodyJobsListExtras extends TeaModel {
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

        public static ListJobsByGroupResponseBodyJobsListExtras build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListExtras self = new ListJobsByGroupResponseBodyJobsListExtras();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobsByGroupResponseBodyJobsListExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobsByGroupResponseBodyJobsListSummary extends TeaModel {
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
         * <p>62a860f5-a8b3-4b75-9512-c7e04bb7c8bc</p>
         */
        @NameInMap("ConversationDetailId")
        public String conversationDetailId;

        /**
         * <strong>example:</strong>
         * <p>88e56cfb-33f8-477a-907c-0fe83292d924</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <strong>example:</strong>
         * <p>f102a853-5f5a-47fb-8869-b31ea74a9620</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>680f1905-81ae-4aab-99dd-2964dfb767fa</p>
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
         * <p>b0f35dd1-0337-402e-9c4f-3a6c2426950a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListJobsByGroupResponseBodyJobsListSummary build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListSummary self = new ListJobsByGroupResponseBodyJobsListSummary();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setConversationDetailId(String conversationDetailId) {
            this.conversationDetailId = conversationDetailId;
            return this;
        }
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListJobsByGroupResponseBodyJobsList extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<ListJobsByGroupResponseBodyJobsListContacts> contacts;

        @NameInMap("Extras")
        public java.util.List<ListJobsByGroupResponseBodyJobsListExtras> extras;

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
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
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
        public java.util.List<ListJobsByGroupResponseBodyJobsListSummary> summary;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SystemPriority")
        public Integer systemPriority;

        public static ListJobsByGroupResponseBodyJobsList build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsList self = new ListJobsByGroupResponseBodyJobsList();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsList setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ListJobsByGroupResponseBodyJobsList setContacts(java.util.List<ListJobsByGroupResponseBodyJobsListContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListContacts> getContacts() {
            return this.contacts;
        }

        public ListJobsByGroupResponseBodyJobsList setExtras(java.util.List<ListJobsByGroupResponseBodyJobsListExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListExtras> getExtras() {
            return this.extras;
        }

        public ListJobsByGroupResponseBodyJobsList setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListJobsByGroupResponseBodyJobsList setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ListJobsByGroupResponseBodyJobsList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsByGroupResponseBodyJobsList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListJobsByGroupResponseBodyJobsList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobsByGroupResponseBodyJobsList setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListJobsByGroupResponseBodyJobsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsByGroupResponseBodyJobsList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListJobsByGroupResponseBodyJobsList setSummary(java.util.List<ListJobsByGroupResponseBodyJobsListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListSummary> getSummary() {
            return this.summary;
        }

        public ListJobsByGroupResponseBodyJobsList setSystemPriority(Integer systemPriority) {
            this.systemPriority = systemPriority;
            return this;
        }
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

    }

    public static class ListJobsByGroupResponseBodyJobs extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListJobsByGroupResponseBodyJobsList> list;

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

        public static ListJobsByGroupResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobs self = new ListJobsByGroupResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobs setList(java.util.List<ListJobsByGroupResponseBodyJobsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsList> getList() {
            return this.list;
        }

        public ListJobsByGroupResponseBodyJobs setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobsByGroupResponseBodyJobs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobsByGroupResponseBodyJobs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
