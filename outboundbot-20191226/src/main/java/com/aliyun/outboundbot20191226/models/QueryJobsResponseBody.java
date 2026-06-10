// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsResponseBody extends TeaModel {
    /**
     * <p>HTTP status code.</p>
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
     * <p>Job data.</p>
     */
    @NameInMap("Jobs")
    public QueryJobsResponseBodyJobs jobs;

    /**
     * <p>Response message.</p>
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
     * <p>Indicates whether the call succeeded.</p>
     * 
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
         * <p>Contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>Contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>Honorific.</p>
         * 
         * <strong>example:</strong>
         * <p>张先生</p>
         */
        @NameInMap("Honorific")
        public String honorific;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Associated business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>Role.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Status.</p>
         * <ul>
         * <li><p>Available</p>
         * </li>
         * <li><p>WrongNumber</p>
         * </li>
         * <li><p>DoesNotExist</p>
         * </li>
         * <li><p>Suspended</p>
         * </li>
         * </ul>
         * 
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
         * <p>Business data key.</p>
         * 
         * <strong>example:</strong>
         * <p>djrq</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Business data value.</p>
         * 
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
         * <p>Category.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Content.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Call record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>098b9b09-9223-4a8b-a422-99726f0457f3</p>
         */
        @NameInMap("ConversationDetailId")
        public String conversationDetailId;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ba1ba502-d044-48c0-b710-0f1f840a7c53</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Summary ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dc67d544-df06-4625-ae48-13e3c9f72d8a</p>
         */
        @NameInMap("SummaryId")
        public String summaryId;

        /**
         * <p>Summary name.</p>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
        @NameInMap("SummaryName")
        public String summaryName;

        /**
         * <p>Call ID.</p>
         * 
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
        /**
         * <p>Tag group name.</p>
         * 
         * <strong>example:</strong>
         * <p>意向收集</p>
         */
        @NameInMap("TagGroup")
        public String tagGroup;

        /**
         * <p>Tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>有意向</p>
         */
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
         * <p>Contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>Contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>Honorific.</p>
         * 
         * <strong>example:</strong>
         * <p>张先生</p>
         */
        @NameInMap("Honorific")
        public String honorific;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Contact phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Business association ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>Role.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Status.</p>
         * 
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
         * <p>Actual call time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <p>Summary. This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Brief")
        public String brief;

        /**
         * <p>SIP call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1528189846043</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>Callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>Caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571****3106</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>Chatbot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>Contact information.</p>
         */
        @NameInMap("Contact")
        public QueryJobsResponseBodyJobsListTasksContact contact;

        /**
         * <p>Call duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Scheduled call time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        @NameInMap("PlanedTime")
        public Long planedTime;

        /**
         * <p>Scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <p>The status of the task. Valid values are described below. Note that the Succeeded status is subdivided by reason. The generic Succeeded: 1 (Connected) status is no longer returned, and a specific success reason is provided instead.</p>
         * <ul>
         * <li><p>Executing: 0 (Calling).</p>
         * </li>
         * <li><p>Succeeded: 1 (Connected).</p>
         * </li>
         * <li><p>NoAnswer: 2 (Not connected – No answer).</p>
         * </li>
         * <li><p>NotExist: 3 (Not connected – Nonexistent number).</p>
         * </li>
         * <li><p>Busy: 4 (Not connected – Line busy).</p>
         * </li>
         * <li><p>Cancelled: 5 (Not dialed – Task stopped).</p>
         * </li>
         * <li><p>Failed: 6 (Failed).</p>
         * </li>
         * <li><p>NotConnected: 7 (Not connected – Unreachable).</p>
         * </li>
         * <li><p>PoweredOff: 8 (Not connected – Powered off).</p>
         * </li>
         * <li><p>OutOfService: 9 (Not connected – Service suspended).</p>
         * </li>
         * <li><p>InArrears: 10 (Not connected – Account has an overdue payment).</p>
         * </li>
         * <li><p>EmptyNumber: 11 (Not dialed – Invalid number).</p>
         * </li>
         * <li><p>PerDayCallCountLimit: 12 (Not dialed – Daily call limit exceeded).</p>
         * </li>
         * <li><p>ContactBlockList: 13 (Not dialed – Number on blocklist).</p>
         * </li>
         * <li><p>CallerNotRegistered: 14 (Not dialed – Caller ID not registered).</p>
         * </li>
         * <li><p>Terminated: 15 (Not dialed – Terminated).</p>
         * </li>
         * <li><p>VerificationCancelled: 16 (Not dialed – Canceled due to pre-call validation failure).</p>
         * </li>
         * <li><p>OutOfServiceNoCall: 17 (Not dialed – Service suspended).</p>
         * </li>
         * <li><p>InArrearsNoCall: 18 (Not dialed – Account has an overdue payment).</p>
         * </li>
         * <li><p>CallingNumberNotExist: 19 (Not dialed – Caller ID does not exist).</p>
         * </li>
         * <li><p>SucceededFinish: 20 (Connected – Completed normally).</p>
         * </li>
         * <li><p>SucceededChatbotHangUpAfterNoAnswer: 21 (Connected – Bot hung up due to unrecognized input).</p>
         * </li>
         * <li><p>SucceededChatbotHangUpAfterSilence: 22 (Connected – Bot hung up due to a silence timeout).</p>
         * </li>
         * <li><p>SucceededClientHangUpAfterNoAnswer: 23 (Connected – User hung up due to unrecognized input).</p>
         * </li>
         * <li><p>SucceededClientHangUp: 24 (Connected – User hung up).</p>
         * </li>
         * <li><p>SucceededTransferByIntent: 25 (Connected – Transferred to an agent based on an intent match).</p>
         * </li>
         * <li><p>SucceededTransferAfterNoAnswer: 26 (Connected – Transferred to an agent due to unrecognized input).</p>
         * </li>
         * <li><p>SucceededInoInterAction: 27 (Connected – No user interaction).</p>
         * </li>
         * <li><p>SucceededError: 28 (Connected – Call interrupted by a system error).</p>
         * </li>
         * <li><p>SucceededSpecialInterceptVoiceAssistant: 29 (Connected – Intercepted by a voice assistant).</p>
         * </li>
         * <li><p>SucceededSpecialInterceptExtensionNumberTransfer: 30 (Connected – Intercepted due to an extension transfer).</p>
         * </li>
         * <li><p>SucceededSpecialInterceptCustomSpecialIntercept: 31 (Connected – Intercepted by a custom rule).</p>
         * </li>
         * <li><p>HighRiskSipCode: 32 (Not dialed – High-risk number).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Call ID.</p>
         * 
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
        /**
         * <p>Caller number list.</p>
         */
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        /**
         * <p>Contact information. This parameter is deprecated.</p>
         * <blockquote>
         * <p>Use the DescribeJob operation instead.</p>
         * </blockquote>
         */
        @NameInMap("Contacts")
        public java.util.List<QueryJobsResponseBodyJobsListContacts> contacts;

        /**
         * <p>Business data. Shows tag collection status for Large Language Model (LLM) scenarios.</p>
         * <blockquote>
         * <p>Keys TenantId and ServiceId are system parameters.</p>
         * </blockquote>
         */
        @NameInMap("Extras")
        public java.util.List<QueryJobsResponseBodyJobsListExtras> extras;

        /**
         * <p>Failure reason.</p>
         * <ul>
         * <li><p>Unknown</p>
         * </li>
         * <li><p>NoAnswer</p>
         * </li>
         * <li><p>InvalidStrategy</p>
         * </li>
         * <li><p>TimeUp</p>
         * </li>
         * <li><p>NoStrategy</p>
         * </li>
         * <li><p>CallFailed</p>
         * </li>
         * <li><p>PerDayCallCountLimit</p>
         * </li>
         * <li><p>ContactBlockList</p>
         * </li>
         * <li><p>EmptyNumber</p>
         * </li>
         * <li><p>JobPerDayCallCountLimit</p>
         * </li>
         * <li><p>VerificationCancelled</p>
         * </li>
         * <li><p>ContactSuspended</p>
         * </li>
         * <li><p>InArrears</p>
         * </li>
         * <li><p>OutOfService</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoAnswer</p>
         */
        @NameInMap("FailureReason")
        public String failureReason;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>Job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Associated business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>Scenario ID. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <p>Job status.</p>
         * <ul>
         * <li><p>Scheduling (0)</p>
         * </li>
         * <li><p>Executing (1)</p>
         * </li>
         * <li><p>Succeeded (2)</p>
         * </li>
         * <li><p>Paused (3)</p>
         * </li>
         * <li><p>Failed (4)</p>
         * </li>
         * <li><p>Cancelled (5)</p>
         * </li>
         * <li><p>Drafted (6)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Strategy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c8a2b7f2-ad1a-4865-b872-d0080d9802d9</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>Conversation summary. This field is deprecated.</p>
         */
        @NameInMap("Summary")
        public java.util.List<QueryJobsResponseBodyJobsListSummary> summary;

        /**
         * <p>Tags hit in small model scenarios.</p>
         */
        @NameInMap("TagHits")
        public java.util.List<QueryJobsResponseBodyJobsListTagHits> tagHits;

        /**
         * <p>Call list. This parameter is deprecated.</p>
         * <blockquote>
         * <p>Use the searchTask operation instead.</p>
         * </blockquote>
         */
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
        /**
         * <p>Job array.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryJobsResponseBodyJobsList> list;

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of records.</p>
         * 
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
