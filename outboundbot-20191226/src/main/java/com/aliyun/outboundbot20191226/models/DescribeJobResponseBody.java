// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Job")
    public DescribeJobResponseBodyJob job;

    /**
     * <p>The API response message.</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The contact ID. This is system-generated.</p>
         * 
         * <strong>example:</strong>
         * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San.</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The honorific of the contact. This is the same as the contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>Mr. Zhang.</p>
         */
        @NameInMap("Honorific")
        public String honorific;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>72dcd26b-f12d-4c27-b3af-18f6aed5b160</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1358****8888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The business ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p><strong>[Deprecated]</strong> The contact role.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p><strong>[Deprecated]</strong> The contact status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
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
        /**
         * <p>The name of the business parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>djrq</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the business parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-21 09:49:59.0</p>
         */
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
        /**
         * <p><strong>[Deprecated]</strong> The ASR configuration of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AppKey\&quot;:\&quot;3GHttnsvir1FeWWb\&quot;}</p>
         */
        @NameInMap("AsrConfig")
        public String asrConfig;

        /**
         * <p>The chatbot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-EJfqqa***</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>The debug status.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        /**
         * <p>The industry.</p>
         * 
         * <strong>example:</strong>
         * <p>Finance.</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Indicates whether the debug version is in draft state.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <p>Indicates whether the script is in draft state.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether the tone continuation feature is enabled. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MiniPlaybackConfigEnabled")
        public Boolean miniPlaybackConfigEnabled;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>Collection script.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The scene.</p>
         * 
         * <strong>example:</strong>
         * <p>Collection.</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The script description.</p>
         * 
         * <strong>example:</strong>
         * <p>Collection script.</p>
         */
        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>810b5872-57f0-4b27-80ab-7b3f4d8a6374</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p><strong>[Deprecated]</strong> The TTS configuration of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;voice\&quot;:\&quot;xiaobei\&quot;,\&quot;volume\&quot;:\&quot;50\&quot;,\&quot;speechRate\&quot;:\&quot;-150\&quot;,\&quot;pitchRate\&quot;:\&quot;0\&quot;}</p>
         */
        @NameInMap("TtsConfig")
        public String ttsConfig;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1578881227000</p>
         */
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
        /**
         * <p><strong>[Deprecated]</strong> The conversation summary category. This is a legacy field and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
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
        /**
         * <p>The contact ID. This is system-generated.</p>
         * 
         * <strong>example:</strong>
         * <p>db3db762-e421-44c9-9a01-cb423470757c</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San.</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The honorific of the contact. This is the same as the contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>Mr. Zhang.</p>
         */
        @NameInMap("Honorific")
        public String honorific;

        /**
         * <p><strong>[Deprecated]</strong> The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1351****8888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The business system ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>2fa6bac3-06da-4315-82ab-72d6fd3a6f34</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p><strong>[Deprecated]</strong> The contact role.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p><strong>[Deprecated]</strong> The contact status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
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
        /**
         * <p>The conversation summary category. This is a legacy field and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The summary content.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The summary name.</p>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
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
        /**
         * <p>The instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>Broadcast</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The instruction parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ActionParams")
        public String actionParams;

        /**
         * <p>The conversation text.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, I am ** customer service.</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fd279983-93b9-b13b-9a34-64e5df473225</p>
         */
        @NameInMap("SequenceId")
        public String sequenceId;

        /**
         * <p>The speaker of the conversation. Valid values: Robot and Contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Robot</p>
         */
        @NameInMap("Speaker")
        public String speaker;

        /**
         * <p><strong>[Deprecated]</strong> The conversation summary data. This is a legacy field and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Summary")
        public java.util.List<DescribeJobResponseBodyJobTasksConversationSummary> summary;

        /**
         * <p>The summary creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
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
        /**
         * <p>The actual execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <p>The business result. This is a legacy field and is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Brief")
        public String brief;

        /**
         * <p>SIP call id。</p>
         * 
         * <strong>example:</strong>
         * <p>1528189846043</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571****3106</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The robot ID for the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>The contact information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Contact")
        public DescribeJobResponseBodyJobTasksContact contact;

        /**
         * <p>The conversation text list of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Conversation")
        public java.util.List<DescribeJobResponseBodyJobTasksConversation> conversation;

        /**
         * <p>The conversation duration. This field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The call end reason.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("EndReason")
        public String endReason;

        /**
         * <p>The actual end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The party that hung up.</p>
         * 
         * <strong>example:</strong>
         * <p>client</p>
         */
        @NameInMap("HangUpDirection")
        public String hangUpDirection;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The planned call time.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        @NameInMap("PlanedTime")
        public Long planedTime;

        /**
         * <p>The actual ringing duration.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("RealRingingDuration")
        public Long realRingingDuration;

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
         * 
         * <strong>example:</strong>
         * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <p>The SIP status code of the call task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SipCode")
        public String sipCode;

        /**
         * <p><strong>[Deprecated]</strong> The SIP signaling duration.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("SipDuration")
        public Long sipDuration;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SucceededTransferByIntent</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ff44709e-39a6-43ba-959b-20fcabe3e496</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total call duration.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

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

        public DescribeJobResponseBodyJobTasks setRealRingingDuration(Long realRingingDuration) {
            this.realRingingDuration = realRingingDuration;
            return this;
        }
        public Long getRealRingingDuration() {
            return this.realRingingDuration;
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

        public DescribeJobResponseBodyJobTasks setSipCode(String sipCode) {
            this.sipCode = sipCode;
            return this;
        }
        public String getSipCode() {
            return this.sipCode;
        }

        public DescribeJobResponseBodyJobTasks setSipDuration(Long sipDuration) {
            this.sipDuration = sipDuration;
            return this;
        }
        public Long getSipDuration() {
            return this.sipDuration;
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

        public DescribeJobResponseBodyJobTasks setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

    }

    public static class DescribeJobResponseBodyJob extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> The actual execution time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1640068026385</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>137****7777</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The list of calling numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;057126883106&quot;]</p>
         */
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        /**
         * <p>The contact information.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Contacts")
        public java.util.List<DescribeJobResponseBodyJobContacts> contacts;

        /**
         * <p><strong>[Deprecated]</strong> The tag hit information of the node.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DsReport")
        public String dsReport;

        /**
         * <p><strong>[Deprecated]</strong> The end reason.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EndReason")
        public Integer endReason;

        /**
         * <p>The business parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Extras")
        public java.util.List<DescribeJobResponseBodyJobExtras> extras;

        /**
         * <p>The reason for the job failure.</p>
         * 
         * <strong>example:</strong>
         * <p>NoAnswer</p>
         */
        @NameInMap("FailureReason")
        public String failureReason;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The next execution time of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1640068026385</p>
         */
        @NameInMap("NextExecutionTime")
        public Long nextExecutionTime;

        /**
         * <p>The job priority.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The business ID of the job, custom-defined by the business side.</p>
         * 
         * <strong>example:</strong>
         * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ade80092-03d9-4f4d-ad4f-ab8a247d3150</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <p>The script scenario.</p>
         */
        @NameInMap("Script")
        public DescribeJobResponseBodyJobScript script;

        /**
         * <p>The job status.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The strategy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c8a2b7f2-ad1a-4865-b872-d0080d9802d9</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>The conversation business tag data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Summary")
        public java.util.List<DescribeJobResponseBodyJobSummary> summary;

        /**
         * <p>The system priority of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SystemPriority")
        public Integer systemPriority;

        /**
         * <p>The call list.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
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
